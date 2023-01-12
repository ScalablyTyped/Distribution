package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersByPermissionGroupResponse extends StObject {
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Lists details of all users in a specific permission group.
    */
  var users: js.UndefOr[UserByPermissionGroupList] = js.undefined
}
object ListUsersByPermissionGroupResponse {
  
  inline def apply(): ListUsersByPermissionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersByPermissionGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUsersByPermissionGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUsers(value: UserByPermissionGroupList): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: UserByPermissionGroup*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
