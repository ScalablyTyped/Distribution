package typings.androiduix.android.view.ScaleGestureDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScaleGestureListener extends js.Object {
  def onScale(detector: typings.androiduix.android.view.ScaleGestureDetector): Boolean
  def onScaleBegin(detector: typings.androiduix.android.view.ScaleGestureDetector): Boolean
  def onScaleEnd(detector: typings.androiduix.android.view.ScaleGestureDetector): Unit
}

object OnScaleGestureListener {
  @scala.inline
  def apply(
    onScale: typings.androiduix.android.view.ScaleGestureDetector => Boolean,
    onScaleBegin: typings.androiduix.android.view.ScaleGestureDetector => Boolean,
    onScaleEnd: typings.androiduix.android.view.ScaleGestureDetector => Unit
  ): OnScaleGestureListener = {
    val __obj = js.Dynamic.literal(onScale = js.Any.fromFunction1(onScale), onScaleBegin = js.Any.fromFunction1(onScaleBegin), onScaleEnd = js.Any.fromFunction1(onScaleEnd))
  
    __obj.asInstanceOf[OnScaleGestureListener]
  }
}

