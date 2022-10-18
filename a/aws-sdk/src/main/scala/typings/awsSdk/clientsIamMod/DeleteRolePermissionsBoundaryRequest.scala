package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRolePermissionsBoundaryRequest extends StObject {
  
  /**
    * The name (friendly name, not ARN) of the IAM role from which you want to remove the permissions boundary.
    */
  var RoleName: roleNameType
}
object DeleteRolePermissionsBoundaryRequest {
  
  inline def apply(RoleName: roleNameType): DeleteRolePermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRolePermissionsBoundaryRequest]
  }
  
  extension [Self <: DeleteRolePermissionsBoundaryRequest](x: Self) {
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
