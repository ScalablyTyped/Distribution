package typings
package antdDashMobileDashRnLib.libCarouselIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginationProps extends js.Object {
  var count: scala.Double
  var current: scala.Double
  var dotActiveStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var dotStyle: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.Any
  var vertical: js.UndefOr[scala.Boolean] = js.undefined
}

object PaginationProps {
  @scala.inline
  def apply(
    count: scala.Double,
    current: scala.Double,
    styles: js.Any,
    dotActiveStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    dotStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    vertical: js.UndefOr[scala.Boolean] = js.undefined
  ): PaginationProps = {
    val __obj = js.Dynamic.literal(count = count, current = current, styles = styles)
    if (dotActiveStyle != null) __obj.updateDynamic("dotActiveStyle")(dotActiveStyle.asInstanceOf[js.Any])
    if (dotStyle != null) __obj.updateDynamic("dotStyle")(dotStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[PaginationProps]
  }
}

