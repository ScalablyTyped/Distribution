package typings.androiduix.androidNs.viewNs.ScaleGestureDetectorNs

import typings.androiduix.androidNs.viewNs.ScaleGestureDetector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScaleGestureListener extends js.Object {
  def onScale(detector: ScaleGestureDetector): Boolean
  def onScaleBegin(detector: ScaleGestureDetector): Boolean
  def onScaleEnd(detector: ScaleGestureDetector): Unit
}

object OnScaleGestureListener {
  @scala.inline
  def apply(
    onScale: ScaleGestureDetector => Boolean,
    onScaleBegin: ScaleGestureDetector => Boolean,
    onScaleEnd: ScaleGestureDetector => Unit
  ): OnScaleGestureListener = {
    val __obj = js.Dynamic.literal(onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd))
  
    __obj.asInstanceOf[OnScaleGestureListener]
  }
}

