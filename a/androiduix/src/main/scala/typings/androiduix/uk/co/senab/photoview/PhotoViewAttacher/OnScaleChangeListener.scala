package typings.androiduix.uk.co.senab.photoview.PhotoViewAttacher

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnScaleChangeListener extends js.Object {
  def onScaleChange(scaleFactor: Double, focusX: Double, focusY: Double): Unit = js.native
}

object OnScaleChangeListener {
  @scala.inline
  def apply(onScaleChange: (Double, Double, Double) => Unit): OnScaleChangeListener = {
    val __obj = js.Dynamic.literal(onScaleChange = js.Any.fromFunction3(onScaleChange))
    __obj.asInstanceOf[OnScaleChangeListener]
  }
  @scala.inline
  implicit class OnScaleChangeListenerOps[Self <: OnScaleChangeListener] (val x: Self) extends AnyVal {
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
    def setOnScaleChange(value: (Double, Double, Double) => Unit): Self = this.set("onScaleChange", js.Any.fromFunction3(value))
  }
  
}

