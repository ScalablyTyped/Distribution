package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersResponse extends StObject {
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * A list of all the user accounts.
    */
  var users: js.UndefOr[UserList] = js.undefined
}
object ListUsersResponse {
  
  inline def apply(): ListUsersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListUsersResponse]
  }
  
  extension [Self <: ListUsersResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUsers(value: UserList): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
    
    inline def setUsersUndefined: Self = StObject.set(x, "users", js.undefined)
    
    inline def setUsersVarargs(value: User*): Self = StObject.set(x, "users", js.Array(value*))
  }
}
