package typings.androiduix.android.support.v4.widget.DrawerLayout

import typings.androiduix.android.support.v4.widget.ViewDragHelper
import typings.androiduix.android.support.v4.widget.ViewDragHelper.Callback
import typings.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewDragCallback extends Callback {
  var _DrawerLayout_this: typings.androiduix.android.support.v4.widget.DrawerLayout = js.native
  var mAbsGravity: js.Any = js.native
  var mDragger: js.Any = js.native
  var mPeekRunnable: js.Any = js.native
  /* private */ def closeOtherDrawer(): js.Any = js.native
  /* private */ def peekDrawer(): js.Any = js.native
  def removeCallbacks(): Unit = js.native
  def setDragger(dragger: ViewDragHelper): Unit = js.native
}

object ViewDragCallback {
  @scala.inline
  def apply(
    _DrawerLayout_this: typings.androiduix.android.support.v4.widget.DrawerLayout,
    clampViewPositionHorizontal: (View, Double, Double) => Double,
    clampViewPositionVertical: (View, Double, Double) => Double,
    closeOtherDrawer: () => js.Any,
    getOrderedChildIndex: Double => Double,
    getViewHorizontalDragRange: View => Double,
    getViewVerticalDragRange: View => Double,
    mAbsGravity: js.Any,
    mDragger: js.Any,
    mPeekRunnable: js.Any,
    onEdgeDragStarted: (Double, Double) => Unit,
    onEdgeLock: Double => Boolean,
    onEdgeTouched: (Double, Double) => Unit,
    onViewCaptured: (View, Double) => Unit,
    onViewDragStateChanged: Double => Unit,
    onViewPositionChanged: (View, Double, Double, Double, Double) => Unit,
    onViewReleased: (View, Double, Double) => Unit,
    peekDrawer: () => js.Any,
    removeCallbacks: () => Unit,
    setDragger: ViewDragHelper => Unit,
    tryCaptureView: (View, Double) => Boolean
  ): ViewDragCallback = {
    val __obj = js.Dynamic.literal(_DrawerLayout_this = _DrawerLayout_this.asInstanceOf[js.Any], clampViewPositionHorizontal = js.Any.fromFunction3(clampViewPositionHorizontal), clampViewPositionVertical = js.Any.fromFunction3(clampViewPositionVertical), closeOtherDrawer = js.Any.fromFunction0(closeOtherDrawer), getOrderedChildIndex = js.Any.fromFunction1(getOrderedChildIndex), getViewHorizontalDragRange = js.Any.fromFunction1(getViewHorizontalDragRange), getViewVerticalDragRange = js.Any.fromFunction1(getViewVerticalDragRange), mAbsGravity = mAbsGravity.asInstanceOf[js.Any], mDragger = mDragger.asInstanceOf[js.Any], mPeekRunnable = mPeekRunnable.asInstanceOf[js.Any], onEdgeDragStarted = js.Any.fromFunction2(onEdgeDragStarted), onEdgeLock = js.Any.fromFunction1(onEdgeLock), onEdgeTouched = js.Any.fromFunction2(onEdgeTouched), onViewCaptured = js.Any.fromFunction2(onViewCaptured), onViewDragStateChanged = js.Any.fromFunction1(onViewDragStateChanged), onViewPositionChanged = js.Any.fromFunction5(onViewPositionChanged), onViewReleased = js.Any.fromFunction3(onViewReleased), peekDrawer = js.Any.fromFunction0(peekDrawer), removeCallbacks = js.Any.fromFunction0(removeCallbacks), setDragger = js.Any.fromFunction1(setDragger), tryCaptureView = js.Any.fromFunction2(tryCaptureView))
    __obj.asInstanceOf[ViewDragCallback]
  }
  @scala.inline
  implicit class ViewDragCallbackOps[Self <: ViewDragCallback] (val x: Self) extends AnyVal {
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
    def set_DrawerLayout_this(value: typings.androiduix.android.support.v4.widget.DrawerLayout): Self = this.set("_DrawerLayout_this", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseOtherDrawer(value: () => js.Any): Self = this.set("closeOtherDrawer", js.Any.fromFunction0(value))
    @scala.inline
    def setMAbsGravity(value: js.Any): Self = this.set("mAbsGravity", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDragger(value: js.Any): Self = this.set("mDragger", value.asInstanceOf[js.Any])
    @scala.inline
    def setMPeekRunnable(value: js.Any): Self = this.set("mPeekRunnable", value.asInstanceOf[js.Any])
    @scala.inline
    def setPeekDrawer(value: () => js.Any): Self = this.set("peekDrawer", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveCallbacks(value: () => Unit): Self = this.set("removeCallbacks", js.Any.fromFunction0(value))
    @scala.inline
    def setSetDragger(value: ViewDragHelper => Unit): Self = this.set("setDragger", js.Any.fromFunction1(value))
  }
  
}

