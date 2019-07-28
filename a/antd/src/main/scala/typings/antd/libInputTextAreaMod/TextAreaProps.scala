package typings.antd.libInputTextAreaMod

import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  var autosize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
  var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object TextAreaProps {
  @scala.inline
  def apply(
    TextareaHTMLAttributes: TextareaHTMLAttributes[HTMLTextAreaElement] = null,
    autosize: Boolean | AutoSizeType = null,
    onPressEnter: KeyboardEventHandler[HTMLTextAreaElement] = null,
    prefixCls: String = null
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, TextareaHTMLAttributes)
    if (autosize != null) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(onPressEnter)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[TextAreaProps]
  }
}

