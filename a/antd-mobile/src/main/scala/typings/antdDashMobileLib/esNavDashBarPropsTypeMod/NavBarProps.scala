package typings
package antdDashMobileLib.esNavDashBarPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavBarProps
  extends reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] {
  var icon: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var leftContent: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var mode: js.UndefOr[
    antdDashMobileLib.antdDashMobileLibStrings.dark | antdDashMobileLib.antdDashMobileLibStrings.light
  ] = js.undefined
  var onLeftClick: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var rightContent: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object NavBarProps {
  @scala.inline
  def apply(
    HTMLProps: reactLib.reactMod.HTMLProps[stdLib.HTMLDivElement] = null,
    className: java.lang.String = null,
    icon: reactLib.reactMod.ReactNode = null,
    leftContent: reactLib.reactMod.ReactNode = null,
    mode: antdDashMobileLib.antdDashMobileLibStrings.dark | antdDashMobileLib.antdDashMobileLibStrings.light = null,
    onLeftClick: reactLib.reactMod.MouseEventHandler[stdLib.HTMLDivElement] = null,
    prefixCls: java.lang.String = null,
    rightContent: reactLib.reactMod.ReactNode = null
  ): NavBarProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (className != null) __obj.updateDynamic("className")(className)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (leftContent != null) __obj.updateDynamic("leftContent")(leftContent.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onLeftClick != null) __obj.updateDynamic("onLeftClick")(onLeftClick)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (rightContent != null) __obj.updateDynamic("rightContent")(rightContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavBarProps]
  }
}

