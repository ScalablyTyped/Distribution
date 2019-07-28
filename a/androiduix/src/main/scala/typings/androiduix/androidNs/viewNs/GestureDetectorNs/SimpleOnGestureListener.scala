package typings.androiduix.androidNs.viewNs.GestureDetectorNs

import typings.androiduix.androidNs.viewNs.MotionEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.GestureDetector.SimpleOnGestureListener")
@js.native
class SimpleOnGestureListener ()
  extends OnGestureListener
     with OnDoubleTapListener {
  /* CompleteClass */
  override def onDoubleTap(e: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onDoubleTapEvent(e: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onDown(e: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onFling(e1: MotionEvent, e2: MotionEvent, velocityX: Double, velocityY: Double): Boolean = js.native
  /* CompleteClass */
  override def onLongPress(e: MotionEvent): Unit = js.native
  /* CompleteClass */
  override def onScroll(e1: MotionEvent, e2: MotionEvent, distanceX: Double, distanceY: Double): Boolean = js.native
  /* CompleteClass */
  override def onShowPress(e: MotionEvent): Unit = js.native
  /* CompleteClass */
  override def onSingleTapConfirmed(e: MotionEvent): Boolean = js.native
  /* CompleteClass */
  override def onSingleTapUp(e: MotionEvent): Boolean = js.native
}

