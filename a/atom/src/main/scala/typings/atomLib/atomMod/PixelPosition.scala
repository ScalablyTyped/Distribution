package typings
package atomLib.atomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelPosition extends js.Object {
  var left: scala.Double
  var top: scala.Double
}

object PixelPosition {
  @scala.inline
  def apply(left: scala.Double, top: scala.Double): PixelPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[PixelPosition]
  }
}

