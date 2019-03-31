package typings
package antdDashMobileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisabledOnChange extends js.Object {
  var disabled: scala.Boolean
  var prefixCls: java.lang.String
  var selectedIndex: scala.Double
  var tintColor: java.lang.String
  var values: js.Array[scala.Nothing]
  def onChange(): scala.Unit
  def onValueChange(): scala.Unit
}

object Anon_DisabledOnChange {
  @scala.inline
  def apply(
    disabled: scala.Boolean,
    onChange: () => scala.Unit,
    onValueChange: () => scala.Unit,
    prefixCls: java.lang.String,
    selectedIndex: scala.Double,
    tintColor: java.lang.String,
    values: js.Array[scala.Nothing]
  ): Anon_DisabledOnChange = {
    val __obj = js.Dynamic.literal(disabled = disabled, onChange = js.Any.fromFunction0(onChange), onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls, selectedIndex = selectedIndex, tintColor = tintColor, values = values)
  
    __obj.asInstanceOf[Anon_DisabledOnChange]
  }
}

