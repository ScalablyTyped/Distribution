package typings
package antdLib.libTooltipPlacementsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementsConfig extends js.Object {
  var arrowPointAtCenter: js.UndefOr[scala.Boolean] = js.undefined
  var arrowWidth: js.UndefOr[scala.Double] = js.undefined
  var autoAdjustOverflow: js.UndefOr[js.Any] = js.undefined
  var horizontalArrowShift: js.UndefOr[scala.Double] = js.undefined
  var verticalArrowShift: js.UndefOr[scala.Double] = js.undefined
}

object PlacementsConfig {
  @scala.inline
  def apply(
    arrowPointAtCenter: js.UndefOr[scala.Boolean] = js.undefined,
    arrowWidth: scala.Int | scala.Double = null,
    autoAdjustOverflow: js.Any = null,
    horizontalArrowShift: scala.Int | scala.Double = null,
    verticalArrowShift: scala.Int | scala.Double = null
  ): PlacementsConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowPointAtCenter)) __obj.updateDynamic("arrowPointAtCenter")(arrowPointAtCenter)
    if (arrowWidth != null) __obj.updateDynamic("arrowWidth")(arrowWidth.asInstanceOf[js.Any])
    if (autoAdjustOverflow != null) __obj.updateDynamic("autoAdjustOverflow")(autoAdjustOverflow)
    if (horizontalArrowShift != null) __obj.updateDynamic("horizontalArrowShift")(horizontalArrowShift.asInstanceOf[js.Any])
    if (verticalArrowShift != null) __obj.updateDynamic("verticalArrowShift")(verticalArrowShift.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementsConfig]
  }
}

