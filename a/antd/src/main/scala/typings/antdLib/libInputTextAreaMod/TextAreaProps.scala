package typings
package antdLib.libInputTextAreaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaProps
  extends reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement] {
  var autosize: js.UndefOr[scala.Boolean | AutoSizeType] = js.undefined
  var onPressEnter: js.UndefOr[reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
}

object TextAreaProps {
  @scala.inline
  def apply(
    TextareaHTMLAttributes: reactLib.reactMod.TextareaHTMLAttributes[stdLib.HTMLTextAreaElement] = null,
    autosize: scala.Boolean | AutoSizeType = null,
    onPressEnter: reactLib.reactMod.KeyboardEventHandler[stdLib.HTMLTextAreaElement] = null,
    prefixCls: java.lang.String = null
  ): TextAreaProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, TextareaHTMLAttributes)
    if (autosize != null) __obj.updateDynamic("autosize")(autosize.asInstanceOf[js.Any])
    if (onPressEnter != null) __obj.updateDynamic("onPressEnter")(onPressEnter)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    __obj.asInstanceOf[TextAreaProps]
  }
}

