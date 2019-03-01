package typings
package androiduixLib.androidNs.viewNs.GestureDetectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGestureListener extends js.Object {
  def onDown(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean
  def onFling(
    e1: androiduixLib.androidNs.viewNs.MotionEvent,
    e2: androiduixLib.androidNs.viewNs.MotionEvent,
    velocityX: scala.Double,
    velocityY: scala.Double
  ): scala.Boolean
  def onLongPress(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Unit
  def onScroll(
    e1: androiduixLib.androidNs.viewNs.MotionEvent,
    e2: androiduixLib.androidNs.viewNs.MotionEvent,
    distanceX: scala.Double,
    distanceY: scala.Double
  ): scala.Boolean
  def onShowPress(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Unit
  def onSingleTapUp(e: androiduixLib.androidNs.viewNs.MotionEvent): scala.Boolean
}

object OnGestureListener {
  @scala.inline
  def apply(
    onDown: js.Function1[androiduixLib.androidNs.viewNs.MotionEvent, scala.Boolean],
    onFling: js.Function4[
      androiduixLib.androidNs.viewNs.MotionEvent, 
      androiduixLib.androidNs.viewNs.MotionEvent, 
      scala.Double, 
      scala.Double, 
      scala.Boolean
    ],
    onLongPress: js.Function1[androiduixLib.androidNs.viewNs.MotionEvent, scala.Unit],
    onScroll: js.Function4[
      androiduixLib.androidNs.viewNs.MotionEvent, 
      androiduixLib.androidNs.viewNs.MotionEvent, 
      scala.Double, 
      scala.Double, 
      scala.Boolean
    ],
    onShowPress: js.Function1[androiduixLib.androidNs.viewNs.MotionEvent, scala.Unit],
    onSingleTapUp: js.Function1[androiduixLib.androidNs.viewNs.MotionEvent, scala.Boolean]
  ): OnGestureListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDown")(onDown)
    __obj.updateDynamic("onFling")(onFling)
    __obj.updateDynamic("onLongPress")(onLongPress)
    __obj.updateDynamic("onScroll")(onScroll)
    __obj.updateDynamic("onShowPress")(onShowPress)
    __obj.updateDynamic("onSingleTapUp")(onSingleTapUp)
    __obj.asInstanceOf[OnGestureListener]
  }
}

