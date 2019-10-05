package typings.androiduix.android.view.GestureDetector

import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGestureListener extends js.Object {
  def onDown(e: MotionEvent): Boolean
  def onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Double, velocityY: Double): Boolean
  def onLongPress(e: MotionEvent): Unit
  def onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Double, distanceY: Double): Boolean
  def onShowPress(e: MotionEvent): Unit
  def onSingleTapUp(e: MotionEvent): Boolean
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
}

