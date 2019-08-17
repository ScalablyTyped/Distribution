package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsSagemakerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type Accept = java.lang.String
  type AccountId = java.lang.String
  type AdditionalCodeRepositoryNamesOrUrls = js.Array[CodeRepositoryNameOrUrl]
  type AlgorithmArn = java.lang.String
  type AlgorithmImage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type AlgorithmSortBy = _AlgorithmSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - java.lang.String
  */
  type AlgorithmStatus = _AlgorithmStatus | java.lang.String
  type AlgorithmStatusItemList = js.Array[AlgorithmStatusItem]
  type AlgorithmSummaryList = js.Array[AlgorithmSummary]
  type AlgorithmValidationProfiles = js.Array[AlgorithmValidationProfile]
  type ArnOrName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None
    - typings.awsDashSdk.awsDashSdkStrings.Line
    - java.lang.String
  */
  type AssemblyType = _AssemblyType | java.lang.String
  type AttributeName = java.lang.String
  type AttributeNames = js.Array[AttributeName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MultiRecord
    - typings.awsDashSdk.awsDashSdkStrings.SingleRecord
    - java.lang.String
  */
  type BatchStrategy = _BatchStrategy | java.lang.String
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.And
    - typings.awsDashSdk.awsDashSdkStrings.Or
    - java.lang.String
  */
  type BooleanOperator = _BooleanOperator | java.lang.String
  type Branch = java.lang.String
  type CategoricalParameterRanges = js.Array[CategoricalParameterRange]
  type Cents = Double
  type CertifyForMarketplace = scala.Boolean
  type ChannelName = java.lang.String
  type ChannelSpecifications = js.Array[ChannelSpecification]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CodeRepositoryArn = java.lang.String
  type CodeRepositoryContains = java.lang.String
  type CodeRepositoryNameContains = java.lang.String
  type CodeRepositoryNameOrUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type CodeRepositorySortBy = _CodeRepositorySortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending
    - typings.awsDashSdk.awsDashSdkStrings.Descending
    - java.lang.String
  */
  type CodeRepositorySortOrder = _CodeRepositorySortOrder | java.lang.String
  type CodeRepositorySummaryList = js.Array[CodeRepositorySummary]
  type CognitoClientId = java.lang.String
  type CognitoUserGroup = java.lang.String
  type CognitoUserPool = java.lang.String
  type CompilationJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.INPROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.STARTING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPING
    - typings.awsDashSdk.awsDashSdkStrings.STOPPED
    - java.lang.String
  */
  type CompilationJobStatus = _CompilationJobStatus | java.lang.String
  type CompilationJobSummaries = js.Array[CompilationJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None
    - typings.awsDashSdk.awsDashSdkStrings.Gzip
    - java.lang.String
  */
  type CompressionType = _CompressionType | java.lang.String
  type CompressionTypes = js.Array[CompressionType]
  type ContainerDefinitionList = js.Array[ContainerDefinition]
  type ContainerHostname = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FreeOfPersonallyIdentifiableInformation
    - typings.awsDashSdk.awsDashSdkStrings.FreeOfAdultContent
    - java.lang.String
  */
  type ContentClassifier = _ContentClassifier | java.lang.String
  type ContentClassifiers = js.Array[ContentClassifier]
  type ContentType = java.lang.String
  type ContentTypes = js.Array[ContentType]
  type ContinuousParameterRanges = js.Array[ContinuousParameterRange]
  type CreationTime = Date
  type DataInputConfig = java.lang.String
  type DeployedImages = js.Array[DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[DesiredWeightAndCapacity]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NotStarted
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type DetailedAlgorithmStatus = _DetailedAlgorithmStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NotStarted
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type DetailedModelPackageStatus = _DetailedModelPackageStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled
    - typings.awsDashSdk.awsDashSdkStrings.Disabled
    - java.lang.String
  */
  type DirectInternetAccess = _DirectInternetAccess | java.lang.String
  type DisassociateAdditionalCodeRepositories = scala.Boolean
  type DisassociateDefaultCodeRepository = scala.Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = scala.Boolean
  type DisassociateNotebookInstanceLifecycleConfig = scala.Boolean
  type Dollars = Double
  type EndpointArn = java.lang.String
  type EndpointConfigArn = java.lang.String
  type EndpointConfigName = java.lang.String
  type EndpointConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type EndpointConfigSortKey = _EndpointConfigSortKey | java.lang.String
  type EndpointConfigSummaryList = js.Array[EndpointConfigSummary]
  type EndpointName = java.lang.String
  type EndpointNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - java.lang.String
  */
  type EndpointSortKey = _EndpointSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OutOfService
    - typings.awsDashSdk.awsDashSdkStrings.Creating
    - typings.awsDashSdk.awsDashSdkStrings.Updating
    - typings.awsDashSdk.awsDashSdkStrings.SystemUpdating
    - typings.awsDashSdk.awsDashSdkStrings.RollingBack
    - typings.awsDashSdk.awsDashSdkStrings.InService
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type EndpointStatus = _EndpointStatus | java.lang.String
  type EndpointSummaryList = js.Array[EndpointSummary]
  type EntityDescription = java.lang.String
  type EntityName = java.lang.String
  type EnvironmentKey = java.lang.String
  type EnvironmentMap = StringDictionary[EnvironmentValue]
  type EnvironmentValue = java.lang.String
  type FailureReason = java.lang.String
  type FilterList = js.Array[Filter]
  type FilterValue = java.lang.String
  type FinalMetricDataList = js.Array[MetricData]
  type Float = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TENSORFLOW
    - typings.awsDashSdk.awsDashSdkStrings.MXNET
    - typings.awsDashSdk.awsDashSdkStrings.ONNX
    - typings.awsDashSdk.awsDashSdkStrings.PYTORCH
    - typings.awsDashSdk.awsDashSdkStrings.XGBOOST
    - java.lang.String
  */
  type Framework = _Framework | java.lang.String
  type GitConfigUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Auto
    - typings.awsDashSdk.awsDashSdkStrings.Linear
    - typings.awsDashSdk.awsDashSdkStrings.Logarithmic
    - typings.awsDashSdk.awsDashSdkStrings.ReverseLogarithmic
    - java.lang.String
  */
  type HyperParameterScalingType = _HyperParameterScalingType | java.lang.String
  type HyperParameterSpecifications = js.Array[HyperParameterSpecification]
  type HyperParameterTrainingJobSummaries = js.Array[HyperParameterTrainingJobSummary]
  type HyperParameterTuningJobArn = java.lang.String
  type HyperParameterTuningJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Maximize
    - typings.awsDashSdk.awsDashSdkStrings.Minimize
    - java.lang.String
  */
  type HyperParameterTuningJobObjectiveType = _HyperParameterTuningJobObjectiveType | java.lang.String
  type HyperParameterTuningJobObjectives = js.Array[HyperParameterTuningJobObjective]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type HyperParameterTuningJobSortByOptions = _HyperParameterTuningJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Stopped
    - typings.awsDashSdk.awsDashSdkStrings.Stopping
    - java.lang.String
  */
  type HyperParameterTuningJobStatus = _HyperParameterTuningJobStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Bayesian
    - typings.awsDashSdk.awsDashSdkStrings.Random
    - java.lang.String
  */
  type HyperParameterTuningJobStrategyType = _HyperParameterTuningJobStrategyType | java.lang.String
  type HyperParameterTuningJobSummaries = js.Array[HyperParameterTuningJobSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.IdenticalDataAndAlgorithm
    - typings.awsDashSdk.awsDashSdkStrings.TransferLearning
    - java.lang.String
  */
  type HyperParameterTuningJobWarmStartType = _HyperParameterTuningJobWarmStartType | java.lang.String
  type HyperParameters = StringDictionary[ParameterValue]
  type Image = java.lang.String
  type ImageDigest = java.lang.String
  type InputDataConfig = js.Array[Channel]
  type InputModes = js.Array[TrainingInputMode]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt2DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt2DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt2DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt3DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt3DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt3DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5dDOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5dDOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5dDOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5dDOT9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5dDOT18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT16xlarge
    - java.lang.String
  */
  type InstanceType = _InstanceType | java.lang.String
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type JobReferenceCode = java.lang.String
  type JobReferenceCodeContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Input
    - typings.awsDashSdk.awsDashSdkStrings.None
    - java.lang.String
  */
  type JoinSource = _JoinSource | java.lang.String
  type JsonPath = java.lang.String
  type KmsKeyId = java.lang.String
  type LabelAttributeName = java.lang.String
  type LabelCounter = Double
  type LabelingJobAlgorithmSpecificationArn = java.lang.String
  type LabelingJobArn = java.lang.String
  type LabelingJobForWorkteamSummaryList = js.Array[LabelingJobForWorkteamSummary]
  type LabelingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Stopping
    - typings.awsDashSdk.awsDashSdkStrings.Stopped
    - java.lang.String
  */
  type LabelingJobStatus = _LabelingJobStatus | java.lang.String
  type LabelingJobSummaryList = js.Array[LabelingJobSummary]
  type LambdaFunctionArn = java.lang.String
  type LastModifiedTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - java.lang.String
  */
  type ListCompilationJobsSortBy = _ListCompilationJobsSortBy | java.lang.String
  type ListLabelingJobsForWorkteamSortByOptions = typings.awsDashSdk.awsDashSdkStrings.CreationTime | java.lang.String
  type ListTagsMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreateDate
    - java.lang.String
  */
  type ListWorkteamsSortByOptions = _ListWorkteamsSortByOptions | java.lang.String
  type MaxConcurrentTaskCount = Double
  type MaxConcurrentTransforms = Double
  type MaxHumanLabeledObjectCount = Double
  type MaxNumberOfTrainingJobs = Double
  type MaxParallelTrainingJobs = Double
  type MaxPayloadInMB = Double
  type MaxPercentageOfInputDatasetLabeled = Double
  type MaxResults = Double
  type MaxRuntimeInSeconds = Double
  type MemberDefinitions = js.Array[MemberDefinition]
  type MetricDefinitionList = js.Array[MetricDefinition]
  type MetricName = java.lang.String
  type MetricRegex = java.lang.String
  type MetricValue = Double
  type ModelArn = java.lang.String
  type ModelName = java.lang.String
  type ModelNameContains = java.lang.String
  type ModelPackageArn = java.lang.String
  type ModelPackageContainerDefinitionList = js.Array[ModelPackageContainerDefinition]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelPackageSortBy = _ModelPackageSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - java.lang.String
  */
  type ModelPackageStatus = _ModelPackageStatus | java.lang.String
  type ModelPackageStatusItemList = js.Array[ModelPackageStatusItem]
  type ModelPackageSummaryList = js.Array[ModelPackageSummary]
  type ModelPackageValidationProfiles = js.Array[ModelPackageValidationProfile]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelSortKey = _ModelSortKey | java.lang.String
  type ModelSummaryList = js.Array[ModelSummary]
  type NameContains = java.lang.String
  type NestedFiltersList = js.Array[NestedFilters]
  type NetworkInterfaceId = java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTeia1DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTeia1DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTeia1DOTxlarge
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
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortKey = _NotebookInstanceLifecycleConfigSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending
    - typings.awsDashSdk.awsDashSdkStrings.Descending
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortOrder = _NotebookInstanceLifecycleConfigSortOrder | java.lang.String
  type NotebookInstanceLifecycleConfigSummaryList = js.Array[NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName = java.lang.String
  type NotebookInstanceNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - java.lang.String
  */
  type NotebookInstanceSortKey = _NotebookInstanceSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending
    - typings.awsDashSdk.awsDashSdkStrings.Descending
    - java.lang.String
  */
  type NotebookInstanceSortOrder = _NotebookInstanceSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.InService
    - typings.awsDashSdk.awsDashSdkStrings.Stopping
    - typings.awsDashSdk.awsDashSdkStrings.Stopped
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Deleting
    - typings.awsDashSdk.awsDashSdkStrings.Updating
    - java.lang.String
  */
  type NotebookInstanceStatus = _NotebookInstanceStatus | java.lang.String
  type NotebookInstanceSummaryList = js.Array[NotebookInstanceSummary]
  type NotebookInstanceUrl = java.lang.String
  type NotebookInstanceVolumeSizeInGB = Double
  type NotificationTopicArn = java.lang.String
  type NumberOfHumanWorkersPerDataObject = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type ObjectiveStatus = _ObjectiveStatus | java.lang.String
  type ObjectiveStatusCounter = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Equals
    - typings.awsDashSdk.awsDashSdkStrings.NotEquals
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThan
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanOrEqualTo
    - typings.awsDashSdk.awsDashSdkStrings.LessThan
    - typings.awsDashSdk.awsDashSdkStrings.LessThanOrEqualTo
    - typings.awsDashSdk.awsDashSdkStrings.Contains
    - java.lang.String
  */
  type Operator = _Operator | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending
    - typings.awsDashSdk.awsDashSdkStrings.Descending
    - java.lang.String
  */
  type OrderKey = _OrderKey | java.lang.String
  type PaginationToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Integer
    - typings.awsDashSdk.awsDashSdkStrings.Continuous
    - typings.awsDashSdk.awsDashSdkStrings.Categorical
    - typings.awsDashSdk.awsDashSdkStrings.FreeText
    - java.lang.String
  */
  type ParameterType = _ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValues = js.Array[ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[ParentHyperParameterTuningJob]
  type ProductId = java.lang.String
  type ProductListings = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTeia1DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTeia1DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTeia1DOTxlarge
    - java.lang.String
  */
  type ProductionVariantAcceleratorType = _ProductionVariantAcceleratorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt2DOTmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt2DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTt2DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT18xlarge
    - java.lang.String
  */
  type ProductionVariantInstanceType = _ProductionVariantInstanceType | java.lang.String
  type ProductionVariantList = js.Array[ProductionVariant]
  type ProductionVariantSummaryList = js.Array[ProductionVariantSummary]
  type PropertyNameHint = java.lang.String
  type PropertyNameSuggestionList = js.Array[PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes = js.Array[ProductionVariantInstanceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None
    - typings.awsDashSdk.awsDashSdkStrings.RecordIO
    - java.lang.String
  */
  type RecordWrapper = _RecordWrapper | java.lang.String
  type RenderingErrorList = js.Array[RenderingError]
  type ResourceArn = java.lang.String
  type ResourcePropertyName = java.lang.String
  type ResourceType = typings.awsDashSdk.awsDashSdkStrings.TrainingJob | java.lang.String
  type ResponseMIMEType = java.lang.String
  type ResponseMIMETypes = js.Array[ResponseMIMEType]
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled
    - typings.awsDashSdk.awsDashSdkStrings.Disabled
    - java.lang.String
  */
  type RootAccess = _RootAccess | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FullyReplicated
    - typings.awsDashSdk.awsDashSdkStrings.ShardedByS3Key
    - java.lang.String
  */
  type S3DataDistribution = _S3DataDistribution | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ManifestFile
    - typings.awsDashSdk.awsDashSdkStrings.S3Prefix
    - typings.awsDashSdk.awsDashSdkStrings.AugmentedManifestFile
    - java.lang.String
  */
  type S3DataType = _S3DataType | java.lang.String
  type S3Uri = java.lang.String
  type SearchExpressionList = js.Array[SearchExpression]
  type SearchResultsList = js.Array[SearchRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending
    - typings.awsDashSdk.awsDashSdkStrings.Descending
    - java.lang.String
  */
  type SearchSortOrder = _SearchSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Starting
    - typings.awsDashSdk.awsDashSdkStrings.LaunchingMLInstances
    - typings.awsDashSdk.awsDashSdkStrings.PreparingTrainingStack
    - typings.awsDashSdk.awsDashSdkStrings.Downloading
    - typings.awsDashSdk.awsDashSdkStrings.DownloadingTrainingImage
    - typings.awsDashSdk.awsDashSdkStrings.Training
    - typings.awsDashSdk.awsDashSdkStrings.Uploading
    - typings.awsDashSdk.awsDashSdkStrings.Stopping
    - typings.awsDashSdk.awsDashSdkStrings.Stopped
    - typings.awsDashSdk.awsDashSdkStrings.MaxRuntimeExceeded
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type SecondaryStatus = _SecondaryStatus | java.lang.String
  type SecondaryStatusTransitions = js.Array[SecondaryStatusTransition]
  type SecretArn = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type Seed = Double
  type SessionExpirationDurationInSeconds = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - java.lang.String
  */
  type SortBy = _SortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending
    - typings.awsDashSdk.awsDashSdkStrings.Descending
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  type SourceAlgorithmList = js.Array[SourceAlgorithm]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None
    - typings.awsDashSdk.awsDashSdkStrings.Line
    - typings.awsDashSdk.awsDashSdkStrings.RecordIO
    - typings.awsDashSdk.awsDashSdkStrings.TFRecord
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
    - typings.awsDashSdk.awsDashSdkStrings.lambda
    - typings.awsDashSdk.awsDashSdkStrings.ml_m4
    - typings.awsDashSdk.awsDashSdkStrings.ml_m5
    - typings.awsDashSdk.awsDashSdkStrings.ml_c4
    - typings.awsDashSdk.awsDashSdkStrings.ml_c5
    - typings.awsDashSdk.awsDashSdkStrings.ml_p2
    - typings.awsDashSdk.awsDashSdkStrings.ml_p3
    - typings.awsDashSdk.awsDashSdkStrings.jetson_tx1
    - typings.awsDashSdk.awsDashSdkStrings.jetson_tx2
    - typings.awsDashSdk.awsDashSdkStrings.jetson_nano
    - typings.awsDashSdk.awsDashSdkStrings.rasp3b
    - typings.awsDashSdk.awsDashSdkStrings.deeplens
    - typings.awsDashSdk.awsDashSdkStrings.rk3399
    - typings.awsDashSdk.awsDashSdkStrings.rk3288
    - typings.awsDashSdk.awsDashSdkStrings.sbe_c
    - java.lang.String
  */
  type TargetDevice = _TargetDevice | java.lang.String
  type TaskAvailabilityLifetimeInSeconds = Double
  type TaskCount = Double
  type TaskDescription = java.lang.String
  type TaskInput = java.lang.String
  type TaskKeyword = java.lang.String
  type TaskKeywords = js.Array[TaskKeyword]
  type TaskTimeLimitInSeconds = Double
  type TaskTitle = java.lang.String
  type TemplateContent = java.lang.String
  type TenthFractionsOfACent = Double
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pipe
    - typings.awsDashSdk.awsDashSdkStrings.File
    - java.lang.String
  */
  type TrainingInputMode = _TrainingInputMode | java.lang.String
  type TrainingInstanceCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT18xlarge
    - java.lang.String
  */
  type TrainingInstanceType = _TrainingInstanceType | java.lang.String
  type TrainingInstanceTypes = js.Array[TrainingInstanceType]
  type TrainingJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Off
    - typings.awsDashSdk.awsDashSdkStrings.Auto
    - java.lang.String
  */
  type TrainingJobEarlyStoppingType = _TrainingJobEarlyStoppingType | java.lang.String
  type TrainingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status
    - typings.awsDashSdk.awsDashSdkStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type TrainingJobSortByOptions = _TrainingJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Stopping
    - typings.awsDashSdk.awsDashSdkStrings.Stopped
    - java.lang.String
  */
  type TrainingJobStatus = _TrainingJobStatus | java.lang.String
  type TrainingJobStatusCounter = Double
  type TrainingJobSummaries = js.Array[TrainingJobSummary]
  type TransformEnvironmentKey = java.lang.String
  type TransformEnvironmentMap = StringDictionary[TransformEnvironmentValue]
  type TransformEnvironmentValue = java.lang.String
  type TransformInstanceCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm4DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc4DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp2DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTp3DOT16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTc5DOT18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOTlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOTxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDOTm5DOT24xlarge
    - java.lang.String
  */
  type TransformInstanceType = _TransformInstanceType | java.lang.String
  type TransformInstanceTypes = js.Array[TransformInstanceType]
  type TransformJobArn = java.lang.String
  type TransformJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Stopping
    - typings.awsDashSdk.awsDashSdkStrings.Stopped
    - java.lang.String
  */
  type TransformJobStatus = _TransformJobStatus | java.lang.String
  type TransformJobSummaries = js.Array[TransformJobSummary]
  type Url = java.lang.String
  type VariantName = java.lang.String
  type VariantWeight = Double
  type VolumeSizeInGB = Double
  type VpcSecurityGroupIds = js.Array[SecurityGroupId]
  type WorkteamArn = java.lang.String
  type WorkteamName = java.lang.String
  type Workteams = js.Array[Workteam]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-07-24`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
