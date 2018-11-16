package typings
package atAngularPlatformDashBrowserDashDynamicLib.srcCompilerUnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser-dynamic/src/compiler_factory", "CompilerImpl")
@js.native
class CompilerImpl protected ()
  extends atAngularCoreLib.coreMod.Compiler {
  def this(injector: atAngularCoreLib.coreMod.Injector, _metadataResolver: atAngularCompilerLib.compilerMod.CompileMetadataResolver, templateParser: atAngularCompilerLib.compilerMod.TemplateParser, styleCompiler: atAngularCompilerLib.compilerMod.StyleCompiler, viewCompiler: atAngularCompilerLib.compilerMod.ViewCompiler, ngModuleCompiler: atAngularCompilerLib.compilerMod.NgModuleCompiler, summaryResolver: atAngularCompilerLib.compilerMod.SummaryResolver[atAngularCoreLib.srcTypeMod.Type[_]], compileReflector: atAngularCompilerLib.compilerMod.CompileReflector, compilerConfig: atAngularCompilerLib.compilerMod.CompilerConfig, console: atAngularCoreLib.coreMod.ɵConsole) = this()
  var _delegate: js.Any = js.native
  var _metadataResolver: js.Any = js.native
  var getExtraNgModuleProviders: js.Any = js.native
  val injector: atAngularCoreLib.coreMod.Injector = js.native
  def getComponentFactory[T](component: atAngularCoreLib.srcTypeMod.Type[T]): atAngularCoreLib.coreMod.ComponentFactory[T] = js.native
  def hasAotSummary(ref: atAngularCoreLib.srcTypeMod.Type[_]): scala.Boolean = js.native
  def loadAotSummaries(summaries: js.Function0[js.Array[_]]): scala.Unit = js.native
}

