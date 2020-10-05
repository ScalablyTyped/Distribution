package typings.angularPlatformBrowserDynamic.mod

import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.configMod.CompilerConfig
import typings.angularCompiler.metadataResolverMod.CompileMetadataResolver
import typings.angularCompiler.ngModuleCompilerMod.NgModuleCompiler
import typings.angularCompiler.outputJitMod.JitEvaluator
import typings.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typings.angularCompiler.styleCompilerMod.StyleCompiler
import typings.angularCompiler.templateParserMod.TemplateParser
import typings.angularCompiler.viewCompilerViewCompilerMod.ViewCompiler
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
  var getExtraNgModuleProviders: js.Any = js.native
  val injector: Injector = js.native
  def getComponentFactory[T](component: Type[T]): ComponentFactory[T] = js.native
  def hasAotSummary(ref: Type[_]): Boolean = js.native
  def loadAotSummaries(summaries: js.Function0[js.Array[_]]): Unit = js.native
}

