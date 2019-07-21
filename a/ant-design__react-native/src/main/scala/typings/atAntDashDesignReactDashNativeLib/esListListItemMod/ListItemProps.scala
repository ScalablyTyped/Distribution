package typings
package atAntDashDesignReactDashNativeLib.esListListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends atAntDashDesignReactDashNativeLib.esListPropsTypeMod.ListItemPropsType
     with atAntDashDesignReactDashNativeLib.esStyleMod.WithThemeStyles[atAntDashDesignReactDashNativeLib.esListStyleMod.ListStyle] {
  var onPress: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    activeStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    align: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.top | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.middle | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.bottom = null,
    arrow: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.horizontal | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.down | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.up | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.empty | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.Empty = null,
    children: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    multipleLine: js.UndefOr[scala.Boolean] = js.undefined,
    onPress: () => scala.Unit = null,
    onPressIn: () => scala.Unit = null,
    onPressOut: () => scala.Unit = null,
    platform: atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.android | atAntDashDesignReactDashNativeLib.atAntDashDesignReactDashNativeLibStrings.ios = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: stdLib.Partial[atAntDashDesignReactDashNativeLib.esListStyleMod.ListStyle] = null,
    thumb: reactLib.reactMod.ReactNode = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine)
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ListItemProps]
  }
}

