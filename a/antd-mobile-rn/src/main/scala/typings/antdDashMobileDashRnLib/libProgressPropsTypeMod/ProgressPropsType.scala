package typings
package antdDashMobileDashRnLib.libProgressPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressPropsType extends js.Object {
  var appearTransition: js.UndefOr[scala.Boolean] = js.undefined
  var percent: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[
    antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.fixed | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.normal
  ] = js.undefined
  var unfilled: js.UndefOr[scala.Boolean] = js.undefined
}

object ProgressPropsType {
  @scala.inline
  def apply(
    appearTransition: js.UndefOr[scala.Boolean] = js.undefined,
    percent: scala.Int | scala.Double = null,
    position: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.fixed | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.normal = null,
    unfilled: js.UndefOr[scala.Boolean] = js.undefined
  ): ProgressPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled)
    __obj.asInstanceOf[ProgressPropsType]
  }
}

