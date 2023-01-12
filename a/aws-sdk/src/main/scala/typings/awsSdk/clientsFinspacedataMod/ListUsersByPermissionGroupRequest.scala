package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListUsersByPermissionGroupRequest extends StObject {
  
  /**
    * The maximum number of results per page.
    */
  var maxResults: ResultLimit
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The unique identifier for the permission group.
    */
  var permissionGroupId: PermissionGroupId
}
object ListUsersByPermissionGroupRequest {
  
  inline def apply(maxResults: ResultLimit, permissionGroupId: PermissionGroupId): ListUsersByPermissionGroupRequest = {
    val __obj = js.Dynamic.literal(maxResults = maxResults.asInstanceOf[js.Any], permissionGroupId = permissionGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUsersByPermissionGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListUsersByPermissionGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: ResultLimit): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPermissionGroupId(value: PermissionGroupId): Self = StObject.set(x, "permissionGroupId", value.asInstanceOf[js.Any])
  }
}
