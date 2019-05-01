package typings
package antdDashMobileLib.libListListItemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItemProps
  extends antdDashMobileLib.libListPropsTypeMod.ListItemPropsType {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
}

object ListItemProps {
  @scala.inline
  def apply(
    activeStyle: reactLib.reactMod.CSSProperties = null,
    align: antdDashMobileLib.antdDashMobileLibStrings.top | antdDashMobileLib.antdDashMobileLibStrings.middle | antdDashMobileLib.antdDashMobileLibStrings.bottom = null,
    arrow: antdDashMobileLib.antdDashMobileLibStrings.horizontal | antdDashMobileLib.antdDashMobileLibStrings.down | antdDashMobileLib.antdDashMobileLibStrings.up | antdDashMobileLib.antdDashMobileLibStrings.empty | antdDashMobileLib.antdDashMobileLibStrings.Empty = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.UndefOr[scala.Boolean] = js.undefined,
    extra: reactLib.reactMod.ReactNode = null,
    multipleLine: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement] = null,
    platform: antdDashMobileLib.antdDashMobileLibStrings.android | antdDashMobileLib.antdDashMobileLibStrings.ios = null,
    prefixCls: java.lang.String = null,
    role: java.lang.String = null,
    style: reactLib.reactMod.CSSProperties = null,
    thumb: reactLib.reactMod.ReactNode = null,
    wrap: js.UndefOr[scala.Boolean] = js.undefined
  ): ListItemProps = {
    val __obj = js.Dynamic.literal()
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle)
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (arrow != null) __obj.updateDynamic("arrow")(arrow.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error)
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleLine)) __obj.updateDynamic("multipleLine")(multipleLine)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (role != null) __obj.updateDynamic("role")(role)
    if (style != null) __obj.updateDynamic("style")(style)
    if (thumb != null) __obj.updateDynamic("thumb")(thumb.asInstanceOf[js.Any])
    if (!js.isUndefined(wrap)) __obj.updateDynamic("wrap")(wrap)
    __obj.asInstanceOf[ListItemProps]
  }
}

