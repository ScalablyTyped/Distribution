package typings.angularCompilerCli

import typings.angularCompilerCli.loggerMod.LogLevel
import typings.angularCompilerCli.ngccOptionsMod.AsyncNgccOptions
import typings.angularCompilerCli.ngccOptionsMod.SyncNgccOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccMod {
  
  @JSImport("@angular/compiler-cli/ngcc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc", "ConsoleLogger")
  @js.native
  open class ConsoleLogger protected ()
    extends typings.angularCompilerCli.loggingMod.ConsoleLogger {
    def this(level: LogLevel) = this()
  }
  
  @JSImport("@angular/compiler-cli/ngcc", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.loggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val debug: typings.angularCompilerCli.loggerMod.LogLevel.debug & Double = js.native
    
    /* 3 */ val error: typings.angularCompilerCli.loggerMod.LogLevel.error & Double = js.native
    
    /* 1 */ val info: typings.angularCompilerCli.loggerMod.LogLevel.info & Double = js.native
    
    /* 2 */ val warn: typings.angularCompilerCli.loggerMod.LogLevel.warn & Double = js.native
  }
  
  inline def clearTsConfigCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTsConfigCache")().asInstanceOf[Unit]
  
  @JSImport("@angular/compiler-cli/ngcc", "containingDirPath")
  @js.native
  val containingDirPath: String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc", "ngccMainFilePath")
  @js.native
  val ngccMainFilePath: String = js.native
  
  inline def process(options: AsyncNgccOptions): Unit | js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Promise[Unit]]
  inline def process(options: SyncNgccOptions): Unit | js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | js.Promise[Unit]]
}
