package typings
package antdDashMobileDashRnLib.libWingDashBlankIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankProps
  extends antdDashMobileDashRnLib.libWingDashBlankPropsTypeMod.WingBlankPropsType {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object WingBlankProps {
  @scala.inline
  def apply(
    size: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.sm | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.md | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.lg = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): WingBlankProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankProps]
  }
}

