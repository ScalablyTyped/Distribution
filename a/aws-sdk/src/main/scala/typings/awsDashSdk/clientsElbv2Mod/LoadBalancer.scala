package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancer extends js.Object {
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.AvailabilityZones] = js.native
  /**
    * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
    */
  var CanonicalHostedZoneId: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.CanonicalHostedZoneId] = js.native
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.CreatedTime] = js.native
  /**
    * The public DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.DNSName] = js.native
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
    */
  var IpAddressType: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.IpAddressType] = js.native
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.LoadBalancerArn] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.LoadBalancerName] = js.native
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can route requests only from clients with access to the VPC for the load balancer.
    */
  var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.native
  /**
    * The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.SecurityGroups] = js.native
  /**
    * The state of the load balancer.
    */
  var State: js.UndefOr[LoadBalancerState] = js.native
  /**
    * The type of load balancer.
    */
  var Type: js.UndefOr[LoadBalancerTypeEnum] = js.native
  /**
    * The ID of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.VpcId] = js.native
}

object LoadBalancer {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZones = null,
    CanonicalHostedZoneId: CanonicalHostedZoneId = null,
    CreatedTime: CreatedTime = null,
    DNSName: DNSName = null,
    IpAddressType: IpAddressType = null,
    LoadBalancerArn: LoadBalancerArn = null,
    LoadBalancerName: LoadBalancerName = null,
    Scheme: LoadBalancerSchemeEnum = null,
    SecurityGroups: SecurityGroups = null,
    State: LoadBalancerState = null,
    Type: LoadBalancerTypeEnum = null,
    VpcId: VpcId = null
  ): LoadBalancer = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (CanonicalHostedZoneId != null) __obj.updateDynamic("CanonicalHostedZoneId")(CanonicalHostedZoneId.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName.asInstanceOf[js.Any])
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    if (LoadBalancerArn != null) __obj.updateDynamic("LoadBalancerArn")(LoadBalancerArn.asInstanceOf[js.Any])
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName.asInstanceOf[js.Any])
    if (Scheme != null) __obj.updateDynamic("Scheme")(Scheme.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancer]
  }
}

