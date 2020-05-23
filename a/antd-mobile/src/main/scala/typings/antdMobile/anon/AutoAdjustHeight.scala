package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoAdjustHeight extends js.Object {
  var autoAdjustHeight: Boolean
  var disabled: Boolean
  var editable: Boolean
  var keyboardPrefixCls: String
  var placeholder: String
  var prefixCls: String
  def onBlur(): Unit
  def onChange(): Unit
  def onFocus(): Unit
  def onVirtualKeyboardConfirm(): Unit
}

object AutoAdjustHeight {
  @scala.inline
  def apply(
    autoAdjustHeight: Boolean,
    disabled: Boolean,
    editable: Boolean,
    keyboardPrefixCls: String,
    onBlur: () => Unit,
    onChange: () => Unit,
    onFocus: () => Unit,
    onVirtualKeyboardConfirm: () => Unit,
    placeholder: String,
    prefixCls: String
  ): AutoAdjustHeight = {
    val __obj = js.Dynamic.literal(autoAdjustHeight = autoAdjustHeight.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], keyboardPrefixCls = keyboardPrefixCls.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoAdjustHeight]
  }
}

