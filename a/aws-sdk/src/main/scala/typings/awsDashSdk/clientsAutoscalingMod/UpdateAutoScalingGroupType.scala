package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAutoScalingGroupType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  /**
    * One or more Availability Zones for the group.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.AvailabilityZones] = js.undefined
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default value is 300. This cooldown period is not used when a scaling-specific cooldown is specified. Cooldown periods are not supported for target tracking scaling policies, step scaling policies, or scheduled scaling. For more information, see Scaling Cooldowns in the Amazon EC2 Auto Scaling User Guide.
    */
  var DefaultCooldown: js.UndefOr[Cooldown] = js.undefined
  /**
    * The number of EC2 instances that should be running in the Auto Scaling group. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. The default value is 0. For more information, see Health Check Grace Period in the Amazon EC2 Auto Scaling User Guide. Conditional: This parameter is required if you are adding an ELB health check.
    */
  var HealthCheckGracePeriod: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.HealthCheckGracePeriod] = js.undefined
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
    */
  var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined
  /**
    * The name of the launch configuration. If you specify LaunchConfigurationName in your update request, you can't specify LaunchTemplate or MixedInstancesPolicy.  To update an Auto Scaling group with a launch configuration with InstanceMonitoring set to false, you must first disable the collection of group metrics. Otherwise, you get an error. If you have previously enabled the collection of group metrics, you can disable it using DisableMetricsCollection. 
    */
  var LaunchConfigurationName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The launch template and version to use to specify the updates. If you specify LaunchTemplate in your update request, you can't specify LaunchConfigurationName or MixedInstancesPolicy. For more information, see LaunchTemplateSpecification in the Amazon EC2 Auto Scaling API Reference.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  /**
    * The maximum size of the Auto Scaling group.
    */
  var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined
  /**
    * The minimum size of the Auto Scaling group.
    */
  var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined
  /**
    * An embedded object that specifies a mixed instances policy. In your call to UpdateAutoScalingGroup, you can make changes to the policy that is specified. All optional parameters are left unchanged if not specified. For more information, see MixedInstancesPolicy in the Amazon EC2 Auto Scaling API Reference and Auto Scaling Groups with Multiple Instance Types and Purchase Options in the Amazon EC2 Auto Scaling User Guide.
    */
  var MixedInstancesPolicy: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.MixedInstancesPolicy] = js.undefined
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in. For more information about preventing instances from terminating on scale in, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined
  /**
    * The name of the placement group into which to launch your instances, if any. A placement group is a logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a placement group. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. For more information, see Service-Linked Roles in the Amazon EC2 Auto Scaling User Guide.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined
  /**
    * A standalone termination policy or a list of termination policies used to select the instance to terminate. The policies are executed in the order that they are listed. For more information, see Controlling Which Instances Auto Scaling Terminates During Scale In in the Amazon EC2 Auto Scaling User Guide.
    */
  var TerminationPolicies: js.UndefOr[typings.awsDashSdk.clientsAutoscalingMod.TerminationPolicies] = js.undefined
  /**
    * A comma-separated list of subnet IDs for virtual private cloud (VPC). If you specify VPCZoneIdentifier with AvailabilityZones, the subnets that you specify for this parameter must reside in those Availability Zones.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
}

object UpdateAutoScalingGroupType {
  @scala.inline
  def apply(
    AutoScalingGroupName: ResourceName,
    AvailabilityZones: AvailabilityZones = null,
    DefaultCooldown: js.UndefOr[Cooldown] = js.undefined,
    DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined,
    HealthCheckGracePeriod: js.UndefOr[HealthCheckGracePeriod] = js.undefined,
    HealthCheckType: XmlStringMaxLen32 = null,
    LaunchConfigurationName: ResourceName = null,
    LaunchTemplate: LaunchTemplateSpecification = null,
    MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined,
    MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined,
    MixedInstancesPolicy: MixedInstancesPolicy = null,
    NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined,
    PlacementGroup: XmlStringMaxLen255 = null,
    ServiceLinkedRoleARN: ResourceName = null,
    TerminationPolicies: TerminationPolicies = null,
    VPCZoneIdentifier: XmlStringMaxLen2047 = null
  ): UpdateAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName)
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (!js.isUndefined(DefaultCooldown)) __obj.updateDynamic("DefaultCooldown")(DefaultCooldown)
    if (!js.isUndefined(DesiredCapacity)) __obj.updateDynamic("DesiredCapacity")(DesiredCapacity)
    if (!js.isUndefined(HealthCheckGracePeriod)) __obj.updateDynamic("HealthCheckGracePeriod")(HealthCheckGracePeriod)
    if (HealthCheckType != null) __obj.updateDynamic("HealthCheckType")(HealthCheckType)
    if (LaunchConfigurationName != null) __obj.updateDynamic("LaunchConfigurationName")(LaunchConfigurationName)
    if (LaunchTemplate != null) __obj.updateDynamic("LaunchTemplate")(LaunchTemplate)
    if (!js.isUndefined(MaxSize)) __obj.updateDynamic("MaxSize")(MaxSize)
    if (!js.isUndefined(MinSize)) __obj.updateDynamic("MinSize")(MinSize)
    if (MixedInstancesPolicy != null) __obj.updateDynamic("MixedInstancesPolicy")(MixedInstancesPolicy)
    if (!js.isUndefined(NewInstancesProtectedFromScaleIn)) __obj.updateDynamic("NewInstancesProtectedFromScaleIn")(NewInstancesProtectedFromScaleIn)
    if (PlacementGroup != null) __obj.updateDynamic("PlacementGroup")(PlacementGroup)
    if (ServiceLinkedRoleARN != null) __obj.updateDynamic("ServiceLinkedRoleARN")(ServiceLinkedRoleARN)
    if (TerminationPolicies != null) __obj.updateDynamic("TerminationPolicies")(TerminationPolicies)
    if (VPCZoneIdentifier != null) __obj.updateDynamic("VPCZoneIdentifier")(VPCZoneIdentifier)
    __obj.asInstanceOf[UpdateAutoScalingGroupType]
  }
}

