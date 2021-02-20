package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275Render3ComponentRef")
@js.native
class ɵRender3ComponentRef[T] protected () extends ComponentRef[T] {
  def this(
    componentType: typings.angularCore.mod.Type[T],
    instance: T,
    location: ElementRef[_],
    _rootLView: ɵangularPackagesCoreCoreBv,
    _tNode: TContainerNode
  ) = this()
  def this(
    componentType: typings.angularCore.mod.Type[T],
    instance: T,
    location: ElementRef[_],
    _rootLView: ɵangularPackagesCoreCoreBv,
    _tNode: TElementContainerNode
  ) = this()
  def this(
    componentType: typings.angularCore.mod.Type[T],
    instance: T,
    location: ElementRef[_],
    _rootLView: ɵangularPackagesCoreCoreBv,
    _tNode: ɵangularPackagesCoreCoreBh
  ) = this()
  
  var _rootLView: js.Any = js.native
  
  var _tNode: js.Any = js.native
  
  @JSName("changeDetectorRef")
  var changeDetectorRef_FɵRender3ComponentRef: ChangeDetectorRef = js.native
  
  @JSName("componentType")
  var componentType_FɵRender3ComponentRef: typings.angularCore.mod.Type[T] = js.native
  
  var destroyCbs: js.Array[js.Function0[Unit]] | Null = js.native
  
  @JSName("hostView")
  var hostView_FɵRender3ComponentRef: ViewRef2[T] = js.native
  
  @JSName("instance")
  var instance_FɵRender3ComponentRef: T = js.native
  
  @JSName("location")
  var location_FɵRender3ComponentRef: ElementRef[_] = js.native
  
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
}
