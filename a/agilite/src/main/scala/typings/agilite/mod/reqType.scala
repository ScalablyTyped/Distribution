package typings.agilite.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait reqType extends js.Object {
  
  var DELETE: String = js.native
  
  var GET: String = js.native
  
  var POST: String = js.native
  
  var PUT: String = js.native
}
object reqType {
  
  @scala.inline
  def apply(DELETE: String, GET: String, POST: String, PUT: String): reqType = {
    val __obj = js.Dynamic.literal(DELETE = DELETE.asInstanceOf[js.Any], GET = GET.asInstanceOf[js.Any], POST = POST.asInstanceOf[js.Any], PUT = PUT.asInstanceOf[js.Any])
    __obj.asInstanceOf[reqType]
  }
  
  @scala.inline
  implicit class reqTypeOps[Self <: reqType] (val x: Self) extends AnyVal {
    
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
    def setDELETE(value: String): Self = this.set("DELETE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGET(value: String): Self = this.set("GET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPOST(value: String): Self = this.set("POST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPUT(value: String): Self = this.set("PUT", value.asInstanceOf[js.Any])
  }
}
