package typings.antDesignPro.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddTab extends js.Object {
  
  def addTab(id: js.Any): Unit = js.native
  
  def removeTab(id: js.Any): Unit = js.native
}
object AddTab {
  
  @scala.inline
  def apply(addTab: js.Any => Unit, removeTab: js.Any => Unit): AddTab = {
    val __obj = js.Dynamic.literal(addTab = js.Any.fromFunction1(addTab), removeTab = js.Any.fromFunction1(removeTab))
    __obj.asInstanceOf[AddTab]
  }
  
  @scala.inline
  implicit class AddTabOps[Self <: AddTab] (val x: Self) extends AnyVal {
    
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
    def setAddTab(value: js.Any => Unit): Self = this.set("addTab", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveTab(value: js.Any => Unit): Self = this.set("removeTab", js.Any.fromFunction1(value))
  }
}
