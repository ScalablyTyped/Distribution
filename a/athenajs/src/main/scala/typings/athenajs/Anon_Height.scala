package typings.athenajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  var height: Double
  var hitBox: js.UndefOr[Anon_X] = js.undefined
  var offsetX: Double
  var offsetY: Double
  var plane: js.UndefOr[Double] = js.undefined
  var width: Double
}

object Anon_Height {
  @scala.inline
  def apply(
    height: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double,
    hitBox: Anon_X = null,
    plane: Int | Double = null
  ): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, offsetX = offsetX, offsetY = offsetY, width = width)
    if (hitBox != null) __obj.updateDynamic("hitBox")(hitBox)
    if (plane != null) __obj.updateDynamic("plane")(plane.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Height]
  }
}

