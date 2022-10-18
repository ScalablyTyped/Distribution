package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInstruction extends StObject {
  
  /**
    * Specifies whether this update is to add or revoke role permissions.
    */
  var action: UpdateAction
  
  /**
    * The role to add or revoke for the user or the group specified in users.
    */
  var role: Role
  
  /**
    * A structure that specifies the user or group to add or revoke the role for.
    */
  var users: UserList
}
object UpdateInstruction {
  
  inline def apply(action: UpdateAction, role: Role, users: UserList): UpdateInstruction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInstruction]
  }
  
  extension [Self <: UpdateInstruction](x: Self) {
    
    inline def setAction(value: UpdateAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setRole(value: Role): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setUsers(value: UserList): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
