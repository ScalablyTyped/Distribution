package typings.antdDashMobile.esProgressPropsTypeMod

import typings.antdDashMobile.antdDashMobileStrings.fixed
import typings.antdDashMobile.antdDashMobileStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressPropsType extends js.Object {
  var appearTransition: js.UndefOr[Boolean] = js.undefined
  var percent: js.UndefOr[Double] = js.undefined
  var position: js.UndefOr[fixed | normal] = js.undefined
  var unfilled: js.UndefOr[Boolean] = js.undefined
}

object ProgressPropsType {
  @scala.inline
  def apply(
    appearTransition: js.UndefOr[Boolean] = js.undefined,
    percent: Int | Double = null,
    position: fixed | normal = null,
    unfilled: js.UndefOr[Boolean] = js.undefined
  ): ProgressPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition)
    if (percent != null) __obj.updateDynamic("percent")(percent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled)
    __obj.asInstanceOf[ProgressPropsType]
  }
}

