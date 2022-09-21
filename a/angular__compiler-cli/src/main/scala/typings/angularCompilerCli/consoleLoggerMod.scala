package typings.angularCompilerCli

import typings.angularCompilerCli.loggerMod.LogLevel
import typings.angularCompilerCli.loggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object consoleLoggerMod {
  
  @JSImport("@angular/compiler-cli/src/ngtsc/logging/src/console_logger", "ConsoleLogger")
  @js.native
  open class ConsoleLogger protected ()
    extends StObject
       with Logger {
    def this(level: LogLevel) = this()
    
    /* CompleteClass */
    override def debug(args: String*): Unit = js.native
    
    /* CompleteClass */
    override def error(args: String*): Unit = js.native
    
    /* CompleteClass */
    override def info(args: String*): Unit = js.native
    
    /* CompleteClass */
    var level: LogLevel = js.native
    
    /* CompleteClass */
    override def warn(args: String*): Unit = js.native
  }
  
  @JSImport("@angular/compiler-cli/src/ngtsc/logging/src/console_logger", "DEBUG")
  @js.native
  val DEBUG: String = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/logging/src/console_logger", "ERROR")
  @js.native
  val ERROR: String = js.native
  
  @JSImport("@angular/compiler-cli/src/ngtsc/logging/src/console_logger", "WARN")
  @js.native
  val WARN: String = js.native
}
