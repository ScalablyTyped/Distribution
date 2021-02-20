package typings.androiduix.android.view

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.ViewOverlay.OverlayViewGroup
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewOverlay extends StObject {
  
  def add(drawable: Drawable): Unit = js.native
  
  def clear(): Unit = js.native
  
  def getOverlayView(): ViewGroup = js.native
  
  def isEmpty(): Boolean = js.native
  
  var mOverlayViewGroup: OverlayViewGroup = js.native
  
  def remove(drawable: Drawable): Unit = js.native
}
object ViewOverlay {
  
  @scala.inline
  def apply(
    add: Drawable => Unit,
    clear: () => Unit,
    getOverlayView: () => ViewGroup,
    isEmpty: () => Boolean,
    mOverlayViewGroup: OverlayViewGroup,
    remove: Drawable => Unit
  ): ViewOverlay = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), clear = js.Any.fromFunction0(clear), getOverlayView = js.Any.fromFunction0(getOverlayView), isEmpty = js.Any.fromFunction0(isEmpty), mOverlayViewGroup = mOverlayViewGroup.asInstanceOf[js.Any], remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ViewOverlay]
  }
  
  @js.native
  trait OverlayViewGroup extends ViewGroup {
    
    def add(child: View): js.Any = js.native
    def add(drawable: Drawable): js.Any = js.native
    
    /* private */ def addDrawable(drawable: js.Any): js.Any = js.native
    
    def clear(): Unit = js.native
    
    def isEmpty(): Boolean = js.native
    
    var mDrawables: Set[Drawable] = js.native
    
    var mHostView: View = js.native
  }
  
  @scala.inline
  implicit class ViewOverlayMutableBuilder[Self <: ViewOverlay] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: Drawable => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOverlayView(value: () => ViewGroup): Self = StObject.set(x, "getOverlayView", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMOverlayViewGroup(value: OverlayViewGroup): Self = StObject.set(x, "mOverlayViewGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemove(value: Drawable => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
