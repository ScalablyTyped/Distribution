package typings.awsSdk.clientsFmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDiscoveredResourcesRequest extends StObject {
  
  /**
    * The maximum number of objects that you want Firewall Manager to return for this request. If more objects are available, in the response, Firewall Manager provides a NextToken value that you can use in a subsequent call to get the next batch of objects.
    */
  var MaxResults: js.UndefOr[PaginationMaxResults] = js.undefined
  
  /**
    * The Amazon Web Services account IDs to discover resources in. Only one account is supported per request. The account must be a member of your organization.
    */
  var MemberAccountIds: AWSAccountIdList
  
  /**
    * When you request a list of objects with a MaxResults setting, if the number of objects that are still available for retrieval exceeds the maximum you requested, Firewall Manager returns a NextToken value in the response. To retrieve the next batch of objects, use the token returned from the prior request in your next request.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The type of resources to discover.
    */
  var ResourceType: typings.awsSdk.clientsFmsMod.ResourceType
}
object ListDiscoveredResourcesRequest {
  
  inline def apply(MemberAccountIds: AWSAccountIdList, ResourceType: ResourceType): ListDiscoveredResourcesRequest = {
    val __obj = js.Dynamic.literal(MemberAccountIds = MemberAccountIds.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDiscoveredResourcesRequest]
  }
  
  extension [Self <: ListDiscoveredResourcesRequest](x: Self) {
    
    inline def setMaxResults(value: PaginationMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setMemberAccountIds(value: AWSAccountIdList): Self = StObject.set(x, "MemberAccountIds", value.asInstanceOf[js.Any])
    
    inline def setMemberAccountIdsVarargs(value: AWSAccountId*): Self = StObject.set(x, "MemberAccountIds", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
  }
}
