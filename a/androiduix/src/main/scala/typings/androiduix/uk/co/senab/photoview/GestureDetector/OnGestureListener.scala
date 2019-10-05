package typings.androiduix.uk.co.senab.photoview.GestureDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGestureListener extends js.Object {
  def onDrag(dx: Double, dy: Double): Unit
  def onFling(startX: Double, startY: Double, velocityX: Double, velocityY: Double): Unit
  def onScale(scaleFactor: Double, focusX: Double, focusY: Double): Unit
}

object OnGestureListener {
  @scala.inline
  def apply(
    onDrag: (Double, Double) => Unit,
    onFling: (Double, Double, Double, Double) => Unit,
    onScale: (Double, Double, Double) => Unit
  ): OnGestureListener = {
    val __obj = js.Dynamic.literal(onDrag = js.Any.fromFunction2(onDrag), onFling = js.Any.fromFunction4(onFling), onScale = js.Any.fromFunction3(onScale))
  
    __obj.asInstanceOf[OnGestureListener]
  }
}

