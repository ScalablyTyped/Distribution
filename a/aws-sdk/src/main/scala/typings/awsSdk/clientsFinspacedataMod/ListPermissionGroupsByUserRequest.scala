package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionGroupsByUserRequest extends StObject {
  
  /**
    * The maximum number of results per page.
    */
  var maxResults: ResultLimit
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The unique identifier for the user.
    */
  var userId: UserId
}
object ListPermissionGroupsByUserRequest {
  
  inline def apply(maxResults: ResultLimit, userId: UserId): ListPermissionGroupsByUserRequest = {
    val __obj = js.Dynamic.literal(maxResults = maxResults.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionGroupsByUserRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPermissionGroupsByUserRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ResultLimit): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
