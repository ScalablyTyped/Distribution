package typings.auth0.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permission extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var permission_name: js.UndefOr[String] = js.native
  
  var resource_server_identifier: js.UndefOr[String] = js.native
  
  var resource_server_name: js.UndefOr[String] = js.native
}
object Permission {
  
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setPermission_name(value: String): Self = this.set("permission_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePermission_name: Self = this.set("permission_name", js.undefined)
    
    @scala.inline
    def setResource_server_identifier(value: String): Self = this.set("resource_server_identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource_server_identifier: Self = this.set("resource_server_identifier", js.undefined)
    
    @scala.inline
    def setResource_server_name(value: String): Self = this.set("resource_server_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource_server_name: Self = this.set("resource_server_name", js.undefined)
  }
}
