package typings.androiduix.android.view.GestureDetector

import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDoubleTapListener extends js.Object {
  def onDoubleTap(e: MotionEvent): Boolean
  def onDoubleTapEvent(e: MotionEvent): Boolean
  def onSingleTapConfirmed(e: MotionEvent): Boolean
}

object OnDoubleTapListener {
  @scala.inline
  def apply(
    onDoubleTap: MotionEvent => Boolean,
    onDoubleTapEvent: MotionEvent => Boolean,
    onSingleTapConfirmed: MotionEvent => Boolean
  ): OnDoubleTapListener = {
    val __obj = js.Dynamic.literal(onDoubleTap = js.Any.fromFunction1(onDoubleTap), onDoubleTapEvent = js.Any.fromFunction1(onDoubleTapEvent), onSingleTapConfirmed = js.Any.fromFunction1(onSingleTapConfirmed))
    __obj.asInstanceOf[OnDoubleTapListener]
  }
}

