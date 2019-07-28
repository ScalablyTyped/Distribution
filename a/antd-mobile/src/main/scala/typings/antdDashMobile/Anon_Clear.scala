package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  var clear: Boolean
  var disabled: Boolean
  var editable: Boolean
  var error: Boolean
  var extra: String
  var labelNumber: Double
  var moneyKeyboardAlign: String
  var moneyKeyboardHeader: Null
  var onBlur: js.Function0[Unit]
  var onChange: js.Function0[Unit]
  var onErrorClick: js.Function0[Unit]
  var onExtraClick: js.Function0[Unit]
  var onFocus: js.Function0[Unit]
  var onVirtualKeyboardConfirm: js.Function0[Unit]
  var placeholder: String
  var prefixCls: String
  var prefixListCls: String
  var `type`: String
  var updatePlaceholder: Boolean
}

object Anon_Clear {
  @scala.inline
  def apply(
    clear: Boolean,
    disabled: Boolean,
    editable: Boolean,
    error: Boolean,
    extra: String,
    labelNumber: Double,
    moneyKeyboardAlign: String,
    moneyKeyboardHeader: Null,
    onBlur: () => Unit,
    onChange: () => Unit,
    onErrorClick: () => Unit,
    onExtraClick: () => Unit,
    onFocus: () => Unit,
    onVirtualKeyboardConfirm: () => Unit,
    placeholder: String,
    prefixCls: String,
    prefixListCls: String,
    `type`: String,
    updatePlaceholder: Boolean
  ): Anon_Clear = {
    val __obj = js.Dynamic.literal(clear = clear, disabled = disabled, editable = editable, error = error, extra = extra, labelNumber = labelNumber, moneyKeyboardAlign = moneyKeyboardAlign, moneyKeyboardHeader = moneyKeyboardHeader, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onExtraClick = js.Any.fromFunction0(onExtraClick), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder, prefixCls = prefixCls, prefixListCls = prefixListCls, updatePlaceholder = updatePlaceholder)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Clear]
  }
}

