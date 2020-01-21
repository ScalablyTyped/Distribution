package typings.angularCompiler.r3ModuleCompilerMod

import typings.angularCompiler.compileMetadataMod.CompileShallowModuleMetadata
import typings.angularCompiler.injectableCompilerMod.InjectableCompiler
import typings.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_module_compiler", "compileNgModuleFromRender2")
@js.native
object compileNgModuleFromRender2 extends js.Object {
  def apply(ctx: OutputContext, ngModule: CompileShallowModuleMetadata, injectableCompiler: InjectableCompiler): Unit = js.native
}

