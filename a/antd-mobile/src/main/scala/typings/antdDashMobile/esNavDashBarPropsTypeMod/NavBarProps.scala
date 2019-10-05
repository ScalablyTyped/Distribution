package typings.antdDashMobile.esNavDashBarPropsTypeMod

import typings.antdDashMobile.antdDashMobileStrings.dark
import typings.antdDashMobile.antdDashMobileStrings.light
import typings.react.NativeMouseEvent
import typings.react.reactMod.HTMLProps
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavBarProps extends HTMLProps[HTMLDivElement] {
  var icon: js.UndefOr[ReactNode] = js.undefined
  var leftContent: js.UndefOr[ReactNode] = js.undefined
  var mode: js.UndefOr[dark | light] = js.undefined
  var onLeftClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rightContent: js.UndefOr[ReactNode] = js.undefined
}

object NavBarProps {
  @scala.inline
  def apply(
    HTMLProps: HTMLProps[HTMLDivElement] = null,
    className: String = null,
    icon: ReactNode = null,
    leftContent: ReactNode = null,
    mode: dark | light = null,
    onLeftClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    rightContent: ReactNode = null
  ): NavBarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (leftContent != null) __obj.updateDynamic("leftContent")(leftContent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onLeftClick != null) __obj.updateDynamic("onLeftClick")(js.Any.fromFunction1(onLeftClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rightContent != null) __obj.updateDynamic("rightContent")(rightContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavBarProps]
  }
}

