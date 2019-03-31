package typings
package antdDashMobileDashRnLib.libActivityDashIndicatorIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityIndicatorNativeProps
  extends antdDashMobileDashRnLib.libActivityDashIndicatorPropsTypeMod.ActivityIndicatorPropTypes {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var styles: js.UndefOr[
    antdDashMobileDashRnLib.libActivityDashIndicatorStyleIndexDotNativeMod.IActivityIndicatorStyle
  ] = js.undefined
}

object ActivityIndicatorNativeProps {
  @scala.inline
  def apply(
    animating: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    size: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.large | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.small = null,
    styles: antdDashMobileDashRnLib.libActivityDashIndicatorStyleIndexDotNativeMod.IActivityIndicatorStyle = null,
    text: java.lang.String = null,
    toast: js.UndefOr[scala.Boolean] = js.undefined
  ): ActivityIndicatorNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animating)) __obj.updateDynamic("animating")(animating)
    if (color != null) __obj.updateDynamic("color")(color)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(toast)) __obj.updateDynamic("toast")(toast)
    __obj.asInstanceOf[ActivityIndicatorNativeProps]
  }
}

