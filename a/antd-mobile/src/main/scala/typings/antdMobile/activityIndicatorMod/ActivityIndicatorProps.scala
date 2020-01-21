package typings.antdMobile.activityIndicatorMod

import typings.antdMobile.activityIndicatorPropsTypeMod.ActivityIndicatorPropTypes
import typings.antdMobile.antdMobileStrings.large
import typings.antdMobile.antdMobileStrings.small
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
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityIndicatorProps]
  }
}

