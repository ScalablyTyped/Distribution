package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoScalingGroup extends StObject {
  
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
  var AvailabilityZones: typings.awsSdk.autoscalingMod.AvailabilityZones = js.native
  
  /**
    * Indicates whether Capacity Rebalancing is enabled.
    */
  var CapacityRebalance: js.UndefOr[CapacityRebalanceEnabled] = js.native
  
  /**
    * The date and time the group was created.
    */
  var CreatedTime: TimestampType = js.native
  
  /**
    * The duration of the default cooldown period, in seconds.
    */
  var DefaultCooldown: Cooldown = js.native
  
  /**
    * The desired size of the group.
    */
  var DesiredCapacity: AutoScalingGroupDesiredCapacity = js.native
  
  /**
    * The metrics enabled for the group.
    */
  var EnabledMetrics: js.UndefOr[typings.awsSdk.autoscalingMod.EnabledMetrics] = js.native
  
  /**
    * The amount of time, in seconds, that Amazon EC2 Auto Scaling waits before checking the health status of an EC2 instance that has come into service.
    */
  var HealthCheckGracePeriod: js.UndefOr[typings.awsSdk.autoscalingMod.HealthCheckGracePeriod] = js.native
  
  /**
    * The service to use for the health checks. The valid values are EC2 and ELB. If you configure an Auto Scaling group to use ELB health checks, it considers the instance unhealthy if it fails either the EC2 status checks or the load balancer health checks.
    */
  var HealthCheckType: XmlStringMaxLen32 = js.native
  
  /**
    * The EC2 instances associated with the group.
    */
  var Instances: js.UndefOr[typings.awsSdk.autoscalingMod.Instances] = js.native
  
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
  var LoadBalancerNames: js.UndefOr[typings.awsSdk.autoscalingMod.LoadBalancerNames] = js.native
  
  /**
    * The maximum amount of time, in seconds, that an instance can be in service. Valid Range: Minimum value of 0.
    */
  var MaxInstanceLifetime: js.UndefOr[typings.awsSdk.autoscalingMod.MaxInstanceLifetime] = js.native
  
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
  var MixedInstancesPolicy: js.UndefOr[typings.awsSdk.autoscalingMod.MixedInstancesPolicy] = js.native
  
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
    * The current state of the group when the DeleteAutoScalingGroup operation is in progress.
    */
  var Status: js.UndefOr[XmlStringMaxLen255] = js.native
  
  /**
    * The suspended processes associated with the group.
    */
  var SuspendedProcesses: js.UndefOr[typings.awsSdk.autoscalingMod.SuspendedProcesses] = js.native
  
  /**
    * The tags for the group.
    */
  var Tags: js.UndefOr[TagDescriptionList] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the target groups for your load balancer.
    */
  var TargetGroupARNs: js.UndefOr[typings.awsSdk.autoscalingMod.TargetGroupARNs] = js.native
  
  /**
    * The termination policies for the group.
    */
  var TerminationPolicies: js.UndefOr[typings.awsSdk.autoscalingMod.TerminationPolicies] = js.native
  
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
    MinSize: AutoScalingGroupMinSize
  ): AutoScalingGroup = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], CreatedTime = CreatedTime.asInstanceOf[js.Any], DefaultCooldown = DefaultCooldown.asInstanceOf[js.Any], DesiredCapacity = DesiredCapacity.asInstanceOf[js.Any], HealthCheckType = HealthCheckType.asInstanceOf[js.Any], MaxSize = MaxSize.asInstanceOf[js.Any], MinSize = MinSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoScalingGroup]
  }
  
  @scala.inline
  implicit class AutoScalingGroupMutableBuilder[Self <: AutoScalingGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupARN(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoScalingGroupARNUndefined: Self = StObject.set(x, "AutoScalingGroupARN", js.undefined)
    
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setCapacityRebalance(value: CapacityRebalanceEnabled): Self = StObject.set(x, "CapacityRebalance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapacityRebalanceUndefined: Self = StObject.set(x, "CapacityRebalance", js.undefined)
    
    @scala.inline
    def setCreatedTime(value: TimestampType): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultCooldown(value: Cooldown): Self = StObject.set(x, "DefaultCooldown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = StObject.set(x, "DesiredCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledMetrics(value: EnabledMetrics): Self = StObject.set(x, "EnabledMetrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledMetricsUndefined: Self = StObject.set(x, "EnabledMetrics", js.undefined)
    
    @scala.inline
    def setEnabledMetricsVarargs(value: EnabledMetric*): Self = StObject.set(x, "EnabledMetrics", js.Array(value :_*))
    
    @scala.inline
    def setHealthCheckGracePeriod(value: HealthCheckGracePeriod): Self = StObject.set(x, "HealthCheckGracePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckGracePeriodUndefined: Self = StObject.set(x, "HealthCheckGracePeriod", js.undefined)
    
    @scala.inline
    def setHealthCheckType(value: XmlStringMaxLen32): Self = StObject.set(x, "HealthCheckType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstances(value: Instances): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value :_*))
    
    @scala.inline
    def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = StObject.set(x, "LaunchConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchConfigurationNameUndefined: Self = StObject.set(x, "LaunchConfigurationName", js.undefined)
    
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = StObject.set(x, "LaunchTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplateUndefined: Self = StObject.set(x, "LaunchTemplate", js.undefined)
    
    @scala.inline
    def setLoadBalancerNames(value: LoadBalancerNames): Self = StObject.set(x, "LoadBalancerNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerNamesUndefined: Self = StObject.set(x, "LoadBalancerNames", js.undefined)
    
    @scala.inline
    def setLoadBalancerNamesVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "LoadBalancerNames", js.Array(value :_*))
    
    @scala.inline
    def setMaxInstanceLifetime(value: MaxInstanceLifetime): Self = StObject.set(x, "MaxInstanceLifetime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxInstanceLifetimeUndefined: Self = StObject.set(x, "MaxInstanceLifetime", js.undefined)
    
    @scala.inline
    def setMaxSize(value: AutoScalingGroupMaxSize): Self = StObject.set(x, "MaxSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSize(value: AutoScalingGroupMinSize): Self = StObject.set(x, "MinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedInstancesPolicy(value: MixedInstancesPolicy): Self = StObject.set(x, "MixedInstancesPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMixedInstancesPolicyUndefined: Self = StObject.set(x, "MixedInstancesPolicy", js.undefined)
    
    @scala.inline
    def setNewInstancesProtectedFromScaleIn(value: InstanceProtected): Self = StObject.set(x, "NewInstancesProtectedFromScaleIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewInstancesProtectedFromScaleInUndefined: Self = StObject.set(x, "NewInstancesProtectedFromScaleIn", js.undefined)
    
    @scala.inline
    def setPlacementGroup(value: XmlStringMaxLen255): Self = StObject.set(x, "PlacementGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacementGroupUndefined: Self = StObject.set(x, "PlacementGroup", js.undefined)
    
    @scala.inline
    def setServiceLinkedRoleARN(value: ResourceName): Self = StObject.set(x, "ServiceLinkedRoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceLinkedRoleARNUndefined: Self = StObject.set(x, "ServiceLinkedRoleARN", js.undefined)
    
    @scala.inline
    def setStatus(value: XmlStringMaxLen255): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setSuspendedProcesses(value: SuspendedProcesses): Self = StObject.set(x, "SuspendedProcesses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuspendedProcessesUndefined: Self = StObject.set(x, "SuspendedProcesses", js.undefined)
    
    @scala.inline
    def setSuspendedProcessesVarargs(value: SuspendedProcess*): Self = StObject.set(x, "SuspendedProcesses", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagDescriptionList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: TagDescription*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTargetGroupARNs(value: TargetGroupARNs): Self = StObject.set(x, "TargetGroupARNs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetGroupARNsUndefined: Self = StObject.set(x, "TargetGroupARNs", js.undefined)
    
    @scala.inline
    def setTargetGroupARNsVarargs(value: XmlStringMaxLen511*): Self = StObject.set(x, "TargetGroupARNs", js.Array(value :_*))
    
    @scala.inline
    def setTerminationPolicies(value: TerminationPolicies): Self = StObject.set(x, "TerminationPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminationPoliciesUndefined: Self = StObject.set(x, "TerminationPolicies", js.undefined)
    
    @scala.inline
    def setTerminationPoliciesVarargs(value: XmlStringMaxLen1600*): Self = StObject.set(x, "TerminationPolicies", js.Array(value :_*))
    
    @scala.inline
    def setVPCZoneIdentifier(value: XmlStringMaxLen2047): Self = StObject.set(x, "VPCZoneIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCZoneIdentifierUndefined: Self = StObject.set(x, "VPCZoneIdentifier", js.undefined)
  }
}
