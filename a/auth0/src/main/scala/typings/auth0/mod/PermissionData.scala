package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionData extends StObject {
  
  var permission_name: String
  
  var resource_server_identifier: String
}
object PermissionData {
  
  inline def apply(permission_name: String, resource_server_identifier: String): PermissionData = {
    val __obj = js.Dynamic.literal(permission_name = permission_name.asInstanceOf[js.Any], resource_server_identifier = resource_server_identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionData]
  }
  
  extension [Self <: PermissionData](x: Self) {
    
    inline def setPermission_name(value: String): Self = StObject.set(x, "permission_name", value.asInstanceOf[js.Any])
    
    inline def setResource_server_identifier(value: String): Self = StObject.set(x, "resource_server_identifier", value.asInstanceOf[js.Any])
  }
}
