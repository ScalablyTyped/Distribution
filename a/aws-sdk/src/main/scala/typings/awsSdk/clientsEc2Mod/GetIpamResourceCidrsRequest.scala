package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamResourceCidrsRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters for the request. For more information about filtering, see Filtering CLI output.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The ID of the IPAM pool that the resource is in.
    */
  var IpamPoolId: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamPoolId] = js.undefined
  
  /**
    * The ID of the scope that the resource is in.
    */
  var IpamScopeId: typings.awsSdk.clientsEc2Mod.IpamScopeId
  
  /**
    * The maximum number of results to return in the request.
    */
  var MaxResults: js.UndefOr[IpamMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The ID of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Amazon Web Services account that owns the resource.
    */
  var ResourceOwner: js.UndefOr[String] = js.undefined
  
  var ResourceTag: js.UndefOr[RequestIpamResourceTag] = js.undefined
  
  /**
    * The resource type.
    */
  var ResourceType: js.UndefOr[IpamResourceType] = js.undefined
}
object GetIpamResourceCidrsRequest {
  
  inline def apply(IpamScopeId: IpamScopeId): GetIpamResourceCidrsRequest = {
    val __obj = js.Dynamic.literal(IpamScopeId = IpamScopeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpamResourceCidrsRequest]
  }
  
  extension [Self <: GetIpamResourceCidrsRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIpamPoolId(value: IpamPoolId): Self = StObject.set(x, "IpamPoolId", value.asInstanceOf[js.Any])
    
    inline def setIpamPoolIdUndefined: Self = StObject.set(x, "IpamPoolId", js.undefined)
    
    inline def setIpamScopeId(value: IpamScopeId): Self = StObject.set(x, "IpamScopeId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: IpamMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceId(value: String): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
    
    inline def setResourceIdUndefined: Self = StObject.set(x, "ResourceId", js.undefined)
    
    inline def setResourceOwner(value: String): Self = StObject.set(x, "ResourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerUndefined: Self = StObject.set(x, "ResourceOwner", js.undefined)
    
    inline def setResourceTag(value: RequestIpamResourceTag): Self = StObject.set(x, "ResourceTag", value.asInstanceOf[js.Any])
    
    inline def setResourceTagUndefined: Self = StObject.set(x, "ResourceTag", js.undefined)
    
    inline def setResourceType(value: IpamResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
