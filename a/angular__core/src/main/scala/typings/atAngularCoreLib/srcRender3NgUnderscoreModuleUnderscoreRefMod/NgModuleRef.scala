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
  def this(ngModuleType: atAngularCoreLib.srcTypeMod.Type[T], _parent: atAngularCoreLib.srcDiInjectorMod.Injector) = this()
  var _parent: atAngularCoreLib.srcDiInjectorMod.Injector | scala.Null = js.native
  var _r3Injector: atAngularCoreLib.srcDiInjectorMod.Injector = js.native
  var destroyCbs: js.Array[js.Function0[scala.Unit]] | scala.Null = js.native
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get(
    token: js.Any,
    notFoundValue: js.Any,
    injectFlags: atAngularCoreLib.srcDiInjectorUnderscoreCompatibilityMod.InjectFlags
  ): js.Any = js.native
}

