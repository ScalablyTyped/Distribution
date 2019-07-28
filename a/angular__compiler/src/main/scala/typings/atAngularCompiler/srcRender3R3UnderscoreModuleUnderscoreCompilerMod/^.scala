package typings.atAngularCompiler.srcRender3R3UnderscoreModuleUnderscoreCompilerMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileShallowModuleMetadata
import typings.atAngularCompiler.srcInjectableUnderscoreCompilerMod.InjectableCompiler
import typings.atAngularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/render3/r3_module_compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compileInjector(meta: R3InjectorMetadata): R3InjectorDef = js.native
  def compileNgModule(meta: R3NgModuleMetadata): R3NgModuleDef = js.native
  def compileNgModuleFromRender2(ctx: OutputContext, ngModule: CompileShallowModuleMetadata, injectableCompiler: InjectableCompiler): Unit = js.native
}

