package typings
package antdLib.libIconMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var component: js.UndefOr[reactLib.reactMod.ReactNs.ComponentType[CustomIconComponentProps]] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLElement]] = js.undefined
  var onKeyUp: js.UndefOr[reactLib.reactMod.ReactNs.KeyboardEventHandler[stdLib.HTMLElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var role: js.UndefOr[java.lang.String] = js.undefined
  var rotate: js.UndefOr[scala.Double] = js.undefined
  var spin: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[scala.Double] = js.undefined
  var theme: js.UndefOr[ThemeType] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var twoToneColor: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    component: reactLib.reactMod.ReactNs.ComponentType[CustomIconComponentProps] = null,
    onClick: reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLElement] = null,
    onKeyUp: reactLib.reactMod.ReactNs.KeyboardEventHandler[stdLib.HTMLElement] = null,
    prefixCls: java.lang.String = null,
    role: java.lang.String = null,
    rotate: scala.Int | scala.Double = null,
    spin: js.UndefOr[scala.Boolean] = js.undefined,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    tabIndex: scala.Int | scala.Double = null,
    theme: ThemeType = null,
    title: java.lang.String = null,
    twoToneColor: java.lang.String = null,
    `type`: java.lang.String = null,
    viewBox: java.lang.String = null
  ): IconProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onKeyUp != null) __obj.updateDynamic("onKeyUp")(onKeyUp)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (role != null) __obj.updateDynamic("role")(role)
    if (rotate != null) __obj.updateDynamic("rotate")(rotate.asInstanceOf[js.Any])
    if (!js.isUndefined(spin)) __obj.updateDynamic("spin")(spin)
    if (style != null) __obj.updateDynamic("style")(style)
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (title != null) __obj.updateDynamic("title")(title)
    if (twoToneColor != null) __obj.updateDynamic("twoToneColor")(twoToneColor)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[IconProps]
  }
}

