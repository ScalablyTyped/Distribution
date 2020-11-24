package typings.androiduix.android.widget.NumberPicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnValueChangeListener extends js.Object {
  
  def onValueChange(picker: typings.androiduix.android.widget.NumberPicker, oldVal: Double, newVal: Double): Unit = js.native
}
object OnValueChangeListener {
  
  @scala.inline
  def apply(onValueChange: (typings.androiduix.android.widget.NumberPicker, Double, Double) => Unit): OnValueChangeListener = {
    val __obj = js.Dynamic.literal(onValueChange = js.Any.fromFunction3(onValueChange))
    __obj.asInstanceOf[OnValueChangeListener]
  }
  
  @scala.inline
  implicit class OnValueChangeListenerOps[Self <: OnValueChangeListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnValueChange(value: (typings.androiduix.android.widget.NumberPicker, Double, Double) => Unit): Self = this.set("onValueChange", js.Any.fromFunction3(value))
  }
}
