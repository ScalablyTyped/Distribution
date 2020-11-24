package typings.androiduix.android.widget

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Checkable extends js.Object {
  
  def isChecked(): Boolean = js.native
  
  def setChecked(checked: Boolean): Unit = js.native
  
  def toggle(): Unit = js.native
}
object Checkable {
  
  @scala.inline
  def apply(isChecked: () => Boolean, setChecked: Boolean => Unit, toggle: () => Unit): Checkable = {
    val __obj = js.Dynamic.literal(isChecked = js.Any.fromFunction0(isChecked), setChecked = js.Any.fromFunction1(setChecked), toggle = js.Any.fromFunction0(toggle))
    __obj.asInstanceOf[Checkable]
  }
  
  @scala.inline
  implicit class CheckableOps[Self <: Checkable] (val x: Self) extends AnyVal {
    
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
    def setIsChecked(value: () => Boolean): Self = this.set("isChecked", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetChecked(value: Boolean => Unit): Self = this.set("setChecked", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToggle(value: () => Unit): Self = this.set("toggle", js.Any.fromFunction0(value))
  }
}
