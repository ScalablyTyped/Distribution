package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAutoScalingGroupType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * One or more Availability Zones for the group.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.autoscalingMod.AvailabilityZones] = js.undefined
  
  /**
    * Enables or disables Capacity Rebalancing. For more information, see Amazon EC2 Auto Scaling Capacity Rebalancing in the Amazon EC2 Auto Scaling User Guide.
    */
  var CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled] = js.undefined
  
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default value is 300. This setting applies when using simple scaling policies, but not when using other scaling policies or scheduled scaling. For more information, see Scaling cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var DefaultCooldown: js.UndefOr[Cooldown] = js.undefined
  
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group after this operation completes and the capacity it attempts to maintain. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.undefined
  
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. The default value is 0. For more information, see Health check grace period in the Amazon EC2 Auto Scaling User Guide. Conditional: Required if you are adding an ELB health check.
    */
  var HealthCheckGracePeriod: js.UndefOr[typings.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.undefined
  
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
    */
  var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.undefined
  
  /**
    * The name of the launch configuration. If you specify LaunchConfigurationName in your update request, you can't specify LaunchTemplate or MixedInstancesPolicy.
    */
  var LaunchConfigurationName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The launch template and version to use to specify the updates. If you specify LaunchTemplate in your update request, you can't specify LaunchConfigurationName or MixedInstancesPolicy.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.undefined
  
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. The default is null. If specified, the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). To clear a previously set value, specify a new value of 0. For more information, see Replacing Auto Scaling instances based on maximum instance lifetime in the Amazon EC2 Auto Scaling User Guide.
    */
  var MaxInstanceLifetime: js.UndefOr[typings.awsSdk.autoscalingMod.MaxInstanceLifetime] = js.undefined
  
  /**
    * The maximum size of the Auto Scaling group.  With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above MaxSize to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never go above MaxSize by more than your largest instance weight (weights that define how many units each instance contributes to the desired capacity of the group). 
    */
  var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.undefined
  
  /**
    * The minimum size of the Auto Scaling group.
    */
  var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.undefined
  
  /**
    * An embedded object that specifies a mixed instances policy. When you make changes to an existing policy, all optional parameters are left unchanged if not specified. For more information, see Auto Scaling groups with multiple instance types and purchase options in the Amazon EC2 Auto Scaling User Guide.
    */
  var MixedInstancesPolicy: js.UndefOr[typings.awsSdk.autoscalingMod.MixedInstancesPolicy] = js.undefined
  
  /**
    * Indicates whether newly launched instances are protected from termination by Amazon EC2 Auto Scaling when scaling in. For more information about preventing instances from terminating on scale in, see Instance scale-in protection in the Amazon EC2 Auto Scaling User Guide.
    */
  var NewInstancesProtectedFromScaleIn: js.UndefOr[InstanceProtected] = js.undefined
  
  /**
    * The name of an existing placement group into which to launch your instances, if any. A placement group is a logical grouping of instances within a single Availability Zone. You cannot specify multiple Availability Zones and a placement group. For more information, see Placement Groups in the Amazon EC2 User Guide for Linux Instances.
    */
  var PlacementGroup: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. For more information, see Service-linked roles in the Amazon EC2 Auto Scaling User Guide.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * A policy or a list of policies that are used to select the instances to terminate. The policies are executed in the order that you list them. For more information, see Controlling which Auto Scaling instances terminate during scale in in the Amazon EC2 Auto Scaling User Guide.
    */
  var TerminationPolicies: js.UndefOr[typings.awsSdk.autoscalingMod.TerminationPolicies] = js.undefined
  
  /**
    * A comma-separated list of subnet IDs for a virtual private cloud (VPC). If you specify VPCZoneIdentifier with AvailabilityZones, the subnets that you specify for this parameter must reside in those Availability Zones.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
}
object UpdateAutoScalingGroupType {
  
  inline def apply(AutoScalingGroupName: ResourceName): UpdateAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAutoScalingGroupType]
  }
  
  extension [Self <: UpdateAutoScalingGroupType](x: Self) {
    
    inline def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesUndefined: Self = StObject.set(x, "AvailabilityZones", js.undefined)
    
    inline def setAvailabilityZonesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    inline def setCapacityRebalance(value: CapacityRebalanceEnabled): Self = StObject.set(x, "CapacityRebalance", value.asInstanceOf[js.Any])
    
    inline def setCapacityRebalanceUndefined: Self = StObject.set(x, "CapacityRebalance", js.undefined)
    
    inline def setDefaultCooldown(value: Cooldown): Self = StObject.set(x, "DefaultCooldown", value.asInstanceOf[js.Any])
    
    inline def setDefaultCooldownUndefined: Self = StObject.set(x, "DefaultCooldown", js.undefined)
    
    inline def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = StObject.set(x, "DesiredCapacity", value.asInstanceOf[js.Any])
    
    inline def setDesiredCapacityUndefined: Self = StObject.set(x, "DesiredCapacity", js.undefined)
    
    inline def setHealthCheckGracePeriod(value: HealthCheckGracePeriod): Self = StObject.set(x, "HealthCheckGracePeriod", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckGracePeriodUndefined: Self = StObject.set(x, "HealthCheckGracePeriod", js.undefined)
    
    inline def setHealthCheckType(value: XmlStringMaxLen32): Self = StObject.set(x, "HealthCheckType", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckTypeUndefined: Self = StObject.set(x, "HealthCheckType", js.undefined)
    
    inline def setLaunchConfigurationName(value: ResourceName): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationNameUndefined: Self = StObject.set(x, "LaunchConfigurationName", js.undefined)
    
    inline def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    inline def setMaxInstanceLifetime(value: MaxInstanceLifetime): Self = StObject.set(x, "MaxInstanceLifetime", value.asInstanceOf[js.Any])
    
    inline def setMaxInstanceLifetimeUndefined: Self = StObject.set(x, "MaxInstanceLifetime", js.undefined)
    
    inline def setMaxSize(value: AutoScalingGroupMaxSize): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "MaxSize", js.undefined)
    
    inline def setMinSize(value: AutoScalingGroupMinSize): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    inline def setMinSizeUndefined: Self = StObject.set(x, "MinSize", js.undefined)
    
    inline def setMixedInstancesPolicy(value: MixedInstancesPolicy): Self = StObject.set(x, "MixedInstancesPolicy", value.asInstanceOf[js.Any])
    
    inline def setMixedInstancesPolicyUndefined: Self = StObject.set(x, "MixedInstancesPolicy", js.undefined)
    
    inline def setNewInstancesProtectedFromScaleIn(value: InstanceProtected): Self = StObject.set(x, "NewInstancesProtectedFromScaleIn", value.asInstanceOf[js.Any])
    
    inline def setNewInstancesProtectedFromScaleInUndefined: Self = StObject.set(x, "NewInstancesProtectedFromScaleIn", js.undefined)
    
    inline def setPlacementGroup(value: XmlStringMaxLen255): Self = StObject.set(x, "PlacementGroup", value.asInstanceOf[js.Any])
    
    inline def setPlacementGroupUndefined: Self = StObject.set(x, "PlacementGroup", js.undefined)
    
    inline def setServiceLinkedRoleARN(value: ResourceName): Self = StObject.set(x, "ServiceLinkedRoleARN", value.asInstanceOf[js.Any])
    
    inline def setServiceLinkedRoleARNUndefined: Self = StObject.set(x, "ServiceLinkedRoleARN", js.undefined)
    
    inline def setTerminationPolicies(value: TerminationPolicies): Self = StObject.set(x, "TerminationPolicies", value.asInstanceOf[js.Any])
    
    inline def setTerminationPoliciesUndefined: Self = StObject.set(x, "TerminationPolicies", js.undefined)
    
    inline def setTerminationPoliciesVarargs(value: XmlStringMaxLen1600*): Self = StObject.set(x, "TerminationPolicies", js.Array(value :_*))
    
    inline def setVPCZoneIdentifier(value: XmlStringMaxLen2047): Self = StObject.set(x, "VPCZoneIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVPCZoneIdentifierUndefined: Self = StObject.set(x, "VPCZoneIdentifier", js.undefined)
  }
}
