package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("authmosphere/lib/src/types/Logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogLevel with String] = js.native
    
    @js.native
    sealed trait debug extends LogLevel
    /* "debug" */ val debug: typings.authmosphere.loggerMod.LogLevel.debug with String = js.native
    
    @js.native
    sealed trait error extends LogLevel
    /* "error" */ val error: typings.authmosphere.loggerMod.LogLevel.error with String = js.native
    
    @js.native
    sealed trait fatal extends LogLevel
    /* "fatal" */ val fatal: typings.authmosphere.loggerMod.LogLevel.fatal with String = js.native
    
    @js.native
    sealed trait info extends LogLevel
    /* "info" */ val info: typings.authmosphere.loggerMod.LogLevel.info with String = js.native
    
    @js.native
    sealed trait trace extends LogLevel
    /* "trace" */ val trace: typings.authmosphere.loggerMod.LogLevel.trace with String = js.native
    
    @js.native
    sealed trait warn extends LogLevel
    /* "warn" */ val warn: typings.authmosphere.loggerMod.LogLevel.warn with String = js.native
  }
  
  type LogFunction = js.Function2[/* message */ String, /* error */ js.UndefOr[js.Any], Unit]
  
  @js.native
  trait Logger extends StObject {
    
    def debug(message: String): Unit = js.native
    def debug(message: String, error: js.Any): Unit = js.native
    @JSName("debug")
    var debug_Original: LogFunction = js.native
    
    def error(message: String): Unit = js.native
    def error(message: String, error: js.Any): Unit = js.native
    @JSName("error")
    var error_Original: LogFunction = js.native
    
    def fatal(message: String): Unit = js.native
    def fatal(message: String, error: js.Any): Unit = js.native
    @JSName("fatal")
    var fatal_Original: LogFunction = js.native
    
    def info(message: String): Unit = js.native
    def info(message: String, error: js.Any): Unit = js.native
    @JSName("info")
    var info_Original: LogFunction = js.native
    
    def trace(message: String): Unit = js.native
    def trace(message: String, error: js.Any): Unit = js.native
    @JSName("trace")
    var trace_Original: LogFunction = js.native
    
    def warn(message: String): Unit = js.native
    def warn(message: String, error: js.Any): Unit = js.native
    @JSName("warn")
    var warn_Original: LogFunction = js.native
  }
}
