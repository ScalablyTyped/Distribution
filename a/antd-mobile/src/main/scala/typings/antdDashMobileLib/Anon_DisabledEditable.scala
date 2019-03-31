package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledEditable extends js.Object {
  var disabled: scala.Boolean
  var editable: scala.Boolean
  var keyboardPrefixCls: java.lang.String
  var placeholder: java.lang.String
  var prefixCls: java.lang.String
  def onBlur(): scala.Unit
  def onChange(): scala.Unit
  def onFocus(): scala.Unit
  def onVirtualKeyboardConfirm(): scala.Unit
}

object Anon_DisabledEditable {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    editable: scala.Boolean,
    keyboardPrefixCls: java.lang.String,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onFocus: () => scala.Unit,
    onVirtualKeyboardConfirm: () => scala.Unit,
    placeholder: java.lang.String,
    prefixCls: java.lang.String
  ): Anon_DisabledEditable = {
    val __obj = js.Dynamic.literal(disabled = disabled, editable = editable, keyboardPrefixCls = keyboardPrefixCls, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder, prefixCls = prefixCls)
  
    __obj.asInstanceOf[Anon_DisabledEditable]
  }
}

