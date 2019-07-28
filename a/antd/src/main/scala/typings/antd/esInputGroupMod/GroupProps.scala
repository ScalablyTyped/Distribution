package typings.antd.esInputGroupMod

import typings.antd.antdStrings.default
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.FocusEventHandler
import typings.react.reactMod.MouseEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupProps extends js.Object {
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var compact: js.UndefOr[Boolean] = js.undefined
  var onBlur: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
  var onFocus: js.UndefOr[FocusEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLSpanElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[large | small | default] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
}

object GroupProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    className: String = null,
    compact: js.UndefOr[Boolean] = js.undefined,
    onBlur: FocusEventHandler[HTMLSpanElement] = null,
    onFocus: FocusEventHandler[HTMLSpanElement] = null,
    onMouseEnter: MouseEventHandler[HTMLSpanElement] = null,
    onMouseLeave: MouseEventHandler[HTMLSpanElement] = null,
    prefixCls: String = null,
    size: large | small | default = null,
    style: CSSProperties = null
  ): GroupProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[GroupProps]
  }
}

