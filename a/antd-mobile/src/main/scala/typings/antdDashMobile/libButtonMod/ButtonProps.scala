package typings.antdDashMobile.libButtonMod

import typings.antdDashMobile.antdDashMobileStrings.ghost
import typings.antdDashMobile.antdDashMobileStrings.large
import typings.antdDashMobile.antdDashMobileStrings.primary
import typings.antdDashMobile.antdDashMobileStrings.small
import typings.antdDashMobile.antdDashMobileStrings.warning
import typings.antdDashMobile.libButtonPropsTypeMod.ButtonPropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonProps extends ButtonPropsType {
  var activeClassName: js.UndefOr[String] = js.undefined
  var activeStyle: js.UndefOr[Boolean | CSSProperties] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var icon: js.UndefOr[ReactNode] = js.undefined
  var `inline`: js.UndefOr[Boolean] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLAnchorElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object ButtonProps {
  @scala.inline
  def apply(
    activeClassName: String = null,
    activeStyle: Boolean | CSSProperties = null,
    className: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: ReactNode = null,
    `inline`: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onClick: MouseEventHandler[HTMLAnchorElement] = null,
    prefixCls: String = null,
    role: String = null,
    size: large | small = null,
    style: CSSProperties = null,
    `type`: primary | warning | ghost = null
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

