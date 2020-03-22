package typings.antdMobile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnChange extends js.Object {
  var disabled: Boolean
  var prefixCls: String
  var selectedIndex: Double
  var tintColor: String
  var values: js.Array[scala.Nothing]
  def onChange(): Unit
  def onValueChange(): Unit
}

object AnonOnChange {
  @scala.inline
  def apply(
    disabled: Boolean,
    onChange: () => Unit,
    onValueChange: () => Unit,
    prefixCls: String,
    selectedIndex: Double,
    tintColor: String,
    values: js.Array[scala.Nothing]
  ): AnonOnChange = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), onValueChange = js.Any.fromFunction0(onValueChange), prefixCls = prefixCls.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOnChange]
  }
}

