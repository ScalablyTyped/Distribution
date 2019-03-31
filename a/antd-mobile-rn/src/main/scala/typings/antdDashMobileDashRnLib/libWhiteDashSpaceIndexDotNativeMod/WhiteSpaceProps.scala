package typings
package antdDashMobileDashRnLib.libWhiteDashSpaceIndexDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps
  extends antdDashMobileDashRnLib.libWhiteDashSpacePropsTypeMod.WhiteSpacePropsType {
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(
    size: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xs | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.sm | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.md | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.lg | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.xl = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null
  ): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

