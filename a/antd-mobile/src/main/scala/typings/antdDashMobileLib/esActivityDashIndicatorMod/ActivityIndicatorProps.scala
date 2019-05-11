package typings
package antdDashMobileLib.esActivityDashIndicatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorProps
  extends antdDashMobileLib.esActivityDashIndicatorPropsTypeMod.ActivityIndicatorPropTypes {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object ActivityIndicatorProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    prefixCls: java.lang.String = null,
    size: antdDashMobileLib.antdDashMobileLibStrings.large | antdDashMobileLib.antdDashMobileLibStrings.small = null,
    text: java.lang.String = null,
    toast: js.UndefOr[scala.Boolean] = js.undefined
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

