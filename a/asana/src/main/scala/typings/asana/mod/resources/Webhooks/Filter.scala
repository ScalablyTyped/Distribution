package typings.asana.mod.resources.Webhooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  var action: String = js.native
  
  var fields: js.Array[String] = js.native
  
  var resource_subtype: String = js.native
  
  var resource_type: String = js.native
}
object Filter {
  
  @scala.inline
  def apply(action: String, fields: js.Array[String], resource_subtype: String, resource_type: String): Filter = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], resource_subtype = resource_subtype.asInstanceOf[js.Any], resource_type = resource_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_subtype(value: String): Self = this.set("resource_subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_type(value: String): Self = this.set("resource_type", value.asInstanceOf[js.Any])
  }
}
