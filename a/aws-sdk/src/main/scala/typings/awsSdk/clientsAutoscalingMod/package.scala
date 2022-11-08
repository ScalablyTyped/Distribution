package typings.awsSdk.clientsAutoscalingMod

import typings.awsSdk.awsSdkStrings.PendingDelete
import typings.awsSdk.awsSdkStrings.Rolling
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.nvidia_
  - typings.awsSdk.awsSdkStrings.amd
  - typings.awsSdk.awsSdkStrings.`amazon-web-services`
  - typings.awsSdk.awsSdkStrings.xilinx
  - java.lang.String
*/
type AcceleratorManufacturer = _AcceleratorManufacturer | String

type AcceleratorManufacturers = js.Array[AcceleratorManufacturer]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.a100
  - typings.awsSdk.awsSdkStrings.v100
  - typings.awsSdk.awsSdkStrings.k80
  - typings.awsSdk.awsSdkStrings.t4
  - typings.awsSdk.awsSdkStrings.m60
  - typings.awsSdk.awsSdkStrings.`radeon-pro-v520`
  - typings.awsSdk.awsSdkStrings.vu9p
  - java.lang.String
*/
type AcceleratorName = _AcceleratorName | String

type AcceleratorNames = js.Array[AcceleratorName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.gpu_
  - typings.awsSdk.awsSdkStrings.fpga
  - typings.awsSdk.awsSdkStrings.inference
  - java.lang.String
*/
type AcceleratorType = _AcceleratorType | String

type AcceleratorTypes = js.Array[AcceleratorType]

type Activities = js.Array[Activity]

type ActivityIds = js.Array[XmlString]

type AdjustmentTypes = js.Array[AdjustmentType]

type Alarms = js.Array[Alarm]

type AllowedInstanceType = String

type AllowedInstanceTypes = js.Array[AllowedInstanceType]

type AsciiStringMaxLen255 = String

type AssociatePublicIpAddress = Boolean

type AutoScalingGroupDesiredCapacity = Double

type AutoScalingGroupMaxSize = Double

type AutoScalingGroupMinSize = Double

type AutoScalingGroupNames = js.Array[XmlStringMaxLen255]

type AutoScalingGroupPredictedCapacity = Double

type AutoScalingGroupState = String

type AutoScalingGroups = js.Array[AutoScalingGroup]

type AutoScalingInstances = js.Array[AutoScalingInstanceDetails]

type AutoScalingNotificationTypes = js.Array[XmlStringMaxLen255]

type AvailabilityZones = js.Array[XmlStringMaxLen255]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.included
  - typings.awsSdk.awsSdkStrings.excluded
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type BareMetal = _BareMetal | String

type BlockDeviceEbsDeleteOnTermination = Boolean

type BlockDeviceEbsEncrypted = Boolean

type BlockDeviceEbsIops = Double

type BlockDeviceEbsThroughput = Double

type BlockDeviceEbsVolumeSize = Double

type BlockDeviceEbsVolumeType = String

type BlockDeviceMappings = js.Array[BlockDeviceMapping]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.included
  - typings.awsSdk.awsSdkStrings.excluded
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type BurstablePerformance = _BurstablePerformance | String

type CapacityRebalanceEnabled = Boolean

type CheckpointDelay = Double

type CheckpointPercentages = js.Array[NonZeroIntPercent]

type ClassicLinkVPCSecurityGroups = js.Array[XmlStringMaxLen255]

type Context = String

type Cooldown = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.intel
  - typings.awsSdk.awsSdkStrings.amd
  - typings.awsSdk.awsSdkStrings.`amazon-web-services`
  - java.lang.String
*/
type CpuManufacturer = _CpuManufacturer | String

type CpuManufacturers = js.Array[CpuManufacturer]

type DefaultInstanceWarmup = Double

type DisableScaleIn = Boolean

type EbsOptimized = Boolean

type EnabledMetrics = js.Array[EnabledMetric]

type EstimatedInstanceWarmup = Double

type ExcludedInstance = String

type ExcludedInstanceTypes = js.Array[ExcludedInstance]

type FailedScheduledUpdateGroupActionRequests = js.Array[FailedScheduledUpdateGroupActionRequest]

type Filters = js.Array[Filter]

type ForceDelete = Boolean

type GlobalTimeout = Double

type HealthCheckGracePeriod = Double

type HeartbeatTimeout = Double

type HonorCooldown = Boolean

type IncludeDeletedGroups = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.current__
  - typings.awsSdk.awsSdkStrings.previous_
  - java.lang.String
*/
type InstanceGeneration = _InstanceGeneration | String

type InstanceGenerations = js.Array[InstanceGeneration]

type InstanceIds = js.Array[XmlStringMaxLen19]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.disabled__
  - typings.awsSdk.awsSdkStrings.enabled__
  - java.lang.String
*/
type InstanceMetadataEndpointState = _InstanceMetadataEndpointState | String

type InstanceMetadataHttpPutResponseHopLimit = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.optional__
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type InstanceMetadataHttpTokensState = _InstanceMetadataHttpTokensState | String

type InstanceProtected = Boolean

type InstanceRefreshIds = js.Array[XmlStringMaxLen255]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Successful_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Cancelling_
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
type InstanceRefreshStatus = _InstanceRefreshStatus | String

type InstanceRefreshes = js.Array[InstanceRefresh]

type Instances = js.Array[Instance]

type InstancesToUpdate = Double

type IntPercent = Double

type LaunchConfigurationNames = js.Array[XmlStringMaxLen255]

type LaunchConfigurations = js.Array[LaunchConfiguration]

type LaunchTemplateName = String

type LifecycleActionResult = String

type LifecycleActionToken = String

type LifecycleHookNames = js.Array[AsciiStringMaxLen255]

type LifecycleHookSpecifications = js.Array[LifecycleHookSpecification]

type LifecycleHooks = js.Array[LifecycleHook]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.PendingColonWait
  - typings.awsSdk.awsSdkStrings.PendingColonProceed
  - typings.awsSdk.awsSdkStrings.Quarantined
  - typings.awsSdk.awsSdkStrings.InService
  - typings.awsSdk.awsSdkStrings.Terminating_
  - typings.awsSdk.awsSdkStrings.TerminatingColonWait
  - typings.awsSdk.awsSdkStrings.TerminatingColonProceed
  - typings.awsSdk.awsSdkStrings.Terminated_
  - typings.awsSdk.awsSdkStrings.Detaching_
  - typings.awsSdk.awsSdkStrings.Detached_
  - typings.awsSdk.awsSdkStrings.EnteringStandby
  - typings.awsSdk.awsSdkStrings.Standby_
  - typings.awsSdk.awsSdkStrings.WarmedColonPending
  - typings.awsSdk.awsSdkStrings.WarmedColonPendingColonWait
  - typings.awsSdk.awsSdkStrings.WarmedColonPendingColonProceed
  - typings.awsSdk.awsSdkStrings.WarmedColonTerminating
  - typings.awsSdk.awsSdkStrings.WarmedColonTerminatingColonWait
  - typings.awsSdk.awsSdkStrings.WarmedColonTerminatingColonProceed
  - typings.awsSdk.awsSdkStrings.WarmedColonTerminated
  - typings.awsSdk.awsSdkStrings.WarmedColonStopped
  - typings.awsSdk.awsSdkStrings.WarmedColonRunning
  - typings.awsSdk.awsSdkStrings.WarmedColonHibernated
  - java.lang.String
*/
type LifecycleState = _LifecycleState | String

type LifecycleTransition = String

type LoadBalancerNames = js.Array[XmlStringMaxLen255]

type LoadBalancerStates = js.Array[LoadBalancerState]

type LoadBalancerTargetGroupStates = js.Array[LoadBalancerTargetGroupState]

type LoadForecasts = js.Array[LoadForecast]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.included
  - typings.awsSdk.awsSdkStrings.excluded
  - typings.awsSdk.awsSdkStrings.required__
  - java.lang.String
*/
type LocalStorage = _LocalStorage | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.hdd_
  - typings.awsSdk.awsSdkStrings.ssd_
  - java.lang.String
*/
type LocalStorageType = _LocalStorageType | String

type LocalStorageTypes = js.Array[LocalStorageType]

type MaxGroupPreparedCapacity = Double

type MaxInstanceLifetime = Double

type MaxNumberOfAutoScalingGroups = Double

type MaxNumberOfLaunchConfigurations = Double

type MaxRecords = Double

type MetricCollectionTypes = js.Array[MetricCollectionType]

type MetricDataQueries = js.Array[MetricDataQuery]

type MetricDimensionName = String

type MetricDimensionValue = String

type MetricDimensions = js.Array[MetricDimension]

type MetricGranularityTypes = js.Array[MetricGranularityType]

type MetricName = String

type MetricNamespace = String

type MetricScale = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Average_
  - typings.awsSdk.awsSdkStrings.Minimum_
  - typings.awsSdk.awsSdkStrings.Maximum_
  - typings.awsSdk.awsSdkStrings.SampleCount
  - typings.awsSdk.awsSdkStrings.Sum_
  - java.lang.String
*/
type MetricStatistic = _MetricStatistic | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
  - typings.awsSdk.awsSdkStrings.ASGAverageNetworkIn
  - typings.awsSdk.awsSdkStrings.ASGAverageNetworkOut
  - typings.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
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

type NonZeroIntPercent = Double

type NotificationConfigurations = js.Array[NotificationConfiguration]

type NotificationTargetResourceName = String

type NullableBoolean = Boolean

type NullablePositiveDouble = Double

type NullablePositiveInteger = Double

type NumberOfAutoScalingGroups = Double

type NumberOfLaunchConfigurations = Double

type OnDemandBaseCapacity = Double

type OnDemandPercentageAboveBaseCapacity = Double

type Overrides = js.Array[LaunchTemplateOverrides]

type PolicyIncrement = Double

type PolicyNames = js.Array[ResourceName]

type PolicyTypes = js.Array[XmlStringMaxLen64]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASGTotalCPUUtilization
  - typings.awsSdk.awsSdkStrings.ASGTotalNetworkIn
  - typings.awsSdk.awsSdkStrings.ASGTotalNetworkOut
  - typings.awsSdk.awsSdkStrings.ALBTargetGroupRequestCount
  - java.lang.String
*/
type PredefinedLoadMetricType = _PredefinedLoadMetricType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASGCPUUtilization
  - typings.awsSdk.awsSdkStrings.ASGNetworkIn
  - typings.awsSdk.awsSdkStrings.ASGNetworkOut
  - typings.awsSdk.awsSdkStrings.ALBRequestCount
  - java.lang.String
*/
type PredefinedMetricPairType = _PredefinedMetricPairType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
  - typings.awsSdk.awsSdkStrings.ASGAverageNetworkIn
  - typings.awsSdk.awsSdkStrings.ASGAverageNetworkOut
  - typings.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
  - java.lang.String
*/
type PredefinedScalingMetricType = _PredefinedScalingMetricType | String

type PredictiveScalingForecastTimestamps = js.Array[js.Date]

type PredictiveScalingForecastValues = js.Array[MetricScale]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HonorMaxCapacity
  - typings.awsSdk.awsSdkStrings.IncreaseMaxCapacity
  - java.lang.String
*/
type PredictiveScalingMaxCapacityBreachBehavior = _PredictiveScalingMaxCapacityBreachBehavior | String

type PredictiveScalingMaxCapacityBuffer = Double

type PredictiveScalingMetricSpecifications = js.Array[PredictiveScalingMetricSpecification]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ForecastAndScale
  - typings.awsSdk.awsSdkStrings.ForecastOnly
  - java.lang.String
*/
type PredictiveScalingMode = _PredictiveScalingMode | String

type PredictiveScalingSchedulingBufferTime = Double

type ProcessNames = js.Array[XmlStringMaxLen255]

type Processes = js.Array[ProcessType]

type Progress = Double

type PropagateAtLaunch = Boolean

type ProtectedFromScaleIn = Boolean

type RefreshInstanceWarmup = Double

type RefreshStrategy = Rolling | String

type ResourceName = String

type ReturnData = Boolean

type ReuseOnScaleIn = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PendingSpotBidPlacement
  - typings.awsSdk.awsSdkStrings.WaitingForSpotInstanceRequestId
  - typings.awsSdk.awsSdkStrings.WaitingForSpotInstanceId
  - typings.awsSdk.awsSdkStrings.WaitingForInstanceId
  - typings.awsSdk.awsSdkStrings.PreInService
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.WaitingForELBConnectionDraining
  - typings.awsSdk.awsSdkStrings.MidLifecycleAction
  - typings.awsSdk.awsSdkStrings.WaitingForInstanceWarmup
  - typings.awsSdk.awsSdkStrings.Successful_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
type ScalingActivityStatusCode = _ScalingActivityStatusCode | String

type ScalingPolicies = js.Array[ScalingPolicy]

type ScalingPolicyEnabled = Boolean

type ScheduledActionNames = js.Array[XmlStringMaxLen255]

type ScheduledUpdateGroupActionRequests = js.Array[ScheduledUpdateGroupActionRequest]

type ScheduledUpdateGroupActions = js.Array[ScheduledUpdateGroupAction]

type SecurityGroups = js.Array[XmlString]

type ShouldDecrementDesiredCapacity = Boolean

type ShouldRespectGracePeriod = Boolean

type SkipMatching = Boolean

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

type TimestampType = js.Date

type Values = js.Array[XmlString]

type WarmPoolMinSize = Double

type WarmPoolSize = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Stopped_
  - typings.awsSdk.awsSdkStrings.Running_
  - typings.awsSdk.awsSdkStrings.Hibernated
  - java.lang.String
*/
type WarmPoolState = _WarmPoolState | String

type WarmPoolStatus = PendingDelete | String

type XmlString = String

type XmlStringMaxLen1023 = String

type XmlStringMaxLen1600 = String

type XmlStringMaxLen19 = String

type XmlStringMaxLen2047 = String

type XmlStringMaxLen255 = String

type XmlStringMaxLen32 = String

type XmlStringMaxLen511 = String

type XmlStringMaxLen64 = String

type XmlStringMetricLabel = String

type XmlStringMetricStat = String

type XmlStringUserData = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2011-01-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
