package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesRequest extends StObject {
  
  /**
    * Specifies the total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the number you specify, the NextToken response element is returned with a value (not null). Include the specified value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want to list only the resource shares that are associated with the specified principal.
    */
  var principal: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want to list only the resource shares that include resources with the specified Amazon Resource Names (ARNs).
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
  
  /**
    * Specifies that you want to list only the resource shares that match the following:     SELF  – resources that your account shares with other accounts     OTHER-ACCOUNTS  – resources that other accounts share with your account  
    */
  var resourceOwner: ResourceOwner
  
  /**
    * Specifies that you want the results to include only resources that have the specified scope.    ALL – the results include both global and regional resources or resource types.    GLOBAL – the results include only global resources or resource types.    REGIONAL – the results include only regional resources or resource types.   The default value is ALL.
    */
  var resourceRegionScope: js.UndefOr[ResourceRegionScopeFilter] = js.undefined
  
  /**
    * Specifies that you want to list only resources in the resource shares identified by the specified Amazon Resource Names (ARNs).
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  
  /**
    * Specifies that you want to list only the resource shares that include resources of the specified resource type. For valid values, query the ListResourceTypes operation.
    */
  var resourceType: js.UndefOr[String] = js.undefined
}
object ListResourcesRequest {
  
  inline def apply(resourceOwner: ResourceOwner): ListResourcesRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListResourcesRequest]
  }
  
  extension [Self <: ListResourcesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPrincipal(value: String): Self = StObject.set(x, "principal", value.asInstanceOf[js.Any])
    
    inline def setPrincipalUndefined: Self = StObject.set(x, "principal", js.undefined)
    
    inline def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsUndefined: Self = StObject.set(x, "resourceArns", js.undefined)
    
    inline def setResourceArnsVarargs(value: String*): Self = StObject.set(x, "resourceArns", js.Array(value*))
    
    inline def setResourceOwner(value: ResourceOwner): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionScope(value: ResourceRegionScopeFilter): Self = StObject.set(x, "resourceRegionScope", value.asInstanceOf[js.Any])
    
    inline def setResourceRegionScopeUndefined: Self = StObject.set(x, "resourceRegionScope", js.undefined)
    
    inline def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    inline def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value*))
    
    inline def setResourceType(value: String): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
