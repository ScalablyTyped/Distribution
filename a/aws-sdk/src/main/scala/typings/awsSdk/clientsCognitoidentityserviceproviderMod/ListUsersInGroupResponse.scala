package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersInGroupResponse extends StObject {
  
  /**
    * An identifier that you can use in a later request to return the next set of items in the list.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
  
  /**
    * The users returned in the request to list users.
    */
  var Users: js.UndefOr[UsersListType] = js.undefined
}
object ListUsersInGroupResponse {
  
  inline def apply(): ListUsersInGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersInGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUsersInGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUsers(value: UsersListType): Self = StObject.set(x, "Users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "Users", js.undefined)
    
    inline def setUsersVarargs(value: UserType*): Self = StObject.set(x, "Users", js.Array(value*))
  }
}
