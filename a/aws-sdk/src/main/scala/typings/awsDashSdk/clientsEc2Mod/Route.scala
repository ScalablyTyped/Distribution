package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Route extends js.Object {
  /**
    * The IPv4 CIDR block used for the destination match.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.native
  /**
    * The IPv6 CIDR block used for the destination match.
    */
  var DestinationIpv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The prefix of the AWS service.
    */
  var DestinationPrefixListId: js.UndefOr[String] = js.native
  /**
    * The ID of the egress-only internet gateway.
    */
  var EgressOnlyInternetGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of a gateway attached to your VPC.
    */
  var GatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of a NAT instance in your VPC.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The AWS account ID of the owner of the instance.
    */
  var InstanceOwnerId: js.UndefOr[String] = js.native
  /**
    * The ID of the local gateway.
    */
  var LocalGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of a NAT gateway.
    */
  var NatGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * Describes how the route was created.    CreateRouteTable - The route was automatically created when the route table was created.    CreateRoute - The route was manually added to the route table.    EnableVgwRoutePropagation - The route was propagated by route propagation.  
    */
  var Origin: js.UndefOr[RouteOrigin] = js.native
  /**
    * The state of the route. The blackhole state indicates that the route's target isn't available (for example, the specified gateway isn't attached to the VPC, or the specified NAT instance has been terminated).
    */
  var State: js.UndefOr[RouteState] = js.native
  /**
    * The ID of a transit gateway.
    */
  var TransitGatewayId: js.UndefOr[String] = js.native
  /**
    * The ID of a VPC peering connection.
    */
  var VpcPeeringConnectionId: js.UndefOr[String] = js.native
}

object Route {
  @scala.inline
  def apply(
    DestinationCidrBlock: String = null,
    DestinationIpv6CidrBlock: String = null,
    DestinationPrefixListId: String = null,
    EgressOnlyInternetGatewayId: String = null,
    GatewayId: String = null,
    InstanceId: String = null,
    InstanceOwnerId: String = null,
    LocalGatewayId: String = null,
    NatGatewayId: String = null,
    NetworkInterfaceId: String = null,
    Origin: RouteOrigin = null,
    State: RouteState = null,
    TransitGatewayId: String = null,
    VpcPeeringConnectionId: String = null
  ): Route = {
    val __obj = js.Dynamic.literal()
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock.asInstanceOf[js.Any])
    if (DestinationIpv6CidrBlock != null) __obj.updateDynamic("DestinationIpv6CidrBlock")(DestinationIpv6CidrBlock.asInstanceOf[js.Any])
    if (DestinationPrefixListId != null) __obj.updateDynamic("DestinationPrefixListId")(DestinationPrefixListId.asInstanceOf[js.Any])
    if (EgressOnlyInternetGatewayId != null) __obj.updateDynamic("EgressOnlyInternetGatewayId")(EgressOnlyInternetGatewayId.asInstanceOf[js.Any])
    if (GatewayId != null) __obj.updateDynamic("GatewayId")(GatewayId.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (InstanceOwnerId != null) __obj.updateDynamic("InstanceOwnerId")(InstanceOwnerId.asInstanceOf[js.Any])
    if (LocalGatewayId != null) __obj.updateDynamic("LocalGatewayId")(LocalGatewayId.asInstanceOf[js.Any])
    if (NatGatewayId != null) __obj.updateDynamic("NatGatewayId")(NatGatewayId.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (Origin != null) __obj.updateDynamic("Origin")(Origin.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId.asInstanceOf[js.Any])
    if (VpcPeeringConnectionId != null) __obj.updateDynamic("VpcPeeringConnectionId")(VpcPeeringConnectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

