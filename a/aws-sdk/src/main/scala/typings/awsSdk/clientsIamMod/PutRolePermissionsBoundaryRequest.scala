package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRolePermissionsBoundaryRequest extends StObject {
  
  /**
    * The ARN of the policy that is used to set the permissions boundary for the role.
    */
  var PermissionsBoundary: arnType
  
  /**
    * The name (friendly name, not ARN) of the IAM role for which you want to set the permissions boundary.
    */
  var RoleName: roleNameType
}
object PutRolePermissionsBoundaryRequest {
  
  inline def apply(PermissionsBoundary: arnType, RoleName: roleNameType): PutRolePermissionsBoundaryRequest = {
    val __obj = js.Dynamic.literal(PermissionsBoundary = PermissionsBoundary.asInstanceOf[js.Any], RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRolePermissionsBoundaryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRolePermissionsBoundaryRequest] (val x: Self) extends AnyVal {
    
    inline def setPermissionsBoundary(value: arnType): Self = StObject.set(x, "PermissionsBoundary", value.asInstanceOf[js.Any])
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
