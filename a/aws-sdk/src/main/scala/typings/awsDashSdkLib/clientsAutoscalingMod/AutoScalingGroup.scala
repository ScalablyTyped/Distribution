package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoScalingGroup extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  var AutoScalingGroupARN: js.UndefOr[ResourceName] = js.undefined
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  /**
    * One or more Availability Zones for the group.
    */
  var AvailabilityZones: awsDashSdkLib.clientsAutoscalingMod.AvailabilityZones
  /**
    * The date and time the group was created.
    */
  var CreatedTime: TimestampType
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start.
    */
  var DefaultCooldown: Cooldown
  /**
    * The desired size of the group.
    */
  var DesiredCapacity: AutoScalingGroupDesiredCapacity
  /**
    * The metrics enabled for the group.
    */
  var EnabledMetrics: js.UndefOr[EnabledMetrics] = js.undefined
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
    */
  var HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
    */
  var HealthCheckType: XmlStringMaxLen32
  /**
    * The EC2 instances associated with the group.
    */
  var Instances: js.UndefOr[Instances] = js.undefined
  /**
    * The name of the associated launch configuration.
    */
  var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The launch template for the group.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  /**
    * One or more load balancers associated with the group.
    */
  var LoadBalancerNames: js.UndefOr[LoadBalancerNames] = js.undefined
  /**
    * The maximum size of the group.
    */
  var MaxSize: AutoScalingGroupMaxSize
  /**
    * The minimum size of the group.
    */
  var MinSize: AutoScalingGroupMinSize
  /**
    * The mixed instances policy for the group. 
    */
  var MixedInstancesPolicy: js.UndefOr[MixedInstancesPolicy] = js.undefined
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined
  /**
    * The name of the placement group into which to launch your instances, if any.
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined
  /**
    * The current state of the group when DeleteAutoScalingGroup is in progress.
    */
  var Status: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The suspended processes associated with the group.
    */
  var SuspendedProcesses: js.UndefOr[SuspendedProcesses] = js.undefined
  /**
    * The tags for the group.
    */
  var Tags: js.UndefOr[TagDescriptionList] = js.undefined
  /**
    * The Amazon Resource Names (ARN) of the target groups for your load balancer.
    */
  var TargetGroupARNs: js.UndefOr[TargetGroupARNs] = js.undefined
  /**
    * The termination policies for the group.
    */
  var TerminationPolicies: js.UndefOr[TerminationPolicies] = js.undefined
  /**
    * One or more subnet IDs, if applicable, separated by commas.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
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
    HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
    Instances: Instances = null,
    LaunchConfigurationName: XmlStringMaxLen255 = null,
    LaunchTemplate: LaunchTemplateSpecification = null,
    LoadBalancerNames: LoadBalancerNames = null,
    MixedInstancesPolicy: MixedInstancesPolicy = null,
    NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined,
    PlacementGroup: XmlStringMaxLen255 = null,
    ServiceLinkedRoleARN: ResourceName = null,
    Status: XmlStringMaxLen255 = null,
    SuspendedProcesses: SuspendedProcesses = null,
    Tags: TagDescriptionList = null,
    TargetGroupARNs: TargetGroupARNs = null,
    TerminationPolicies: TerminationPolicies = null,
    VPCZoneIdentifier: XmlStringMaxLen2047 = null
  ): AutoScalingGroup = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName, AvailabilityZones = AvailabilityZones, CreatedTime = CreatedTime, DefaultCooldown = DefaultCooldown, DesiredCapacity = DesiredCapacity, HealthCheckType = HealthCheckType, MaxSize = MaxSize, MinSize = MinSize)
    if (AutoScalingGroupARN != null) __obj.updateDynamic("AutoScalingGroupARN")(AutoScalingGroupARN)
    if (EnabledMetrics != null) __obj.updateDynamic("EnabledMetrics")(EnabledMetrics)
    if (!js.isUndefined(HealthCheckGracePeriod)) __obj.updateDynamic("HealthCheckGracePeriod")(HealthCheckGracePeriod)
    if (Instances != null) __obj.updateDynamic("Instances")(Instances)
    if (LaunchConfigurationName != null) __obj.updateDynamic("LaunchConfigurationName")(LaunchConfigurationName)
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate)
    if (LoadBalancerNames != null) __obj.updateDynamic("LoadBalancerNames")(LoadBalancerNames)
    if (MixedInstancesPolicy != null) __obj.updateDynamic("MixedInstancesPolicy")(MixedInstancesPolicy)
    if (!js.isUndefined(NewInstancesProtectedFromScaleIn)) __obj.updateDynamic("NewInstancesProtectedFromScaleIn")(NewInstancesProtectedFromScaleIn)
    if (PlacementGroup != null) __obj.updateDynamic("PlacementGroup")(PlacementGroup)
    if (ServiceLinkedRoleARN != null) __obj.updateDynamic("ServiceLinkedRoleARN")(ServiceLinkedRoleARN)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (SuspendedProcesses != null) __obj.updateDynamic("SuspendedProcesses")(SuspendedProcesses)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TargetGroupARNs != null) __obj.updateDynamic("TargetGroupARNs")(TargetGroupARNs)
    if (TerminationPolicies != null) __obj.updateDynamic("TerminationPolicies")(TerminationPolicies)
    if (VPCZoneIdentifier != null) __obj.updateDynamic("VPCZoneIdentifier")(VPCZoneIdentifier)
    __obj.asInstanceOf[AutoScalingGroup]
  }
}

