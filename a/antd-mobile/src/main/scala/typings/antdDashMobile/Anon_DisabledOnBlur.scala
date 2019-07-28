package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledOnBlur extends js.Object {
  var disabled: Boolean
  var placeholder: String
  var prefixCls: String
  var showCancelButton: Boolean
  def onBlur(): Unit
  def onChange(): Unit
  def onClear(): Unit
  def onFocus(): Unit
  def onSubmit(): Unit
}

object Anon_DisabledOnBlur {
  @scala.inline
  def apply(
    disabled: Boolean,
    onBlur: () => Unit,
    onChange: () => Unit,
    onClear: () => Unit,
    onFocus: () => Unit,
    onSubmit: () => Unit,
    placeholder: String,
    prefixCls: String,
    showCancelButton: Boolean
  ): Anon_DisabledOnBlur = {
    val __obj = js.Dynamic.literal(disabled = disabled, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), onSubmit = js.Any.fromFunction0(onSubmit), placeholder = placeholder, prefixCls = prefixCls, showCancelButton = showCancelButton)
  
    __obj.asInstanceOf[Anon_DisabledOnBlur]
  }
}

