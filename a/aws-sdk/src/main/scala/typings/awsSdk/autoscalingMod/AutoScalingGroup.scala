package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoScalingGroup extends StObject {
  
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
  var AvailabilityZones: typings.awsSdk.autoscalingMod.AvailabilityZones
  
  /**
    * Indicates whether Capacity Rebalancing is enabled.
    */
  var CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled] = js.undefined
  
  /**
    * The date and time the group was created.
    */
  var CreatedTime: TimestampType
  
  /**
    * The duration of the default cooldown period, in seconds.
    */
  var DefaultCooldown: Cooldown
  
  /**
    * The desired size of the group.
    */
  var DesiredCapacity: AutoScalingGroupDesiredCapacity
  
  /**
    * The metrics enabled for the group.
    */
  var EnabledMetrics: js.UndefOr[typings.awsSdk.autoscalingMod.EnabledMetrics] = js.undefined
  
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
    */
  var HealthCheckGracePeriod: js.UndefOr[typings.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.undefined
  
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
    */
  var HealthCheckType: XmlStringMaxLen32
  
  /**
    * The EC2 instances associated with the group.
    */
  var Instances: js.UndefOr[typings.awsSdk.autoscalingMod.Instances] = js.undefined
  
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
  var LoadBalancerNames: js.UndefOr[typings.awsSdk.autoscalingMod.LoadBalancerNames] = js.undefined
  
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. Valid Range: Minimum value of 0.
    */
  var MaxInstanceLifetime: js.UndefOr[typings.awsSdk.autoscalingMod.MaxInstanceLifetime] = js.undefined
  
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
  var MixedInstancesPolicy: js.UndefOr[typings.awsSdk.autoscalingMod.MixedInstancesPolicy] = js.undefined
  
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
    * The current state of the group when the DeleteAutoScalingGroup operation is in progress.
    */
  var Status: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * The suspended processes associated with the group.
    */
  var SuspendedProcesses: js.UndefOr[typings.awsSdk.autoscalingMod.SuspendedProcesses] = js.undefined
  
  /**
    * The tags for the group.
    */
  var Tags: js.UndefOr[TagDescriptionList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the target groups for your load balancer.
    */
  var TargetGroupARNs: js.UndefOr[typings.awsSdk.autoscalingMod.TargetGroupARNs] = js.undefined
  
  /**
    * The termination policies for the group.
    */
  var TerminationPolicies: js.UndefOr[typings.awsSdk.autoscalingMod.TerminationPolicies] = js.undefined
  
  /**
    * One or more subnet IDs, if applicable, separated by commas.
    */
  var VPCZoneIdentifier: js.UndefOr[XmlStringMaxLen2047] = js.undefined
}
object AutoScalingGroup {
  
  inline def apply(
    AutoScalingGroupName: XmlStringMaxLen255,
    AvailabilityZones: AvailabilityZones,
    CreatedTime: TimestampType,
    DefaultCooldown: Cooldown,
    DesiredCapacity: AutoScalingGroupDesiredCapacity,
    HealthCheckType: XmlStringMaxLen32,
    MaxSize: AutoScalingGroupMaxSize,
    MinSize: AutoScalingGroupMinSize
  ): AutoScalingGroup = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], DefaultCooldown = DefaultCooldown.asInstanceOf[js.Any], DesiredCapacity = DesiredCapacity.asInstanceOf[js.Any], HealthCheckType = HealthCheckType.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroup]
  }
  
  extension [Self <: AutoScalingGroup](x: Self) {
    
    inline def setAutoScalingGroupARN(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupARN", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupARNUndefined: Self = StObject.set(x, "AutoScalingGroupARN", js.undefined)
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZonesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    inline def setCapacityRebalance(value: CapacityRebalanceEnabled): Self = StObject.set(x, "CapacityRebalance", value.asInstanceOf[js.Any])
    
    inline def setCapacityRebalanceUndefined: Self = StObject.set(x, "CapacityRebalance", js.undefined)
    
    inline def setCreatedTime(value: TimestampType): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setDefaultCooldown(value: Cooldown): Self = StObject.set(x, "DefaultCooldown", value.asInstanceOf[js.Any])
    
    inline def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = StObject.set(x, "DesiredCapacity", value.asInstanceOf[js.Any])
    
    inline def setEnabledMetrics(value: EnabledMetrics): Self = StObject.set(x, "EnabledMetrics", value.asInstanceOf[js.Any])
    
    inline def setEnabledMetricsUndefined: Self = StObject.set(x, "EnabledMetrics", js.undefined)
    
    inline def setEnabledMetricsVarargs(value: EnabledMetric*): Self = StObject.set(x, "EnabledMetrics", js.Array(value :_*))
    
    inline def setHealthCheckGracePeriod(value: HealthCheckGracePeriod): Self = StObject.set(x, "HealthCheckGracePeriod", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckGracePeriodUndefined: Self = StObject.set(x, "HealthCheckGracePeriod", js.undefined)
    
    inline def setHealthCheckType(value: XmlStringMaxLen32): Self = StObject.set(x, "HealthCheckType", value.asInstanceOf[js.Any])
    
    inline def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    inline def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationNameUndefined: Self = StObject.set(x, "LaunchConfigurationName", js.undefined)
    
    inline def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    inline def setLoadBalancerNames(value: LoadBalancerNames): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancerNamesUndefined: Self = StObject.set(x, "LoadBalancerNames", js.undefined)
    
    inline def setLoadBalancerNamesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value :_*))
    
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
    
    inline def setStatus(value: XmlStringMaxLen255): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSuspendedProcesses(value: SuspendedProcesses): Self = StObject.set(x, "SuspendedProcesses", value.asInstanceOf[js.Any])
    
    inline def setSuspendedProcessesUndefined: Self = StObject.set(x, "SuspendedProcesses", js.undefined)
    
    inline def setSuspendedProcessesVarargs(value: SuspendedProcess*): Self = StObject.set(x, "SuspendedProcesses", js.Array(value :_*))
    
    inline def setTags(value: TagDescriptionList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: TagDescription*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setTargetGroupARNs(value: TargetGroupARNs): Self = StObject.set(x, "TargetGroupARNs", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupARNsUndefined: Self = StObject.set(x, "TargetGroupARNs", js.undefined)
    
    inline def setTargetGroupARNsVarargs(value: XmlStringMaxLen511*): Self = StObject.set(x, "TargetGroupARNs", js.Array(value :_*))
    
    inline def setTerminationPolicies(value: TerminationPolicies): Self = StObject.set(x, "TerminationPolicies", value.asInstanceOf[js.Any])
    
    inline def setTerminationPoliciesUndefined: Self = StObject.set(x, "TerminationPolicies", js.undefined)
    
    inline def setTerminationPoliciesVarargs(value: XmlStringMaxLen1600*): Self = StObject.set(x, "TerminationPolicies", js.Array(value :_*))
    
    inline def setVPCZoneIdentifier(value: XmlStringMaxLen2047): Self = StObject.set(x, "VPCZoneIdentifier", value.asInstanceOf[js.Any])
    
    inline def setVPCZoneIdentifierUndefined: Self = StObject.set(x, "VPCZoneIdentifier", js.undefined)
  }
}
