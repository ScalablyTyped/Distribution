package typings.antd.placementsMod

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
    arrowWidth: js.UndefOr[Double] = js.undefined,
    autoAdjustOverflow: Boolean | AdjustOverflow = null,
    horizontalArrowShift: js.UndefOr[Double] = js.undefined,
    verticalArrowShift: js.UndefOr[Double] = js.undefined
  ): PlacementsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(arrowWidth)) __obj.updateDynamic("arrowWidth")(arrowWidth.get.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow.asInstanceOf[js.Any])
    if (!js.isUndefined(horizontalArrowShift)) __obj.updateDynamic("horizontalArrowShift")(horizontalArrowShift.get.asInstanceOf[js.Any])
    if (!js.isUndefined(verticalArrowShift)) __obj.updateDynamic("verticalArrowShift")(verticalArrowShift.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementsConfig]
  }
}

