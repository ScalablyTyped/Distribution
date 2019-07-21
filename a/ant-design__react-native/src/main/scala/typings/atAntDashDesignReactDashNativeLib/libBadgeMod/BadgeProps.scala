package typings
package atAntDashDesignReactDashNativeLib.libBadgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeProps
  extends atAntDashDesignReactDashNativeLib.libStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.libBadgeStyleMod.BadgeStyle] {
  var corner: js.UndefOr[scala.Boolean] = js.undefined
  var dot: js.UndefOr[scala.Boolean] = js.undefined
  var overflowCount: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[
    atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.large | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.small
  ] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var text: js.UndefOr[js.Any] = js.undefined
}

object BadgeProps {
  @scala.inline
  def apply(
    corner: js.UndefOr[scala.Boolean] = js.undefined,
    dot: js.UndefOr[scala.Boolean] = js.undefined,
    overflowCount: scala.Int | scala.Double = null,
    size: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.large | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.small = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.libBadgeStyleMod.BadgeStyle] = null,
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

