package typings.antdMobile.progressPropsTypeMod

import typings.antdMobile.antdMobileStrings.fixed
import typings.antdMobile.antdMobileStrings.normal
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
    percent: js.UndefOr[Double] = js.undefined,
    position: fixed | normal = null,
    unfilled: js.UndefOr[Boolean] = js.undefined
  ): ProgressPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(appearTransition)) __obj.updateDynamic("appearTransition")(appearTransition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(percent)) __obj.updateDynamic("percent")(percent.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(unfilled)) __obj.updateDynamic("unfilled")(unfilled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressPropsType]
  }
}

