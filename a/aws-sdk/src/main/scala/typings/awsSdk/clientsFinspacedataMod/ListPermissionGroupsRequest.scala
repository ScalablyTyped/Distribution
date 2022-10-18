package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionGroupsRequest extends StObject {
  
  /**
    * The maximum number of results per page.
    */
  var maxResults: ResultLimit
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListPermissionGroupsRequest {
  
  inline def apply(maxResults: ResultLimit): ListPermissionGroupsRequest = {
    val __obj = js.Dynamic.literal(maxResults = maxResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionGroupsRequest]
  }
  
  extension [Self <: ListPermissionGroupsRequest](x: Self) {
    
    inline def setMaxResults(value: ResultLimit): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
