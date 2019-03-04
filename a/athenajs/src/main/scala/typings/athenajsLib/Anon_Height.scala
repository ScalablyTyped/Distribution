package typings
package athenajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: scala.Double
  var hitBox: js.UndefOr[Anon_X] = js.undefined
  var offsetX: scala.Double
  var offsetY: scala.Double
  var plane: js.UndefOr[scala.Double] = js.undefined
  var width: scala.Double
}

object Anon_Height {
  @scala.inline
  def apply(
    height: scala.Double,
    offsetX: scala.Double,
    offsetY: scala.Double,
    width: scala.Double,
    hitBox: Anon_X = null,
    plane: scala.Int | scala.Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, offsetX = offsetX, offsetY = offsetY, width = width)
    if (hitBox != null) __obj.updateDynamic("hitBox")(hitBox)
    if (plane != null) __obj.updateDynamic("plane")(plane.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

