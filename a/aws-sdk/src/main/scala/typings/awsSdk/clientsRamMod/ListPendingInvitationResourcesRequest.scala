package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPendingInvitationResourcesRequest extends StObject {
  
  /**
    * Specifies the total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the number you specify, the NextToken response element is returned with a value (not null). Include the specified value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want the results to include only resources that have the specified scope.    ALL – the results include both global and regional resources or resource types.    GLOBAL – the results include only global resources or resource types.    REGIONAL – the results include only regional resources or resource types.   The default value is ALL.
    */
  var resourceRegionScope: js.UndefOr[ResourceRegionScopeFilter] = js.undefined
  
  /**
    * Specifies the Amazon Resoure Name (ARN) of the invitation. You can use GetResourceShareInvitations to find the ARN of the invitation.
    */
  var resourceShareInvitationArn: String
}
object ListPendingInvitationResourcesRequest {
  
  inline def apply(resourceShareInvitationArn: String): ListPendingInvitationResourcesRequest = {
    val __obj = js.Dynamic.literal(resourceShareInvitationArn = resourceShareInvitationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPendingInvitationResourcesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPendingInvitationResourcesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceRegionScope(value: ResourceRegionScopeFilter): Self = StObject.set(x, "resourceRegionScope", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionScopeUndefined: Self = StObject.set(x, "resourceRegionScope", js.undefined)
    
    inline def setResourceShareInvitationArn(value: String): Self = StObject.set(x, "resourceShareInvitationArn", value.asInstanceOf[js.Any])
  }
}
