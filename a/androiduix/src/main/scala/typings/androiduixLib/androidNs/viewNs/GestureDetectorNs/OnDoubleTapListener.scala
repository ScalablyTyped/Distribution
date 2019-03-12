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
    onDoubleTap: androiduixLib.androidNs.viewNs.MotionEvent => scala.Boolean,
    onDoubleTapEvent: androiduixLib.androidNs.viewNs.MotionEvent => scala.Boolean,
    onSingleTapConfirmed: androiduixLib.androidNs.viewNs.MotionEvent => scala.Boolean
  ): OnDoubleTapListener = {
    val __obj = js.Dynamic.literal(onDoubleTap = js.Any.fromFunction1(onDoubleTap), onDoubleTapEvent = js.Any.fromFunction1(onDoubleTapEvent), onSingleTapConfirmed = js.Any.fromFunction1(onSingleTapConfirmed))
  
    __obj.asInstanceOf[OnDoubleTapListener]
  }
}

