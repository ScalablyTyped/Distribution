package typings.antdDashMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledOnChange extends js.Object {
  var disabled: Boolean
  var prefixCls: String
  var selectedIndex: Double
  var tintColor: String
  var values: js.Array[scala.Nothing]
  def onChange(): Unit
  def onValueChange(): Unit
}

object Anon_DisabledOnChange {
  @scala.inline
  def apply(
    disabled: Boolean,
    onChange: () => Unit,
    onValueChange: () => Unit,
    prefixCls: String,
    selectedIndex: Double,
    tintColor: String,
    values: js.Array[scala.Nothing]
  ): Anon_DisabledOnChange = {
    val __obj = js.Dynamic.literal(disabled = disabled, onChange = js.Any.fromFunction0(onChange), onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls, selectedIndex = selectedIndex, tintColor = tintColor, values = values)
  
    __obj.asInstanceOf[Anon_DisabledOnChange]
  }
}

