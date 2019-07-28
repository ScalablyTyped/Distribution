package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHeight extends js.Object {
  var autoHeight: Boolean
  var clear: Boolean
  var disabled: Boolean
  var editable: Boolean
  var error: Boolean
  var labelNumber: Double
  var onBlur: js.Function0[Unit]
  var onChange: js.Function0[Unit]
  var onErrorClick: js.Function0[Unit]
  var onFocus: js.Function0[Unit]
  var placeholder: String
  var prefixCls: String
  var prefixListCls: String
  var rows: Double
}

object Anon_AutoHeight {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    clear: Boolean,
    disabled: Boolean,
    editable: Boolean,
    error: Boolean,
    labelNumber: Double,
    onBlur: () => Unit,
    onChange: () => Unit,
    onErrorClick: () => Unit,
    onFocus: () => Unit,
    placeholder: String,
    prefixCls: String,
    prefixListCls: String,
    rows: Double
  ): Anon_AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight, clear = clear, disabled = disabled, editable = editable, error = error, labelNumber = labelNumber, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onFocus = js.Any.fromFunction0(onFocus), placeholder = placeholder, prefixCls = prefixCls, prefixListCls = prefixListCls, rows = rows)
  
    __obj.asInstanceOf[Anon_AutoHeight]
  }
}

