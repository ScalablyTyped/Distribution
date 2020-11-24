package typings.androiduix.android.widget.CompoundButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnCheckedChangeListener extends js.Object {
  
  def onCheckedChanged(buttonView: typings.androiduix.android.widget.CompoundButton, isChecked: Boolean): Unit = js.native
}
object OnCheckedChangeListener {
  
  @scala.inline
  def apply(onCheckedChanged: (typings.androiduix.android.widget.CompoundButton, Boolean) => Unit): OnCheckedChangeListener = {
    val __obj = js.Dynamic.literal(onCheckedChanged = js.Any.fromFunction2(onCheckedChanged))
    __obj.asInstanceOf[OnCheckedChangeListener]
  }
  
  @scala.inline
  implicit class OnCheckedChangeListenerOps[Self <: OnCheckedChangeListener] (val x: Self) extends AnyVal {
    
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
    def setOnCheckedChanged(value: (typings.androiduix.android.widget.CompoundButton, Boolean) => Unit): Self = this.set("onCheckedChanged", js.Any.fromFunction2(value))
  }
}
