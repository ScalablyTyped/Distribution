package typings
package androiduixLib.androidNs.viewNs.GestureDetectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.GestureDetector.SimpleOnGestureListener")
@js.native
class SimpleOnGestureListener ()
  extends OnGestureListener
     with OnDoubleTapListener {
  /* CompleteClass */
  override def onDoubleTap(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onDoubleTapEvent(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onDown(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onFling(
    e1: androiduixLib.androidNs.viewNs.MotionEvent,
    e2: androiduixLib.androidNs.viewNs.MotionEvent,
    velocityX: scala.Double,
    velocityY: scala.Double
  ): scala.Boolean = js.native
  /* CompleteClass */
  override def onLongPress(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Unit = js.native
  /* CompleteClass */
  override def onScroll(
    e1: androiduixLib.androidNs.viewNs.MotionEvent,
    e2: androiduixLib.androidNs.viewNs.MotionEvent,
    distanceX: scala.Double,
    distanceY: scala.Double
  ): scala.Boolean = js.native
  /* CompleteClass */
  override def onShowPress(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Unit = js.native
  /* CompleteClass */
  override def onSingleTapConfirmed(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
  /* CompleteClass */
  override def onSingleTapUp(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean = js.native
}

