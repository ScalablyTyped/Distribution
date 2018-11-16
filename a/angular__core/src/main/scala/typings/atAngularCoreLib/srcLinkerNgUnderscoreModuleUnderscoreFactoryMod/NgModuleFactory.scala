package typings
package atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/linker/ng_module_factory", "NgModuleFactory")
@js.native
abstract class NgModuleFactory[T] () extends js.Object {
  val moduleType: atAngularCoreLib.srcTypeMod.Type[T] = js.native
  def create(): NgModuleRef[T] = js.native
  def create(parentInjector: atAngularCoreLib.srcDiInjectorMod.Injector): NgModuleRef[T] = js.native
}

