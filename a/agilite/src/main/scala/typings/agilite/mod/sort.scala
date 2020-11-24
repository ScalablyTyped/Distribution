package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait sort extends js.Object {
  
  var ASC: String = js.native
  
  var ASC_VALUE: String = js.native
  
  var DESC: String = js.native
  
  var DESC_VALUE: String = js.native
}
object sort {
  
  @scala.inline
  def apply(ASC: String, ASC_VALUE: String, DESC: String, DESC_VALUE: String): sort = {
    val __obj = js.Dynamic.literal(ASC = ASC.asInstanceOf[js.Any], ASC_VALUE = ASC_VALUE.asInstanceOf[js.Any], DESC = DESC.asInstanceOf[js.Any], DESC_VALUE = DESC_VALUE.asInstanceOf[js.Any])
    __obj.asInstanceOf[sort]
  }
  
  @scala.inline
  implicit class sortOps[Self <: sort] (val x: Self) extends AnyVal {
    
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
    def setASC(value: String): Self = this.set("ASC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setASC_VALUE(value: String): Self = this.set("ASC_VALUE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDESC(value: String): Self = this.set("DESC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDESC_VALUE(value: String): Self = this.set("DESC_VALUE", value.asInstanceOf[js.Any])
  }
}
