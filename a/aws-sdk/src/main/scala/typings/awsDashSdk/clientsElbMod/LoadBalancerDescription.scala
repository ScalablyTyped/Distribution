package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadBalancerDescription extends js.Object {
  /**
    * The Availability Zones for the load balancer.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsElbMod.AvailabilityZones] = js.native
  /**
    * Information about your EC2 instances.
    */
  var BackendServerDescriptions: js.UndefOr[typings.awsDashSdk.clientsElbMod.BackendServerDescriptions] = js.native
  /**
    * The DNS name of the load balancer. For more information, see Configure a Custom Domain Name in the Classic Load Balancers Guide.
    */
  var CanonicalHostedZoneName: js.UndefOr[DNSName] = js.native
  /**
    * The ID of the Amazon Route 53 hosted zone for the load balancer.
    */
  var CanonicalHostedZoneNameID: js.UndefOr[DNSName] = js.native
  /**
    * The date and time the load balancer was created.
    */
  var CreatedTime: js.UndefOr[typings.awsDashSdk.clientsElbMod.CreatedTime] = js.native
  /**
    * The DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typings.awsDashSdk.clientsElbMod.DNSName] = js.native
  /**
    * Information about the health checks conducted on the load balancer.
    */
  var HealthCheck: js.UndefOr[typings.awsDashSdk.clientsElbMod.HealthCheck] = js.native
  /**
    * The IDs of the instances for the load balancer.
    */
  var Instances: js.UndefOr[typings.awsDashSdk.clientsElbMod.Instances] = js.native
  /**
    * The listeners for the load balancer.
    */
  var ListenerDescriptions: js.UndefOr[typings.awsDashSdk.clientsElbMod.ListenerDescriptions] = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: js.UndefOr[AccessPointName] = js.native
  /**
    * The policies defined for the load balancer.
    */
  var Policies: js.UndefOr[typings.awsDashSdk.clientsElbMod.Policies] = js.native
  /**
    * The type of load balancer. Valid only for load balancers in a VPC. If Scheme is internet-facing, the load balancer has a public DNS name that resolves to a public IP address. If Scheme is internal, the load balancer has a public DNS name that resolves to a private IP address.
    */
  var Scheme: js.UndefOr[LoadBalancerScheme] = js.native
  /**
    * The security groups for the load balancer. Valid only for load balancers in a VPC.
    */
  var SecurityGroups: js.UndefOr[typings.awsDashSdk.clientsElbMod.SecurityGroups] = js.native
  /**
    * The security group for the load balancer, which you can use as part of your inbound rules for your registered instances. To only allow traffic from load balancers, add a security group rule that specifies this source security group as the inbound source.
    */
  var SourceSecurityGroup: js.UndefOr[typings.awsDashSdk.clientsElbMod.SourceSecurityGroup] = js.native
  /**
    * The IDs of the subnets for the load balancer.
    */
  var Subnets: js.UndefOr[typings.awsDashSdk.clientsElbMod.Subnets] = js.native
  /**
    * The ID of the VPC for the load balancer.
    */
  var VPCId: js.UndefOr[typings.awsDashSdk.clientsElbMod.VPCId] = js.native
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
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (BackendServerDescriptions != null) __obj.updateDynamic("BackendServerDescriptions")(BackendServerDescriptions.asInstanceOf[js.Any])
    if (CanonicalHostedZoneName != null) __obj.updateDynamic("CanonicalHostedZoneName")(CanonicalHostedZoneName.asInstanceOf[js.Any])
    if (CanonicalHostedZoneNameID != null) __obj.updateDynamic("CanonicalHostedZoneNameID")(CanonicalHostedZoneNameID.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName.asInstanceOf[js.Any])
    if (HealthCheck != null) __obj.updateDynamic("HealthCheck")(HealthCheck.asInstanceOf[js.Any])
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (ListenerDescriptions != null) __obj.updateDynamic("ListenerDescriptions")(ListenerDescriptions.asInstanceOf[js.Any])
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName.asInstanceOf[js.Any])
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    if (Scheme != null) __obj.updateDynamic("Scheme")(Scheme.asInstanceOf[js.Any])
    if (SecurityGroups != null) __obj.updateDynamic("SecurityGroups")(SecurityGroups.asInstanceOf[js.Any])
    if (SourceSecurityGroup != null) __obj.updateDynamic("SourceSecurityGroup")(SourceSecurityGroup.asInstanceOf[js.Any])
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    if (VPCId != null) __obj.updateDynamic("VPCId")(VPCId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerDescription]
  }
}

