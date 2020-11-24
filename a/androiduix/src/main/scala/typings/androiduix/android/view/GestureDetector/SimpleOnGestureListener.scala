package typings.androiduix.android.view.GestureDetector

import typings.androiduix.android.view.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleOnGestureListener
  extends OnGestureListener
     with OnDoubleTapListener
object SimpleOnGestureListener {
  
  @scala.inline
  def apply(
    onDoubleTap: MotionEvent => Boolean,
    onDoubleTapEvent: MotionEvent => Boolean,
    onDown: MotionEvent => Boolean,
    onFling: (MotionEvent, MotionEvent, Double, Double) => Boolean,
    onLongPress: MotionEvent => Unit,
    onScroll: (MotionEvent, MotionEvent, Double, Double) => Boolean,
    onShowPress: MotionEvent => Unit,
    onSingleTapConfirmed: MotionEvent => Boolean,
    onSingleTapUp: MotionEvent => Boolean
  ): SimpleOnGestureListener = {
    val __obj = js.Dynamic.literal(onDoubleTap = js.Any.fromFunction1(onDoubleTap), onDoubleTapEvent = js.Any.fromFunction1(onDoubleTapEvent), onDown = js.Any.fromFunction1(onDown), onFling = js.Any.fromFunction4(onFling), onLongPress = js.Any.fromFunction1(onLongPress), onScroll = js.Any.fromFunction4(onScroll), onShowPress = js.Any.fromFunction1(onShowPress), onSingleTapConfirmed = js.Any.fromFunction1(onSingleTapConfirmed), onSingleTapUp = js.Any.fromFunction1(onSingleTapUp))
    __obj.asInstanceOf[SimpleOnGestureListener]
  }
}
