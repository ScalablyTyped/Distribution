package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscLoggingSrcLoggerMod {
  
  @js.native
  sealed trait LogLevel extends StObject
  @JSImport("@angular/compiler-cli/src/ngtsc/logging/src/logger", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[LogLevel & Double] = js.native
    
    @js.native
    sealed trait debug
      extends StObject
         with LogLevel
    /* 0 */ val debug: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.debug & Double = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with LogLevel
    /* 3 */ val error: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.error & Double = js.native
    
    @js.native
    sealed trait info
      extends StObject
         with LogLevel
    /* 1 */ val info: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.info & Double = js.native
    
    @js.native
    sealed trait warn
      extends StObject
         with LogLevel
    /* 2 */ val warn: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.warn & Double = js.native
  }
  
  trait Logger extends StObject {
    
    def debug(args: String*): Unit
    
    def error(args: String*): Unit
    
    def info(args: String*): Unit
    
    var level: LogLevel
    
    def warn(args: String*): Unit
  }
  object Logger {
    
    inline def apply(
      debug: /* repeated */ String => Unit,
      error: /* repeated */ String => Unit,
      info: /* repeated */ String => Unit,
      level: LogLevel,
      warn: /* repeated */ String => Unit
    ): Logger = {
      val __obj = js.Dynamic.literal(debug = js.Any.fromFunction1(debug), error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), level = level.asInstanceOf[js.Any], warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    extension [Self <: Logger](x: Self) {
      
      inline def setDebug(value: /* repeated */ String => Unit): Self = StObject.set(x, "debug", js.Any.fromFunction1(value))
      
      inline def setError(value: /* repeated */ String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: /* repeated */ String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setLevel(value: LogLevel): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setWarn(value: /* repeated */ String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
}
