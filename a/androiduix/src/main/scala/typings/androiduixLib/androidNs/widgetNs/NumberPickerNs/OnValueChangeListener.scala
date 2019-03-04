package typings
package androiduixLib.androidNs.widgetNs.NumberPickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnValueChangeListener extends js.Object {
  def onValueChange(picker: androiduixLib.androidNs.widgetNs.NumberPicker, oldVal: scala.Double, newVal: scala.Double): scala.Unit
}

object OnValueChangeListener {
  @scala.inline
  def apply(
    onValueChange: js.Function3[androiduixLib.androidNs.widgetNs.NumberPicker, scala.Double, scala.Double, scala.Unit]
  ): OnValueChangeListener = {
    val __obj = js.Dynamic.literal(onValueChange = onValueChange)
  
    __obj.asInstanceOf[OnValueChangeListener]
  }
}

