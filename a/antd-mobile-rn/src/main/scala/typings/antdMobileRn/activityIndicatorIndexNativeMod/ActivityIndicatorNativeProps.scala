package typings.antdMobileRn.activityIndicatorIndexNativeMod

import typings.antdMobileRn.activityIndicatorPropsTypeMod.ActivityIndicatorPropTypes
import typings.antdMobileRn.antdMobileRnStrings.large
import typings.antdMobileRn.antdMobileRnStrings.small
import typings.antdMobileRn.styleIndexDotnativeMod.IActivityIndicatorStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorNativeProps extends ActivityIndicatorPropTypes {
  var color: js.UndefOr[String] = js.undefined
  var styles: js.UndefOr[IActivityIndicatorStyle] = js.undefined
}

object ActivityIndicatorNativeProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    size: large | small = null,
    styles: IActivityIndicatorStyle = null,
    text: String = null,
    toast: js.UndefOr[Boolean] = js.undefined
  ): ActivityIndicatorNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityIndicatorNativeProps]
  }
}

