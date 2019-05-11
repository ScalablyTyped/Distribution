package typings
package antdDashMobileLib.esActivityDashIndicatorPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorPropTypes extends js.Object {
  var animating: js.UndefOr[scala.Boolean] = js.undefined
  var size: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.large | antdDashMobileLib.antdDashMobileLibStrings.small
  ] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var toast: js.UndefOr[scala.Boolean] = js.undefined
}

object ActivityIndicatorPropTypes {
  @scala.inline
  def apply(
    animating: js.UndefOr[scala.Boolean] = js.undefined,
    size: antdDashMobileLib.antdDashMobileLibStrings.large | antdDashMobileLib.antdDashMobileLibStrings.small = null,
    text: java.lang.String = null,
    toast: js.UndefOr[scala.Boolean] = js.undefined
  ): ActivityIndicatorPropTypes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast)
    __obj.asInstanceOf[ActivityIndicatorPropTypes]
  }
}

