package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAutoscalingMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Activities = js.Array[Activity]
  type ActivityIds = js.Array[XmlString]
  type AdjustmentTypes = js.Array[AdjustmentType]
  type Alarms = js.Array[Alarm]
  type AsciiStringMaxLen255 = String
  type AssociatePublicIpAddress = Boolean
  type AutoScalingGroupDesiredCapacity = Double
  type AutoScalingGroupMaxSize = Double
  type AutoScalingGroupMinSize = Double
  type AutoScalingGroupNames = js.Array[ResourceName]
  type AutoScalingGroups = js.Array[AutoScalingGroup]
  type AutoScalingInstances = js.Array[AutoScalingInstanceDetails]
  type AutoScalingNotificationTypes = js.Array[XmlStringMaxLen255]
  type AvailabilityZones = js.Array[XmlStringMaxLen255]
  type BlockDeviceEbsDeleteOnTermination = Boolean
  type BlockDeviceEbsEncrypted = Boolean
  type BlockDeviceEbsIops = Double
  type BlockDeviceEbsVolumeSize = Double
  type BlockDeviceEbsVolumeType = String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type ClassicLinkVPCSecurityGroups = js.Array[XmlStringMaxLen255]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = Double
  type DisableScaleIn = Boolean
  type EbsOptimized = Boolean
  type EnabledMetrics = js.Array[EnabledMetric]
  type EstimatedInstanceWarmup = Double
  type FailedScheduledUpdateGroupActionRequests = js.Array[FailedScheduledUpdateGroupActionRequest]
  type Filters = js.Array[Filter]
  type ForceDelete = Boolean
  type GlobalTimeout = Double
  type HealthCheckGracePeriod = Double
  type HeartbeatTimeout = Double
  type HonorCooldown = Boolean
  type InstanceIds = js.Array[XmlStringMaxLen19]
  type InstanceProtected = Boolean
  type Instances = js.Array[Instance]
  type LaunchConfigurationNames = js.Array[ResourceName]
  type LaunchConfigurations = js.Array[LaunchConfiguration]
  type LaunchTemplateName = String
  type LifecycleActionResult = String
  type LifecycleActionToken = String
  type LifecycleHookNames = js.Array[AsciiStringMaxLen255]
  type LifecycleHookSpecifications = js.Array[LifecycleHookSpecification]
  type LifecycleHooks = js.Array[LifecycleHook]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.PendingColonWait
    - typings.awsDashSdk.awsDashSdkStrings.PendingColonProceed
    - typings.awsDashSdk.awsDashSdkStrings.Quarantined
    - typings.awsDashSdk.awsDashSdkStrings.InService
    - typings.awsDashSdk.awsDashSdkStrings.Terminating_
    - typings.awsDashSdk.awsDashSdkStrings.TerminatingColonWait
    - typings.awsDashSdk.awsDashSdkStrings.TerminatingColonProceed
    - typings.awsDashSdk.awsDashSdkStrings.Terminated_
    - typings.awsDashSdk.awsDashSdkStrings.Detaching_
    - typings.awsDashSdk.awsDashSdkStrings.Detached_
    - typings.awsDashSdk.awsDashSdkStrings.EnteringStandby
    - typings.awsDashSdk.awsDashSdkStrings.Standby_
    - java.lang.String
  */
  type LifecycleState = _LifecycleState | String
  type LifecycleTransition = String
  type LoadBalancerNames = js.Array[XmlStringMaxLen255]
  type LoadBalancerStates = js.Array[LoadBalancerState]
  type LoadBalancerTargetGroupStates = js.Array[LoadBalancerTargetGroupState]
  type MaxInstanceLifetime = Double
  type MaxNumberOfAutoScalingGroups = Double
  type MaxNumberOfLaunchConfigurations = Double
  type MaxRecords = Double
  type MetricCollectionTypes = js.Array[MetricCollectionType]
  type MetricDimensionName = String
  type MetricDimensionValue = String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricGranularityTypes = js.Array[MetricGranularityType]
  type MetricName = String
  type MetricNamespace = String
  type MetricScale = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Average_
    - typings.awsDashSdk.awsDashSdkStrings.Minimum_
    - typings.awsDashSdk.awsDashSdkStrings.Maximum_
    - typings.awsDashSdk.awsDashSdkStrings.SampleCount
    - typings.awsDashSdk.awsDashSdkStrings.Sum_
    - java.lang.String
  */
  type MetricStatistic = _MetricStatistic | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ASGAverageCPUUtilization
    - typings.awsDashSdk.awsDashSdkStrings.ASGAverageNetworkIn
    - typings.awsDashSdk.awsDashSdkStrings.ASGAverageNetworkOut
    - typings.awsDashSdk.awsDashSdkStrings.ALBRequestCountPerTarget
    - java.lang.String
  */
  type MetricType = _MetricType | String
  type MetricUnit = String
  type Metrics = js.Array[XmlStringMaxLen255]
  type MinAdjustmentMagnitude = Double
  type MinAdjustmentStep = Double
  type MixedInstanceSpotPrice = String
  type MonitoringEnabled = Boolean
  type NoDevice = Boolean
  type NotificationConfigurations = js.Array[NotificationConfiguration]
  type NotificationTargetResourceName = String
  type NumberOfAutoScalingGroups = Double
  type NumberOfLaunchConfigurations = Double
  type OnDemandBaseCapacity = Double
  type OnDemandPercentageAboveBaseCapacity = Double
  type Overrides = js.Array[LaunchTemplateOverrides]
  type PolicyIncrement = Double
  type PolicyNames = js.Array[ResourceName]
  type PolicyTypes = js.Array[XmlStringMaxLen64]
  type ProcessNames = js.Array[XmlStringMaxLen255]
  type Processes = js.Array[ProcessType]
  type Progress = Double
  type PropagateAtLaunch = Boolean
  type ProtectedFromScaleIn = Boolean
  type ResourceName = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PendingSpotBidPlacement
    - typings.awsDashSdk.awsDashSdkStrings.WaitingForSpotInstanceRequestId
    - typings.awsDashSdk.awsDashSdkStrings.WaitingForSpotInstanceId
    - typings.awsDashSdk.awsDashSdkStrings.WaitingForInstanceId
    - typings.awsDashSdk.awsDashSdkStrings.PreInService
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.WaitingForELBConnectionDraining
    - typings.awsDashSdk.awsDashSdkStrings.MidLifecycleAction
    - typings.awsDashSdk.awsDashSdkStrings.WaitingForInstanceWarmup
    - typings.awsDashSdk.awsDashSdkStrings.Successful_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled_
    - java.lang.String
  */
  type ScalingActivityStatusCode = _ScalingActivityStatusCode | String
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScheduledActionNames = js.Array[ResourceName]
  type ScheduledUpdateGroupActionRequests = js.Array[ScheduledUpdateGroupActionRequest]
  type ScheduledUpdateGroupActions = js.Array[ScheduledUpdateGroupAction]
  type SecurityGroups = js.Array[XmlString]
  type ShouldDecrementDesiredCapacity = Boolean
  type ShouldRespectGracePeriod = Boolean
  type SpotInstancePools = Double
  type SpotPrice = String
  type StepAdjustments = js.Array[StepAdjustment]
  type SuspendedProcesses = js.Array[SuspendedProcess]
  type TagDescriptionList = js.Array[TagDescription]
  type TagKey = String
  type TagValue = String
  type Tags = js.Array[Tag]
  type TargetGroupARNs = js.Array[XmlStringMaxLen511]
  type TerminationPolicies = js.Array[XmlStringMaxLen1600]
  type TimestampType = Date
  type Values = js.Array[XmlString]
  type XmlString = String
  type XmlStringMaxLen1023 = String
  type XmlStringMaxLen1600 = String
  type XmlStringMaxLen19 = String
  type XmlStringMaxLen2047 = String
  type XmlStringMaxLen255 = String
  type XmlStringMaxLen32 = String
  type XmlStringMaxLen511 = String
  type XmlStringMaxLen64 = String
  type XmlStringUserData = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2011-01-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
