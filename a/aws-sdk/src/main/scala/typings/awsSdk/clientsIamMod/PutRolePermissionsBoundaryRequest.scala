package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRolePermissionsBoundaryRequest extends StObject {
  
  /**
    * The ARN of the managed policy that is used to set the permissions boundary for the role. A permissions boundary policy defines the maximum permissions that identity-based policies can grant to an entity, but does not grant permissions. Permissions boundaries do not define the maximum permissions that a resource-based policy can grant to an entity. To learn more, see Permissions boundaries for IAM entities in the IAM User Guide. For more information about policy types, see Policy types  in the IAM User Guide.
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
