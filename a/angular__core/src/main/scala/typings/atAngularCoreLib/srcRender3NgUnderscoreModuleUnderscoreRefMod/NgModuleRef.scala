package typings
package atAngularCoreLib.srcRender3NgUnderscoreModuleUnderscoreRefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/src/render3/ng_module_ref", "NgModuleRef")
@js.native
class NgModuleRef[T] protected ()
  extends atAngularCoreLib.srcLinkerNgUnderscoreModuleUnderscoreFactoryMod.InternalNgModuleRef[T] {
  def this(ngModuleType: atAngularCoreLib.srcTypeMod.Type[T]) = this()
  def this(ngModuleType: atAngularCoreLib.srcTypeMod.Type[T], parentInjector: atAngularCoreLib.srcDiInjectorMod.Injector) = this()
  var destroyCbs: js.Array[js.Function0[scala.Unit]] | scala.Null = js.native
}

