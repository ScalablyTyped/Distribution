package typings.atAngularCore.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "\u0275Render3NgModuleRef")
@js.native
class ɵRender3NgModuleRef[T] protected () extends InternalNgModuleRef[T] {
  def this(ngModuleType: Type[T]) = this()
  def this(ngModuleType: Type[T], _parent: Injector) = this()
  var _parent: Injector | Null = js.native
  var _r3Injector: R3Injector = js.native
  var destroyCbs: js.Array[js.Function0[Unit]] | Null = js.native
  def get(token: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any): js.Any = js.native
  def get(token: js.Any, notFoundValue: js.Any, injectFlags: InjectFlags): js.Any = js.native
}

