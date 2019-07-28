package typings.androiduix.androidNs.widgetNs.NumberPickerNs

import typings.androiduix.androidNs.widgetNs.NumberPicker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnValueChangeListener extends js.Object {
  def onValueChange(picker: NumberPicker, oldVal: Double, newVal: Double): Unit
}

object OnValueChangeListener {
  @scala.inline
  def apply(onValueChange: (NumberPicker, Double, Double) => Unit): OnValueChangeListener = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction3(onValueChange))
  
    __obj.asInstanceOf[OnValueChangeListener]
  }
}

