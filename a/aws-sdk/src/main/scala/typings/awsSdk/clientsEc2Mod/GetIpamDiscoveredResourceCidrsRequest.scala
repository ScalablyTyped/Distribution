package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIpamDiscoveredResourceCidrsRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Filters.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A resource discovery ID.
    */
  var IpamResourceDiscoveryId: typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryId
  
  /**
    * The maximum number of discovered resource CIDRs to return in one page of results.
    */
  var MaxResults: js.UndefOr[IpamMaxResults] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * A resource Region.
    */
  var ResourceRegion: String
}
object GetIpamDiscoveredResourceCidrsRequest {
  
  inline def apply(IpamResourceDiscoveryId: IpamResourceDiscoveryId, ResourceRegion: String): GetIpamDiscoveredResourceCidrsRequest = {
    val __obj = js.Dynamic.literal(IpamResourceDiscoveryId = IpamResourceDiscoveryId.asInstanceOf[js.Any], ResourceRegion = ResourceRegion.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIpamDiscoveredResourceCidrsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIpamDiscoveredResourceCidrsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIpamResourceDiscoveryId(value: IpamResourceDiscoveryId): Self = StObject.set(x, "IpamResourceDiscoveryId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: IpamMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceRegion(value: String): Self = StObject.set(x, "ResourceRegion", value.asInstanceOf[js.Any])
  }
}
