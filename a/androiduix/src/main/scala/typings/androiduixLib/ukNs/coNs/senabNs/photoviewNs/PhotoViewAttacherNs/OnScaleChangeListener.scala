package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs.PhotoViewAttacherNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnScaleChangeListener extends js.Object {
  def onScaleChange(scaleFactor: scala.Double, focusX: scala.Double, focusY: scala.Double): scala.Unit
}

object OnScaleChangeListener {
  @scala.inline
  def apply(onScaleChange: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit]): OnScaleChangeListener = {
    val __obj = js.Dynamic.literal(onScaleChange = onScaleChange)
  
    __obj.asInstanceOf[OnScaleChangeListener]
  }
}

