package typings
package atAntDashDesignReactDashNativeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: scala.Boolean
  var placeholder: java.lang.String
  var showCancelButton: scala.Boolean
  def onBlur(): scala.Unit
  def onChange(): scala.Unit
  def onClear(): scala.Unit
  def onFocus(): scala.Unit
  def onSubmit(): scala.Unit
}

object Anon_Disabled {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onClear: () => scala.Unit,
    onFocus: () => scala.Unit,
    onSubmit: () => scala.Unit,
    placeholder: java.lang.String,
    showCancelButton: scala.Boolean
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onClear = js.Any.fromFunction0(onClear), onFocus = js.Any.fromFunction0(onFocus), onSubmit = js.Any.fromFunction0(onSubmit), placeholder = placeholder, showCancelButton = showCancelButton)
  
    __obj.asInstanceOf[Anon_Disabled]
  }
}

