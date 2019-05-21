package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHeight extends js.Object {
  var autoHeight: scala.Boolean
  var clear: scala.Boolean
  var disabled: scala.Boolean
  var editable: scala.Boolean
  var error: scala.Boolean
  var labelNumber: scala.Double
  var onBlur: js.Function0[scala.Unit]
  var onChange: js.Function0[scala.Unit]
  var onErrorClick: js.Function0[scala.Unit]
  var onFocus: js.Function0[scala.Unit]
  var placeholder: java.lang.String
  var prefixCls: java.lang.String
  var prefixListCls: java.lang.String
  var rows: scala.Double
}

object Anon_AutoHeight {
  @scala.inline
  def apply(
    autoHeight: scala.Boolean,
    clear: scala.Boolean,
    disabled: scala.Boolean,
    editable: scala.Boolean,
    error: scala.Boolean,
    labelNumber: scala.Double,
    onBlur: () => scala.Unit,
    onChange: () => scala.Unit,
    onErrorClick: () => scala.Unit,
    onFocus: () => scala.Unit,
    placeholder: java.lang.String,
    prefixCls: java.lang.String,
    prefixListCls: java.lang.String,
    rows: scala.Double
  ): Anon_AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight, clear = clear, disabled = disabled, editable = editable, error = error, labelNumber = labelNumber, onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onFocus = js.Any.fromFunction0(onFocus), placeholder = placeholder, prefixCls = prefixCls, prefixListCls = prefixListCls, rows = rows)
  
    __obj.asInstanceOf[Anon_AutoHeight]
  }
}

