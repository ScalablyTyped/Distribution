package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpcEndpoint extends js.Object {
  /**
    * The date and time the VPC endpoint was created.
    */
  var CreationTimestamp: js.UndefOr[MillisecondDateTime] = js.undefined
  /**
    * (Interface endpoint) The DNS entries for the endpoint.
    */
  var DnsEntries: js.UndefOr[DnsEntrySet] = js.undefined
  /**
    * (Interface endpoint) Information about the security groups associated with the network interface.
    */
  var Groups: js.UndefOr[GroupIdentifierSet] = js.undefined
  /**
    * (Interface endpoint) One or more network interfaces for the endpoint.
    */
  var NetworkInterfaceIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The policy document associated with the endpoint, if applicable.
    */
  var PolicyDocument: js.UndefOr[String] = js.undefined
  /**
    * (Interface endpoint) Indicates whether the VPC is associated with a private hosted zone.
    */
  var PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the VPC Endpoint is being managed by its service.
    */
  var RequesterManaged: js.UndefOr[Boolean] = js.undefined
  /**
    * (Gateway endpoint) One or more route tables associated with the endpoint.
    */
  var RouteTableIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The name of the service to which the endpoint is associated.
    */
  var ServiceName: js.UndefOr[String] = js.undefined
  /**
    * The state of the VPC endpoint.
    */
  var State: js.UndefOr[State] = js.undefined
  /**
    * (Interface endpoint) One or more subnets in which the endpoint is located.
    */
  var SubnetIds: js.UndefOr[ValueStringList] = js.undefined
  /**
    * The ID of the VPC endpoint.
    */
  var VpcEndpointId: js.UndefOr[String] = js.undefined
  /**
    * The type of endpoint.
    */
  var VpcEndpointType: js.UndefOr[VpcEndpointType] = js.undefined
  /**
    * The ID of the VPC to which the endpoint is associated.
    */
  var VpcId: js.UndefOr[String] = js.undefined
}

object VpcEndpoint {
  @scala.inline
  def apply(
    CreationTimestamp: MillisecondDateTime = null,
    DnsEntries: DnsEntrySet = null,
    Groups: GroupIdentifierSet = null,
    NetworkInterfaceIds: ValueStringList = null,
    PolicyDocument: String = null,
    PrivateDnsEnabled: js.UndefOr[Boolean] = js.undefined,
    RequesterManaged: js.UndefOr[Boolean] = js.undefined,
    RouteTableIds: ValueStringList = null,
    ServiceName: String = null,
    State: State = null,
    SubnetIds: ValueStringList = null,
    VpcEndpointId: String = null,
    VpcEndpointType: VpcEndpointType = null,
    VpcId: String = null
  ): VpcEndpoint = {
    val __obj = js.Dynamic.literal()
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (DnsEntries != null) __obj.updateDynamic("DnsEntries")(DnsEntries)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (NetworkInterfaceIds != null) __obj.updateDynamic("NetworkInterfaceIds")(NetworkInterfaceIds)
    if (PolicyDocument != null) __obj.updateDynamic("PolicyDocument")(PolicyDocument)
    if (!js.isUndefined(PrivateDnsEnabled)) __obj.updateDynamic("PrivateDnsEnabled")(PrivateDnsEnabled)
    if (!js.isUndefined(RequesterManaged)) __obj.updateDynamic("RequesterManaged")(RequesterManaged)
    if (RouteTableIds != null) __obj.updateDynamic("RouteTableIds")(RouteTableIds)
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (VpcEndpointId != null) __obj.updateDynamic("VpcEndpointId")(VpcEndpointId)
    if (VpcEndpointType != null) __obj.updateDynamic("VpcEndpointType")(VpcEndpointType.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[VpcEndpoint]
  }
}

