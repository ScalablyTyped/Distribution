package typings.androiduix.uk.co.senab.photoview.GestureDetector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnGestureListener extends js.Object {
  def onDrag(dx: Double, dy: Double): Unit = js.native
  def onFling(startX: Double, startY: Double, velocityX: Double, velocityY: Double): Unit = js.native
  def onScale(scaleFactor: Double, focusX: Double, focusY: Double): Unit = js.native
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
  @scala.inline
  implicit class OnGestureListenerOps[Self <: OnGestureListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnDrag(value: (Double, Double) => Unit): Self = this.set("onDrag", js.Any.fromFunction2(value))
    @scala.inline
    def setOnFling(value: (Double, Double, Double, Double) => Unit): Self = this.set("onFling", js.Any.fromFunction4(value))
    @scala.inline
    def setOnScale(value: (Double, Double, Double) => Unit): Self = this.set("onScale", js.Any.fromFunction3(value))
  }
  
}

