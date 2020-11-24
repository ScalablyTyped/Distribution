package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAutoScalingGroupType extends js.Object {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * One or more Availability Zones for the group.
    */
  var AvailabilityZones: js.UndefOr[typings.awsSdk.autoscalingMod.AvailabilityZones] = js.native
  
  /**
    * Enables or disables Capacity Rebalancing. For more information, see Amazon EC2 Auto Scaling Capacity Rebalancing in the Amazon EC2 Auto Scaling User Guide.
    */
  var CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled] = js.native
  
  /**
    * The amount of time, in seconds, after a scaling activity completes before another scaling activity can start. The default value is 300. This setting applies when using simple scaling policies, but not when using other scaling policies or scheduled scaling. For more information, see Scaling cooldowns for Amazon EC2 Auto Scaling in the Amazon EC2 Auto Scaling User Guide.
    */
  var DefaultCooldown: js.UndefOr[Cooldown] = js.native
  
  /**
    * The desired capacity is the initial capacity of the Auto Scaling group after this operation completes and the capacity it attempts to maintain. This number must be greater than or equal to the minimum size of the group and less than or equal to the maximum size of the group.
    */
  var DesiredCapacity: js.UndefOr[AutoScalingGroupDesiredCapacity] = js.native
  
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service. The default value is 0. For more information, see Health check grace period in the Amazon EC2 Auto Scaling User Guide. Conditional: Required if you are adding an ELB health check.
    */
  var HealthCheckGracePeriod: js.UndefOr[typings.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.native
  
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
    */
  var HealthCheckType: js.UndefOr[XmlStringMaxLen32] = js.native
  
  /**
    * The name of the launch configuration. If you specify LaunchConfigurationName in your update request, you can't specify LaunchTemplate or MixedInstancesPolicy.
    */
  var LaunchConfigurationName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The launch template and version to use to specify the updates. If you specify LaunchTemplate in your update request, you can't specify LaunchConfigurationName or MixedInstancesPolicy.
    */
  var LaunchTemplate: js.UndefOr[LaunchTemplateSpecification] = js.native
  
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. The default is null. If specified, the value must be either 0 or a number equal to or greater than 86,400 seconds (1 day). To clear a previously set value, specify a new value of 0. For more information, see Replacing Auto Scaling instances based on maximum instance lifetime in the Amazon EC2 Auto Scaling User Guide.
    */
  var MaxInstanceLifetime: js.UndefOr[typings.awsSdk.autoscalingMod.MaxInstanceLifetime] = js.native
  
  /**
    * The maximum size of the Auto Scaling group.  With a mixed instances policy that uses instance weighting, Amazon EC2 Auto Scaling may need to go above MaxSize to meet your capacity requirements. In this event, Amazon EC2 Auto Scaling will never go above MaxSize by more than your largest instance weight (weights that define how many units each instance contributes to the desired capacity of the group). 
    */
  var MaxSize: js.UndefOr[AutoScalingGroupMaxSize] = js.native
  
  /**
    * The minimum size of the Auto Scaling group.
    */
  var MinSize: js.UndefOr[AutoScalingGroupMinSize] = js.native
  
  /**
    * An embedded object that specifies a mixed instances policy. When you make changes to an existing policy, all optional parameters are left unchanged if not specified. For more information, see Auto Scaling groups with multiple instance types and purchase options in the Amazon EC2 Auto Scaling User Guide.
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
    * The Amazon Resource Name (ARN) of the service-linked role that the Auto Scaling group uses to call other AWS services on your behalf. For more information, see Service-linked roles in the Amazon EC2 Auto Scaling User Guide.
    */
  var ServiceLinkedRoleARN: js.UndefOr[ResourceName] = js.native
  
  /**
    * A policy or a list of policies that are used to select the instances to terminate. The policies are executed in the order that you list them. For more information, see Controlling which Auto Scaling instances terminate during scale in in the Amazon EC2 Auto Scaling User Guide.
    */
  var TerminationPolicies: js.UndefOr[typings.awsSdk.autoscalingMod.TerminationPolicies] = js.native
  
  /**
    * A comma-separated list of subnet IDs for a virtual private cloud (VPC). If you specify VPCZoneIdentifier with AvailabilityZones, the subnets that you specify for this parameter must reside in those Availability Zones.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.native
}
object UpdateAutoScalingGroupType {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): UpdateAutoScalingGroupType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAutoScalingGroupType]
  }
  
  @scala.inline
  implicit class UpdateAutoScalingGroupTypeOps[Self <: UpdateAutoScalingGroupType] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    
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
    def setLaunchConfigurationName(value: ResourceName): Self = this.set("LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchConfigurationName: Self = this.set("LaunchConfigurationName", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = this.set("LaunchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("LaunchTemplate", js.undefined)
    
    @scala.inline
    def setMaxInstanceLifetime(value: MaxInstanceLifetime): Self = this.set("MaxInstanceLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxInstanceLifetime: Self = this.set("MaxInstanceLifetime", js.undefined)
    
    @scala.inline
    def setMaxSize(value: AutoScalingGroupMaxSize): Self = this.set("MaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSize: Self = this.set("MaxSize", js.undefined)
    
    @scala.inline
    def setMinSize(value: AutoScalingGroupMinSize): Self = this.set("MinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSize: Self = this.set("MinSize", js.undefined)
    
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
