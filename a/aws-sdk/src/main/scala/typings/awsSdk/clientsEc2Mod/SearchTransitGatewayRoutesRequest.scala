package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchTransitGatewayRoutesRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. The possible values are:    attachment.transit-gateway-attachment-id- The id of the transit gateway attachment.    attachment.resource-id - The resource id of the transit gateway attachment.    attachment.resource-type - The attachment resource type. Valid values are vpc | vpn | direct-connect-gateway | peering | connect.    prefix-list-id - The ID of the prefix list.    route-search.exact-match - The exact match of the specified filter.    route-search.longest-prefix-match - The longest prefix that matches the route.    route-search.subnet-of-match - The routes with a subnet that match the specified CIDR filter.    route-search.supernet-of-match - The routes with a CIDR that encompass the CIDR filter. For example, if you have 10.0.1.0/29 and 10.0.1.0/31 routes in your route table and you specify supernet-of-match as 10.0.1.0/30, then the result returns 10.0.1.0/29.    state - The state of the route (active | blackhole).    type - The type of route (propagated | static).  
    */
  var Filters: FilterList
  
  /**
    * The maximum number of routes to return.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined
  
  /**
    * The ID of the transit gateway route table.
    */
  var TransitGatewayRouteTableId: typings.awsSdk.clientsEc2Mod.TransitGatewayRouteTableId
}
object SearchTransitGatewayRoutesRequest {
  
  inline def apply(Filters: FilterList, TransitGatewayRouteTableId: TransitGatewayRouteTableId): SearchTransitGatewayRoutesRequest = {
    val __obj = js.Dynamic.literal(Filters = Filters.asInstanceOf[js.Any], TransitGatewayRouteTableId = TransitGatewayRouteTableId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchTransitGatewayRoutesRequest]
  }
  
  extension [Self <: SearchTransitGatewayRoutesRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: TransitGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setTransitGatewayRouteTableId(value: TransitGatewayRouteTableId): Self = StObject.set(x, "TransitGatewayRouteTableId", value.asInstanceOf[js.Any])
  }
}
