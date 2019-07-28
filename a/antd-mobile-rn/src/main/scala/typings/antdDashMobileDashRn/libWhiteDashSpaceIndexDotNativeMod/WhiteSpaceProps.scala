package typings.antdDashMobileDashRn.libWhiteDashSpaceIndexDotNativeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.lg
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.md
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.sm
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.xl
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.xs
import typings.antdDashMobileDashRn.libWhiteDashSpacePropsTypeMod.WhiteSpacePropsType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends WhiteSpacePropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(size: xs | sm | md | lg | xl = null, style: StyleProp[ViewStyle] = null): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

