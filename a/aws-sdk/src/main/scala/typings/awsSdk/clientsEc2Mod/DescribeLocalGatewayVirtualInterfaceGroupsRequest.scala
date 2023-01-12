package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLocalGatewayVirtualInterfaceGroupsRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    local-gateway-id - The ID of a local gateway.    local-gateway-virtual-interface-group-id - The ID of the virtual interface group.    local-gateway-virtual-interface-id - The ID of the virtual interface.    owner-id - The ID of the Amazon Web Services account that owns the local gateway virtual interface group.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The IDs of the virtual interface groups.
    */
  var LocalGatewayVirtualInterfaceGroupIds: js.UndefOr[LocalGatewayVirtualInterfaceGroupIdSet] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[LocalGatewayMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeLocalGatewayVirtualInterfaceGroupsRequest {
  
  inline def apply(): DescribeLocalGatewayVirtualInterfaceGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLocalGatewayVirtualInterfaceGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLocalGatewayVirtualInterfaceGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setLocalGatewayVirtualInterfaceGroupIds(value: LocalGatewayVirtualInterfaceGroupIdSet): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupIds", value.asInstanceOf[js.Any])
    
    inline def setLocalGatewayVirtualInterfaceGroupIdsUndefined: Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupIds", js.undefined)
    
    inline def setLocalGatewayVirtualInterfaceGroupIdsVarargs(value: LocalGatewayVirtualInterfaceGroupId*): Self = StObject.set(x, "LocalGatewayVirtualInterfaceGroupIds", js.Array(value*))
    
    inline def setMaxResults(value: LocalGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
