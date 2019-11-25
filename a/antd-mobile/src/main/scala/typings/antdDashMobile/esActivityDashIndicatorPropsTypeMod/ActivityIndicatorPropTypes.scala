package typings.antdDashMobile.esActivityDashIndicatorPropsTypeMod

import typings.antdDashMobile.antdDashMobileStrings.large
import typings.antdDashMobile.antdDashMobileStrings.small
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorPropTypes extends js.Object {
  var animating: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[large | small] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var toast: js.UndefOr[Boolean] = js.undefined
}

object ActivityIndicatorPropTypes {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    size: large | small = null,
    text: String = null,
    toast: js.UndefOr[Boolean] = js.undefined
  ): ActivityIndicatorPropTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityIndicatorPropTypes]
  }
}

