package typings
package antdDashMobileLib.libButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps
  extends antdDashMobileLib.libButtonPropsTypeMod.ButtonPropsType {
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  var activeStyle: js.UndefOr[scala.Boolean | reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var icon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var `inline`: js.UndefOr[scala.Boolean] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLAnchorElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    activeClassName: java.lang.String = null,
    activeStyle: scala.Boolean | reactLib.reactMod.ReactNs.CSSProperties = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: reactLib.reactMod.ReactNs.ReactNode = null,
    `inline`: js.UndefOr[scala.Boolean] = js.undefined,
    loading: js.UndefOr[scala.Boolean] = js.undefined,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLAnchorElement] = null,
    prefixCls: java.lang.String = null,
    role: java.lang.String = null,
    size: antdDashMobileLib.antdDashMobileLibStrings.large | antdDashMobileLib.antdDashMobileLibStrings.small = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    `type`: antdDashMobileLib.antdDashMobileLibStrings.primary | antdDashMobileLib.antdDashMobileLibStrings.warning | antdDashMobileLib.antdDashMobileLibStrings.ghost = null
  ): ButtonProps = {
    val __obj = js.Dynamic.literal()
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName)
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(`inline`)) __obj.updateDynamic("inline")(`inline`)
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (role != null) __obj.updateDynamic("role")(role)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonProps]
  }
}

