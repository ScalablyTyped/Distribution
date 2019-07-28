package typings.atAngularPlatformDashBrowserDashDynamic.atAngularPlatformDashBrowserDashDynamicMod

import typings.atAngularCompiler.atAngularCompilerMod.CompileMetadataResolver
import typings.atAngularCompiler.atAngularCompilerMod.CompileReflector
import typings.atAngularCompiler.atAngularCompilerMod.CompilerConfig
import typings.atAngularCompiler.atAngularCompilerMod.JitEvaluator
import typings.atAngularCompiler.atAngularCompilerMod.NgModuleCompiler
import typings.atAngularCompiler.atAngularCompilerMod.StyleCompiler
import typings.atAngularCompiler.atAngularCompilerMod.SummaryResolver
import typings.atAngularCompiler.atAngularCompilerMod.TemplateParser
import typings.atAngularCompiler.atAngularCompilerMod.ViewCompiler
import typings.atAngularCore.atAngularCoreMod.Compiler
import typings.atAngularCore.atAngularCoreMod.ComponentFactory
import typings.atAngularCore.atAngularCoreMod.Injector
import typings.atAngularCore.atAngularCoreMod.Type
import typings.atAngularCore.atAngularCoreMod.ɵConsole
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic", "ɵCompilerImpl")
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

