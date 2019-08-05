package typings.antd.libTagMod

import typings.react.reactMod.CSSProperties
import typings.react.reactMod.HTMLAttributes
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagProps extends HTMLAttributes[HTMLSpanElement] {
  var afterClose: js.UndefOr[js.Function] = js.undefined
  var closable: js.UndefOr[Boolean] = js.undefined
  var onClose: js.UndefOr[js.Function] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var visible: js.UndefOr[Boolean] = js.undefined
}

object TagProps {
  @scala.inline
  def apply(
    HTMLAttributes: HTMLAttributes[HTMLSpanElement] = null,
    afterClose: js.Function = null,
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    onClose: js.Function = null,
    prefixCls: String = null,
    style: CSSProperties = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): TagProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (afterClose != null) __obj.updateDynamic("afterClose")(afterClose)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable)
    if (color != null) __obj.updateDynamic("color")(color)
    if (onClose != null) __obj.updateDynamic("onClose")(onClose)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[TagProps]
  }
}

