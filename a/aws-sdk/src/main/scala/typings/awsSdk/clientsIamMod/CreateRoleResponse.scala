package typings.awsSdk.clientsIamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRoleResponse extends StObject {
  
  /**
    * A structure containing details about the new role.
    */
  var Role: typings.awsSdk.clientsIamMod.Role
}
object CreateRoleResponse {
  
  inline def apply(Role: Role): CreateRoleResponse = {
    val __obj = js.Dynamic.literal(Role = Role.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRoleResponse]
  }
  
  extension [Self <: CreateRoleResponse](x: Self) {
    
    inline def setRole(value: Role): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
  }
}
