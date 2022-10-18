package typings.awsSdk.clientsComputeoptimizerMod

import typings.awsSdk.awsSdkStrings.Csv_
import typings.awsSdk.awsSdkStrings.Duration_
import typings.awsSdk.awsSdkStrings.Finding_
import typings.awsSdk.awsSdkStrings.Status_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountEnrollmentStatuses = js.Array[AccountEnrollmentStatus]

type AccountId = String

type AccountIds = js.Array[AccountId]

type AutoScalingGroupArn = String

type AutoScalingGroupArns = js.Array[AutoScalingGroupArn]

type AutoScalingGroupName = String

type AutoScalingGroupRecommendationOptions = js.Array[AutoScalingGroupRecommendationOption]

type AutoScalingGroupRecommendations = js.Array[AutoScalingGroupRecommendation]

type Code = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AWS_ARM64
  - typings.awsSdk.awsSdkStrings.CURRENT
  - java.lang.String
*/
type CpuVendorArchitecture = _CpuVendorArchitecture | String

type CpuVendorArchitectures = js.Array[CpuVendorArchitecture]

type CreationTimestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.USD
  - typings.awsSdk.awsSdkStrings.CNY
  - java.lang.String
*/
type Currency = _Currency | String

type CurrentInstanceType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VeryLow
  - typings.awsSdk.awsSdkStrings.Low_
  - typings.awsSdk.awsSdkStrings.Medium_
  - typings.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type CurrentPerformanceRisk = _CurrentPerformanceRisk | String

type DesiredCapacity = Double

type DestinationBucket = String

type DestinationKey = String

type DestinationKeyPrefix = String

type EBSFilterName = Finding_ | String

