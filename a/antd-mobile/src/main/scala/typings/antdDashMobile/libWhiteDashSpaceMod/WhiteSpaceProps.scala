package typings.antdDashMobile.libWhiteDashSpaceMod

import typings.antdDashMobile.antdDashMobileStrings.lg
import typings.antdDashMobile.antdDashMobileStrings.md
import typings.antdDashMobile.antdDashMobileStrings.sm
import typings.antdDashMobile.antdDashMobileStrings.xl
import typings.antdDashMobile.antdDashMobileStrings.xs
import typings.antdDashMobile.libWhiteDashSpacePropsTypeMod.WhiteSpacePropsType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.NativeMouseEvent
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhiteSpaceProps extends WhiteSpacePropsType {
  var className: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object WhiteSpaceProps {
  @scala.inline
  def apply(
    className: String = null,
    onClick: MouseEvent[HTMLDivElement, NativeMouseEvent] => Unit = null,
    prefixCls: String = null,
    size: xs | sm | md | lg | xl = null,
    style: CSSProperties = null
  ): WhiteSpaceProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[WhiteSpaceProps]
  }
}

