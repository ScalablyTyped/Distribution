package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerDescription extends js.Object {
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[AvailabilityZones] = js.undefined
  /**
    * Information about your EC2 instances.
    */
  var BackendServerDescriptions: js.UndefOr[BackendServerDescriptions] = js.undefined
  /**
    * The DNS name of the load balancer. For more information, see Configure a Custom Domain Name in the Classic Load Balancers Guide.
    */
  var CanonicalHostedZoneName: js.UndefOr[DNSName] = js.undefined
  /**
    * The ID of the Amazon Route 53 hosted zone for the load balancer.
    */
  var CanonicalHostedZoneNameID: js.UndefOr[DNSName] = js.undefined
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[CreatedTime] = js.undefined
  /**
    * The DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[DNSName] = js.undefined
  /**
    * Information about the health checks conducted on the load balancer.
    */
  var HealthCheck: js.UndefOr[HealthCheck] = js.undefined
  /**
    * The IDs of the instances for the load balancer.
    */
  var Instances: js.UndefOr[Instances] = js.undefined
  /**
    * The listeners for the load balancer.
    */
  var ListenerDescriptions: js.UndefOr[ListenerDescriptions] = js.undefined
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.undefined
  /**
    * The policies defined for the load balancer.
    */
  var Policies: js.UndefOr[Policies] = js.undefined
  /**
    * The type of load balancer. Valid only for load balancers in a VPC. If Scheme is internet-facing, the load balancer has a public DNS name that resolves to a public IP address. If Scheme is internal, the load balancer has a public DNS name that resolves to a private IP address.
    */
  var Scheme: js.UndefOr[LoadBalancerScheme] = js.undefined
  /**
    * The security groups for the load balancer. Valid only for load balancers in a VPC.
    */
  var SecurityGroups: js.UndefOr[SecurityGroups] = js.undefined
  /**
    * The security group for the load balancer, which you can use as part of your inbound rules for your registered instances. To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
    */
  var SourceSecurityGroup: js.UndefOr[SourceSecurityGroup] = js.undefined
  /**
    * The IDs of the subnets for the load balancer.
    */
  var Subnets: js.UndefOr[Subnets] = js.undefined
  /**
    * The ID of the VPC for the load balancer.
    */
  var VPCId: js.UndefOr[VPCId] = js.undefined
}

object LoadBalancerDescription {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZones = null,
    BackendServerDescriptions: BackendServerDescriptions = null,
    CanonicalHostedZoneName: DNSName = null,
    CanonicalHostedZoneNameID: DNSName = null,
    CreatedTime: CreatedTime = null,
    DNSName: DNSName = null,
    HealthCheck: HealthCheck = null,
    Instances: Instances = null,
    ListenerDescriptions: ListenerDescriptions = null,
    LoadBalancerName: AccessPointName = null,
    Policies: Policies = null,
    Scheme: LoadBalancerScheme = null,
    SecurityGroups: SecurityGroups = null,
    SourceSecurityGroup: SourceSecurityGroup = null,
    Subnets: Subnets = null,
    VPCId: VPCId = null
  ): LoadBalancerDescription = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (BackendServerDescriptions != null) __obj.updateDynamic("BackendServerDescriptions")(BackendServerDescriptions)
    if (CanonicalHostedZoneName != null) __obj.updateDynamic("CanonicalHostedZoneName")(CanonicalHostedZoneName)
    if (CanonicalHostedZoneNameID != null) __obj.updateDynamic("CanonicalHostedZoneNameID")(CanonicalHostedZoneNameID)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName)
    if (HealthCheck != null) __obj.updateDynamic("HealthCheck")(HealthCheck)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (ListenerDescriptions != null) __obj.updateDynamic("ListenerDescriptions")(ListenerDescriptions)
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName)
    if (Policies != null) __obj.updateDynamic("Policies")(Policies)
    if (Scheme != null) __obj.updateDynamic("Scheme")(Scheme)
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups)
    if (SourceSecurityGroup != null) __obj.updateDynamic("SourceSecurityGroup")(SourceSecurityGroup)
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets)
    if (VPCId != null) __obj.updateDynamic("VPCId")(VPCId)
    __obj.asInstanceOf[LoadBalancerDescription]
  }
}

