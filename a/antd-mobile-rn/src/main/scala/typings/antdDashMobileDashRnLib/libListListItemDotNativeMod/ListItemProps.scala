package typings
package antdDashMobileDashRnLib.libListListItemDotNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends antdDashMobileDashRnLib.libListPropsTypeMod.ListItemPropsType {
  var onClick: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var style: js.UndefOr[
    reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle]
  ] = js.undefined
  var styles: js.UndefOr[antdDashMobileDashRnLib.Anon_Arrow] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    activeStyle: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    align: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.top | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.middle | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.bottom = null,
    arrow: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.horizontal | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.down | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.up | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.empty | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.Empty = null,
    children: reactLib.reactMod.ReactNode = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    multipleLine: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: () => scala.Unit = null,
    onPressIn: () => scala.Unit = null,
    onPressOut: () => scala.Unit = null,
    platform: antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.android | antdDashMobileDashRnLib.antdDashMobileDashRnLibStrings.ios = null,
    style: reactDashNativeLib.reactDashNativeMod.StyleProp[reactDashNativeLib.reactDashNativeMod.ViewStyle] = null,
    styles: antdDashMobileDashRnLib.Anon_Arrow = null,
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
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
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

