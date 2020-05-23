package typings.antDesignReactNative.badgeMod

import typings.antDesignReactNative.antDesignReactNativeStrings.large
import typings.antDesignReactNative.antDesignReactNativeStrings.small
import typings.antDesignReactNative.badgeStyleMod.BadgeStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps extends WithThemeStyles[BadgeStyle] {
  var corner: js.UndefOr[Boolean] = js.undefined
  var dot: js.UndefOr[Boolean] = js.undefined
  var overflowCount: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[large | small] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var text: js.UndefOr[js.Any] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    corner: js.UndefOr[Boolean] = js.undefined,
    dot: js.UndefOr[Boolean] = js.undefined,
    overflowCount: js.UndefOr[Double] = js.undefined,
    size: large | small = null,
    style: js.UndefOr[Null | StyleProp[ViewStyle]] = js.undefined,
    styles: Partial[BadgeStyle] = null,
    text: js.Any = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot.get.asInstanceOf[js.Any])
    if (!js.isUndefined(overflowCount)) __obj.updateDynamic("overflowCount")(overflowCount.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeProps]
  }
}

