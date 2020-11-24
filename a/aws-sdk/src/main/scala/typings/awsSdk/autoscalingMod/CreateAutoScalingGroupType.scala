package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateAutoScalingGroupType extends js.Object {
  
  /**
    * The name of the Auto Scaling group. This name must be unique per Region per account.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  
  /**
    * A list of Availability Zones where instances in the Auto Scaling group can be created. This parameter is optional if you specify one or more subnets for VPCZoneIdentifier. Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into EC2-Classic.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.autoscalingMod.AvailabilityZones] = js.native
  
  /**
    * Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot Instance is at an elevated risk of interruption. After launching a new instance, it then terminates an old instance. For more information, see Amazon EC2 Auto Scaling Capacity Rebalancing in the Amazon EC2 Auto Scaling User Guide.
    */
  var CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled] = js.native
  
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default value is 300. This setting applies when using simple scaling policies, but not when using other scaling policies or scheduled scaling. For more information, see Scaling cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var DefaultCooldown: js.UndefOr[Cooldown] = js.native
  
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and the capacity it attempts to maintain. It can scale beyond this capacity if you configure auto scaling. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a desired capacity, the default is the minimum size of the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.native
  
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. During this time, any health check failures for the instance are ignored. The default value is 0. For more information, see Health check grace period in the Amazon EC2 Auto Scaling User Guide. Conditional: Required if you are adding an ELB health check.
    */
  var HealthCheckGracePeriod: js.UndefOr[typings.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.native
  
  /**
    * The service to use for the health checks. The valid values are EC2 (default) and ELB. If you configure an Auto Scaling group to use load balancer (ELB) health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks. For more information, see Health checks for Auto Scaling instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.native
  
  /**
    * The ID of the instance used to base the launch configuration on. If specified, Amazon EC2 Auto Scaling uses the configuration values from the specified instance to create a new launch configuration. To get the instance ID, use the Amazon EC2 DescribeInstances API operation. For more information, see Creating an Auto Scaling group using an EC2 instance in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.native
  
  /**
    * The name of the launch configuration to use to launch instances.  Conditional: You must specify either a launch template (LaunchTemplate or MixedInstancesPolicy) or a launch configuration (LaunchConfigurationName or InstanceId).
    */
  var LaunchConfigurationName: js.UndefOr[ResourceName] = js.native
  
  /**
    * Parameters used to specify the launch template and version to use to launch instances.  Conditional: You must specify either a launch template (LaunchTemplate or MixedInstancesPolicy) or a launch configuration (LaunchConfigurationName or InstanceId).  The launch template that is specified must be configured for use with an Auto Scaling group. For more information, see Creating a launch template for an Auto Scaling group in the Amazon EC2 Auto Scaling User Guide. 
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  
  /**
    * One or more lifecycle hooks for the group, which specify actions to perform when Amazon EC2 Auto Scaling launches or terminates instances.
    */
  var LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications] = js.native
  
  /**
    * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers and Network Load Balancers, specify TargetGroupARNs instead.
    */
  var LoadBalancerNames: js.UndefOr[typings.awsSdk.autoscalingMod.LoadBalancerNames] = js.native
  
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. The default is null. If specified, the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). For more information, see Replacing Auto Scaling instances based on maximum instance lifetime in the Amazon EC2 Auto Scaling User Guide.
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
    * An embedded object that specifies a mixed instances policy. The required parameters must be specified. If optional parameters are unspecified, their default values are used. The policy includes parameters that not only define the distribution of On-Demand Instances and Spot Instances, the maximum price to pay for Spot Instances, and how the Auto Scaling group allocates instance types to fulfill On-Demand and Spot capacities, but also the parameters that specify the instance configuration information—the launch template and instance types. The policy can also include a weight for each instance type and different launch templates for individual instance types. For more information, see Auto Scaling groups with multiple instance types and purchase options in the Amazon EC2 Auto Scaling User Guide. Conditional: You must specify either a launch template (LaunchTemplate or MixedInstancesPolicy) or a launch configuration (LaunchConfigurationName or InstanceId).
    */
  var MixedInstancesPolicy: js.UndefOr[typings.awsSdk.autoscalingMod.MixedInstancesPolicy] = js.native
  
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in. For more information about preventing instances from terminating on scale in, see Instance scale-in protection in the Amazon EC2 Auto Scaling User Guide.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.native
  
  /**
    * The name of an existing placement group into which to launch your instances, if any. A placement group is a logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a placement group. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see Service-linked roles in the Amazon EC2 Auto Scaling User Guide.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.native
  
  /**
    * One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the tags in a launch template but use caution. If the launch template specifies an instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that instance tag with the value specified by the Auto Scaling group. For more information, see Tagging Auto Scaling groups and instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.autoscalingMod.Tags] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are registered as targets in a target group, and traffic is routed to the target group. For more information, see Elastic Load Balancing and Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var TargetGroupARNs: js.UndefOr[typings.awsSdk.autoscalingMod.TargetGroupARNs] = js.native
  
  /**
    * A policy or a list of policies that are used to select the instance to terminate. These policies are executed in the order that you list them. For more information, see Controlling which Auto Scaling instances terminate during scale in in the Amazon EC2 Auto Scaling User Guide.
    */
  var TerminationPolicies: js.UndefOr[typings.awsSdk.autoscalingMod.TerminationPolicies] = js.native
  
  /**
    * A comma-separated list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling group can be created. If you specify VPCZoneIdentifier with AvailabilityZones, the subnets that you specify for this parameter must reside in those Availability Zones. Conditional: If your account supports EC2-Classic and VPC, this parameter is required to launch instances into a VPC.
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
    def setCapacityRebalance(value: CapacityRebalanceEnabled): Self = this.set("CapacityRebalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacityRebalance: Self = this.set("CapacityRebalance", js.undefined)
    
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
