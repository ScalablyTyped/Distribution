package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancer extends js.Object {
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
  /**
    * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
    */
  var CanonicalHostedZoneId: js.UndefOr[CanonicalHostedZoneId] = js.undefined
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
  /**
    * The public DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[DNSName] = js.undefined
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
    */
  var IpAddressType: js.UndefOr[IpAddressType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the load balancer.
    */
  var LoadBalancerArn: js.UndefOr[LoadBalancerArn] = js.undefined
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[LoadBalancerName] = js.undefined
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses. The DNS name of an Internet-facing load balancer is publicly resolvable to the public IP addresses of the nodes. Therefore, Internet-facing load balancers can route requests from clients over the internet. The nodes of an internal load balancer have only private IP addresses. The DNS name of an internal load balancer is publicly resolvable to the private IP addresses of the nodes. Therefore, internal load balancers can only route requests from clients with access to the VPC for the load balancer.
    */
  var Scheme: js.UndefOr[LoadBalancerSchemeEnum] = js.undefined
  /**
    * The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
  /**
    * The state of the load balancer.
    */
  var State: js.UndefOr[LoadBalancerState] = js.undefined
  /**
    * The type of load balancer.
    */
  var Type: js.UndefOr[LoadBalancerTypeEnum] = js.undefined
  /**
    * The ID of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[VpcId] = js.undefined
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
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (CanonicalHostedZoneId != null) __obj.updateDynamic("CanonicalHostedZoneId")(CanonicalHostedZoneId)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName)
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    if (LoadBalancerArn != null) __obj.updateDynamic("LoadBalancerArn")(LoadBalancerArn)
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName)
    if (Scheme != null) __obj.updateDynamic("Scheme")(Scheme.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (State != null) __obj.updateDynamic("State")(State)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[LoadBalancer]
  }
}

