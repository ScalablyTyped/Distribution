package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElbv2LoadBalancerDetails extends js.Object {
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.AvailabilityZones] = js.native
  /**
    * The ID of the Amazon Route 53 hosted zone associated with the load balancer.
    */
  var CanonicalHostedZoneId: js.UndefOr[NonEmptyString] = js.native
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[NonEmptyString] = js.native
  /**
    * The public DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[NonEmptyString] = js.native
  /**
    * The type of IP addresses used by the subnets for your load balancer. The possible values are ipv4 (for IPv4 addresses) and dualstack (for IPv4 and IPv6 addresses).
    */
  var IpAddressType: js.UndefOr[NonEmptyString] = js.native
  /**
    * The nodes of an Internet-facing load balancer have public IP addresses.
    */
  var Scheme: js.UndefOr[NonEmptyString] = js.native
  /**
    * The IDs of the security groups for the load balancer.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.SecurityGroups] = js.native
  /**
    * The state of the load balancer.
    */
  var State: js.UndefOr[LoadBalancerState] = js.native
  /**
    * The type of load balancer.
    */
  var Type: js.UndefOr[NonEmptyString] = js.native
  /**
    * The ID of the VPC for the load balancer.
    */
  var VpcId: js.UndefOr[NonEmptyString] = js.native
}

object AwsElbv2LoadBalancerDetails {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZones = null,
    CanonicalHostedZoneId: NonEmptyString = null,
    CreatedTime: NonEmptyString = null,
    DNSName: NonEmptyString = null,
    IpAddressType: NonEmptyString = null,
    Scheme: NonEmptyString = null,
    SecurityGroups: SecurityGroups = null,
    State: LoadBalancerState = null,
    Type: NonEmptyString = null,
    VpcId: NonEmptyString = null
  ): AwsElbv2LoadBalancerDetails = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (CanonicalHostedZoneId != null) __obj.updateDynamic("CanonicalHostedZoneId")(CanonicalHostedZoneId.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName.asInstanceOf[js.Any])
    if (IpAddressType != null) __obj.updateDynamic("IpAddressType")(IpAddressType.asInstanceOf[js.Any])
    if (Scheme != null) __obj.updateDynamic("Scheme")(Scheme.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsElbv2LoadBalancerDetails]
  }
}

