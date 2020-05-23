package typings.athenajs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Height extends js.Object {
  var height: Double
  var hitBox: js.UndefOr[X] = js.undefined
  var offsetX: Double
  var offsetY: Double
  var plane: js.UndefOr[Double] = js.undefined
  var width: Double
}

object Height {
  @scala.inline
  def apply(
    height: Double,
    offsetX: Double,
    offsetY: Double,
    width: Double,
    hitBox: X = null,
    plane: js.UndefOr[Double] = js.undefined
  ): Height = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (hitBox != null) __obj.updateDynamic("hitBox")(hitBox.asInstanceOf[js.Any])
    if (!js.isUndefined(plane)) __obj.updateDynamic("plane")(plane.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
}

