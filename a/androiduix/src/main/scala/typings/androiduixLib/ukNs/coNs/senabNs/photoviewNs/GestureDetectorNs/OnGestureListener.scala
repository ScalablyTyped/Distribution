package typings
package androiduixLib.ukNs.coNs.senabNs.photoviewNs.GestureDetectorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGestureListener extends js.Object {
  def onDrag(dx: scala.Double, dy: scala.Double): scala.Unit
  def onFling(startX: scala.Double, startY: scala.Double, velocityX: scala.Double, velocityY: scala.Double): scala.Unit
  def onScale(scaleFactor: scala.Double, focusX: scala.Double, focusY: scala.Double): scala.Unit
}

object OnGestureListener {
  @scala.inline
  def apply(
    onDrag: js.Function2[scala.Double, scala.Double, scala.Unit],
    onFling: js.Function4[scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    onScale: js.Function3[scala.Double, scala.Double, scala.Double, scala.Unit]
  ): OnGestureListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onDrag")(onDrag)
    __obj.updateDynamic("onFling")(onFling)
    __obj.updateDynamic("onScale")(onScale)
    __obj.asInstanceOf[OnGestureListener]
  }
}

