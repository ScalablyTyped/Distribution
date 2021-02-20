package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Permission extends StObject {
  
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
  implicit class PermissionMutableBuilder[Self <: Permission] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setPermission_name(value: String): Self = StObject.set(x, "permission_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermission_nameUndefined: Self = StObject.set(x, "permission_name", js.undefined)
    
    @scala.inline
    def setResource_server_identifier(value: String): Self = StObject.set(x, "resource_server_identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_server_identifierUndefined: Self = StObject.set(x, "resource_server_identifier", js.undefined)
    
    @scala.inline
    def setResource_server_name(value: String): Self = StObject.set(x, "resource_server_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource_server_nameUndefined: Self = StObject.set(x, "resource_server_name", js.undefined)
  }
}
