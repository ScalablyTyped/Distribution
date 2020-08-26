package typings.awsSdk.autoscalingMod

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
  var AvailabilityZones: typings.awsSdk.autoscalingMod.AvailabilityZones = js.native
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
  implicit class AutoScalingGroupOps[Self <: AutoScalingGroup] (val x: Self) extends AnyVal {
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
    def setAvailabilityZonesVarargs(value: XmlStringMaxLen255*): Self = this.set("AvailabilityZones", js.Array(value :_*))
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = this.set("AvailabilityZones", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedTime(value: TimestampType): Self = this.set("CreatedTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultCooldown(value: Cooldown): Self = this.set("DefaultCooldown", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredCapacity(value: AutoScalingGroupDesiredCapacity): Self = this.set("DesiredCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthCheckType(value: XmlStringMaxLen32): Self = this.set("HealthCheckType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxSize(value: AutoScalingGroupMaxSize): Self = this.set("MaxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinSize(value: AutoScalingGroupMinSize): Self = this.set("MinSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoScalingGroupARN(value: ResourceName): Self = this.set("AutoScalingGroupARN", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoScalingGroupARN: Self = this.set("AutoScalingGroupARN", js.undefined)
    @scala.inline
    def setEnabledMetricsVarargs(value: EnabledMetric*): Self = this.set("EnabledMetrics", js.Array(value :_*))
    @scala.inline
    def setEnabledMetrics(value: EnabledMetrics): Self = this.set("EnabledMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledMetrics: Self = this.set("EnabledMetrics", js.undefined)
    @scala.inline
    def setHealthCheckGracePeriod(value: HealthCheckGracePeriod): Self = this.set("HealthCheckGracePeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthCheckGracePeriod: Self = this.set("HealthCheckGracePeriod", js.undefined)
    @scala.inline
    def setInstancesVarargs(value: Instance*): Self = this.set("Instances", js.Array(value :_*))
    @scala.inline
    def setInstances(value: Instances): Self = this.set("Instances", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstances: Self = this.set("Instances", js.undefined)
    @scala.inline
    def setLaunchConfigurationName(value: XmlStringMaxLen255): Self = this.set("LaunchConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchConfigurationName: Self = this.set("LaunchConfigurationName", js.undefined)
    @scala.inline
    def setLaunchTemplate(value: LaunchTemplateSpecification): Self = this.set("LaunchTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplate: Self = this.set("LaunchTemplate", js.undefined)
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
    def setStatus(value: XmlStringMaxLen255): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setSuspendedProcessesVarargs(value: SuspendedProcess*): Self = this.set("SuspendedProcesses", js.Array(value :_*))
    @scala.inline
    def setSuspendedProcesses(value: SuspendedProcesses): Self = this.set("SuspendedProcesses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuspendedProcesses: Self = this.set("SuspendedProcesses", js.undefined)
    @scala.inline
    def setTagsVarargs(value: TagDescription*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagDescriptionList): Self = this.set("Tags", value.asInstanceOf[js.Any])
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

