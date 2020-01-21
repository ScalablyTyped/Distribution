package typings.athenajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  var height: Double
  var hitBox: js.UndefOr[AnonX] = js.undefined
  var offsetX: Double
  var offsetY: Double
  var plane: js.UndefOr[Double] = js.undefined
  var width: Double
}

object AnonHeight {
  @scala.inline
  def apply(
    height: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double,
    hitBox: AnonX = null,
    plane: Int | Double = null
  ): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (hitBox != null) __obj.updateDynamic("hitBox")(hitBox.asInstanceOf[js.Any])
    if (plane != null) __obj.updateDynamic("plane")(plane.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

