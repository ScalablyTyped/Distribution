package typings.androiduix.android.view.GestureDetector

import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGestureListener extends js.Object {
  def onDown(e: MotionEvent): Boolean = js.native
  def onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Double, velocityY: Double): Boolean = js.native
  def onLongPress(e: MotionEvent): Unit = js.native
  def onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Double, distanceY: Double): Boolean = js.native
  def onShowPress(e: MotionEvent): Unit = js.native
  def onSingleTapUp(e: MotionEvent): Boolean = js.native
}

object OnGestureListener {
  @scala.inline
  def apply(
    onDown: MotionEvent => Boolean,
    onFling: (MotionEvent, MotionEvent, Double, Double) => Boolean,
    onLongPress: MotionEvent => Unit,
    onScroll: (MotionEvent, MotionEvent, Double, Double) => Boolean,
    onShowPress: MotionEvent => Unit,
    onSingleTapUp: MotionEvent => Boolean
  ): OnGestureListener = {
    val __obj = js.Dynamic.literal(onDown = js.Any.fromFunction1(onDown), onFling = js.Any.fromFunction4(onFling), onLongPress = js.Any.fromFunction1(onLongPress), onScroll = js.Any.fromFunction4(onScroll), onShowPress = js.Any.fromFunction1(onShowPress), onSingleTapUp = js.Any.fromFunction1(onSingleTapUp))
    __obj.asInstanceOf[OnGestureListener]
  }
  @scala.inline
  implicit class OnGestureListenerOps[Self <: OnGestureListener] (val x: Self) extends AnyVal {
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
    def setOnDown(value: MotionEvent => Boolean): Self = this.set("onDown", js.Any.fromFunction1(value))
    @scala.inline
    def setOnFling(value: (MotionEvent, MotionEvent, Double, Double) => Boolean): Self = this.set("onFling", js.Any.fromFunction4(value))
    @scala.inline
    def setOnLongPress(value: MotionEvent => Unit): Self = this.set("onLongPress", js.Any.fromFunction1(value))
    @scala.inline
    def setOnScroll(value: (MotionEvent, MotionEvent, Double, Double) => Boolean): Self = this.set("onScroll", js.Any.fromFunction4(value))
    @scala.inline
    def setOnShowPress(value: MotionEvent => Unit): Self = this.set("onShowPress", js.Any.fromFunction1(value))
    @scala.inline
    def setOnSingleTapUp(value: MotionEvent => Boolean): Self = this.set("onSingleTapUp", js.Any.fromFunction1(value))
  }
  
}

