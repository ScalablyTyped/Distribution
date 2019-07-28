package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpnGatewaysRequest extends js.Object {
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
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    VpnGatewayIds: VpnGatewayIdStringList = null
  ): DescribeVpnGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Filters != null) __obj.updateDynamic("Filters")(Filters)
    if (VpnGatewayIds != null) __obj.updateDynamic("VpnGatewayIds")(VpnGatewayIds)
    __obj.asInstanceOf[DescribeVpnGatewaysRequest]
  }
}

