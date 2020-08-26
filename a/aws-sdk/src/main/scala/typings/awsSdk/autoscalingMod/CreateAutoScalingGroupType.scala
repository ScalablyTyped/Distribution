package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAutoScalingGroupType extends js.Object {
  /**
    * The name of the Auto Scaling group. This name must be unique per Region per account.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  /**
    * One or more Availability Zones for the group. This parameter is optional if you specify one or more subnets for VPCZoneIdentifier. Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into EC2-Classic.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.autoscalingMod.AvailabilityZones] = js.native
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default value is 300. This setting applies when using simple scaling policies, but not when using other scaling policies or scheduled scaling. For more information, see Scaling Cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var DefaultCooldown: js.UndefOr[Cooldown] = js.native
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and the capacity it attempts to maintain. It can scale beyond this capacity if you configure automatic scaling. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a desired capacity, the default is the minimum size of the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.native
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. During this time, any health check failures for the instance are ignored. The default value is 0. For more information, see Health Check Grace Period in the Amazon EC2 Auto Scaling User Guide. Required if you are adding an ELB health check.
    */
  var HealthCheckGracePeriod: js.UndefOr[typings.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.native
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. The default value is EC2. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks. For more information, see Health Checks for Auto Scaling Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.native
  /**
    * The ID of the instance used to create a launch configuration for the group. To get the instance ID, use the Amazon EC2 DescribeInstances API operation. When you specify an ID of an instance, Amazon EC2 Auto Scaling creates a new launch configuration and associates it with the group. This launch configuration derives its attributes from the specified instance, except for the block device mapping. You must specify one of the following parameters in your request: LaunchConfigurationName, LaunchTemplate, InstanceId, or MixedInstancesPolicy.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.native
  /**
    * The name of the launch configuration to use when an instance is launched. To get the launch configuration name, use the DescribeLaunchConfigurations API operation. New launch configurations can be created with the CreateLaunchConfiguration API. You must specify one of the following parameters in your request: LaunchConfigurationName, LaunchTemplate, InstanceId, or MixedInstancesPolicy.
    */
  var LaunchConfigurationName: js.UndefOr[ResourceName] = js.native
  /**
    * Parameters used to specify the launch template and version to use when an instance is launched. For more information, see LaunchTemplateSpecification in the Amazon EC2 Auto Scaling API Reference. You can alternatively associate a launch template to the Auto Scaling group by using the MixedInstancesPolicy parameter. You must specify one of the following parameters in your request: LaunchConfigurationName, LaunchTemplate, InstanceId, or MixedInstancesPolicy.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  /**
    * One or more lifecycle hooks.
    */
  var LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications] = js.native
  /**
    * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers and Network Load Balancers, specify a list of target groups using the TargetGroupARNs property instead. For more information, see Using a Load Balancer with an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var LoadBalancerNames: js.UndefOr[typings.awsSdk.autoscalingMod.LoadBalancerNames] = js.native
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. The default is null. This parameter is optional, but if you specify a value for it, you must specify a value of at least 604,800 seconds (7 days). To clear a previously set value, specify a new value of 0. For more information, see Replacing Auto Scaling Instances Based on Maximum Instance Lifetime in the Amazon EC2 Auto Scaling User Guide. Valid Range: Minimum value of 0.
    */
  var MaxInstanceLifetime: js.UndefOr[typings.awsSdk.autoscalingMod.MaxInstanceLifetime] = js.native
  /**
    * The maximum size of the group.  With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above MaxSize to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never go above MaxSize by more than your largest instance weight (weights that define how many units each instance contributes to the desired capacity of the group). 
    */
  var MaxSize: AutoScalingGroupMaxSize = js.native
  /**
    * The minimum size of the group.
    */
  var MinSize: AutoScalingGroupMinSize = js.native
  /**
    * An embedded object that specifies a mixed instances policy. The required parameters must be specified. If optional parameters are unspecified, their default values are used. The policy includes parameters that not only define the distribution of On-Demand Instances and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill On-Demand and Spot capacity, but also the parameters that specify the instance configuration information—the launch template and instance types. For more information, see MixedInstancesPolicy in the Amazon EC2 Auto Scaling API Reference and Auto Scaling Groups with Multiple Instance Types and Purchase Options in the Amazon EC2 Auto Scaling User Guide. You must specify one of the following parameters in your request: LaunchConfigurationName, LaunchTemplate, InstanceId, or MixedInstancesPolicy.
    */
  var MixedInstancesPolicy: js.UndefOr[typings.awsSdk.autoscalingMod.MixedInstancesPolicy] = js.native
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in. For more information about preventing instances from terminating on scale in, see Instance Protection in the Amazon EC2 Auto Scaling User Guide.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.native
  /**
    * The name of the placement group into which to launch your instances, if any. A placement group is a logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a placement group. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see Service-Linked Roles in the Amazon EC2 Auto Scaling User Guide.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.native
  /**
    * One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the tags in a launch template but use caution. If the launch template specifies an instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that instance tag with the value specified by the Auto Scaling group. For more information, see Tagging Auto Scaling Groups and Instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.autoscalingMod.Tags] = js.native
  /**
    * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are registered as targets in a target group, and traffic is routed to the target group. For more information, see Using a Load Balancer with an Auto Scaling Group in the Amazon EC2 Auto Scaling User Guide.
    */
  var TargetGroupARNs: js.UndefOr[typings.awsSdk.autoscalingMod.TargetGroupARNs] = js.native
  /**
    * One or more termination policies used to select the instance to terminate. These policies are executed in the order that they are listed. For more information, see Controlling Which Instances Auto Scaling Terminates During Scale In in the Amazon EC2 Auto Scaling User Guide.
    */
  var TerminationPolicies: js.UndefOr[typings.awsSdk.autoscalingMod.TerminationPolicies] = js.native
  /**
    * A comma-separated list of subnet IDs for your virtual private cloud (VPC). If you specify VPCZoneIdentifier with AvailabilityZones, the subnets that you specify for this parameter must reside in those Availability Zones. Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a VPC.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.native
}

object CreateAutoScalingGroupType {
  @scala.inline
  def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    MaxSize: AutoScalingGroupMaxSize,
    MinSize: AutoScalingGroupMinSize
  ): CreateAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoScalingGroupType]
  }
  @scala.inline
  implicit class CreateAutoScalingGroupTypeOps[Self <: CreateAutoScalingGroupType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSize(value: AutoScalingGroupMaxSize): Self = this.set("MaxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinSize(value: AutoScalingGroupMinSize): Self = this.set("MinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZonesVarargs(value: XmlStringMaxLen255*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZones: Self = this.set("AvailabilityZones", js.undefined)
    @scala.inline
    def setDefaultCooldown(value: Cooldown): Self = this.set("DefaultCooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCooldown: Self = this.set("DefaultCooldown", js.undefined)
    @scala.inline
    def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = this.set("DesiredCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredCapacity: Self = this.set("DesiredCapacity", js.undefined)
    @scala.inline
    def setHealthCheckGracePeriod(value: HealthCheckGracePeriod): Self = this.set("HealthCheckGracePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckGracePeriod: Self = this.set("HealthCheckGracePeriod", js.undefined)
    @scala.inline
    def setHealthCheckType(value: XmlStringMaxLen32): Self = this.set("HealthCheckType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckType: Self = this.set("HealthCheckType", js.undefined)
    @scala.inline
    def setInstanceId(value: XmlStringMaxLen19): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    @scala.inline
    def setLaunchConfigurationName(value: ResourceName): Self = this.set("LaunchConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchConfigurationName: Self = this.set("LaunchConfigurationName", js.undefined)
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = this.set("LaunchTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("LaunchTemplate", js.undefined)
    @scala.inline
    def setLifecycleHookSpecificationListVarargs(value: LifecycleHookSpecification*): Self = this.set("LifecycleHookSpecificationList", js.Array(value :_*))
    @scala.inline
    def setLifecycleHookSpecificationList(value: LifecycleHookSpecifications): Self = this.set("LifecycleHookSpecificationList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLifecycleHookSpecificationList: Self = this.set("LifecycleHookSpecificationList", js.undefined)
    @scala.inline
    def setLoadBalancerNamesVarargs(value: XmlStringMaxLen255*): Self = this.set("LoadBalancerNames", js.Array(value :_*))
    @scala.inline
    def setLoadBalancerNames(value: LoadBalancerNames): Self = this.set("LoadBalancerNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadBalancerNames: Self = this.set("LoadBalancerNames", js.undefined)
    @scala.inline
    def setMaxInstanceLifetime(value: MaxInstanceLifetime): Self = this.set("MaxInstanceLifetime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxInstanceLifetime: Self = this.set("MaxInstanceLifetime", js.undefined)
    @scala.inline
    def setMixedInstancesPolicy(value: MixedInstancesPolicy): Self = this.set("MixedInstancesPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMixedInstancesPolicy: Self = this.set("MixedInstancesPolicy", js.undefined)
    @scala.inline
    def setNewInstancesProtectedFromScaleIn(value: InstanceProtected): Self = this.set("NewInstancesProtectedFromScaleIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewInstancesProtectedFromScaleIn: Self = this.set("NewInstancesProtectedFromScaleIn", js.undefined)
    @scala.inline
    def setPlacementGroup(value: XmlStringMaxLen255): Self = this.set("PlacementGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacementGroup: Self = this.set("PlacementGroup", js.undefined)
    @scala.inline
    def setServiceLinkedRoleARN(value: ResourceName): Self = this.set("ServiceLinkedRoleARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceLinkedRoleARN: Self = this.set("ServiceLinkedRoleARN", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setTargetGroupARNsVarargs(value: XmlStringMaxLen511*): Self = this.set("TargetGroupARNs", js.Array(value :_*))
    @scala.inline
    def setTargetGroupARNs(value: TargetGroupARNs): Self = this.set("TargetGroupARNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupARNs: Self = this.set("TargetGroupARNs", js.undefined)
    @scala.inline
    def setTerminationPoliciesVarargs(value: XmlStringMaxLen1600*): Self = this.set("TerminationPolicies", js.Array(value :_*))
    @scala.inline
    def setTerminationPolicies(value: TerminationPolicies): Self = this.set("TerminationPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTerminationPolicies: Self = this.set("TerminationPolicies", js.undefined)
    @scala.inline
    def setVPCZoneIdentifier(value: XmlStringMaxLen2047): Self = this.set("VPCZoneIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVPCZoneIdentifier: Self = this.set("VPCZoneIdentifier", js.undefined)
  }
  
}

