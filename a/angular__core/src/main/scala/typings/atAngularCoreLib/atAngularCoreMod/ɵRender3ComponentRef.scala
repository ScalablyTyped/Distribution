package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "ɵRender3ComponentRef")
@js.native
class ɵRender3ComponentRef[T] protected () extends ComponentRef[T] {
  def this(componentType: Type[T], instance: T, location: ElementRef[_], _rootLView: ɵangular_packages_core_core_bm, _tNode: TContainerNode) = this()
  def this(componentType: Type[T], instance: T, location: ElementRef[_], _rootLView: ɵangular_packages_core_core_bm, _tNode: TElementContainerNode) = this()
  def this(componentType: Type[T], instance: T, location: ElementRef[_], _rootLView: ɵangular_packages_core_core_bm, _tNode: ɵangular_packages_core_core_bg) = this()
  var _rootLView: js.Any = js.native
  var _tNode: js.Any = js.native
  @JSName("componentType")
  var componentType_ɵRender3ComponentRef: Type[T] = js.native
  var destroyCbs: js.Array[js.Function0[scala.Unit]] | scala.Null = js.native
  @JSName("hostView")
  var hostView_ɵRender3ComponentRef: ViewRef_2[T] = js.native
  def onDestroy(callback: js.Function0[scala.Unit]): scala.Unit = js.native
}

