package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnBlur extends js.Object {
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

object AnonOnBlur {
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
  ): AnonOnBlur = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), onSubmit = js.Any.fromFunction0(onSubmit), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], showCancelButton = showCancelButton.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnBlur]
  }
}

