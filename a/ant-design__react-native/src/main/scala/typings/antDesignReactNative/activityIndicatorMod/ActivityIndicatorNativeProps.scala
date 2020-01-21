package typings.antDesignReactNative.activityIndicatorMod

import typings.antDesignReactNative.activityIndicatorStyleMod.ActivityIndicatorStyle
import typings.antDesignReactNative.antDesignReactNativeStrings.large
import typings.antDesignReactNative.antDesignReactNativeStrings.small
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorNativeProps extends WithThemeStyles[ActivityIndicatorStyle] {
  var animating: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[large | small] = js.undefined
  @JSName("styles")
  var styles_ActivityIndicatorNativeProps: js.UndefOr[ActivityIndicatorStyle] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var toast: js.UndefOr[Boolean] = js.undefined
}

object ActivityIndicatorNativeProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    size: large | small = null,
    styles: ActivityIndicatorStyle = null,
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

