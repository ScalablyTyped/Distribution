package typings.angularCompilerCli

import typings.angularCompilerCli.loggerMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loggingMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/logging", "ConsoleLogger")
  @js.native
  open class ConsoleLogger protected ()
    extends typings.angularCompilerCli.consoleLoggerMod.ConsoleLogger {
    def this(level: LogLevel) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/logging", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.loggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val debug: typings.angularCompilerCli.loggerMod.LogLevel.debug & Double = js.native
    
    /* 3 */ val error: typings.angularCompilerCli.loggerMod.LogLevel.error & Double = js.native
    
    /* 1 */ val info: typings.angularCompilerCli.loggerMod.LogLevel.info & Double = js.native
    
    /* 2 */ val warn: typings.angularCompilerCli.loggerMod.LogLevel.warn & Double = js.native
  }
}
