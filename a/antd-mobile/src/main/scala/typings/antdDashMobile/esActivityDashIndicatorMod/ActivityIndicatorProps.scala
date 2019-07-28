package typings.antdDashMobile.esActivityDashIndicatorMod

import typings.antdDashMobile.antdDashMobileStrings.large
import typings.antdDashMobile.antdDashMobileStrings.small
import typings.antdDashMobile.esActivityDashIndicatorPropsTypeMod.ActivityIndicatorPropTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorProps extends ActivityIndicatorPropTypes {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object ActivityIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    prefixCls: String = null,
    size: large | small = null,
    text: String = null,
    toast: js.UndefOr[Boolean] = js.undefined
  ): ActivityIndicatorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (className != null) __obj.updateDynamic("className")(className)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast)
    __obj.asInstanceOf[ActivityIndicatorProps]
  }
}

