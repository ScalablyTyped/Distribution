package typings.antdDashMobileDashRn.libListListItemDotNativeMod

import typings.antdDashMobileDashRn.Anon_Arrow
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings._empty
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.android
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.bottom
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.down
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.empty
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.horizontal
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.ios
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.middle
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.top
import typings.antdDashMobileDashRn.antdDashMobileDashRnStrings.up
import typings.antdDashMobileDashRn.libListPropsTypeMod.ListItemPropsType
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.StyleProp
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps extends ListItemPropsType {
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressIn: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onPressOut: js.UndefOr[js.Function0[Unit]] = js.undefined
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  var styles: js.UndefOr[Anon_Arrow] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    activeStyle: StyleProp[ViewStyle] = null,
    align: top | middle | bottom = null,
    arrow: horizontal | down | up | empty | _empty = null,
    children: ReactNode = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    extra: ReactNode = null,
    multipleLine: js.UndefOr[Boolean] = js.undefined,
    onClick: () => Unit = null,
    onPressIn: () => Unit = null,
    onPressOut: () => Unit = null,
    platform: android | ios = null,
    style: StyleProp[ViewStyle] = null,
    styles: Anon_Arrow = null,
    thumb: ReactNode = null,
    wrap: js.UndefOr[Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction0(onClick))
    if (onPressIn != null) __obj.updateDynamic("onPressIn")(js.Any.fromFunction0(onPressIn))
    if (onPressOut != null) __obj.updateDynamic("onPressOut")(js.Any.fromFunction0(onPressOut))
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemProps]
  }
}

