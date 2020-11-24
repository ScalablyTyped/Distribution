package typings.antDesignProProvider.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Clear extends js.Object {
  
  var clear: String = js.native
  
  var confirm: String = js.native
  
  var itemUnit: String = js.native
  
  var more: String = js.native
}
object Clear {
  
  @scala.inline
  def apply(clear: String, confirm: String, itemUnit: String, more: String): Clear = {
    val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], confirm = confirm.asInstanceOf[js.Any], itemUnit = itemUnit.asInstanceOf[js.Any], more = more.asInstanceOf[js.Any])
    __obj.asInstanceOf[Clear]
  }
  
  @scala.inline
  implicit class ClearOps[Self <: Clear] (val x: Self) extends AnyVal {
    
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
    def setClear(value: String): Self = this.set("clear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirm(value: String): Self = this.set("confirm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUnit(value: String): Self = this.set("itemUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMore(value: String): Self = this.set("more", value.asInstanceOf[js.Any])
  }
}
