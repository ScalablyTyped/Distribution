package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcNgtscLoggingMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/logging", "ConsoleLogger")
  @js.native
  open class ConsoleLogger protected ()
    extends typings.angularCompilerCli.srcNgtscLoggingSrcConsoleLoggerMod.ConsoleLogger {
    def this(level: LogLevel) = this()
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/logging", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val debug: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.debug & Double = js.native
    
    /* 3 */ val error: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.error & Double = js.native
    
    /* 1 */ val info: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.info & Double = js.native
    
    /* 2 */ val warn: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.warn & Double = js.native
  }
}
