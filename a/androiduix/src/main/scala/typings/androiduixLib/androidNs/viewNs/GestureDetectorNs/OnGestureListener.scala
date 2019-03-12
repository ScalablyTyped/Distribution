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
    onDown: androiduixLib.androidNs.viewNs.MotionEvent => scala.Boolean,
    onFling: (androiduixLib.androidNs.viewNs.MotionEvent, androiduixLib.androidNs.viewNs.MotionEvent, scala.Double, scala.Double) => scala.Boolean,
    onLongPress: androiduixLib.androidNs.viewNs.MotionEvent => scala.Unit,
    onScroll: (androiduixLib.androidNs.viewNs.MotionEvent, androiduixLib.androidNs.viewNs.MotionEvent, scala.Double, scala.Double) => scala.Boolean,
    onShowPress: androiduixLib.androidNs.viewNs.MotionEvent => scala.Unit,
    onSingleTapUp: androiduixLib.androidNs.viewNs.MotionEvent => scala.Boolean
  ): OnGestureListener = {
    val __obj = js.Dynamic.literal(onDown = js.Any.fromFunction1(onDown), onFling = js.Any.fromFunction4(onFling), onLongPress = js.Any.fromFunction1(onLongPress), onScroll = js.Any.fromFunction4(onScroll), onShowPress = js.Any.fromFunction1(onShowPress), onSingleTapUp = js.Any.fromFunction1(onSingleTapUp))
  
    __obj.asInstanceOf[OnGestureListener]
  }
}

