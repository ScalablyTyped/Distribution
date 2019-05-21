package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  var clear: scala.Boolean
  var disabled: scala.Boolean
  var editable: scala.Boolean
  var error: scala.Boolean
  var extra: java.lang.String
  var labelNumber: scala.Double
  var moneyKeyboardAlign: java.lang.String
  var moneyKeyboardHeader: scala.Null
  var onBlur: js.Function0[scala.Unit]
  var onChange: js.Function0[scala.Unit]
  var onErrorClick: js.Function0[scala.Unit]
  var onExtraClick: js.Function0[scala.Unit]
  var onFocus: js.Function0[scala.Unit]
  var onVirtualKeyboardConfirm: js.Function0[scala.Unit]
  var placeholder: java.lang.String
  var prefixCls: java.lang.String
  var prefixListCls: java.lang.String
  var `type`: java.lang.String
  var updatePlaceholder: scala.Boolean
}

object Anon_Clear {
  @scala.inline
  def apply(
    clear: scala.Boolean,
    disabled: scala.Boolean,
    editable: scala.Boolean,
    error: scala.Boolean,
    extra: java.lang.String,
    labelNumber: scala.Double,
    moneyKeyboardAlign: java.lang.String,
    moneyKeyboardHeader: scala.Null,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onErrorClick: () => scala.Unit,
    onExtraClick: () => scala.Unit,
    onFocus: () => scala.Unit,
    onVirtualKeyboardConfirm: () => scala.Unit,
    placeholder: java.lang.String,
    prefixCls: java.lang.String,
    prefixListCls: java.lang.String,
    `type`: java.lang.String,
    updatePlaceholder: scala.Boolean
  ): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = clear, disabled = disabled, editable = editable, error = error, extra = extra, labelNumber = labelNumber, moneyKeyboardAlign = moneyKeyboardAlign, moneyKeyboardHeader = moneyKeyboardHeader, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onExtraClick = js.Any.fromFunction0(onExtraClick), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder, prefixCls = prefixCls, prefixListCls = prefixListCls, updatePlaceholder = updatePlaceholder)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Clear]
  }
}

