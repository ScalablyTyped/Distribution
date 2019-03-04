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
    onScale: js.Function1[androiduixLib.androidNs.viewNs.ScaleGestureDetector, scala.Boolean],
    onScaleBegin: js.Function1[androiduixLib.androidNs.viewNs.ScaleGestureDetector, scala.Boolean],
    onScaleEnd: js.Function1[androiduixLib.androidNs.viewNs.ScaleGestureDetector, scala.Unit]
  ): OnScaleGestureListener = {
    val __obj = js.Dynamic.literal(onScale = onScale, onScaleBegin = onScaleBegin, onScaleEnd = onScaleEnd)
  
    __obj.asInstanceOf[OnScaleGestureListener]
  }
}

