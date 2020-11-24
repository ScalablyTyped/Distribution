package typings.angularPlatformBrowserDynamic.mod

import typings.angularCompiler.mod.CompileMetadataResolver
import typings.angularCompiler.mod.CompileReflector
import typings.angularCompiler.mod.CompilerConfig
import typings.angularCompiler.mod.JitEvaluator
import typings.angularCompiler.mod.NgModuleCompiler
import typings.angularCompiler.mod.StyleCompiler
import typings.angularCompiler.mod.SummaryResolver
import typings.angularCompiler.mod.TemplateParser
import typings.angularCompiler.mod.ViewCompiler
import typings.angularCore.mod.Compiler
import typings.angularCore.mod.ComponentFactory
import typings.angularCore.mod.Injector
import typings.angularCore.mod.Type
import typings.angularCore.mod.ɵConsole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/platform-browser-dynamic", "\u0275CompilerImpl")
@js.native
class ɵCompilerImpl protected () extends Compiler {
  def this(
    injector: Injector,
    _metadataResolver: CompileMetadataResolver,
    templateParser: TemplateParser,
    styleCompiler: StyleCompiler,
    viewCompiler: ViewCompiler,
    ngModuleCompiler: NgModuleCompiler,
    summaryResolver: SummaryResolver[Type[_]],
    compileReflector: CompileReflector,
    jitEvaluator: JitEvaluator,
    compilerConfig: CompilerConfig,
    console: ɵConsole
  ) = this()
  
  var _delegate: js.Any = js.native
  
  var _metadataResolver: js.Any = js.native
  
  def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
  
  var getExtraNgModuleProviders: js.Any = js.native
  
  def hasAotSummary(ref: Type[_]): Boolean = js.native
  
  val injector: Injector = js.native
  
  def loadAotSummaries(summaries: js.Function0[js.Array[_]]): Unit = js.native
}
