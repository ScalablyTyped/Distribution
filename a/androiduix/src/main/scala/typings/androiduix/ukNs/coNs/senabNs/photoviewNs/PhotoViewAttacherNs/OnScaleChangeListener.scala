package typings.androiduix.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScaleChangeListener extends js.Object {
  def onScaleChange(scaleFactor: Double, focusX: Double, focusY: Double): Unit
}

object OnScaleChangeListener {
  @scala.inline
  def apply(onScaleChange: (Double, Double, Double) => Unit): OnScaleChangeListener = {
    val __obj = js.Dynamic.literal(onScaleChange = js.Any.fromFunction3(onScaleChange))
  
    __obj.asInstanceOf[OnScaleChangeListener]
  }
}

