package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScalingGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  var AutoScalingGroupARN: js.UndefOr[ResourceName] = js.native
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  /**
    * One or more Availability Zones for the group.
    */
  var AvailabilityZones: typings.awsDashSdk.clientsAutoscalingMod.AvailabilityZones = js.native
  /**
    * The date and time the group was created.
    */
  var CreatedTime: TimestampType = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
    */
  var DefaultCooldown: Cooldown = js.native
  /**
    * The desired size of the group.
    */
  var DesiredCapacity: AutoScalingGroupDesiredCapacity = js.native
  /**
    * The metrics enabled for the group.
    */
  var EnabledMetrics: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.EnabledMetrics] = js.native
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
    */
  var HealthCheckGracePeriod: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.HealthCheckGracePeriod] = js.native
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
    */
  var HealthCheckType: XmlStringMaxLen32 = js.native
  /**
    * The EC2 instances associated with the group.
    */
  var Instances: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.Instances] = js.native
  /**
    * The name of the associated launch configuration.
    */
  var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The launch template for the group.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  /**
    * One or more load balancers associated with the group.
    */
  var LoadBalancerNames: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.LoadBalancerNames] = js.native
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. Valid Range: Minimum value of 604800.
    */
  var MaxInstanceLifetime: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MaxInstanceLifetime] = js.native
  /**
    * The maximum size of the group.
    */
  var MaxSize: AutoScalingGroupMaxSize = js.native
  /**
    * The minimum size of the group.
    */
  var MinSize: AutoScalingGroupMinSize = js.native
  /**
    * The mixed instances policy for the group.
    */
  var MixedInstancesPolicy: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MixedInstancesPolicy] = js.native
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.native
  /**
    * The name of the placement group into which to launch your instances, if any.
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.native
  /**
    * The current state of the group when DeleteAutoScalingGroup is in progress.
    */
  var Status: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The suspended processes associated with the group.
    */
  var SuspendedProcesses: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.SuspendedProcesses] = js.native
  /**
    * The tags for the group.
    */
  var Tags: js.UndefOr[TagDescriptionList] = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups for your load balancer.
    */
  var TargetGroupARNs: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.TargetGroupARNs] = js.native
  /**
    * The termination policies for the group.
    */
  var TerminationPolicies: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.TerminationPolicies] = js.native
  /**
    * One or more subnet IDs, if applicable, separated by commas.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.native
}

object AutoScalingGroup {
  @scala.inline
  def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    AvailabilityZones: AvailabilityZones,
    CreatedTime: TimestampType,
    DefaultCooldown: Cooldown,
    DesiredCapacity: AutoScalingGroupDesiredCapacity,
    HealthCheckType: XmlStringMaxLen32,
    MaxSize: AutoScalingGroupMaxSize,
    MinSize: AutoScalingGroupMinSize,
    AutoScalingGroupARN: ResourceName = null,
    EnabledMetrics: EnabledMetrics = null,
    HealthCheckGracePeriod: Int | Double = null,
    Instances: Instances = null,
    LaunchConfigurationName: XmlStringMaxLen255 = null,
    LaunchTemplate: LaunchTemplateSpecification = null,
    LoadBalancerNames: LoadBalancerNames = null,
    MaxInstanceLifetime: Int | Double = null,
    MixedInstancesPolicy: MixedInstancesPolicy = null,
    NewInstancesProtectedFromScaleIn: js.UndefOr[Boolean] = js.undefined,
    PlacementGroup: XmlStringMaxLen255 = null,
    ServiceLinkedRoleARN: ResourceName = null,
    Status: XmlStringMaxLen255 = null,
    SuspendedProcesses: SuspendedProcesses = null,
    Tags: TagDescriptionList = null,
    TargetGroupARNs: TargetGroupARNs = null,
    TerminationPolicies: TerminationPolicies = null,
    VPCZoneIdentifier: XmlStringMaxLen2047 = null
  ): AutoScalingGroup = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], DefaultCooldown = DefaultCooldown.asInstanceOf[js.Any], DesiredCapacity = DesiredCapacity.asInstanceOf[js.Any], HealthCheckType = HealthCheckType.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any])
    if (AutoScalingGroupARN != null) __obj.updateDynamic("AutoScalingGroupARN")(AutoScalingGroupARN.asInstanceOf[js.Any])
    if (EnabledMetrics != null) __obj.updateDynamic("EnabledMetrics")(EnabledMetrics.asInstanceOf[js.Any])
    if (HealthCheckGracePeriod != null) __obj.updateDynamic("HealthCheckGracePeriod")(HealthCheckGracePeriod.asInstanceOf[js.Any])
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    if (LaunchConfigurationName != null) __obj.updateDynamic("LaunchConfigurationName")(LaunchConfigurationName.asInstanceOf[js.Any])
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate.asInstanceOf[js.Any])
    if (LoadBalancerNames != null) __obj.updateDynamic("LoadBalancerNames")(LoadBalancerNames.asInstanceOf[js.Any])
    if (MaxInstanceLifetime != null) __obj.updateDynamic("MaxInstanceLifetime")(MaxInstanceLifetime.asInstanceOf[js.Any])
    if (MixedInstancesPolicy != null) __obj.updateDynamic("MixedInstancesPolicy")(MixedInstancesPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(NewInstancesProtectedFromScaleIn)) __obj.updateDynamic("NewInstancesProtectedFromScaleIn")(NewInstancesProtectedFromScaleIn.asInstanceOf[js.Any])
    if (PlacementGroup != null) __obj.updateDynamic("PlacementGroup")(PlacementGroup.asInstanceOf[js.Any])
    if (ServiceLinkedRoleARN != null) __obj.updateDynamic("ServiceLinkedRoleARN")(ServiceLinkedRoleARN.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SuspendedProcesses != null) __obj.updateDynamic("SuspendedProcesses")(SuspendedProcesses.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TargetGroupARNs != null) __obj.updateDynamic("TargetGroupARNs")(TargetGroupARNs.asInstanceOf[js.Any])
    if (TerminationPolicies != null) __obj.updateDynamic("TerminationPolicies")(TerminationPolicies.asInstanceOf[js.Any])
    if (VPCZoneIdentifier != null) __obj.updateDynamic("VPCZoneIdentifier")(VPCZoneIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroup]
  }
}

