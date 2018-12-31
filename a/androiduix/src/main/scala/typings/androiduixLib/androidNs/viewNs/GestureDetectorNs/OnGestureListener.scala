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

