package typings.atAntDashDesignReactDashNative.libBadgeMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.large
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.small
import typings.atAntDashDesignReactDashNative.libBadgeStyleMod.BadgeStyle
import typings.atAntDashDesignReactDashNative.libStyleMod.WithThemeStyles
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
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
    overflowCount: Int | Double = null,
    size: large | small = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[BadgeStyle] = null,
    text: js.Any = null
  ): BadgeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(corner)) __obj.updateDynamic("corner")(corner)
    if (!js.isUndefined(dot)) __obj.updateDynamic("dot")(dot)
    if (overflowCount != null) __obj.updateDynamic("overflowCount")(overflowCount.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[BadgeProps]
  }
}

