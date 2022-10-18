package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTransitGatewaysRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters. The possible values are:    options.propagation-default-route-table-id - The ID of the default propagation route table.    options.amazon-side-asn - The private ASN for the Amazon side of a BGP session.    options.association-default-route-table-id - The ID of the default association route table.    options.auto-accept-shared-attachments - Indicates whether there is automatic acceptance of attachment requests (enable | disable).    options.default-route-table-association - Indicates whether resource attachments are automatically associated with the default association route table (enable | disable).    options.default-route-table-propagation - Indicates whether resource attachments automatically propagate routes to the default propagation route table (enable | disable).    options.dns-support - Indicates whether DNS support is enabled (enable | disable).    options.vpn-ecmp-support - Indicates whether Equal Cost Multipath Protocol support is enabled (enable | disable).    owner-id - The ID of the Amazon Web Services account that owns the transit gateway.    state - The state of the transit gateway (available | deleted | deleting | modifying | pending).    transit-gateway-id - The ID of the transit gateway.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[TransitGatewayMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the transit gateways.
    */
  var TransitGatewayIds: js.UndefOr[TransitGatewayIdStringList] = js.undefined
}
object DescribeTransitGatewaysRequest {
  
  inline def apply(): DescribeTransitGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTransitGatewaysRequest]
  }
  
  extension [Self <: DescribeTransitGatewaysRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: TransitGatewayMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setTransitGatewayIds(value: TransitGatewayIdStringList): Self = StObject.set(x, "TransitGatewayIds", value.asInstanceOf[js.Any])
    
    inline def setTransitGatewayIdsUndefined: Self = StObject.set(x, "TransitGatewayIds", js.undefined)
    
    inline def setTransitGatewayIdsVarargs(value: TransitGatewayId*): Self = StObject.set(x, "TransitGatewayIds", js.Array(value*))
  }
}
