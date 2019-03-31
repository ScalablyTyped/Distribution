package typings
package antdDashMobileDashRnLib.libBadgeIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeNativeProps
  extends antdDashMobileDashRnLib.libBadgePropsTypeMod.BadgePropsTypes {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[antdDashMobileDashRnLib.libBadgeStyleIndexDotNativeMod.IBadgeStyle] = js.undefined
}

object BadgeNativeProps {
  @scala.inline
  def apply(
    corner: js.UndefOr[scala.Boolean] = js.undefined,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    overflowCount: scala.Int | scala.Double = null,
    size: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.large | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.small = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: antdDashMobileDashRnLib.libBadgeStyleIndexDotNativeMod.IBadgeStyle = null,
    text: js.Any = null
  ): BadgeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BadgeNativeProps]
  }
}

