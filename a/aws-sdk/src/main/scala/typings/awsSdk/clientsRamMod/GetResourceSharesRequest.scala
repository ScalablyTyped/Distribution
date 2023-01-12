package typings.awsSdk.clientsRamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceSharesRequest extends StObject {
  
  /**
    * Specifies the total number of results that you want included on each page of the response. If you do not include this parameter, it defaults to a value that is specific to the operation. If additional items exist beyond the number you specify, the NextToken response element is returned with a value (not null). Include the specified value as the NextToken request parameter in the next call to the operation to get the next part of the results. Note that the service might return fewer results than the maximum even when there are more results available. You should check NextToken after every operation to ensure that you receive all of the results.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * Specifies the name of an individual resource share that you want to retrieve details about.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want to receive the next page of results. Valid only if you received a NextToken response in the previous request. If you did, it indicates that more output is available. Set this parameter to the value provided by the previous call's NextToken response to request the next page of results.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want to retrieve details of only those resource shares that use the RAM permission with this Amazon Resoure Name (ARN).
    */
  var permissionArn: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies that you want to retrieve details of only those resource shares that match the following:     SELF  – resource shares that your account shares with other accounts     OTHER-ACCOUNTS  – resource shares that other accounts share with your account  
    */
  var resourceOwner: ResourceOwner
  
  /**
    * Specifies the Amazon Resource Names (ARNs) of individual resource shares that you want information about.
    */
  var resourceShareArns: js.UndefOr[ResourceShareArnList] = js.undefined
  
  /**
    * Specifies that you want to retrieve details of only those resource shares that have this status.
    */
  var resourceShareStatus: js.UndefOr[ResourceShareStatus] = js.undefined
  
  /**
    * Specifies that you want to retrieve details of only those resource shares that match the specified tag keys and values.
    */
  var tagFilters: js.UndefOr[TagFilters] = js.undefined
}
object GetResourceSharesRequest {
  
  inline def apply(resourceOwner: ResourceOwner): GetResourceSharesRequest = {
    val __obj = js.Dynamic.literal(resourceOwner = resourceOwner.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetResourceSharesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResourceSharesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPermissionArn(value: String): Self = StObject.set(x, "permissionArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionArnUndefined: Self = StObject.set(x, "permissionArn", js.undefined)
    
    inline def setResourceOwner(value: ResourceOwner): Self = StObject.set(x, "resourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArns(value: ResourceShareArnList): Self = StObject.set(x, "resourceShareArns", value.asInstanceOf[js.Any])
    
    inline def setResourceShareArnsUndefined: Self = StObject.set(x, "resourceShareArns", js.undefined)
    
    inline def setResourceShareArnsVarargs(value: String*): Self = StObject.set(x, "resourceShareArns", js.Array(value*))
    
    inline def setResourceShareStatus(value: ResourceShareStatus): Self = StObject.set(x, "resourceShareStatus", value.asInstanceOf[js.Any])
    
    inline def setResourceShareStatusUndefined: Self = StObject.set(x, "resourceShareStatus", js.undefined)
    
    inline def setTagFilters(value: TagFilters): Self = StObject.set(x, "tagFilters", value.asInstanceOf[js.Any])
    
    inline def setTagFiltersUndefined: Self = StObject.set(x, "tagFilters", js.undefined)
    
    inline def setTagFiltersVarargs(value: TagFilter*): Self = StObject.set(x, "tagFilters", js.Array(value*))
  }
}
