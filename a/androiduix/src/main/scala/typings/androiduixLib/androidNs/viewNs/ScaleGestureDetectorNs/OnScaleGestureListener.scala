package typings
package androiduixLib.androidNs.viewNs.ScaleGestureDetectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScaleGestureListener extends js.Object {
  def onScale(detector: androiduixLib.androidNs.viewNs.ScaleGestureDetector): scala.Boolean
  def onScaleBegin(detector: androiduixLib.androidNs.viewNs.ScaleGestureDetector): scala.Boolean
  def onScaleEnd(detector: androiduixLib.androidNs.viewNs.ScaleGestureDetector): scala.Unit
}

object OnScaleGestureListener {
  @scala.inline
  def apply(
    onScale: androiduixLib.androidNs.viewNs.ScaleGestureDetector => scala.Boolean,
    onScaleBegin: androiduixLib.androidNs.viewNs.ScaleGestureDetector => scala.Boolean,
    onScaleEnd: androiduixLib.androidNs.viewNs.ScaleGestureDetector => scala.Unit
  ): OnScaleGestureListener = {
    val __obj = js.Dynamic.literal(onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd))
  
    __obj.asInstanceOf[OnScaleGestureListener]
  }
}

