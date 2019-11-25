package typings.antdDashMobileDashRn.libBadgeIndexDotNativeMod

import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.large
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.small
import typings.antdDashMobileDashRn.libBadgePropsTypeMod.BadgePropsTypes
import typings.antdDashMobileDashRn.libBadgeStyleIndexDotNativeMod.IBadgeStyle
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeNativeProps extends BadgePropsTypes {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[IBadgeStyle] = js.undefined
}

object BadgeNativeProps {
  @scala.inline
  def apply(
    corner: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    overflowCount: Int | Double = null,
    size: large | small = null,
    style: StyleProp[ViewStyle] = null,
    styles: IBadgeStyle = null,
    text: js.Any = null
  ): BadgeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.asInstanceOf[js.Any])
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeNativeProps]
  }
}

