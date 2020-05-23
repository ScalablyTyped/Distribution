package typings.awsSdk.anon

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.ec2Mod.VpnConnectionIdStringList
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeVpnConnectionsRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeVpnConnectionsReq extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * One or more filters.    customer-gateway-configuration - The configuration information for the customer gateway.    customer-gateway-id - The ID of a customer gateway associated with the VPN connection.    state - The state of the VPN connection (pending | available | deleting | deleted).    option.static-routes-only - Indicates whether the connection has static routes only. Used for devices that do not support Border Gateway Protocol (BGP).    route.destination-cidr-block - The destination CIDR block. This corresponds to the subnet used in a customer data center.    bgp-asn - The BGP Autonomous System Number (ASN) associated with a BGP device.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.    type - The type of VPN connection. Currently the only supported type is ipsec.1.    vpn-connection-id - The ID of the VPN connection.    vpn-gateway-id - The ID of a virtual private gateway associated with the VPN connection.    transit-gateway-id - The ID of a transit gateway associated with the VPN connection.  
    */
  var Filters: js.UndefOr[FilterList] = js.native
  /**
    * One or more VPN connection IDs. Default: Describes your VPN connections.
    */
  var VpnConnectionIds: js.UndefOr[VpnConnectionIdStringList] = js.native
}

object DescribeVpnConnectionsReq {
  @scala.inline
  def apply(
    $waiter: WaiterConfiguration = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Filters: FilterList = null,
    VpnConnectionIds: VpnConnectionIdStringList = null
  ): DescribeVpnConnectionsReq = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (VpnConnectionIds != null) __obj.updateDynamic("VpnConnectionIds")(VpnConnectionIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpnConnectionsReq]
  }
}

