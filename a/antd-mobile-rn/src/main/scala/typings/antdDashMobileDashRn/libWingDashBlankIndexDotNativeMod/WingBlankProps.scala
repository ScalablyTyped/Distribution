package typings.antdDashMobileDashRn.libWingDashBlankIndexDotNativeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.lg
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.md
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.sm
import typings.antdDashMobileDashRn.libWingDashBlankPropsTypeMod.WingBlankPropsType
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WingBlankProps extends WingBlankPropsType {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object WingBlankProps {
  @scala.inline
  def apply(size: sm | md | lg = null, style: StyleProp[ViewStyle] = null): WingBlankProps = {
    val __obj = js.Dynamic.literal()
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WingBlankProps]
  }
}

