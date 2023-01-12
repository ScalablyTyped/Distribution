package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyRole extends StObject {
  
  /**
    * The stable and unique string identifying the role. For more information about IDs, see IAM identifiers in the IAM User Guide.
    */
  var RoleId: js.UndefOr[idType] = js.undefined
  
  /**
    * The name (friendly name, not ARN) identifying the role.
    */
  var RoleName: js.UndefOr[roleNameType] = js.undefined
}
object PolicyRole {
  
  inline def apply(): PolicyRole = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyRole]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyRole] (val x: Self) extends AnyVal {
    
    inline def setRoleId(value: idType): Self = StObject.set(x, "RoleId", value.asInstanceOf[js.Any])
    
    inline def setRoleIdUndefined: Self = StObject.set(x, "RoleId", js.undefined)
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
    
    inline def setRoleNameUndefined: Self = StObject.set(x, "RoleName", js.undefined)
  }
}
