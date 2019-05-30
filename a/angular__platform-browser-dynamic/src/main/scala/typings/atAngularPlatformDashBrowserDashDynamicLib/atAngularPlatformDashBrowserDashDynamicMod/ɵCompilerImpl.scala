package typings
package atAngularPlatformDashBrowserDashDynamicLib.atAngularPlatformDashBrowserDashDynamicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic", "ɵCompilerImpl")
@js.native
class ɵCompilerImpl protected ()
  extends atAngularCoreLib.atAngularCoreMod.Compiler {
  def this(injector: atAngularCoreLib.atAngularCoreMod.Injector, _metadataResolver: atAngularCompilerLib.atAngularCompilerMod.CompileMetadataResolver, templateParser: atAngularCompilerLib.atAngularCompilerMod.TemplateParser, styleCompiler: atAngularCompilerLib.atAngularCompilerMod.StyleCompiler, viewCompiler: atAngularCompilerLib.atAngularCompilerMod.ViewCompiler, ngModuleCompiler: atAngularCompilerLib.atAngularCompilerMod.NgModuleCompiler, summaryResolver: atAngularCompilerLib.atAngularCompilerMod.SummaryResolver[atAngularCoreLib.atAngularCoreMod.Type[_]], compileReflector: atAngularCompilerLib.atAngularCompilerMod.CompileReflector, jitEvaluator: atAngularCompilerLib.atAngularCompilerMod.JitEvaluator, compilerConfig: atAngularCompilerLib.atAngularCompilerMod.CompilerConfig, console: atAngularCoreLib.atAngularCoreMod.ɵConsole) = this()
  var _delegate: js.Any = js.native
  var _metadataResolver: js.Any = js.native
  var getExtraNgModuleProviders: js.Any = js.native
  val injector: atAngularCoreLib.atAngularCoreMod.Injector = js.native
  def getComponentFactory[T](component: atAngularCoreLib.atAngularCoreMod.Type[T]): atAngularCoreLib.atAngularCoreMod.ComponentFactory[T] = js.native
  def hasAotSummary(ref: atAngularCoreLib.atAngularCoreMod.Type[_]): scala.Boolean = js.native
  def loadAotSummaries(summaries: js.Function0[js.Array[_]]): scala.Unit = js.native
}

