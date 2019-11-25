package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clear extends js.Object {
  var clear: Boolean
  var disabled: Boolean
  var disabledKeys: Null
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
    disabledKeys: Null,
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
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], disabledKeys = disabledKeys.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], labelNumber = labelNumber.asInstanceOf[js.Any], moneyKeyboardAlign = moneyKeyboardAlign.asInstanceOf[js.Any], moneyKeyboardHeader = moneyKeyboardHeader.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onExtraClick = js.Any.fromFunction0(onExtraClick), onFocus = js.Any.fromFunction0(onFocus), onVirtualKeyboardConfirm = js.Any.fromFunction0(onVirtualKeyboardConfirm), placeholder = placeholder.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], prefixListCls = prefixListCls.asInstanceOf[js.Any], updatePlaceholder = updatePlaceholder.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clear]
  }
}

