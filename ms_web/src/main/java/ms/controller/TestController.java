package ms.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
public class TestController {
    @RequestMapping("/test")
    private String test(){
        log.info("日志");
        return "奥里给";
    }
}
