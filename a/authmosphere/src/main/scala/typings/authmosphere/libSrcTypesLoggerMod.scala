package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSrcTypesLoggerMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("authmosphere/lib/src/types/Logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[LogLevel & String] = js.native
    
    @js.native
    sealed trait debug
      extends StObject
         with LogLevel
    /* "debug" */ val debug: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.debug & String = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with LogLevel
    /* "error" */ val error: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.error & String = js.native
    
    @js.native
    sealed trait fatal
      extends StObject
         with LogLevel
    /* "fatal" */ val fatal: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.fatal & String = js.native
    
    @js.native
    sealed trait info
      extends StObject
         with LogLevel
    /* "info" */ val info: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.info & String = js.native
    
    @js.native
    sealed trait trace
      extends StObject
         with LogLevel
    /* "trace" */ val trace: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.trace & String = js.native
    
    @js.native
    sealed trait warn
      extends StObject
         with LogLevel
    /* "warn" */ val warn: typings.authmosphere.libSrcTypesLoggerMod.LogLevel.warn & String = js.native
  }
  
  @js.native
  trait LogFunction extends StObject {
    
    def apply(message: String, args: Any*): Unit = js.native
  }
  
  trait Logger extends StObject {
    
    def debug(message: String, args: Any*): Unit
    @JSName("debug")
    var debug_Original: LogFunction
    
    def error(message: String, args: Any*): Unit
    @JSName("error")
    var error_Original: LogFunction
    
    def fatal(message: String, args: Any*): Unit
    @JSName("fatal")
    var fatal_Original: LogFunction
    
    def info(message: String, args: Any*): Unit
    @JSName("info")
    var info_Original: LogFunction
    
    def trace(message: String, args: Any*): Unit
    @JSName("trace")
    var trace_Original: LogFunction
    
    def warn(message: String, args: Any*): Unit
    @JSName("warn")
    var warn_Original: LogFunction
  }
  object Logger {
    
    inline def apply(
      debug: LogFunction,
      error: LogFunction,
      fatal: LogFunction,
      info: LogFunction,
      trace: LogFunction,
      warn: LogFunction
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fatal = fatal.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setDebug(value: LogFunction): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setError(value: LogFunction): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFatal(value: LogFunction): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: LogFunction): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setTrace(value: LogFunction): Self = StObject.set(x, "trace", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: LogFunction): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
    }
  }
}
