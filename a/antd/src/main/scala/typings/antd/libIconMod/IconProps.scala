package typings.antd.libIconMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ComponentType
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IconProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[ComponentType[CustomIconComponentProps]] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
  var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var role: js.UndefOr[String] = js.undefined
  var rotate: js.UndefOr[Double] = js.undefined
  var spin: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabIndex: js.UndefOr[Double] = js.undefined
  var theme: js.UndefOr[ThemeType] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var twoToneColor: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
}

object IconProps {
  @scala.inline
  def apply(
    className: String = null,
    component: ComponentType[CustomIconComponentProps] = null,
    onClick: MouseEventHandler[HTMLElement] = null,
    onKeyUp: KeyboardEventHandler[HTMLElement] = null,
    prefixCls: String = null,
    role: String = null,
    rotate: Int | Double = null,
    spin: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    tabIndex: Int | Double = null,
    theme: ThemeType = null,
    title: String = null,
    twoToneColor: String = null,
    `type`: String = null,
    viewBox: String = null
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

