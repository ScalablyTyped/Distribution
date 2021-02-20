package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object autoscalingMod {
  
  type Activities = js.Array[typings.awsSdk.autoscalingMod.Activity]
  
  type ActivityIds = js.Array[typings.awsSdk.autoscalingMod.XmlString]
  
  type AdjustmentTypes = js.Array[typings.awsSdk.autoscalingMod.AdjustmentType]
  
  type Alarms = js.Array[typings.awsSdk.autoscalingMod.Alarm]
  
  type AsciiStringMaxLen255 = java.lang.String
  
  type AssociatePublicIpAddress = scala.Boolean
  
  type AutoScalingGroupDesiredCapacity = scala.Double
  
  type AutoScalingGroupMaxSize = scala.Double
  
  type AutoScalingGroupMinSize = scala.Double
  
  type AutoScalingGroupNames = js.Array[typings.awsSdk.autoscalingMod.ResourceName]
  
  type AutoScalingGroups = js.Array[typings.awsSdk.autoscalingMod.AutoScalingGroup]
  
  type AutoScalingInstances = js.Array[typings.awsSdk.autoscalingMod.AutoScalingInstanceDetails]
  
  type AutoScalingNotificationTypes = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type AvailabilityZones = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type BlockDeviceEbsDeleteOnTermination = scala.Boolean
  
  type BlockDeviceEbsEncrypted = scala.Boolean
  
  type BlockDeviceEbsIops = scala.Double
  
  type BlockDeviceEbsVolumeSize = scala.Double
  
  type BlockDeviceEbsVolumeType = java.lang.String
  
  type BlockDeviceMappings = js.Array[typings.awsSdk.autoscalingMod.BlockDeviceMapping]
  
  type CapacityRebalanceEnabled = scala.Boolean
  
  type ClassicLinkVPCSecurityGroups = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.autoscalingMod.ClientApiVersions
  
  type Cooldown = scala.Double
  
  type DisableScaleIn = scala.Boolean
  
  type EbsOptimized = scala.Boolean
  
  type EnabledMetrics = js.Array[typings.awsSdk.autoscalingMod.EnabledMetric]
  
  type EstimatedInstanceWarmup = scala.Double
  
  type FailedScheduledUpdateGroupActionRequests = js.Array[typings.awsSdk.autoscalingMod.FailedScheduledUpdateGroupActionRequest]
  
  type Filters = js.Array[typings.awsSdk.autoscalingMod.Filter]
  
  type ForceDelete = scala.Boolean
  
  type GlobalTimeout = scala.Double
  
  type HealthCheckGracePeriod = scala.Double
  
  type HeartbeatTimeout = scala.Double
  
  type HonorCooldown = scala.Boolean
  
  type InstanceIds = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen19]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.disabled__
    - typings.awsSdk.awsSdkStrings.enabled__
    - java.lang.String
  */
  type InstanceMetadataEndpointState = typings.awsSdk.autoscalingMod._InstanceMetadataEndpointState | java.lang.String
  
  type InstanceMetadataHttpPutResponseHopLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.optional__
    - typings.awsSdk.awsSdkStrings.required__
    - java.lang.String
  */
  type InstanceMetadataHttpTokensState = typings.awsSdk.autoscalingMod._InstanceMetadataHttpTokensState | java.lang.String
  
  type InstanceProtected = scala.Boolean
  
  type InstanceRefreshIds = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Successful_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Cancelling_
    - typings.awsSdk.awsSdkStrings.Cancelled_
    - java.lang.String
  */
  type InstanceRefreshStatus = typings.awsSdk.autoscalingMod._InstanceRefreshStatus | java.lang.String
  
  type InstanceRefreshes = js.Array[typings.awsSdk.autoscalingMod.InstanceRefresh]
  
  type Instances = js.Array[typings.awsSdk.autoscalingMod.Instance]
  
  type InstancesToUpdate = scala.Double
  
  type IntPercent = scala.Double
  
  type LaunchConfigurationNames = js.Array[typings.awsSdk.autoscalingMod.ResourceName]
  
  type LaunchConfigurations = js.Array[typings.awsSdk.autoscalingMod.LaunchConfiguration]
  
  type LaunchTemplateName = java.lang.String
  
  type LifecycleActionResult = java.lang.String
  
  type LifecycleActionToken = java.lang.String
  
  type LifecycleHookNames = js.Array[typings.awsSdk.autoscalingMod.AsciiStringMaxLen255]
  
  type LifecycleHookSpecifications = js.Array[typings.awsSdk.autoscalingMod.LifecycleHookSpecification]
  
  type LifecycleHooks = js.Array[typings.awsSdk.autoscalingMod.LifecycleHook]
  
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
    - java.lang.String
  */
  type LifecycleState = typings.awsSdk.autoscalingMod._LifecycleState | java.lang.String
  
  type LifecycleTransition = java.lang.String
  
  type LoadBalancerNames = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type LoadBalancerStates = js.Array[typings.awsSdk.autoscalingMod.LoadBalancerState]
  
  type LoadBalancerTargetGroupStates = js.Array[typings.awsSdk.autoscalingMod.LoadBalancerTargetGroupState]
  
  type MaxInstanceLifetime = scala.Double
  
  type MaxNumberOfAutoScalingGroups = scala.Double
  
  type MaxNumberOfLaunchConfigurations = scala.Double
  
  type MaxRecords = scala.Double
  
  type MetricCollectionTypes = js.Array[typings.awsSdk.autoscalingMod.MetricCollectionType]
  
  type MetricDimensionName = java.lang.String
  
  type MetricDimensionValue = java.lang.String
  
  type MetricDimensions = js.Array[typings.awsSdk.autoscalingMod.MetricDimension]
  
  type MetricGranularityTypes = js.Array[typings.awsSdk.autoscalingMod.MetricGranularityType]
  
  type MetricName = java.lang.String
  
  type MetricNamespace = java.lang.String
  
  type MetricScale = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Average_
    - typings.awsSdk.awsSdkStrings.Minimum_
    - typings.awsSdk.awsSdkStrings.Maximum_
    - typings.awsSdk.awsSdkStrings.SampleCount
    - typings.awsSdk.awsSdkStrings.Sum_
    - java.lang.String
  */
  type MetricStatistic = typings.awsSdk.autoscalingMod._MetricStatistic | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ASGAverageCPUUtilization
    - typings.awsSdk.awsSdkStrings.ASGAverageNetworkIn
    - typings.awsSdk.awsSdkStrings.ASGAverageNetworkOut
    - typings.awsSdk.awsSdkStrings.ALBRequestCountPerTarget
    - java.lang.String
  */
  type MetricType = typings.awsSdk.autoscalingMod._MetricType | java.lang.String
  
  type MetricUnit = java.lang.String
  
  type Metrics = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type MinAdjustmentMagnitude = scala.Double
  
  type MinAdjustmentStep = scala.Double
  
  type MixedInstanceSpotPrice = java.lang.String
  
  type MonitoringEnabled = scala.Boolean
  
  type NoDevice = scala.Boolean
  
  type NotificationConfigurations = js.Array[typings.awsSdk.autoscalingMod.NotificationConfiguration]
  
  type NotificationTargetResourceName = java.lang.String
  
  type NumberOfAutoScalingGroups = scala.Double
  
  type NumberOfLaunchConfigurations = scala.Double
  
  type OnDemandBaseCapacity = scala.Double
  
  type OnDemandPercentageAboveBaseCapacity = scala.Double
  
  type Overrides = js.Array[typings.awsSdk.autoscalingMod.LaunchTemplateOverrides]
  
  type PolicyIncrement = scala.Double
  
  type PolicyNames = js.Array[typings.awsSdk.autoscalingMod.ResourceName]
  
  type PolicyTypes = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen64]
  
  type ProcessNames = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen255]
  
  type Processes = js.Array[typings.awsSdk.autoscalingMod.ProcessType]
  
  type Progress = scala.Double
  
  type PropagateAtLaunch = scala.Boolean
  
  type ProtectedFromScaleIn = scala.Boolean
  
  type RefreshInstanceWarmup = scala.Double
  
  type RefreshStrategy = typings.awsSdk.awsSdkStrings.Rolling | java.lang.String
  
  type ResourceName = java.lang.String
  
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
  type ScalingActivityStatusCode = typings.awsSdk.autoscalingMod._ScalingActivityStatusCode | java.lang.String
  
  type ScalingPolicies = js.Array[typings.awsSdk.autoscalingMod.ScalingPolicy]
  
  type ScalingPolicyEnabled = scala.Boolean
  
  type ScheduledActionNames = js.Array[typings.awsSdk.autoscalingMod.ResourceName]
  
  type ScheduledUpdateGroupActionRequests = js.Array[typings.awsSdk.autoscalingMod.ScheduledUpdateGroupActionRequest]
  
  type ScheduledUpdateGroupActions = js.Array[typings.awsSdk.autoscalingMod.ScheduledUpdateGroupAction]
  
  type SecurityGroups = js.Array[typings.awsSdk.autoscalingMod.XmlString]
  
  type ShouldDecrementDesiredCapacity = scala.Boolean
  
  type ShouldRespectGracePeriod = scala.Boolean
  
  type SpotInstancePools = scala.Double
  
  type SpotPrice = java.lang.String
  
  type StepAdjustments = js.Array[typings.awsSdk.autoscalingMod.StepAdjustment]
  
  type SuspendedProcesses = js.Array[typings.awsSdk.autoscalingMod.SuspendedProcess]
  
  type TagDescriptionList = js.Array[typings.awsSdk.autoscalingMod.TagDescription]
  
  type TagKey = java.lang.String
  
  type TagValue = java.lang.String
  
  type Tags = js.Array[typings.awsSdk.autoscalingMod.Tag]
  
  type TargetGroupARNs = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen511]
  
  type TerminationPolicies = js.Array[typings.awsSdk.autoscalingMod.XmlStringMaxLen1600]
  
  type TimestampType = typings.std.Date
  
  type Values = js.Array[typings.awsSdk.autoscalingMod.XmlString]
  
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
    - typings.awsSdk.awsSdkStrings.`2011-01-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.autoscalingMod._apiVersion | java.lang.String
}