type EBSFilters = js.Array[EBSFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Optimized
  - typings.awsSdk.awsSdkStrings.NotOptimized
  - java.lang.String
*/
type EBSFinding = _EBSFinding | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VolumeReadOpsPerSecond
  - typings.awsSdk.awsSdkStrings.VolumeWriteOpsPerSecond
  - typings.awsSdk.awsSdkStrings.VolumeReadBytesPerSecond
  - typings.awsSdk.awsSdkStrings.VolumeWriteBytesPerSecond
  - java.lang.String
*/
type EBSMetricName = _EBSMetricName | String

type EBSUtilizationMetrics = js.Array[EBSUtilizationMetric]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type EnhancedInfrastructureMetrics = _EnhancedInfrastructureMetrics | String

type EnrollmentFilterName = Status_ | String

type EnrollmentFilters = js.Array[EnrollmentFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AccountId
  - typings.awsSdk.awsSdkStrings.AutoScalingGroupArn
  - typings.awsSdk.awsSdkStrings.AutoScalingGroupName
  - typings.awsSdk.awsSdkStrings.Finding_
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsCpuMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsMemoryMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsEbsReadOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsEbsWriteOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsEbsReadBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsEbsWriteBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDiskReadOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDiskWriteOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDiskReadBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDiskWriteBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsNetworkInBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsNetworkOutBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsNetworkPacketsInPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsNetworkPacketsOutPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.LookbackPeriodInDays
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationInstanceType
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationDesiredCapacity
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationMinSize
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationMaxSize
  - typings.awsSdk.awsSdkStrings.CurrentOnDemandPrice
  - typings.awsSdk.awsSdkStrings.CurrentStandardOneYearNoUpfrontReservedPrice
  - typings.awsSdk.awsSdkStrings.CurrentStandardThreeYearNoUpfrontReservedPrice
  - typings.awsSdk.awsSdkStrings.CurrentVCpus
  - typings.awsSdk.awsSdkStrings.CurrentMemory
  - typings.awsSdk.awsSdkStrings.CurrentStorage
  - typings.awsSdk.awsSdkStrings.CurrentNetwork
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationInstanceType
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationDesiredCapacity
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationMinSize
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationMaxSize
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsProjectedUtilizationMetricsCpuMaximum
  - / * RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum * / java.lang.String
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsPerformanceRisk
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsOnDemandPrice
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsStandardOneYearNoUpfrontReservedPrice
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsVcpus
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsMemory
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsStorage
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsNetwork
  - typings.awsSdk.awsSdkStrings.LastRefreshTimestamp
  - typings.awsSdk.awsSdkStrings.CurrentPerformanceRisk
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsSavingsOpportunityPercentage
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsCurrency
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsValue
  - typings.awsSdk.awsSdkStrings.EffectiveRecommendationPreferencesCpuVendorArchitectures
  - typings.awsSdk.awsSdkStrings.EffectiveRecommendationPreferencesInferredWorkloadTypes
  - typings.awsSdk.awsSdkStrings.InferredWorkloadTypes
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsMigrationEffort
*/
type ExportableAutoScalingGroupField = _ExportableAutoScalingGroupField | (/* RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum */ String)

type ExportableAutoScalingGroupFields = js.Array[ExportableAutoScalingGroupField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AccountId
  - typings.awsSdk.awsSdkStrings.InstanceArn
  - typings.awsSdk.awsSdkStrings.InstanceName
  - typings.awsSdk.awsSdkStrings.Finding_
  - typings.awsSdk.awsSdkStrings.FindingReasonCodes
  - typings.awsSdk.awsSdkStrings.LookbackPeriodInDays
  - typings.awsSdk.awsSdkStrings.CurrentInstanceType
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsCpuMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsMemoryMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsEbsReadOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsEbsWriteOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsEbsReadBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsEbsWriteBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDiskReadOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDiskWriteOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDiskReadBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDiskWriteBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsNetworkInBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsNetworkOutBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsNetworkPacketsInPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsNetworkPacketsOutPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.CurrentOnDemandPrice
  - typings.awsSdk.awsSdkStrings.CurrentStandardOneYearNoUpfrontReservedPrice
  - typings.awsSdk.awsSdkStrings.CurrentStandardThreeYearNoUpfrontReservedPrice
  - typings.awsSdk.awsSdkStrings.CurrentVCpus
  - typings.awsSdk.awsSdkStrings.CurrentMemory
  - typings.awsSdk.awsSdkStrings.CurrentStorage
  - typings.awsSdk.awsSdkStrings.CurrentNetwork
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsInstanceType
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsProjectedUtilizationMetricsCpuMaximum
  - / * RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum * / java.lang.String
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsPlatformDifferences
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsPerformanceRisk
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsVcpus
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsMemory
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsStorage
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsNetwork
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsOnDemandPrice
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsStandardOneYearNoUpfrontReservedPrice
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsStandardThreeYearNoUpfrontReservedPrice
  - typings.awsSdk.awsSdkStrings.RecommendationsSourcesRecommendationSourceArn
  - typings.awsSdk.awsSdkStrings.RecommendationsSourcesRecommendationSourceType
  - typings.awsSdk.awsSdkStrings.LastRefreshTimestamp
  - typings.awsSdk.awsSdkStrings.CurrentPerformanceRisk
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsSavingsOpportunityPercentage
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsCurrency
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsValue
  - typings.awsSdk.awsSdkStrings.EffectiveRecommendationPreferencesCpuVendorArchitectures
  - typings.awsSdk.awsSdkStrings.EffectiveRecommendationPreferencesInferredWorkloadTypes
  - typings.awsSdk.awsSdkStrings.InferredWorkloadTypes
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsMigrationEffort
*/
type ExportableInstanceField = _ExportableInstanceField | (/* RecommendationOptionsProjectedUtilizationMetricsMemoryMaximum */ String)

type ExportableInstanceFields = js.Array[ExportableInstanceField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AccountId
  - typings.awsSdk.awsSdkStrings.FunctionArn
  - typings.awsSdk.awsSdkStrings.FunctionVersion
  - typings.awsSdk.awsSdkStrings.Finding_
  - typings.awsSdk.awsSdkStrings.FindingReasonCodes
  - typings.awsSdk.awsSdkStrings.NumberOfInvocations
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDurationMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsDurationAverage
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsMemoryMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsMemoryAverage
  - typings.awsSdk.awsSdkStrings.LookbackPeriodInDays
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationMemorySize
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationTimeout
  - typings.awsSdk.awsSdkStrings.CurrentCostTotal
  - typings.awsSdk.awsSdkStrings.CurrentCostAverage
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationMemorySize
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsCostLow
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsCostHigh
  - / * RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound * / java.lang.String
  - typings.awsSdk.awsSdkStrings.LastRefreshTimestamp
  - typings.awsSdk.awsSdkStrings.CurrentPerformanceRisk
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsSavingsOpportunityPercentage
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsCurrency
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsValue
*/
type ExportableLambdaFunctionField = _ExportableLambdaFunctionField | (/* RecommendationOptionsProjectedUtilizationMetricsDurationLowerBound */ String)

type ExportableLambdaFunctionFields = js.Array[ExportableLambdaFunctionField]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AccountId
  - typings.awsSdk.awsSdkStrings.VolumeArn
  - typings.awsSdk.awsSdkStrings.Finding_
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsVolumeReadOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsVolumeWriteOpsPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsVolumeReadBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.UtilizationMetricsVolumeWriteBytesPerSecondMaximum
  - typings.awsSdk.awsSdkStrings.LookbackPeriodInDays
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationVolumeType
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationVolumeBaselineIOPS
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationVolumeBaselineThroughput
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationVolumeBurstIOPS
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationVolumeBurstThroughput
  - typings.awsSdk.awsSdkStrings.CurrentConfigurationVolumeSize
  - typings.awsSdk.awsSdkStrings.CurrentMonthlyPrice
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeType
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeBaselineIOPS
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeBaselineThroughput
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeBurstIOPS
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeBurstThroughput
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsConfigurationVolumeSize
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsMonthlyPrice
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsPerformanceRisk
  - typings.awsSdk.awsSdkStrings.LastRefreshTimestamp
  - typings.awsSdk.awsSdkStrings.CurrentPerformanceRisk
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsSavingsOpportunityPercentage
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsCurrency
  - typings.awsSdk.awsSdkStrings.RecommendationOptionsEstimatedMonthlySavingsValue
  - java.lang.String
*/
type ExportableVolumeField = _ExportableVolumeField | String

type ExportableVolumeFields = js.Array[ExportableVolumeField]

type FailureReason = String

type FileFormat = Csv_ | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Finding_
  - typings.awsSdk.awsSdkStrings.FindingReasonCodes
  - typings.awsSdk.awsSdkStrings.RecommendationSourceType
  - java.lang.String
*/
type FilterName = _FilterName | String

type FilterValue = String

type FilterValues = js.Array[FilterValue]

type Filters = js.Array[Filter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Underprovisioned
  - typings.awsSdk.awsSdkStrings.Overprovisioned
  - typings.awsSdk.awsSdkStrings.Optimized
  - typings.awsSdk.awsSdkStrings.NotOptimized
  - java.lang.String
*/
type Finding = _Finding | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MemoryOverprovisioned
  - typings.awsSdk.awsSdkStrings.MemoryUnderprovisioned
  - java.lang.String
*/
type FindingReasonCode = _FindingReasonCode | String

type FunctionArn = String

type FunctionArns = js.Array[FunctionArn]

type FunctionVersion = String

type GetRecommendationErrors = js.Array[GetRecommendationError]

type High = Double

type Identifier = String

type IncludeMemberAccounts = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AmazonEmr
  - typings.awsSdk.awsSdkStrings.ApacheCassandra
  - typings.awsSdk.awsSdkStrings.ApacheHadoop
  - typings.awsSdk.awsSdkStrings.Memcached
  - typings.awsSdk.awsSdkStrings.Nginx
  - typings.awsSdk.awsSdkStrings.PostgreSql_
  - typings.awsSdk.awsSdkStrings.Redis
  - java.lang.String
*/
type InferredWorkloadType = _InferredWorkloadType | String

type InferredWorkloadTypes = js.Array[InferredWorkloadType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type InferredWorkloadTypesPreference = _InferredWorkloadTypesPreference | String

type InstanceArn = String

type InstanceArns = js.Array[InstanceArn]

type InstanceName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CPUOverprovisioned
  - typings.awsSdk.awsSdkStrings.CPUUnderprovisioned
  - typings.awsSdk.awsSdkStrings.MemoryOverprovisioned
  - typings.awsSdk.awsSdkStrings.MemoryUnderprovisioned
  - typings.awsSdk.awsSdkStrings.EBSThroughputOverprovisioned
  - typings.awsSdk.awsSdkStrings.EBSThroughputUnderprovisioned
  - typings.awsSdk.awsSdkStrings.EBSIOPSOverprovisioned
  - typings.awsSdk.awsSdkStrings.EBSIOPSUnderprovisioned
  - typings.awsSdk.awsSdkStrings.NetworkBandwidthOverprovisioned
  - typings.awsSdk.awsSdkStrings.NetworkBandwidthUnderprovisioned
  - typings.awsSdk.awsSdkStrings.NetworkPPSOverprovisioned
  - typings.awsSdk.awsSdkStrings.NetworkPPSUnderprovisioned
  - typings.awsSdk.awsSdkStrings.DiskIOPSOverprovisioned
  - typings.awsSdk.awsSdkStrings.DiskIOPSUnderprovisioned
  - typings.awsSdk.awsSdkStrings.DiskThroughputOverprovisioned
  - typings.awsSdk.awsSdkStrings.DiskThroughputUnderprovisioned
  - java.lang.String
*/
type InstanceRecommendationFindingReasonCode = _InstanceRecommendationFindingReasonCode | String

type InstanceRecommendationFindingReasonCodes = js.Array[InstanceRecommendationFindingReasonCode]

type InstanceRecommendations = js.Array[InstanceRecommendation]

type InstanceType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ResourceType
  - typings.awsSdk.awsSdkStrings.JobStatus
  - java.lang.String
*/
type JobFilterName = _JobFilterName | String

type JobFilters = js.Array[JobFilter]

type JobId = String

type JobIds = js.Array[JobId]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Queued_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Complete_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type JobStatus = _JobStatus | String

type LambdaFunctionMemoryMetricName = Duration_ | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LowerBound
  - typings.awsSdk.awsSdkStrings.UpperBound
  - typings.awsSdk.awsSdkStrings.Expected
  - java.lang.String
*/
type LambdaFunctionMemoryMetricStatistic = _LambdaFunctionMemoryMetricStatistic | String

type LambdaFunctionMemoryProjectedMetrics = js.Array[LambdaFunctionMemoryProjectedMetric]

type LambdaFunctionMemoryRecommendationOptions = js.Array[LambdaFunctionMemoryRecommendationOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Duration_
  - typings.awsSdk.awsSdkStrings.Memory_
  - java.lang.String
*/
type LambdaFunctionMetricName = _LambdaFunctionMetricName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Maximum_
  - typings.awsSdk.awsSdkStrings.Average_
  - java.lang.String
*/
type LambdaFunctionMetricStatistic = _LambdaFunctionMetricStatistic | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Finding_
  - typings.awsSdk.awsSdkStrings.FindingReasonCode
  - java.lang.String
*/
type LambdaFunctionRecommendationFilterName = _LambdaFunctionRecommendationFilterName | String

type LambdaFunctionRecommendationFilters = js.Array[LambdaFunctionRecommendationFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Optimized
  - typings.awsSdk.awsSdkStrings.NotOptimized
  - typings.awsSdk.awsSdkStrings.Unavailable_
  - java.lang.String
*/
type LambdaFunctionRecommendationFinding = _LambdaFunctionRecommendationFinding | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MemoryOverprovisioned
  - typings.awsSdk.awsSdkStrings.MemoryUnderprovisioned
  - typings.awsSdk.awsSdkStrings.InsufficientData
  - typings.awsSdk.awsSdkStrings.Inconclusive
  - java.lang.String
*/
type LambdaFunctionRecommendationFindingReasonCode = _LambdaFunctionRecommendationFindingReasonCode | String

type LambdaFunctionRecommendationFindingReasonCodes = js.Array[LambdaFunctionRecommendationFindingReasonCode]

type LambdaFunctionRecommendations = js.Array[LambdaFunctionRecommendation]

type LambdaFunctionUtilizationMetrics = js.Array[LambdaFunctionUtilizationMetric]

type LastRefreshTimestamp = js.Date

type LastUpdatedTimestamp = js.Date

type LookBackPeriodInDays = Double

type Low = Double

type MaxResults = Double

type MaxSize = Double

type Medium = Double

type MemberAccountsEnrolled = Boolean

type MemorySize = Double

type Message = String

type MetadataKey = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Cpu_
  - typings.awsSdk.awsSdkStrings.Memory_
  - typings.awsSdk.awsSdkStrings.EBS_READ_OPS_PER_SECOND
  - typings.awsSdk.awsSdkStrings.EBS_WRITE_OPS_PER_SECOND
  - typings.awsSdk.awsSdkStrings.EBS_READ_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.EBS_WRITE_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.DISK_READ_OPS_PER_SECOND
  - typings.awsSdk.awsSdkStrings.DISK_WRITE_OPS_PER_SECOND
  - typings.awsSdk.awsSdkStrings.DISK_READ_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.DISK_WRITE_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.NETWORK_IN_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.NETWORK_OUT_BYTES_PER_SECOND
  - typings.awsSdk.awsSdkStrings.NETWORK_PACKETS_IN_PER_SECOND
  - typings.awsSdk.awsSdkStrings.NETWORK_PACKETS_OUT_PER_SECOND
  - java.lang.String
*/
type MetricName = _MetricName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Maximum_
  - typings.awsSdk.awsSdkStrings.Average_
  - java.lang.String
*/
type MetricStatistic = _MetricStatistic | String

type MetricValue = Double

type MetricValues = js.Array[MetricValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.VeryLow
  - typings.awsSdk.awsSdkStrings.Low_
  - typings.awsSdk.awsSdkStrings.Medium_
  - typings.awsSdk.awsSdkStrings.High_
  - java.lang.String
*/
type MigrationEffort = _MigrationEffort | String

type MinSize = Double

type NextToken = String

type NumberOfInvocations = Double

type NumberOfMemberAccountsOptedIn = Double

type PerformanceRisk = Double

type Period = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Hypervisor_
  - typings.awsSdk.awsSdkStrings.NetworkInterface
  - typings.awsSdk.awsSdkStrings.StorageInterface
  - typings.awsSdk.awsSdkStrings.InstanceStoreAvailability
  - typings.awsSdk.awsSdkStrings.VirtualizationType
  - typings.awsSdk.awsSdkStrings.Architecture
  - java.lang.String
*/
type PlatformDifference = _PlatformDifference | String

type PlatformDifferences = js.Array[PlatformDifference]

type ProjectedMetrics = js.Array[ProjectedMetric]

type ProjectedUtilizationMetrics = js.Array[UtilizationMetric]

type Rank = Double

type ReasonCodeSummaries = js.Array[ReasonCodeSummary]

type RecommendationExportJobs = js.Array[RecommendationExportJob]

type RecommendationOptions = js.Array[InstanceRecommendationOption]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.EnhancedInfrastructureMetrics
  - typings.awsSdk.awsSdkStrings.InferredWorkloadTypes
  - java.lang.String
*/
type RecommendationPreferenceName = _RecommendationPreferenceName | String

type RecommendationPreferenceNames = js.Array[RecommendationPreferenceName]

type RecommendationPreferencesDetails = js.Array[RecommendationPreferencesDetail]

type RecommendationSourceArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Ec2Instance_
  - typings.awsSdk.awsSdkStrings.AutoScalingGroup
  - typings.awsSdk.awsSdkStrings.EbsVolume
  - typings.awsSdk.awsSdkStrings.LambdaFunction
  - java.lang.String
*/
type RecommendationSourceType = _RecommendationSourceType | String

type RecommendationSources = js.Array[RecommendationSource]

type RecommendationSummaries = js.Array[RecommendationSummary]

type RecommendedInstanceType = String

type RecommendedOptionProjectedMetrics = js.Array[RecommendedOptionProjectedMetric]

type ResourceArn = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Ec2Instance_
  - typings.awsSdk.awsSdkStrings.AutoScalingGroup
  - typings.awsSdk.awsSdkStrings.EbsVolume
  - typings.awsSdk.awsSdkStrings.LambdaFunction
  - typings.awsSdk.awsSdkStrings.NotApplicable
  - java.lang.String
*/
type ResourceType = _ResourceType | String

type SavingsOpportunityPercentage = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Organization_
  - typings.awsSdk.awsSdkStrings.AccountId
  - typings.awsSdk.awsSdkStrings.ResourceArn
  - java.lang.String
*/
type ScopeName = _ScopeName | String

type ScopeValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type Status = _Status | String

type StatusReason = String

type Summaries = js.Array[Summary]

type SummaryValue = Double

type Timestamp = js.Date

type Timestamps = js.Array[js.Date]

type UtilizationMetrics = js.Array[UtilizationMetric]

type Value = Double

type VeryLow = Double

type VolumeArn = String

type VolumeArns = js.Array[VolumeArn]

type VolumeBaselineIOPS = Double

type VolumeBaselineThroughput = Double

type VolumeBurstIOPS = Double

type VolumeBurstThroughput = Double

type VolumeRecommendationOptions = js.Array[VolumeRecommendationOption]

type VolumeRecommendations = js.Array[VolumeRecommendation]

type VolumeSize = Double

type VolumeType = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2019-11-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
