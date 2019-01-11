package typings
package atAngularCoreLib.srcLinkerCompilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/compiler", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val COMPILER_OPTIONS: atAngularCoreLib.srcDiInjectionUnderscoreTokenMod.InjectionToken[js.Array[atAngularCoreLib.srcLinkerCompilerMod.CompilerOptions]] = js.native
  def `Compiler_compileModuleAndAllComponentsAsync__POST_R3__`[T](moduleType: atAngularCoreLib.srcTypeMod.Type[T]): js.Promise[atAngularCoreLib.srcLinkerCompilerMod.ModuleWithComponentFactories[T]] = js.native
  def `Compiler_compileModuleAndAllComponentsSync__POST_R3__`[T](moduleType: atAngularCoreLib.srcTypeMod.Type[T]): atAngularCoreLib.srcLinkerCompilerMod.ModuleWithComponentFactories[T] = js.native
  def `Compiler_compileModuleAsync__POST_R3__`[T](moduleType: atAngularCoreLib.srcTypeMod.Type[T]): js.Promise[
    atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[T]
  ] = js.native
  def `Compiler_compileModuleSync__POST_R3__`[T](moduleType: atAngularCoreLib.srcTypeMod.Type[T]): atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.NgModuleFactory[T] = js.native
}

