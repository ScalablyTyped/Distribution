package typings.angularCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core", "\u0275Render3ComponentRef")
@js.native
class ɵRender3ComponentRef[T] protected () extends ComponentRef[T] {
  def this(
    componentType: Type[T],
    instance: T,
    location: ElementRef[_],
    _rootLView: ɵangularPackagesCoreCoreBo,
    _tNode: TContainerNode
  ) = this()
  def this(
    componentType: Type[T],
    instance: T,
    location: ElementRef[_],
    _rootLView: ɵangularPackagesCoreCoreBo,
    _tNode: TElementContainerNode
  ) = this()
  def this(
    componentType: Type[T],
    instance: T,
    location: ElementRef[_],
    _rootLView: ɵangularPackagesCoreCoreBo,
    _tNode: ɵangularPackagesCoreCoreBe
  ) = this()
  var _rootLView: js.Any = js.native
  var _tNode: js.Any = js.native
  @JSName("changeDetectorRef")
  var changeDetectorRef_FɵRender3ComponentRef: ChangeDetectorRef = js.native
  @JSName("componentType")
  var componentType_FɵRender3ComponentRef: Type[T] = js.native
  var destroyCbs: js.Array[js.Function0[Unit]] | Null = js.native
  @JSName("hostView")
  var hostView_FɵRender3ComponentRef: ViewRef2[T] = js.native
  @JSName("instance")
  var instance_FɵRender3ComponentRef: T = js.native
  @JSName("location")
  var location_FɵRender3ComponentRef: ElementRef[_] = js.native
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
}

