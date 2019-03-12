package typings
package atAngularCompilerLib.srcRender3R3UnderscoreModuleUnderscoreCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_module_compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compileInjector(meta: R3InjectorMetadata): R3InjectorDef = js.native
  def compileNgModule(meta: R3NgModuleMetadata): R3NgModuleDef = js.native
  def compileNgModuleFromRender2(
    ctx: atAngularCompilerLib.srcUtilMod.OutputContext,
    ngModule: atAngularCompilerLib.srcCompileUnderscoreMetadataMod.CompileShallowModuleMetadata,
    injectableCompiler: atAngularCompilerLib.srcInjectableUnderscoreCompilerMod.InjectableCompiler
  ): scala.Unit = js.native
}

