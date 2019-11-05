package typings.antd.libInputTextAreaMod

import typings.antd.libInputResizableTextAreaMod.AutoSizeType
import typings.react.reactMod.KeyboardEvent
import typings.react.reactMod.KeyboardEventHandler
import typings.react.reactMod.TextareaHTMLAttributes
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps extends TextareaHTMLAttributes[HTMLTextAreaElement] {
  var allowClear: js.UndefOr[Boolean] = js.undefined
  var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
  var autosize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
  var onPressEnter: js.UndefOr[KeyboardEventHandler[HTMLTextAreaElement]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
}

object TextAreaProps {
  @scala.inline
  def apply(
    TextareaHTMLAttributes: TextareaHTMLAttributes[HTMLTextAreaElement] = null,
    allowClear: js.UndefOr[Boolean] = js.undefined,
    autoSize: Boolean | AutoSizeType = null,
    autosize: Boolean | AutoSizeType = null,
    onPressEnter: KeyboardEvent[HTMLTextAreaElement] => Unit = null,
    prefixCls: String = null
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, TextareaHTMLAttributes)
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (autoSize != null) __obj.updateDynamic("autoSize")(autoSize.asInstanceOf[js.Any])
    if (autosize != null) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(js.Any.fromFunction1(onPressEnter))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[TextAreaProps]
  }
}

