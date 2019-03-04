package typings
package androiduixLib.androidNs.viewNs.GestureDetectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnDoubleTapListener extends js.Object {
  def onDoubleTap(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean
  def onDoubleTapEvent(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean
  def onSingleTapConfirmed(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean
}

object OnDoubleTapListener {
  @scala.inline
  def apply(
    onDoubleTap: js.Function1[androiduixLib.androidNs.viewNs.MotionEvent, scala.Boolean],
    onDoubleTapEvent: js.Function1[androiduixLib.androidNs.viewNs.MotionEvent, scala.Boolean],
    onSingleTapConfirmed: js.Function1[androiduixLib.androidNs.viewNs.MotionEvent, scala.Boolean]
  ): OnDoubleTapListener = {
    val __obj = js.Dynamic.literal(onDoubleTap = onDoubleTap, onDoubleTapEvent = onDoubleTapEvent, onSingleTapConfirmed = onSingleTapConfirmed)
  
    __obj.asInstanceOf[OnDoubleTapListener]
  }
}

