package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAutoScalingGroupType extends StObject {
  
  /**
    * The name of the Auto Scaling group. This name must be unique per Region per account.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * A list of Availability Zones where instances in the Auto Scaling group can be created. Used for launching into the default VPC subnet in each Availability Zone when not using the VPCZoneIdentifier property, or for attaching a network interface when an existing network interface ID is specified in a launch template.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.AvailabilityZones] = js.undefined
  
  /**
    * Indicates whether Capacity Rebalancing is enabled. Otherwise, Capacity Rebalancing is disabled. When you turn on Capacity Rebalancing, Amazon EC2 Auto Scaling attempts to launch a Spot Instance whenever Amazon EC2 notifies that a Spot Instance is at an elevated risk of interruption. After launching a new instance, it then terminates an old instance. For more information, see Use Capacity Rebalancing to handle Amazon EC2 Spot Interruptions in the in the Amazon EC2 Auto Scaling User Guide.
    */
  var CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled] = js.undefined
  
  /**
    * Reserved.
    */
  var Context: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Context] = js.undefined
  
  /**
    *  Only needed if you use simple scaling policies.  The amount of time, in seconds, between one scaling activity ending and another one starting due to simple scaling policies. For more information, see Scaling cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide. Default: 300 seconds
    */
  var DefaultCooldown: js.UndefOr[Cooldown] = js.undefined
  
  /**
    * The amount of time, in seconds, until a newly launched instance can contribute to the Amazon CloudWatch metrics. This delay lets an instance finish initializing before Amazon EC2 Auto Scaling aggregates instance metrics, resulting in more reliable usage data. Set this value equal to the amount of time that it takes for resource consumption to become stable after an instance reaches the InService state. For more information, see Set the default instance warmup for an Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.  To manage your warm-up settings at the group level, we recommend that you set the default instance warmup, even if its value is set to 0 seconds. This also optimizes the performance of scaling policies that scale continuously, such as target tracking and step scaling policies.  If you need to remove a value that you previously set, include the property but specify -1 for the value. However, we strongly recommend keeping the default instance warmup enabled by specifying a minimum value of 0.  Default: None 
    */
  var DefaultInstanceWarmup: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.DefaultInstanceWarmup] = js.undefined
  
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group at the time of its creation and the capacity it attempts to maintain. It can scale beyond this capacity if you configure auto scaling. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group. If you do not specify a desired capacity, the default is the minimum size of the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
  
  /**
    * The unit of measurement for the value specified for desired capacity. Amazon EC2 Auto Scaling supports DesiredCapacityType for attribute-based instance type selection only. For more information, see Creating an Auto Scaling group using attribute-based instance type selection in the Amazon EC2 Auto Scaling User Guide. By default, Amazon EC2 Auto Scaling specifies units, which translates into number of instances. Valid values: units | vcpu | memory-mib 
    */
  var DesiredCapacityType: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service and marking it unhealthy due to a failed Elastic Load Balancing or custom health check. This is useful if your instances do not immediately pass these health checks after they enter the InService state. For more information, see Health check grace period in the Amazon EC2 Auto Scaling User Guide. Default: 0 seconds
    */
  var HealthCheckGracePeriod: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.HealthCheckGracePeriod] = js.undefined
  
  /**
    * The service to use for the health checks. The valid values are EC2 (default) and ELB. If you configure an Auto Scaling group to use load balancer (ELB) health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks. For more information, see Health checks for Auto Scaling instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined
  
  /**
    * The ID of the instance used to base the launch configuration on. If specified, Amazon EC2 Auto Scaling uses the configuration values from the specified instance to create a new launch configuration. To get the instance ID, use the Amazon EC2 DescribeInstances API operation. For more information, see Creating an Auto Scaling group using an EC2 instance in the Amazon EC2 Auto Scaling User Guide.
    */
  var InstanceId: js.UndefOr[XmlStringMaxLen19] = js.undefined
  
  /**
    * The name of the launch configuration to use to launch instances.  Conditional: You must specify either a launch template (LaunchTemplate or MixedInstancesPolicy) or a launch configuration (LaunchConfigurationName or InstanceId).
    */
  var LaunchConfigurationName: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * Information used to specify the launch template and version to use to launch instances.  Conditional: You must specify either a launch template (LaunchTemplate or MixedInstancesPolicy) or a launch configuration (LaunchConfigurationName or InstanceId).  The launch template that is specified must be configured for use with an Auto Scaling group. For more information, see Creating a launch template for an Auto Scaling group in the Amazon EC2 Auto Scaling User Guide. 
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  
  /**
    * One or more lifecycle hooks to add to the Auto Scaling group before instances are launched.
    */
  var LifecycleHookSpecificationList: js.UndefOr[LifecycleHookSpecifications] = js.undefined
  
  /**
    * A list of Classic Load Balancers associated with this Auto Scaling group. For Application Load Balancers, Network Load Balancers, and Gateway Load Balancer, specify the TargetGroupARNs property instead.
    */
  var LoadBalancerNames: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.LoadBalancerNames] = js.undefined
  
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. The default is null. If specified, the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). For more information, see Replacing Auto Scaling instances based on maximum instance lifetime in the Amazon EC2 Auto Scaling User Guide.
    */
  var MaxInstanceLifetime: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxInstanceLifetime] = js.undefined
  
  /**
    * The maximum size of the group.  With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above MaxSize to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never go above MaxSize by more than your largest instance weight (weights that define how many units each instance contributes to the desired capacity of the group). 
    */
  var MaxSize: AutoScalingGroupMaxSize
  
  /**
    * The minimum size of the group.
    */
  var MinSize: AutoScalingGroupMinSize
  
  /**
    * An embedded object that specifies a mixed instances policy. For more information, see Auto Scaling groups with multiple instance types and purchase options in the Amazon EC2 Auto Scaling User Guide.
    */
  var MixedInstancesPolicy: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MixedInstancesPolicy] = js.undefined
  
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in. For more information about preventing instances from terminating on scale in, see Using instance scale-in protection in the Amazon EC2 Auto Scaling User Guide.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined
  
  /**
    * The name of the placement group into which to launch your instances. For more information, see Placement groups in the Amazon EC2 User Guide for Linux Instances.  A cluster placement group is a logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a cluster placement group.  
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other Amazon Web Services service on your behalf. By default, Amazon EC2 Auto Scaling uses a service-linked role named AWSServiceRoleForAutoScaling, which it creates if it does not exist. For more information, see Service-linked roles in the Amazon EC2 Auto Scaling User Guide.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * One or more tags. You can tag your Auto Scaling group and propagate the tags to the Amazon EC2 instances it launches. Tags are not propagated to Amazon EBS volumes. To add tags to Amazon EBS volumes, specify the tags in a launch template but use caution. If the launch template specifies an instance tag with a key that is also specified for the Auto Scaling group, Amazon EC2 Auto Scaling overrides the value of that instance tag with the value specified by the Auto Scaling group. For more information, see Tag Auto Scaling groups and instances in the Amazon EC2 Auto Scaling User Guide.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Tags] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the target groups to associate with the Auto Scaling group. Instances are registered as targets with the target groups. The target groups receive incoming traffic and route requests to one or more registered targets. For more information, see Use Elastic Load Balancing to distribute traffic across the instances in your Auto Scaling group in the Amazon EC2 Auto Scaling User Guide.
    */
  var TargetGroupARNs: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.TargetGroupARNs] = js.undefined
  
  /**
    * A policy or a list of policies that are used to select the instance to terminate. These policies are executed in the order that you list them. For more information, see Work with Amazon EC2 Auto Scaling termination policies in the Amazon EC2 Auto Scaling User Guide. Valid values: Default | AllocationStrategy | ClosestToNextInstanceHour | NewestInstance | OldestInstance | OldestLaunchConfiguration | OldestLaunchTemplate | arn:aws:lambda:region:account-id:function:my-function:my-alias 
    */
  var TerminationPolicies: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.TerminationPolicies] = js.undefined
  
  /**
    * A comma-separated list of subnet IDs for a virtual private cloud (VPC) where instances in the Auto Scaling group can be created. If you specify VPCZoneIdentifier with AvailabilityZones, the subnets that you specify must reside in those Availability Zones.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
}
object CreateAutoScalingGroupType {
  
  inline def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    MaxSize: AutoScalingGroupMaxSize,
    MinSize: AutoScalingGroupMinSize
  ): CreateAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAutoScalingGroupType]
  }
  
  extension [Self <: CreateAutoScalingGroupType](x: Self) {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "AvailabilityZones", js.Array(value*))
    
    inline def setCapacityRebalance(value: CapacityRebalanceEnabled): Self = StObject.set(x, "CapacityRebalance", value.asInstanceOf[js.Any])
    
    inline def setCapacityRebalanceUndefined: Self = StObject.set(x, "CapacityRebalance", js.undefined)
    
    inline def setContext(value: Context): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    inline def setDefaultCooldown(value: Cooldown): Self = StObject.set(x, "DefaultCooldown", value.asInstanceOf[js.Any])
    
    inline def setDefaultCooldownUndefined: Self = StObject.set(x, "DefaultCooldown", js.undefined)
    
    inline def setDefaultInstanceWarmup(value: DefaultInstanceWarmup): Self = StObject.set(x, "DefaultInstanceWarmup", value.asInstanceOf[js.Any])
    
    inline def setDefaultInstanceWarmupUndefined: Self = StObject.set(x, "DefaultInstanceWarmup", js.undefined)
    
    inline def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = StObject.set(x, "DesiredCapacity", value.asInstanceOf[js.Any])
    
    inline def setDesiredCapacityType(value: XmlStringMaxLen255): Self = StObject.set(x, "DesiredCapacityType", value.asInstanceOf[js.Any])
    
    inline def setDesiredCapacityTypeUndefined: Self = StObject.set(x, "DesiredCapacityType", js.undefined)
    
    inline def setDesiredCapacityUndefined: Self = StObject.set(x, "DesiredCapacity", js.undefined)
    
    inline def setHealthCheckGracePeriod(value: HealthCheckGracePeriod): Self = StObject.set(x, "HealthCheckGracePeriod", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckGracePeriodUndefined: Self = StObject.set(x, "HealthCheckGracePeriod", js.undefined)
    
    inline def setHealthCheckType(value: XmlStringMaxLen32): Self = StObject.set(x, "HealthCheckType", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckTypeUndefined: Self = StObject.set(x, "HealthCheckType", js.undefined)
    
    inline def setInstanceId(value: XmlStringMaxLen19): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationNameUndefined: Self = StObject.set(x, "LaunchConfigurationName", js.undefined)
    
    inline def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    inline def setLifecycleHookSpecificationList(value: LifecycleHookSpecifications): Self = StObject.set(x, "LifecycleHookSpecificationList", value.asInstanceOf[js.Any])
    
    inline def setLifecycleHookSpecificationListUndefined: Self = StObject.set(x, "LifecycleHookSpecificationList", js.undefined)
    
    inline def setLifecycleHookSpecificationListVarargs(value: LifecycleHookSpecification*): Self = StObject.set(x, "LifecycleHookSpecificationList", js.Array(value*))
    
    inline def setLoadBalancerNames(value: LoadBalancerNames): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNamesUndefined: Self = StObject.set(x, "LoadBalancerNames", js.undefined)
    
    inline def setLoadBalancerNamesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value*))
    
    inline def setMaxInstanceLifetime(value: MaxInstanceLifetime): Self = StObject.set(x, "MaxInstanceLifetime", value.asInstanceOf[js.Any])
    
    inline def setMaxInstanceLifetimeUndefined: Self = StObject.set(x, "MaxInstanceLifetime", js.undefined)
    
    inline def setMaxSize(value: AutoScalingGroupMaxSize): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    inline def setMinSize(value: AutoScalingGroupMinSize): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setMixedInstancesPolicy(value: MixedInstancesPolicy): Self = StObject.set(x, "MixedInstancesPolicy", value.asInstanceOf[js.Any])
    
    inline def setMixedInstancesPolicyUndefined: Self = StObject.set(x, "MixedInstancesPolicy", js.undefined)
    
    inline def setNewInstancesProtectedFromScaleIn(value: InstanceProtected): Self = StObject.set(x, "NewInstancesProtectedFromScaleIn", value.asInstanceOf[js.Any])
    
    inline def setNewInstancesProtectedFromScaleInUndefined: Self = StObject.set(x, "NewInstancesProtectedFromScaleIn", js.undefined)
    
    inline def setPlacementGroup(value: XmlStringMaxLen255): Self = StObject.set(x, "PlacementGroup", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupUndefined: Self = StObject.set(x, "PlacementGroup", js.undefined)
    
    inline def setServiceLinkedRoleARN(value: ResourceName): Self = StObject.set(x, "ServiceLinkedRoleARN", value.asInstanceOf[js.Any])
    
    inline def setServiceLinkedRoleARNUndefined: Self = StObject.set(x, "ServiceLinkedRoleARN", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetGroupARNs(value: TargetGroupARNs): Self = StObject.set(x, "TargetGroupARNs", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupARNsUndefined: Self = StObject.set(x, "TargetGroupARNs", js.undefined)
    
    inline def setTargetGroupARNsVarargs(value: XmlStringMaxLen511*): Self = StObject.set(x, "TargetGroupARNs", js.Array(value*))
    
    inline def setTerminationPolicies(value: TerminationPolicies): Self = StObject.set(x, "TerminationPolicies", value.asInstanceOf[js.Any])
    
    inline def setTerminationPoliciesUndefined: Self = StObject.set(x, "TerminationPolicies", js.undefined)
    
    inline def setTerminationPoliciesVarargs(value: XmlStringMaxLen1600*): Self = StObject.set(x, "TerminationPolicies", js.Array(value*))
    
    inline def setVPCZoneIdentifier(value: XmlStringMaxLen2047): Self = StObject.set(x, "VPCZoneIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVPCZoneIdentifierUndefined: Self = StObject.set(x, "VPCZoneIdentifier", js.undefined)
  }
}
