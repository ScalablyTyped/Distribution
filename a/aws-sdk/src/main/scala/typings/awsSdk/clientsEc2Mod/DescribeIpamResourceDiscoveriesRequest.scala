package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpamResourceDiscoveriesRequest extends StObject {
  
  /**
    * A check for whether you have the required permissions for the action without actually making the request and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The resource discovery filters.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IPAM resource discovery IDs.
    */
  var IpamResourceDiscoveryIds: js.UndefOr[ValueStringList] = js.undefined
  
  /**
    * The maximum number of resource discoveries to return in one page of results.
    */
  var MaxResults: js.UndefOr[IpamMaxResults] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIpamResourceDiscoveriesRequest {
  
  inline def apply(): DescribeIpamResourceDiscoveriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpamResourceDiscoveriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIpamResourceDiscoveriesRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setIpamResourceDiscoveryIds(value: ValueStringList): Self = StObject.set(x, "IpamResourceDiscoveryIds", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryIdsUndefined: Self = StObject.set(x, "IpamResourceDiscoveryIds", js.undefined)
    
    inline def setIpamResourceDiscoveryIdsVarargs(value: String*): Self = StObject.set(x, "IpamResourceDiscoveryIds", js.Array(value*))
    
    inline def setMaxResults(value: IpamMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
