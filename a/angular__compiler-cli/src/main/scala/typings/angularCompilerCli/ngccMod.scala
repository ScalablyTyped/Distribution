package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcNgccOptionsMod.AsyncNgccOptions
import typings.angularCompilerCli.ngccSrcNgccOptionsMod.SyncNgccOptions
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel
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
    extends typings.angularCompilerCli.srcNgtscLoggingMod.ConsoleLogger {
    def this(level: LogLevel) = this()
  }
  
  @JSImport("@angular/compiler-cli/ngcc", "LogLevel")
  @js.native
  object LogLevel extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel & Double] = js.native
    
    /* 0 */ val debug: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.debug & Double = js.native
    
    /* 3 */ val error: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.error & Double = js.native
    
    /* 1 */ val info: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.info & Double = js.native
    
    /* 2 */ val warn: typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.LogLevel.warn & Double = js.native
  }
  
  inline def clearTsConfigCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTsConfigCache")().asInstanceOf[Unit]
  
  @JSImport("@angular/compiler-cli/ngcc", "containingDirPath")
  @js.native
  val containingDirPath: String = js.native
  
  @JSImport("@angular/compiler-cli/ngcc", "ngccMainFilePath")
  @js.native
  val ngccMainFilePath: String = js.native
  
  inline def process(options: AsyncNgccOptions): /* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(options.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any]
  inline def process(options: SyncNgccOptions): /* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.SyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(options.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.SyncNgccOptions extends @angular/compiler-cli.@angular/compiler-cli/ngcc/src/ngcc_options.AsyncNgccOptions ? std.Promise<void> : void */ js.Any]
}
