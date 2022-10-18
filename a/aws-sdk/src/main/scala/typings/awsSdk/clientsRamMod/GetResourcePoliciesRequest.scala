package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourcePoliciesRequest extends StObject {
  
  /**
    * Specifies the total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the number you specify, the NextToken response element is returned with a value (not null). Include the specified value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the principal.
    */
  var principal: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the Amazon Resource Names (ARNs) of the resources whose policies you want to retrieve.
    */
  var resourceArns: ResourceArnList
}
object GetResourcePoliciesRequest {
  
  inline def apply(resourceArns: ResourceArnList): GetResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal(resourceArns = resourceArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourcePoliciesRequest]
  }
  
  extension [Self <: GetResourcePoliciesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsVarargs(value: String*): Self = StObject.set(x, "resourceArns", js.Array(value*))
  }
}
