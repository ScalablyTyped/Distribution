package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpnGatewaysRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    amazon-side-asn - The Autonomous System Number (ASN) for the Amazon side of the gateway.    attachment.state - The current state of the attachment between the gateway and the VPC (attaching | attached | detaching | detached).    attachment.vpc-id - The ID of an attached VPC.    availability-zone - The Availability Zone for the virtual private gateway (if applicable).    state - The state of the virtual private gateway (pending | available | deleting | deleted).    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    type - The type of virtual private gateway. Currently the only supported type is ipsec.1.    vpn-gateway-id - The ID of the virtual private gateway.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * One or more virtual private gateway IDs. Default: Describes all your virtual private gateways.
    */
  var VpnGatewayIds: js.UndefOr[VpnGatewayIdStringList] = js.undefined
}
object DescribeVpnGatewaysRequest {
  
  inline def apply(): DescribeVpnGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpnGatewaysRequest]
  }
  
  extension [Self <: DescribeVpnGatewaysRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setVpnGatewayIds(value: VpnGatewayIdStringList): Self = StObject.set(x, "VpnGatewayIds", value.asInstanceOf[js.Any])
    
    inline def setVpnGatewayIdsUndefined: Self = StObject.set(x, "VpnGatewayIds", js.undefined)
    
    inline def setVpnGatewayIdsVarargs(value: VpnGatewayId*): Self = StObject.set(x, "VpnGatewayIds", js.Array(value*))
  }
}
