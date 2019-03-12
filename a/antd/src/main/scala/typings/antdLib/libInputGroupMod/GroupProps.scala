package typings
package antdLib.libInputGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupProps extends js.Object {
  var children: js.UndefOr[js.Any] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[stdLib.HTMLSpanElement]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.ReactNs.FocusEventHandler[stdLib.HTMLSpanElement]] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLSpanElement]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLSpanElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

object GroupProps {
  @scala.inline
  def apply(
    children: js.Any = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    onBlur: reactLib.reactMod.ReactNs.FocusEventHandler[stdLib.HTMLSpanElement] = null,
    onFocus: reactLib.reactMod.ReactNs.FocusEventHandler[stdLib.HTMLSpanElement] = null,
    onMouseEnter: reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLSpanElement] = null,
    onMouseLeave: reactLib.reactMod.ReactNs.MouseEventHandler[stdLib.HTMLSpanElement] = null,
    prefixCls: java.lang.String = null,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
  ): GroupProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
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

