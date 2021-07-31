package typings.authmosphere

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggerMod {
  
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
    /* "debug" */ val debug: typings.authmosphere.loggerMod.LogLevel.debug & String = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with LogLevel
    /* "error" */ val error: typings.authmosphere.loggerMod.LogLevel.error & String = js.native
    
    @js.native
    sealed trait fatal
      extends StObject
         with LogLevel
    /* "fatal" */ val fatal: typings.authmosphere.loggerMod.LogLevel.fatal & String = js.native
    
    @js.native
    sealed trait info
      extends StObject
         with LogLevel
    /* "info" */ val info: typings.authmosphere.loggerMod.LogLevel.info & String = js.native
    
    @js.native
    sealed trait trace
      extends StObject
         with LogLevel
    /* "trace" */ val trace: typings.authmosphere.loggerMod.LogLevel.trace & String = js.native
    
    @js.native
    sealed trait warn
      extends StObject
         with LogLevel
    /* "warn" */ val warn: typings.authmosphere.loggerMod.LogLevel.warn & String = js.native
  }
  
  type LogFunction = js.Function2[/* message */ String, /* error */ js.UndefOr[js.Any], Unit]
  
  trait Logger extends StObject {
    
    def debug(message: String): Unit
    def debug(message: String, error: js.Any): Unit
    @JSName("debug")
    var debug_Original: LogFunction
    
    def error(message: String): Unit
    def error(message: String, error: js.Any): Unit
    @JSName("error")
    var error_Original: LogFunction
    
    def fatal(message: String): Unit
    def fatal(message: String, error: js.Any): Unit
    @JSName("fatal")
    var fatal_Original: LogFunction
    
    def info(message: String): Unit
    def info(message: String, error: js.Any): Unit
    @JSName("info")
    var info_Original: LogFunction
    
    def trace(message: String): Unit
    def trace(message: String, error: js.Any): Unit
    @JSName("trace")
    var trace_Original: LogFunction
    
    def warn(message: String): Unit
    def warn(message: String, error: js.Any): Unit
    @JSName("warn")
    var warn_Original: LogFunction
  }
  object Logger {
    
    @scala.inline
    def apply(
      debug: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit,
      error: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit,
      fatal: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit,
      info: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit,
      trace: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit,
      warn: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction2(debug), error = js.Any.fromFunction2(error), fatal = js.Any.fromFunction2(fatal), info = js.Any.fromFunction2(info), trace = js.Any.fromFunction2(trace), warn = js.Any.fromFunction2(warn))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit class LoggerMutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebug(value: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction2(value))
      
      @scala.inline
      def setError(value: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "error", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFatal(value: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "fatal", js.Any.fromFunction2(value))
      
      @scala.inline
      def setInfo(value: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "info", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTrace(value: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "trace", js.Any.fromFunction2(value))
      
      @scala.inline
      def setWarn(value: (/* message */ String, /* error */ js.UndefOr[js.Any]) => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction2(value))
    }
  }
}
