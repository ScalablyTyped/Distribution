package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsAutoscalingMod {
  type Activities = js.Array[Activity]
  type ActivityIds = js.Array[XmlString]
  type AdjustmentTypes = js.Array[AdjustmentType]
  type Alarms = js.Array[Alarm]
  type AsciiStringMaxLen255 = java.lang.String
  type AssociatePublicIpAddress = scala.Boolean
  type AutoScalingGroupDesiredCapacity = scala.Double
  type AutoScalingGroupMaxSize = scala.Double
  type AutoScalingGroupMinSize = scala.Double
  type AutoScalingGroupNames = js.Array[ResourceName]
  type AutoScalingGroups = js.Array[AutoScalingGroup]
  type AutoScalingInstances = js.Array[AutoScalingInstanceDetails]
  type AutoScalingNotificationTypes = js.Array[XmlStringMaxLen255]
  type AvailabilityZones = js.Array[XmlStringMaxLen255]
  type BlockDeviceEbsDeleteOnTermination = scala.Boolean
  type BlockDeviceEbsEncrypted = scala.Boolean
  type BlockDeviceEbsIops = scala.Double
  type BlockDeviceEbsVolumeSize = scala.Double
  type BlockDeviceEbsVolumeType = java.lang.String
  type BlockDeviceMappings = js.Array[BlockDeviceMapping]
  type ClassicLinkVPCSecurityGroups = js.Array[XmlStringMaxLen255]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Cooldown = scala.Double
  type DisableScaleIn = scala.Boolean
  type EbsOptimized = scala.Boolean
  type EnabledMetrics = js.Array[EnabledMetric]
  type EstimatedInstanceWarmup = scala.Double
  type FailedScheduledUpdateGroupActionRequests = js.Array[FailedScheduledUpdateGroupActionRequest]
  type Filters = js.Array[Filter]
  type ForceDelete = scala.Boolean
  type GlobalTimeout = scala.Double
  type HealthCheckGracePeriod = scala.Double
  type HeartbeatTimeout = scala.Double
  type HonorCooldown = scala.Boolean
  type InstanceIds = js.Array[XmlStringMaxLen19]
  type InstanceProtected = scala.Boolean
  type Instances = js.Array[Instance]
  type LaunchConfigurationNames = js.Array[ResourceName]
  type LaunchConfigurations = js.Array[LaunchConfiguration]
  type LaunchTemplateName = java.lang.String
  type LifecycleActionResult = java.lang.String
  type LifecycleActionToken = java.lang.String
  type LifecycleHookNames = js.Array[AsciiStringMaxLen255]
  type LifecycleHookSpecifications = js.Array[LifecycleHookSpecification]
  type LifecycleHooks = js.Array[LifecycleHook]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.`Pending:Wait`
    - awsDashSdkLib.awsDashSdkLibStrings.`Pending:Proceed`
    - awsDashSdkLib.awsDashSdkLibStrings.Quarantined
    - awsDashSdkLib.awsDashSdkLibStrings.InService
    - awsDashSdkLib.awsDashSdkLibStrings.Terminating
    - awsDashSdkLib.awsDashSdkLibStrings.`Terminating:Wait`
    - awsDashSdkLib.awsDashSdkLibStrings.`Terminating:Proceed`
    - awsDashSdkLib.awsDashSdkLibStrings.Terminated
    - awsDashSdkLib.awsDashSdkLibStrings.Detaching
    - awsDashSdkLib.awsDashSdkLibStrings.Detached
    - awsDashSdkLib.awsDashSdkLibStrings.EnteringStandby
    - awsDashSdkLib.awsDashSdkLibStrings.Standby
    - java.lang.String
  */
  type LifecycleState = _LifecycleState | java.lang.String
  type LifecycleTransition = java.lang.String
  type LoadBalancerNames = js.Array[XmlStringMaxLen255]
  type LoadBalancerStates = js.Array[LoadBalancerState]
  type LoadBalancerTargetGroupStates = js.Array[LoadBalancerTargetGroupState]
  type MaxNumberOfAutoScalingGroups = scala.Double
  type MaxNumberOfLaunchConfigurations = scala.Double
  type MaxRecords = scala.Double
  type MetricCollectionTypes = js.Array[MetricCollectionType]
  type MetricDimensionName = java.lang.String
  type MetricDimensionValue = java.lang.String
  type MetricDimensions = js.Array[MetricDimension]
  type MetricGranularityTypes = js.Array[MetricGranularityType]
  type MetricName = java.lang.String
  type MetricNamespace = java.lang.String
  type MetricScale = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Average
    - awsDashSdkLib.awsDashSdkLibStrings.Minimum
    - awsDashSdkLib.awsDashSdkLibStrings.Maximum
    - awsDashSdkLib.awsDashSdkLibStrings.SampleCount
    - awsDashSdkLib.awsDashSdkLibStrings.Sum
    - java.lang.String
  */
  type MetricStatistic = _MetricStatistic | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ASGAverageCPUUtilization
    - awsDashSdkLib.awsDashSdkLibStrings.ASGAverageNetworkIn
    - awsDashSdkLib.awsDashSdkLibStrings.ASGAverageNetworkOut
    - awsDashSdkLib.awsDashSdkLibStrings.ALBRequestCountPerTarget
    - java.lang.String
  */
  type MetricType = _MetricType | java.lang.String
  type MetricUnit = java.lang.String
  type Metrics = js.Array[XmlStringMaxLen255]
  type MinAdjustmentMagnitude = scala.Double
  type MinAdjustmentStep = scala.Double
  type MixedInstanceSpotPrice = java.lang.String
  type MonitoringEnabled = scala.Boolean
  type NoDevice = scala.Boolean
  type NotificationConfigurations = js.Array[NotificationConfiguration]
  type NotificationTargetResourceName = java.lang.String
  type NumberOfAutoScalingGroups = scala.Double
  type NumberOfLaunchConfigurations = scala.Double
  type OnDemandBaseCapacity = scala.Double
  type OnDemandPercentageAboveBaseCapacity = scala.Double
  type Overrides = js.Array[LaunchTemplateOverrides]
  type PolicyIncrement = scala.Double
  type PolicyNames = js.Array[ResourceName]
  type PolicyTypes = js.Array[XmlStringMaxLen64]
  type ProcessNames = js.Array[XmlStringMaxLen255]
  type Processes = js.Array[ProcessType]
  type Progress = scala.Double
  type PropagateAtLaunch = scala.Boolean
  type ProtectedFromScaleIn = scala.Boolean
  type ResourceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PendingSpotBidPlacement
    - awsDashSdkLib.awsDashSdkLibStrings.WaitingForSpotInstanceRequestId
    - awsDashSdkLib.awsDashSdkLibStrings.WaitingForSpotInstanceId
    - awsDashSdkLib.awsDashSdkLibStrings.WaitingForInstanceId
    - awsDashSdkLib.awsDashSdkLibStrings.PreInService
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.WaitingForELBConnectionDraining
    - awsDashSdkLib.awsDashSdkLibStrings.MidLifecycleAction
    - awsDashSdkLib.awsDashSdkLibStrings.WaitingForInstanceWarmup
    - awsDashSdkLib.awsDashSdkLibStrings.Successful
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - java.lang.String
  */
  type ScalingActivityStatusCode = _ScalingActivityStatusCode | java.lang.String
  type ScalingPolicies = js.Array[ScalingPolicy]
  type ScheduledActionNames = js.Array[ResourceName]
  type ScheduledUpdateGroupActionRequests = js.Array[ScheduledUpdateGroupActionRequest]
  type ScheduledUpdateGroupActions = js.Array[ScheduledUpdateGroupAction]
  type SecurityGroups = js.Array[XmlString]
  type ShouldDecrementDesiredCapacity = scala.Boolean
  type ShouldRespectGracePeriod = scala.Boolean
  type SpotInstancePools = scala.Double
  type SpotPrice = java.lang.String
  type StepAdjustments = js.Array[StepAdjustment]
  type SuspendedProcesses = js.Array[SuspendedProcess]
  type TagDescriptionList = js.Array[TagDescription]
  type TagKey = java.lang.String
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TargetGroupARNs = js.Array[XmlStringMaxLen511]
  type TerminationPolicies = js.Array[XmlStringMaxLen1600]
  type TimestampType = stdLib.Date
  type Values = js.Array[XmlString]
  type XmlString = java.lang.String
  type XmlStringMaxLen1023 = java.lang.String
  type XmlStringMaxLen1600 = java.lang.String
  type XmlStringMaxLen19 = java.lang.String
  type XmlStringMaxLen2047 = java.lang.String
  type XmlStringMaxLen255 = java.lang.String
  type XmlStringMaxLen32 = java.lang.String
  type XmlStringMaxLen511 = java.lang.String
  type XmlStringMaxLen64 = java.lang.String
  type XmlStringUserData = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2011-01-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
