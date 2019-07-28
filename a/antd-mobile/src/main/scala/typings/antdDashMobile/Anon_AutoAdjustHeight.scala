package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoAdjustHeight extends js.Object {
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

object Anon_AutoAdjustHeight {
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
  ): Anon_AutoAdjustHeight = {
    val __obj = js.Dynamic.literal(autoAdjustHeight = autoAdjustHeight, disabled = disabled, editable = editable, keyboardPrefixCls = keyboardPrefixCls, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_AutoAdjustHeight]
  }
}

