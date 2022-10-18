package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceShareInvitationsRequest extends StObject {
  
  /**
    * Specifies the total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the number you specify, the NextToken response element is returned with a value (not null). Include the specified value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want details about invitations only for the resource shares described by this list of Amazon Resource Names (ARNs) 
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  
  /**
    * Specifies the Amazon Resource Names (ARNs) of the resource share invitations you want information about.
    */
  var resourceShareInvitationArns: js.UndefOr[ResourceShareInvitationArnList] = js.undefined
}
object GetResourceShareInvitationsRequest {
  
  inline def apply(): GetResourceShareInvitationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceShareInvitationsRequest]
  }
  
  extension [Self <: GetResourceShareInvitationsRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    inline def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value*))
    
    inline def setResourceShareInvitationArns(value: ResourceShareInvitationArnList): Self = StObject.set(x, "resourceShareInvitationArns", value.asInstanceOf[js.Any])
    
    inline def setResourceShareInvitationArnsUndefined: Self = StObject.set(x, "resourceShareInvitationArns", js.undefined)
    
    inline def setResourceShareInvitationArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareInvitationArns", js.Array(value*))
  }
}
