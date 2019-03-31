package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledOnBlur extends js.Object {
  var disabled: scala.Boolean
  var placeholder: java.lang.String
  var prefixCls: java.lang.String
  var showCancelButton: scala.Boolean
  def onBlur(): scala.Unit
  def onChange(): scala.Unit
  def onClear(): scala.Unit
  def onFocus(): scala.Unit
  def onSubmit(): scala.Unit
}

object Anon_DisabledOnBlur {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onClear: () => scala.Unit,
    onFocus: () => scala.Unit,
    onSubmit: () => scala.Unit,
    placeholder: java.lang.String,
    prefixCls: java.lang.String,
    showCancelButton: scala.Boolean
  ): Anon_DisabledOnBlur = {
    val __obj = js.Dynamic.literal(disabled = disabled, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), onSubmit = js.Any.fromFunction0(onSubmit), placeholder = placeholder, prefixCls = prefixCls, showCancelButton = showCancelButton)
  
    __obj.asInstanceOf[Anon_DisabledOnBlur]
  }
}

