package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteServiceLinkedRoleRequest extends StObject {
  
  /**
    * The name of the service-linked role to be deleted.
    */
  var RoleName: roleNameType
}
object DeleteServiceLinkedRoleRequest {
  
  inline def apply(RoleName: roleNameType): DeleteServiceLinkedRoleRequest = {
    val __obj = js.Dynamic.literal(RoleName = RoleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteServiceLinkedRoleRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteServiceLinkedRoleRequest] (val x: Self) extends AnyVal {
    
    inline def setRoleName(value: roleNameType): Self = StObject.set(x, "RoleName", value.asInstanceOf[js.Any])
  }
}
