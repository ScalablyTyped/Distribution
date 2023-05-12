package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReplacePermissionAssociationsWorkRequest extends StObject {
  
  /**
    * Specifies the total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the number you specify, the NextToken response element is returned with a value (not null). Include the specified value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want to see only the details about requests with a status that matches this value.
    */
  var status: js.UndefOr[ReplacePermissionAssociationsWorkStatus] = js.undefined
  
  /**
    * A list of IDs. These values come from the idfield of the replacePermissionAssociationsWorkstructure returned by the ReplacePermissionAssociations operation. 
    */
  var workIds: js.UndefOr[ReplacePermissionAssociationsWorkIdList] = js.undefined
}
object ListReplacePermissionAssociationsWorkRequest {
  
  inline def apply(): ListReplacePermissionAssociationsWorkRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReplacePermissionAssociationsWorkRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReplacePermissionAssociationsWorkRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStatus(value: ReplacePermissionAssociationsWorkStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setWorkIds(value: ReplacePermissionAssociationsWorkIdList): Self = StObject.set(x, "workIds", value.asInstanceOf[js.Any])
    
    inline def setWorkIdsUndefined: Self = StObject.set(x, "workIds", js.undefined)
    
    inline def setWorkIdsVarargs(value: String*): Self = StObject.set(x, "workIds", js.Array(value*))
  }
}
