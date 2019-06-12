package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSagemakerMod {
  type Accept = java.lang.String
  type AccountId = java.lang.String
  type AdditionalCodeRepositoryNamesOrUrls = js.Array[CodeRepositoryNameOrUrl]
  type AlgorithmArn = java.lang.String
  type AlgorithmImage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - java.lang.String
  */
  type AlgorithmSortBy = _AlgorithmSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - java.lang.String
  */
  type AlgorithmStatus = _AlgorithmStatus | java.lang.String
  type AlgorithmStatusItemList = js.Array[AlgorithmStatusItem]
  type AlgorithmSummaryList = js.Array[AlgorithmSummary]
  type AlgorithmValidationProfiles = js.Array[AlgorithmValidationProfile]
  type ArnOrName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - awsDashSdkLib.awsDashSdkLibStrings.Line
    - java.lang.String
  */
  type AssemblyType = _AssemblyType | java.lang.String
  type AttributeName = java.lang.String
  type AttributeNames = js.Array[AttributeName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.MultiRecord
    - awsDashSdkLib.awsDashSdkLibStrings.SingleRecord
    - java.lang.String
  */
  type BatchStrategy = _BatchStrategy | java.lang.String
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.And
    - awsDashSdkLib.awsDashSdkLibStrings.Or
    - java.lang.String
  */
  type BooleanOperator = _BooleanOperator | java.lang.String
  type Branch = java.lang.String
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type Cents = scala.Double
  type CertifyForMarketplace = scala.Boolean
  type ChannelName = java.lang.String
  type ChannelSpecifications = js.Array[ChannelSpecification]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CodeRepositoryArn = java.lang.String
  type CodeRepositoryContains = java.lang.String
  type CodeRepositoryNameContains = java.lang.String
  type CodeRepositoryNameOrUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - awsDashSdkLib.awsDashSdkLibStrings.LastModifiedTime
    - java.lang.String
  */
  type CodeRepositorySortBy = _CodeRepositorySortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Ascending
    - awsDashSdkLib.awsDashSdkLibStrings.Descending
    - java.lang.String
  */
  type CodeRepositorySortOrder = _CodeRepositorySortOrder | java.lang.String
  type CodeRepositorySummaryList = js.Array[CodeRepositorySummary]
  type CognitoClientId = java.lang.String
  type CognitoUserGroup = java.lang.String
  type CognitoUserPool = java.lang.String
  type CompilationJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.INPROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.STARTING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPING
    - awsDashSdkLib.awsDashSdkLibStrings.STOPPED
    - java.lang.String
  */
  type CompilationJobStatus = _CompilationJobStatus | java.lang.String
  type CompilationJobSummaries = js.Array[CompilationJobSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - awsDashSdkLib.awsDashSdkLibStrings.Gzip
    - java.lang.String
  */
  type CompressionType = _CompressionType | java.lang.String
  type CompressionTypes = js.Array[CompressionType]
  type ContainerDefinitionList = js.Array[ContainerDefinition]
  type ContainerHostname = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FreeOfPersonallyIdentifiableInformation
    - awsDashSdkLib.awsDashSdkLibStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = _ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[ContentClassifier]
  type ContentType = java.lang.String
  type ContentTypes = js.Array[ContentType]
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type CreationTime = stdLib.Date
  type DataInputConfig = java.lang.String
  type DeployedImages = js.Array[DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[DesiredWeightAndCapacity]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NotStarted
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type DetailedAlgorithmStatus = _DetailedAlgorithmStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NotStarted
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type DetailedModelPackageStatus = _DetailedModelPackageStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type DirectInternetAccess = _DirectInternetAccess | java.lang.String
  type DisassociateAdditionalCodeRepositories = scala.Boolean
  type DisassociateDefaultCodeRepository = scala.Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = scala.Boolean
  type DisassociateNotebookInstanceLifecycleConfig = scala.Boolean
  type Dollars = scala.Double
  type EndpointArn = java.lang.String
  type EndpointConfigArn = java.lang.String
  type EndpointConfigName = java.lang.String
  type EndpointConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - java.lang.String
  */
  type EndpointConfigSortKey = _EndpointConfigSortKey | java.lang.String
  type EndpointConfigSummaryList = js.Array[EndpointConfigSummary]
  type EndpointName = java.lang.String
  type EndpointNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - java.lang.String
  */
  type EndpointSortKey = _EndpointSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OutOfService
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Updating
    - awsDashSdkLib.awsDashSdkLibStrings.SystemUpdating
    - awsDashSdkLib.awsDashSdkLibStrings.RollingBack
    - awsDashSdkLib.awsDashSdkLibStrings.InService
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type EndpointStatus = _EndpointStatus | java.lang.String
  type EndpointSummaryList = js.Array[EndpointSummary]
  type EntityDescription = java.lang.String
  type EntityName = java.lang.String
  type EnvironmentKey = java.lang.String
  type EnvironmentMap = org.scalablytyped.runtime.StringDictionary[EnvironmentValue]
  type EnvironmentValue = java.lang.String
  type FailureReason = java.lang.String
  type FilterList = js.Array[Filter]
  type FilterValue = java.lang.String
  type FinalMetricDataList = js.Array[MetricData]
  type Float = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TENSORFLOW
    - awsDashSdkLib.awsDashSdkLibStrings.MXNET
    - awsDashSdkLib.awsDashSdkLibStrings.ONNX
    - awsDashSdkLib.awsDashSdkLibStrings.PYTORCH
    - awsDashSdkLib.awsDashSdkLibStrings.XGBOOST
    - java.lang.String
  */
  type Framework = _Framework | java.lang.String
  type GitConfigUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Auto
    - awsDashSdkLib.awsDashSdkLibStrings.Linear
    - awsDashSdkLib.awsDashSdkLibStrings.Logarithmic
    - awsDashSdkLib.awsDashSdkLibStrings.ReverseLogarithmic
    - java.lang.String
  */
  type HyperParameterScalingType = _HyperParameterScalingType | java.lang.String
  type HyperParameterSpecifications = js.Array[HyperParameterSpecification]
  type HyperParameterTrainingJobSummaries = js.Array[HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = java.lang.String
  type HyperParameterTuningJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Maximize
    - awsDashSdkLib.awsDashSdkLibStrings.Minimize
    - java.lang.String
  */
  type HyperParameterTuningJobObjectiveType = _HyperParameterTuningJobObjectiveType | java.lang.String
  type HyperParameterTuningJobObjectives = js.Array[HyperParameterTuningJobObjective]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - java.lang.String
  */
  type HyperParameterTuningJobSortByOptions = _HyperParameterTuningJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - awsDashSdkLib.awsDashSdkLibStrings.Stopping
    - java.lang.String
  */
  type HyperParameterTuningJobStatus = _HyperParameterTuningJobStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Bayesian
    - awsDashSdkLib.awsDashSdkLibStrings.Random
    - java.lang.String
  */
  type HyperParameterTuningJobStrategyType = _HyperParameterTuningJobStrategyType | java.lang.String
  type HyperParameterTuningJobSummaries = js.Array[HyperParameterTuningJobSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.IdenticalDataAndAlgorithm
    - awsDashSdkLib.awsDashSdkLibStrings.TransferLearning
    - java.lang.String
  */
  type HyperParameterTuningJobWarmStartType = _HyperParameterTuningJobWarmStartType | java.lang.String
  type HyperParameters = org.scalablytyped.runtime.StringDictionary[ParameterValue]
  type Image = java.lang.String
  type ImageDigest = java.lang.String
  type InputDataConfig = js.Array[Channel]
  type InputModes = js.Array[TrainingInputMode]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt3DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt3DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt3DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOT9xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5dDOT18xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge
    - java.lang.String
  */
  type InstanceType = _InstanceType | java.lang.String
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type JobReferenceCode = java.lang.String
  type JobReferenceCodeContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Input
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - java.lang.String
  */
  type JoinSource = _JoinSource | java.lang.String
  type JsonPath = java.lang.String
  type KmsKeyId = java.lang.String
  type LabelAttributeName = java.lang.String
  type LabelCounter = scala.Double
  type LabelingJobAlgorithmSpecificationArn = java.lang.String
  type LabelingJobArn = java.lang.String
  type LabelingJobForWorkteamSummaryList = js.Array[LabelingJobForWorkteamSummary]
  type LabelingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Stopping
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - java.lang.String
  */
  type LabelingJobStatus = _LabelingJobStatus | java.lang.String
  type LabelingJobSummaryList = js.Array[LabelingJobSummary]
  type LambdaFunctionArn = java.lang.String
  type LastModifiedTime = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - java.lang.String
  */
  type ListCompilationJobsSortBy = _ListCompilationJobsSortBy | java.lang.String
  type ListLabelingJobsForWorkteamSortByOptions = awsDashSdkLib.awsDashSdkLibStrings.CreationTime | java.lang.String
  type ListTagsMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreateDate
    - java.lang.String
  */
  type ListWorkteamsSortByOptions = _ListWorkteamsSortByOptions | java.lang.String
  type MaxConcurrentTaskCount = scala.Double
  type MaxConcurrentTransforms = scala.Double
  type MaxHumanLabeledObjectCount = scala.Double
  type MaxNumberOfTrainingJobs = scala.Double
  type MaxParallelTrainingJobs = scala.Double
  type MaxPayloadInMB = scala.Double
  type MaxPercentageOfInputDatasetLabeled = scala.Double
  type MaxResults = scala.Double
  type MaxRuntimeInSeconds = scala.Double
  type MemberDefinitions = js.Array[MemberDefinition]
  type MetricDefinitionList = js.Array[MetricDefinition]
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = scala.Double
  type ModelArn = java.lang.String
  type ModelName = java.lang.String
  type ModelNameContains = java.lang.String
  type ModelPackageArn = java.lang.String
  type ModelPackageContainerDefinitionList = js.Array[ModelPackageContainerDefinition]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - java.lang.String
  */
  type ModelPackageSortBy = _ModelPackageSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - java.lang.String
  */
  type ModelPackageStatus = _ModelPackageStatus | java.lang.String
  type ModelPackageStatusItemList = js.Array[ModelPackageStatusItem]
  type ModelPackageSummaryList = js.Array[ModelPackageSummary]
  type ModelPackageValidationProfiles = js.Array[ModelPackageValidationProfile]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - java.lang.String
  */
  type ModelSortKey = _ModelSortKey | java.lang.String
  type ModelSummaryList = js.Array[ModelSummary]
  type NameContains = java.lang.String
  type NestedFiltersList = js.Array[NestedFilters]
  type NetworkInterfaceId = java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTxlarge
    - java.lang.String
  */
  type NotebookInstanceAcceleratorType = _NotebookInstanceAcceleratorType | java.lang.String
  type NotebookInstanceAcceleratorTypes = js.Array[NotebookInstanceAcceleratorType]
  type NotebookInstanceArn = java.lang.String
  type NotebookInstanceLifecycleConfigArn = java.lang.String
  type NotebookInstanceLifecycleConfigContent = java.lang.String
  type NotebookInstanceLifecycleConfigList = js.Array[NotebookInstanceLifecycleHook]
  type NotebookInstanceLifecycleConfigName = java.lang.String
  type NotebookInstanceLifecycleConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - awsDashSdkLib.awsDashSdkLibStrings.LastModifiedTime
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortKey = _NotebookInstanceLifecycleConfigSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Ascending
    - awsDashSdkLib.awsDashSdkLibStrings.Descending
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortOrder = _NotebookInstanceLifecycleConfigSortOrder | java.lang.String
  type NotebookInstanceLifecycleConfigSummaryList = js.Array[NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName = java.lang.String
  type NotebookInstanceNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - java.lang.String
  */
  type NotebookInstanceSortKey = _NotebookInstanceSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Ascending
    - awsDashSdkLib.awsDashSdkLibStrings.Descending
    - java.lang.String
  */
  type NotebookInstanceSortOrder = _NotebookInstanceSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InService
    - awsDashSdkLib.awsDashSdkLibStrings.Stopping
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Updating
    - java.lang.String
  */
  type NotebookInstanceStatus = _NotebookInstanceStatus | java.lang.String
  type NotebookInstanceSummaryList = js.Array[NotebookInstanceSummary]
  type NotebookInstanceUrl = java.lang.String
  type NotebookInstanceVolumeSizeInGB = scala.Double
  type NotificationTopicArn = java.lang.String
  type NumberOfHumanWorkersPerDataObject = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type ObjectiveStatus = _ObjectiveStatus | java.lang.String
  type ObjectiveStatusCounter = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Equals
    - awsDashSdkLib.awsDashSdkLibStrings.NotEquals
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThan
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThanOrEqualTo
    - awsDashSdkLib.awsDashSdkLibStrings.LessThan
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanOrEqualTo
    - awsDashSdkLib.awsDashSdkLibStrings.Contains
    - java.lang.String
  */
  type Operator = _Operator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Ascending
    - awsDashSdkLib.awsDashSdkLibStrings.Descending
    - java.lang.String
  */
  type OrderKey = _OrderKey | java.lang.String
  type PaginationToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Integer
    - awsDashSdkLib.awsDashSdkLibStrings.Continuous
    - awsDashSdkLib.awsDashSdkLibStrings.Categorical
    - awsDashSdkLib.awsDashSdkLibStrings.FreeText
    - java.lang.String
  */
  type ParameterType = _ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValues = js.Array[ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[ParentHyperParameterTuningJob]
  type ProductId = java.lang.String
  type ProductListings = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTeia1DOTxlarge
    - java.lang.String
  */
  type ProductionVariantAcceleratorType = _ProductionVariantAcceleratorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTmedium
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTt2DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge
    - java.lang.String
  */
  type ProductionVariantInstanceType = _ProductionVariantInstanceType | java.lang.String
  type ProductionVariantList = js.Array[ProductionVariant]
  type ProductionVariantSummaryList = js.Array[ProductionVariantSummary]
  type PropertyNameHint = java.lang.String
  type PropertyNameSuggestionList = js.Array[PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes = js.Array[ProductionVariantInstanceType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - awsDashSdkLib.awsDashSdkLibStrings.RecordIO
    - java.lang.String
  */
  type RecordWrapper = _RecordWrapper | java.lang.String
  type RenderingErrorList = js.Array[RenderingError]
  type ResourceArn = java.lang.String
  type ResourcePropertyName = java.lang.String
  type ResourceType = awsDashSdkLib.awsDashSdkLibStrings.TrainingJob | java.lang.String
  type ResponseMIMEType = java.lang.String
  type ResponseMIMETypes = js.Array[ResponseMIMEType]
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type RootAccess = _RootAccess | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FullyReplicated
    - awsDashSdkLib.awsDashSdkLibStrings.ShardedByS3Key
    - java.lang.String
  */
  type S3DataDistribution = _S3DataDistribution | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ManifestFile
    - awsDashSdkLib.awsDashSdkLibStrings.S3Prefix
    - awsDashSdkLib.awsDashSdkLibStrings.AugmentedManifestFile
    - java.lang.String
  */
  type S3DataType = _S3DataType | java.lang.String
  type S3Uri = java.lang.String
  type SearchExpressionList = js.Array[SearchExpression]
  type SearchResultsList = js.Array[SearchRecord]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Ascending
    - awsDashSdkLib.awsDashSdkLibStrings.Descending
    - java.lang.String
  */
  type SearchSortOrder = _SearchSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Starting
    - awsDashSdkLib.awsDashSdkLibStrings.LaunchingMLInstances
    - awsDashSdkLib.awsDashSdkLibStrings.PreparingTrainingStack
    - awsDashSdkLib.awsDashSdkLibStrings.Downloading
    - awsDashSdkLib.awsDashSdkLibStrings.DownloadingTrainingImage
    - awsDashSdkLib.awsDashSdkLibStrings.Training
    - awsDashSdkLib.awsDashSdkLibStrings.Uploading
    - awsDashSdkLib.awsDashSdkLibStrings.Stopping
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - awsDashSdkLib.awsDashSdkLibStrings.MaxRuntimeExceeded
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type SecondaryStatus = _SecondaryStatus | java.lang.String
  type SecondaryStatusTransitions = js.Array[SecondaryStatusTransition]
  type SecretArn = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type Seed = scala.Double
  type SessionExpirationDurationInSeconds = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - java.lang.String
  */
  type SortBy = _SortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Ascending
    - awsDashSdkLib.awsDashSdkLibStrings.Descending
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  type SourceAlgorithmList = js.Array[SourceAlgorithm]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.None
    - awsDashSdkLib.awsDashSdkLibStrings.Line
    - awsDashSdkLib.awsDashSdkLibStrings.RecordIO
    - awsDashSdkLib.awsDashSdkLibStrings.TFRecord
    - java.lang.String
  */
  type SplitType = _SplitType | java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type String200 = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[SubnetId]
  type SubscribedWorkteams = js.Array[SubscribedWorkteam]
  type Success = scala.Boolean
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.lambda
    - awsDashSdkLib.awsDashSdkLibStrings.ml_m4
    - awsDashSdkLib.awsDashSdkLibStrings.ml_m5
    - awsDashSdkLib.awsDashSdkLibStrings.ml_c4
    - awsDashSdkLib.awsDashSdkLibStrings.ml_c5
    - awsDashSdkLib.awsDashSdkLibStrings.ml_p2
    - awsDashSdkLib.awsDashSdkLibStrings.ml_p3
    - awsDashSdkLib.awsDashSdkLibStrings.jetson_tx1
    - awsDashSdkLib.awsDashSdkLibStrings.jetson_tx2
    - awsDashSdkLib.awsDashSdkLibStrings.jetson_nano
    - awsDashSdkLib.awsDashSdkLibStrings.rasp3b
    - awsDashSdkLib.awsDashSdkLibStrings.deeplens
    - awsDashSdkLib.awsDashSdkLibStrings.rk3399
    - awsDashSdkLib.awsDashSdkLibStrings.rk3288
    - awsDashSdkLib.awsDashSdkLibStrings.sbe_c
    - java.lang.String
  */
  type TargetDevice = _TargetDevice | java.lang.String
  type TaskAvailabilityLifetimeInSeconds = scala.Double
  type TaskCount = scala.Double
  type TaskDescription = java.lang.String
  type TaskInput = java.lang.String
  type TaskKeyword = java.lang.String
  type TaskKeywords = js.Array[TaskKeyword]
  type TaskTimeLimitInSeconds = scala.Double
  type TaskTitle = java.lang.String
  type TemplateContent = java.lang.String
  type TenthFractionsOfACent = scala.Double
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pipe
    - awsDashSdkLib.awsDashSdkLibStrings.File
    - java.lang.String
  */
  type TrainingInputMode = _TrainingInputMode | java.lang.String
  type TrainingInstanceCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge
    - java.lang.String
  */
  type TrainingInstanceType = _TrainingInstanceType | java.lang.String
  type TrainingInstanceTypes = js.Array[TrainingInstanceType]
  type TrainingJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Off
    - awsDashSdkLib.awsDashSdkLibStrings.Auto
    - java.lang.String
  */
  type TrainingJobEarlyStoppingType = _TrainingJobEarlyStoppingType | java.lang.String
  type TrainingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Name
    - awsDashSdkLib.awsDashSdkLibStrings.CreationTime
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type TrainingJobSortByOptions = _TrainingJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Stopping
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - java.lang.String
  */
  type TrainingJobStatus = _TrainingJobStatus | java.lang.String
  type TrainingJobStatusCounter = scala.Double
  type TrainingJobSummaries = js.Array[TrainingJobSummary]
  type TransformEnvironmentKey = java.lang.String
  type TransformEnvironmentMap = org.scalablytyped.runtime.StringDictionary[TransformEnvironmentValue]
  type TransformEnvironmentValue = java.lang.String
  type TransformInstanceCount = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT10xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm4DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc4DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp2DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT8xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTp3DOT16xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT9xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTc5DOT18xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOTxlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT2xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT4xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT12xlarge
    - awsDashSdkLib.awsDashSdkLibStrings.mlDOTm5DOT24xlarge
    - java.lang.String
  */
  type TransformInstanceType = _TransformInstanceType | java.lang.String
  type TransformInstanceTypes = js.Array[TransformInstanceType]
  type TransformJobArn = java.lang.String
  type TransformJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Stopping
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - java.lang.String
  */
  type TransformJobStatus = _TransformJobStatus | java.lang.String
  type TransformJobSummaries = js.Array[TransformJobSummary]
  type Url = java.lang.String
  type VariantName = java.lang.String
  type VariantWeight = scala.Double
  type VolumeSizeInGB = scala.Double
  type VpcSecurityGroupIds = js.Array[SecurityGroupId]
  type WorkteamArn = java.lang.String
  type WorkteamName = java.lang.String
  type Workteams = js.Array[Workteam]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-07-24`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
