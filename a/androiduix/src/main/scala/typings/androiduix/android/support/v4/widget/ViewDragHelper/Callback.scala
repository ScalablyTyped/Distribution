package typings.androiduix.android.support.v4.widget.ViewDragHelper

import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Callback extends js.Object {
  
  def clampViewPositionHorizontal(child: View, left: Double, dx: Double): Double = js.native
  
  def clampViewPositionVertical(child: View, top: Double, dy: Double): Double = js.native
  
  def getOrderedChildIndex(index: Double): Double = js.native
  
  def getViewHorizontalDragRange(child: View): Double = js.native
  
  def getViewVerticalDragRange(child: View): Double = js.native
  
  def onEdgeDragStarted(edgeFlags: Double, pointerId: Double): Unit = js.native
  
  def onEdgeLock(edgeFlags: Double): Boolean = js.native
  
  def onEdgeTouched(edgeFlags: Double, pointerId: Double): Unit = js.native
  
  def onViewCaptured(capturedChild: View, activePointerId: Double): Unit = js.native
  
  def onViewDragStateChanged(state: Double): Unit = js.native
  
  def onViewPositionChanged(changedView: View, left: Double, top: Double, dx: Double, dy: Double): Unit = js.native
  
  def onViewReleased(releasedChild: View, xvel: Double, yvel: Double): Unit = js.native
  
  def tryCaptureView(child: View, pointerId: Double): Boolean = js.native
}
object Callback {
  
  @scala.inline
  def apply(
    clampViewPositionHorizontal: (View, Double, Double) => Double,
    clampViewPositionVertical: (View, Double, Double) => Double,
    getOrderedChildIndex: Double => Double,
    getViewHorizontalDragRange: View => Double,
    getViewVerticalDragRange: View => Double,
    onEdgeDragStarted: (Double, Double) => Unit,
    onEdgeLock: Double => Boolean,
    onEdgeTouched: (Double, Double) => Unit,
    onViewCaptured: (View, Double) => Unit,
    onViewDragStateChanged: Double => Unit,
    onViewPositionChanged: (View, Double, Double, Double, Double) => Unit,
    onViewReleased: (View, Double, Double) => Unit,
    tryCaptureView: (View, Double) => Boolean
  ): Callback = {
    val __obj = js.Dynamic.literal(clampViewPositionHorizontal = js.Any.fromFunction3(clampViewPositionHorizontal), clampViewPositionVertical = js.Any.fromFunction3(clampViewPositionVertical), getOrderedChildIndex = js.Any.fromFunction1(getOrderedChildIndex), getViewHorizontalDragRange = js.Any.fromFunction1(getViewHorizontalDragRange), getViewVerticalDragRange = js.Any.fromFunction1(getViewVerticalDragRange), onEdgeDragStarted = js.Any.fromFunction2(onEdgeDragStarted), onEdgeLock = js.Any.fromFunction1(onEdgeLock), onEdgeTouched = js.Any.fromFunction2(onEdgeTouched), onViewCaptured = js.Any.fromFunction2(onViewCaptured), onViewDragStateChanged = js.Any.fromFunction1(onViewDragStateChanged), onViewPositionChanged = js.Any.fromFunction5(onViewPositionChanged), onViewReleased = js.Any.fromFunction3(onViewReleased), tryCaptureView = js.Any.fromFunction2(tryCaptureView))
    __obj.asInstanceOf[Callback]
  }
  
  @scala.inline
  implicit class CallbackOps[Self <: Callback] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClampViewPositionHorizontal(value: (View, Double, Double) => Double): Self = this.set("clampViewPositionHorizontal", js.Any.fromFunction3(value))
    
    @scala.inline
    def setClampViewPositionVertical(value: (View, Double, Double) => Double): Self = this.set("clampViewPositionVertical", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetOrderedChildIndex(value: Double => Double): Self = this.set("getOrderedChildIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetViewHorizontalDragRange(value: View => Double): Self = this.set("getViewHorizontalDragRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetViewVerticalDragRange(value: View => Double): Self = this.set("getViewVerticalDragRange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEdgeDragStarted(value: (Double, Double) => Unit): Self = this.set("onEdgeDragStarted", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnEdgeLock(value: Double => Boolean): Self = this.set("onEdgeLock", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEdgeTouched(value: (Double, Double) => Unit): Self = this.set("onEdgeTouched", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnViewCaptured(value: (View, Double) => Unit): Self = this.set("onViewCaptured", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnViewDragStateChanged(value: Double => Unit): Self = this.set("onViewDragStateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnViewPositionChanged(value: (View, Double, Double, Double, Double) => Unit): Self = this.set("onViewPositionChanged", js.Any.fromFunction5(value))
    
    @scala.inline
    def setOnViewReleased(value: (View, Double, Double) => Unit): Self = this.set("onViewReleased", js.Any.fromFunction3(value))
    
    @scala.inline
    def setTryCaptureView(value: (View, Double) => Boolean): Self = this.set("tryCaptureView", js.Any.fromFunction2(value))
  }
}
