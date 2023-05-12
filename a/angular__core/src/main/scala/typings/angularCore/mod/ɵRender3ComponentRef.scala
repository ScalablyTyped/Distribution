package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core", "\u0275Render3ComponentRef")
@js.native
open class ɵRender3ComponentRef[T] protected () extends ComponentRef[T] {
  def this(
    componentType: Type[T],
    instance: T,
    location: ElementRef[Any],
    _rootLView: LView[Any],
    _tNode: TContainerNode
  ) = this()
  def this(
    componentType: Type[T],
    instance: T,
    location: ElementRef[Any],
    _rootLView: LView[Any],
    _tNode: TElementContainerNode
  ) = this()
  def this(
    componentType: Type[T],
    instance: T,
    location: ElementRef[Any],
    _rootLView: LView[Any],
    _tNode: TElementNode
  ) = this()
  
  /* private */ var _rootLView: Any = js.native
  
  /* private */ var _tNode: Any = js.native
  
  @JSName("changeDetectorRef")
  var changeDetectorRef_FɵRender3ComponentRef: ChangeDetectorRef = js.native
  
  @JSName("componentType")
  var componentType_FɵRender3ComponentRef: Type[T] = js.native
  
  @JSName("hostView")
  var hostView_FɵRender3ComponentRef: ɵViewRef[T] = js.native
  
  @JSName("instance")
  var instance_FɵRender3ComponentRef: T = js.native
  
  @JSName("location")
  var location_FɵRender3ComponentRef: ElementRef[Any] = js.native
  
  def onDestroy(callback: js.Function0[Unit]): Unit = js.native
  
  /* private */ var previousInputValues: Any = js.native
}
