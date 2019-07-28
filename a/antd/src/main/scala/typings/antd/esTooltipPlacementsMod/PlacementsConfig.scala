package typings.antd.esTooltipPlacementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsConfig extends js.Object {
  var arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined
  var arrowWidth: js.UndefOr[Double] = js.undefined
  var autoAdjustOverflow: js.UndefOr[Boolean | AdjustOverflow] = js.undefined
  var horizontalArrowShift: js.UndefOr[Double] = js.undefined
  var verticalArrowShift: js.UndefOr[Double] = js.undefined
}

object PlacementsConfig {
  @scala.inline
  def apply(
    arrowPointAtCenter: js.UndefOr[Boolean] = js.undefined,
    arrowWidth: Int | Double = null,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    horizontalArrowShift: Int | Double = null,
    verticalArrowShift: Int | Double = null
  ): PlacementsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter)
    if (arrowWidth != null) __obj.updateDynamic("arrowWidth")(arrowWidth.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (horizontalArrowShift != null) __obj.updateDynamic("horizontalArrowShift")(horizontalArrowShift.asInstanceOf[js.Any])
    if (verticalArrowShift != null) __obj.updateDynamic("verticalArrowShift")(verticalArrowShift.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementsConfig]
  }
}

