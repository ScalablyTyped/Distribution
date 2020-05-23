package typings.antdMobileRn.badgeIndexNativeMod

import typings.antdMobileRn.antdMobileRnStrings.large
import typings.antdMobileRn.antdMobileRnStrings.small
import typings.antdMobileRn.badgePropsTypeMod.BadgePropsTypes
import typings.antdMobileRn.badgeStyleIndexNativeMod.IBadgeStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
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
    overflowCount: js.UndefOr[Double] = js.undefined,
    size: large | small = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: IBadgeStyle = null,
    text: js.Any = null
  ): BadgeNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowCount)) __obj.updateDynamic("overflowCount")(overflowCount.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeNativeProps]
  }
}

