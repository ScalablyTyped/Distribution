package typings
package atAngularPlatformDashBrowserDashDynamicLib.srcCompilerUnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic/src/compiler_factory", "CompilerImpl")
@js.native
class CompilerImpl protected ()
  extends atAngularCoreLib.atAngularCoreMod.Compiler {
  def this(injector: atAngularCoreLib.atAngularCoreMod.Injector, _metadataResolver: atAngularCompilerLib.atAngularCompilerMod.CompileMetadataResolver, templateParser: atAngularCompilerLib.atAngularCompilerMod.TemplateParser, styleCompiler: atAngularCompilerLib.atAngularCompilerMod.StyleCompiler, viewCompiler: atAngularCompilerLib.atAngularCompilerMod.ViewCompiler, ngModuleCompiler: atAngularCompilerLib.atAngularCompilerMod.NgModuleCompiler, summaryResolver: atAngularCompilerLib.atAngularCompilerMod.SummaryResolver[atAngularCoreLib.srcTypeMod.Type[_]], compileReflector: atAngularCompilerLib.atAngularCompilerMod.CompileReflector, compilerConfig: atAngularCompilerLib.atAngularCompilerMod.CompilerConfig, console: atAngularCoreLib.atAngularCoreMod.ɵConsole) = this()
  var _delegate: js.Any = js.native
  var _metadataResolver: js.Any = js.native
  var getExtraNgModuleProviders: js.Any = js.native
  val injector: atAngularCoreLib.atAngularCoreMod.Injector = js.native
  def getComponentFactory[T](component: atAngularCoreLib.srcTypeMod.Type[T]): atAngularCoreLib.atAngularCoreMod.ComponentFactory[T] = js.native
  def hasAotSummary(ref: atAngularCoreLib.srcTypeMod.Type[_]): scala.Boolean = js.native
  def loadAotSummaries(summaries: js.Function0[js.Array[_]]): scala.Unit = js.native
}

