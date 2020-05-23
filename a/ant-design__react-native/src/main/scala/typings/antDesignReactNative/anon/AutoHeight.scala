package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoHeight extends js.Object {
  var autoHeight: Boolean
  var clear: Boolean
  var count: Double
  var editable: Boolean
  var error: Boolean
  var keyboardType: String
  var last: Boolean
  var rows: Double
  def onBlur(): Unit
  def onChange(): Unit
  def onErrorClick(): Unit
  def onFocus(): Unit
}

object AutoHeight {
  @scala.inline
  def apply(
    autoHeight: Boolean,
    clear: Boolean,
    count: Double,
    editable: Boolean,
    error: Boolean,
    keyboardType: String,
    last: Boolean,
    onBlur: () => Unit,
    onChange: () => Unit,
    onErrorClick: () => Unit,
    onFocus: () => Unit,
    rows: Double
  ): AutoHeight = {
    val __obj = js.Dynamic.literal(autoHeight = autoHeight.asInstanceOf[js.Any], clear = clear.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], keyboardType = keyboardType.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], onBlur = js.Any.fromFunction0(onBlur), onChange = js.Any.fromFunction0(onChange), onErrorClick = js.Any.fromFunction0(onErrorClick), onFocus = js.Any.fromFunction0(onFocus), rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHeight]
  }
}

