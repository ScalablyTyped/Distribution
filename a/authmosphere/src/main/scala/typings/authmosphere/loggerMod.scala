package typings.authmosphere

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("authmosphere/lib/src/types/Logger", JSImport.Namespace)
@js.native
object loggerMod extends js.Object {
  
  @js.native
  sealed trait LogLevel extends js.Object
  @js.native
  object LogLevel extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogLevel with String] = js.native
    
    @js.native
    sealed trait debug extends LogLevel
    /* "debug" */ @js.native
    object debug extends TopLevel[debug with String]
    
    @js.native
    sealed trait error extends LogLevel
    /* "error" */ @js.native
    object error extends TopLevel[error with String]
    
    @js.native
    sealed trait fatal extends LogLevel
    /* "fatal" */ @js.native
    object fatal extends TopLevel[fatal with String]
    
    @js.native
    sealed trait info extends LogLevel
    /* "info" */ @js.native
    object info extends TopLevel[info with String]
    
    @js.native
    sealed trait trace extends LogLevel
    /* "trace" */ @js.native
    object trace extends TopLevel[trace with String]
    
    @js.native
    sealed trait warn extends LogLevel
    /* "warn" */ @js.native
    object warn extends TopLevel[warn with String]
  }
  
  @js.native
  trait Logger extends js.Object {
    
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
  
  type LogFunction = js.Function2[/* message */ String, /* error */ js.UndefOr[js.Any], Unit]
}
