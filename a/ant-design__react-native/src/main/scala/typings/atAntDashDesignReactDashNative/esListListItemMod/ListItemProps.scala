package typings.atAntDashDesignReactDashNative.esListListItemMod

import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.Empty
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.android
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.bottom
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.down
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.empty
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.horizontal
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.ios
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.middle
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.top
import typings.atAntDashDesignReactDashNative.atAntDashDesignReactDashNativeStrings.up
import typings.atAntDashDesignReactDashNative.esListPropsTypeMod.ListItemPropsType
import typings.atAntDashDesignReactDashNative.esListStyleMod.ListStyle
import typings.atAntDashDesignReactDashNative.esStyleMod.WithThemeStyles
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends ListItemPropsType
     with WithThemeStyles[ListStyle] {
  var onPress: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    activeStyle: StyleProp[ViewStyle] = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | Empty = null,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    onPress: () => Unit = null,
    onPressIn: () => Unit = null,
    onPressOut: () => Unit = null,
    platform: android | ios = null,
    style: StyleProp[ViewStyle] = null,
    styles: Partial[ListStyle] = null,
    thumb: ReactNode = null,
    wrap: js.UndefOr[Boolean] = js.undefined
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

