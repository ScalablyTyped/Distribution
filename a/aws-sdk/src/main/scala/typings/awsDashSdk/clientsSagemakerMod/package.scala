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
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type AlgorithmSortBy = _AlgorithmSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - java.lang.String
  */
  type AlgorithmStatus = _AlgorithmStatus | java.lang.String
  type AlgorithmStatusItemList = js.Array[AlgorithmStatusItem]
  type AlgorithmSummaryList = js.Array[AlgorithmSummary]
  type AlgorithmValidationProfiles = js.Array[AlgorithmValidationProfile]
  type AppArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.system__
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotmicro
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotsmall
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot16xlarge
    - java.lang.String
  */
  type AppInstanceType = _AppInstanceType | java.lang.String
  type AppList = js.Array[AppDetails]
  type AppName = java.lang.String
  type AppSortKey = typings.awsDashSdk.awsDashSdkStrings.CreationTime | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.InService
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - java.lang.String
  */
  type AppStatus = _AppStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.JupyterServer
    - typings.awsDashSdk.awsDashSdkStrings.KernelGateway
    - typings.awsDashSdk.awsDashSdkStrings.TensorBoard
    - java.lang.String
  */
  type AppType = _AppType | java.lang.String
  type ArnOrName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None_
    - typings.awsDashSdk.awsDashSdkStrings.Line_
    - java.lang.String
  */
  type AssemblyType = _AssemblyType | java.lang.String
  type AttributeName = java.lang.String
  type AttributeNames = js.Array[AttributeName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SSO
    - typings.awsDashSdk.awsDashSdkStrings.IAM
    - java.lang.String
  */
  type AuthMode = _AuthMode | java.lang.String
  type AutoMLCandidates = js.Array[AutoMLCandidate]
  type AutoMLContainerDefinitions = js.Array[AutoMLContainerDefinition]
  type AutoMLFailureReason = java.lang.String
  type AutoMLInputDataConfig = js.Array[AutoMLChannel]
  type AutoMLJobArn = java.lang.String
  type AutoMLJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Maximize
    - typings.awsDashSdk.awsDashSdkStrings.Minimize
    - java.lang.String
  */
  type AutoMLJobObjectiveType = _AutoMLJobObjectiveType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Starting_
    - typings.awsDashSdk.awsDashSdkStrings.AnalyzingData
    - typings.awsDashSdk.awsDashSdkStrings.FeatureEngineering
    - typings.awsDashSdk.awsDashSdkStrings.ModelTuning
    - typings.awsDashSdk.awsDashSdkStrings.MaxCandidatesReached
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - typings.awsDashSdk.awsDashSdkStrings.MaxAutoMLJobRuntimeReached
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.CandidateDefinitionsGenerated
    - java.lang.String
  */
  type AutoMLJobSecondaryStatus = _AutoMLJobSecondaryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - java.lang.String
  */
  type AutoMLJobStatus = _AutoMLJobStatus | java.lang.String
  type AutoMLJobSummaries = js.Array[AutoMLJobSummary]
  type AutoMLMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Accuracy
    - typings.awsDashSdk.awsDashSdkStrings.MSE
    - typings.awsDashSdk.awsDashSdkStrings.F1
    - typings.awsDashSdk.awsDashSdkStrings.F1macro
    - java.lang.String
  */
  type AutoMLMetricEnum = _AutoMLMetricEnum | java.lang.String
  type AutoMLNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ManifestFile
    - typings.awsDashSdk.awsDashSdkStrings.S3Prefix
    - java.lang.String
  */
  type AutoMLS3DataType = _AutoMLS3DataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - java.lang.String
  */
  type AutoMLSortBy = _AutoMLSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending_
    - typings.awsDashSdk.awsDashSdkStrings.Descending_
    - java.lang.String
  */
  type AutoMLSortOrder = _AutoMLSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWSSlashRekognitionSlashDetectModerationLabelsSlashImageSlashV3
    - typings.awsDashSdk.awsDashSdkStrings.AWSSlashTextractSlashAnalyzeDocumentSlashFormsSlashV1
    - java.lang.String
  */
  type AwsManagedHumanLoopRequestSource = _AwsManagedHumanLoopRequestSource | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.MultiRecord
    - typings.awsDashSdk.awsDashSdkStrings.SingleRecord
    - java.lang.String
  */
  type BatchStrategy = _BatchStrategy | java.lang.String
  type BillableTimeInSeconds = Double
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.And_
    - typings.awsDashSdk.awsDashSdkStrings.Or_
    - java.lang.String
  */
  type BooleanOperator = _BooleanOperator | java.lang.String
  type Branch = java.lang.String
  type CandidateDefinitionNotebookLocation = java.lang.String
  type CandidateName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - typings.awsDashSdk.awsDashSdkStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type CandidateSortBy = _CandidateSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - java.lang.String
  */
  type CandidateStatus = _CandidateStatus | java.lang.String
  type CandidateStepArn = java.lang.String
  type CandidateStepName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonSageMakerColonColonTrainingJob
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonSageMakerColonColonTransformJob
    - typings.awsDashSdk.awsDashSdkStrings.AWSColonColonSageMakerColonColonProcessingJob
    - java.lang.String
  */
  type CandidateStepType = _CandidateStepType | java.lang.String
  type CandidateSteps = js.Array[AutoMLCandidateStep]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Input_
    - typings.awsDashSdk.awsDashSdkStrings.Output_
    - java.lang.String
  */
  type CaptureMode = _CaptureMode | java.lang.String
  type CaptureOptionList = js.Array[CaptureOption]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Started_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - java.lang.String
  */
  type CaptureStatus = _CaptureStatus | java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type CodeRepositorySortBy = _CodeRepositorySortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending_
    - typings.awsDashSdk.awsDashSdkStrings.Descending_
    - java.lang.String
  */
  type CodeRepositorySortOrder = _CodeRepositorySortOrder | java.lang.String
  type CodeRepositorySummaryList = js.Array[CodeRepositorySummary]
  type CognitoClientId = java.lang.String
  type CognitoUserGroup = java.lang.String
  type CognitoUserPool = java.lang.String
  type CollectionConfigurations = js.Array[CollectionConfiguration]
  type CollectionName = java.lang.String
  type CollectionParameters = StringDictionary[ConfigValue]
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
    - typings.awsDashSdk.awsDashSdkStrings.None_
    - typings.awsDashSdk.awsDashSdkStrings.Gzip_
    - java.lang.String
  */
  type CompressionType = _CompressionType | java.lang.String
  type CompressionTypes = js.Array[CompressionType]
  type ConfigKey = java.lang.String
  type ConfigValue = java.lang.String
  type ContainerArgument = java.lang.String
  type ContainerArguments = js.Array[ContainerArgument]
  type ContainerDefinitionList = js.Array[ContainerDefinition]
  type ContainerEntrypoint = js.Array[ContainerEntrypointString]
  type ContainerEntrypointString = java.lang.String
  type ContainerHostname = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SingleModel
    - typings.awsDashSdk.awsDashSdkStrings.MultiModel
    - java.lang.String
  */
  type ContainerMode = _ContainerMode | java.lang.String
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
  type CsvContentType = java.lang.String
  type CsvContentTypes = js.Array[CsvContentType]
  type DataExplorationNotebookLocation = java.lang.String
  type DataInputConfig = java.lang.String
  type DebugRuleConfigurations = js.Array[DebugRuleConfiguration]
  type DebugRuleEvaluationStatuses = js.Array[DebugRuleEvaluationStatus]
  type DeployedImages = js.Array[DeployedImage]
  type DesiredWeightAndCapacityList = js.Array[DesiredWeightAndCapacity]
  type DestinationS3Uri = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NotStarted
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type DetailedAlgorithmStatus = _DetailedAlgorithmStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NotStarted
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type DetailedModelPackageStatus = _DetailedModelPackageStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type DirectInternetAccess = _DirectInternetAccess | java.lang.String
  type DirectoryPath = java.lang.String
  type DisassociateAdditionalCodeRepositories = scala.Boolean
  type DisassociateDefaultCodeRepository = scala.Boolean
  type DisassociateNotebookInstanceAcceleratorTypes = scala.Boolean
  type DisassociateNotebookInstanceLifecycleConfig = scala.Boolean
  type Dollars = Double
  type DomainArn = java.lang.String
  type DomainId = java.lang.String
  type DomainList = js.Array[DomainDetails]
  type DomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.InService
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - java.lang.String
  */
  type DomainStatus = _DomainStatus | java.lang.String
  type DoubleParameterValue = Double
  type EfsUid = java.lang.String
  type EnableCapture = scala.Boolean
  type EndpointArn = java.lang.String
  type EndpointConfigArn = java.lang.String
  type EndpointConfigName = java.lang.String
  type EndpointConfigNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type EndpointConfigSortKey = _EndpointConfigSortKey | java.lang.String
  type EndpointConfigSummaryList = js.Array[EndpointConfigSummary]
  type EndpointName = java.lang.String
  type EndpointNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - java.lang.String
  */
  type EndpointSortKey = _EndpointSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OutOfService
    - typings.awsDashSdk.awsDashSdkStrings.Creating_
    - typings.awsDashSdk.awsDashSdkStrings.Updating_
    - typings.awsDashSdk.awsDashSdkStrings.SystemUpdating
    - typings.awsDashSdk.awsDashSdkStrings.RollingBack
    - typings.awsDashSdk.awsDashSdkStrings.InService
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type EndpointStatus = _EndpointStatus | java.lang.String
  type EndpointSummaryList = js.Array[EndpointSummary]
  type EntityDescription = java.lang.String
  type EntityName = java.lang.String
  type EnvironmentArn = java.lang.String
  type EnvironmentKey = java.lang.String
  type EnvironmentMap = StringDictionary[EnvironmentValue]
  type EnvironmentValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.CompletedWithViolations
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - java.lang.String
  */
  type ExecutionStatus = _ExecutionStatus | java.lang.String
  type ExitMessage = java.lang.String
  type ExperimentArn = java.lang.String
  type ExperimentConfigName = java.lang.String
  type ExperimentDescription = java.lang.String
  type ExperimentEntityName = java.lang.String
  type ExperimentSourceArn = java.lang.String
  type ExperimentSummaries = js.Array[ExperimentSummary]
  type FailureReason = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.rw_
    - typings.awsDashSdk.awsDashSdkStrings.ro_
    - java.lang.String
  */
  type FileSystemAccessMode = _FileSystemAccessMode | java.lang.String
  type FileSystemId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.EFS
    - typings.awsDashSdk.awsDashSdkStrings.FSxLustre
    - java.lang.String
  */
  type FileSystemType = _FileSystemType | java.lang.String
  type FilterList = js.Array[Filter]
  type FilterValue = java.lang.String
  type FinalMetricDataList = js.Array[MetricData]
  type Float = Double
  type FlowDefinitionArn = java.lang.String
  type FlowDefinitionName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Initializing_
    - typings.awsDashSdk.awsDashSdkStrings.Active_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - java.lang.String
  */
  type FlowDefinitionStatus = _FlowDefinitionStatus | java.lang.String
  type FlowDefinitionSummaries = js.Array[FlowDefinitionSummary]
  type FlowDefinitionTaskAvailabilityLifetimeInSeconds = Double
  type FlowDefinitionTaskCount = Double
  type FlowDefinitionTaskDescription = java.lang.String
  type FlowDefinitionTaskKeyword = java.lang.String
  type FlowDefinitionTaskKeywords = js.Array[FlowDefinitionTaskKeyword]
  type FlowDefinitionTaskTimeLimitInSeconds = Double
  type FlowDefinitionTaskTitle = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TENSORFLOW
    - typings.awsDashSdk.awsDashSdkStrings.MXNET
    - typings.awsDashSdk.awsDashSdkStrings.ONNX
    - typings.awsDashSdk.awsDashSdkStrings.PYTORCH
    - typings.awsDashSdk.awsDashSdkStrings.XGBOOST
    - java.lang.String
  */
  type Framework = _Framework | java.lang.String
  type GenerateCandidateDefinitionsOnly = scala.Boolean
  type GitConfigUrl = java.lang.String
  type HookParameters = StringDictionary[ConfigValue]
  type HumanLoopActivationConditions = java.lang.String
  type HumanTaskUiArn = java.lang.String
  type HumanTaskUiName = java.lang.String
  type HumanTaskUiSummaries = js.Array[HumanTaskUiSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Auto_
    - typings.awsDashSdk.awsDashSdkStrings.Linear_
    - typings.awsDashSdk.awsDashSdkStrings.Logarithmic
    - typings.awsDashSdk.awsDashSdkStrings.ReverseLogarithmic
    - java.lang.String
  */
  type HyperParameterScalingType = _HyperParameterScalingType | java.lang.String
  type HyperParameterSpecifications = js.Array[HyperParameterSpecification]
  type HyperParameterTrainingJobDefinitionName = java.lang.String
  type HyperParameterTrainingJobDefinitions = js.Array[HyperParameterTrainingJobDefinition]
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
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type HyperParameterTuningJobSortByOptions = _HyperParameterTuningJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
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
  type ImageUri = java.lang.String
  type InputDataConfig = js.Array[Channel]
  type InputModes = js.Array[TrainingInputMode]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDott2Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDott2Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott2Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot16xlarge
    - java.lang.String
  */
  type InstanceType = _InstanceType | java.lang.String
  type IntegerParameterRanges = js.Array[IntegerParameterRange]
  type JobReferenceCode = java.lang.String
  type JobReferenceCodeContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Input_
    - typings.awsDashSdk.awsDashSdkStrings.None_
    - java.lang.String
  */
  type JoinSource = _JoinSource | java.lang.String
  type JsonContentType = java.lang.String
  type JsonContentTypes = js.Array[JsonContentType]
  type JsonPath = java.lang.String
  type KmsKeyId = java.lang.String
  type LabelAttributeName = java.lang.String
  type LabelCounter = Double
  type LabelingJobAlgorithmSpecificationArn = java.lang.String
  type LabelingJobArn = java.lang.String
  type LabelingJobForWorkteamSummaryList = js.Array[LabelingJobForWorkteamSummary]
  type LabelingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - java.lang.String
  */
  type LabelingJobStatus = _LabelingJobStatus | java.lang.String
  type LabelingJobSummaryList = js.Array[LabelingJobSummary]
  type LambdaFunctionArn = java.lang.String
  type LastModifiedTime = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - java.lang.String
  */
  type ListCompilationJobsSortBy = _ListCompilationJobsSortBy | java.lang.String
  type ListLabelingJobsForWorkteamSortByOptions = typings.awsDashSdk.awsDashSdkStrings.CreationTime | java.lang.String
  type ListTagsMaxResults = Double
  type ListTrialComponentKey256 = js.Array[TrialComponentKey256]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreateDate
    - java.lang.String
  */
  type ListWorkteamsSortByOptions = _ListWorkteamsSortByOptions | java.lang.String
  type MaxAutoMLJobRuntimeInSeconds = Double
  type MaxCandidates = Double
  type MaxConcurrentTaskCount = Double
  type MaxConcurrentTransforms = Double
  type MaxHumanLabeledObjectCount = Double
  type MaxNumberOfTrainingJobs = Double
  type MaxParallelTrainingJobs = Double
  type MaxPayloadInMB = Double
  type MaxPercentageOfInputDatasetLabeled = Double
  type MaxResults = Double
  type MaxRuntimeInSeconds = Double
  type MaxRuntimePerTrainingJobInSeconds = Double
  type MaxWaitTimeInSeconds = Double
  type MediaType = java.lang.String
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
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelPackageSortBy = _ModelPackageSortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - java.lang.String
  */
  type ModelPackageStatus = _ModelPackageStatus | java.lang.String
  type ModelPackageStatusItemList = js.Array[ModelPackageStatusItem]
  type ModelPackageSummaryList = js.Array[ModelPackageSummary]
  type ModelPackageValidationProfiles = js.Array[ModelPackageValidationProfile]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type ModelSortKey = _ModelSortKey | java.lang.String
  type ModelSummaryList = js.Array[ModelSummary]
  type MonitoringContainerArguments = js.Array[ContainerArgument]
  type MonitoringEnvironmentMap = StringDictionary[ProcessingEnvironmentValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.ScheduledTime
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - java.lang.String
  */
  type MonitoringExecutionSortKey = _MonitoringExecutionSortKey | java.lang.String
  type MonitoringExecutionSummaryList = js.Array[MonitoringExecutionSummary]
  type MonitoringInputs = js.Array[MonitoringInput]
  type MonitoringMaxRuntimeInSeconds = Double
  type MonitoringOutputs = js.Array[MonitoringOutput]
  type MonitoringS3Uri = java.lang.String
  type MonitoringScheduleArn = java.lang.String
  type MonitoringScheduleName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - java.lang.String
  */
  type MonitoringScheduleSortKey = _MonitoringScheduleSortKey | java.lang.String
  type MonitoringScheduleSummaryList = js.Array[MonitoringScheduleSummary]
  type NameContains = java.lang.String
  type NestedFiltersList = js.Array[NestedFilters]
  type NetworkInterfaceId = java.lang.String
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia1Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia1Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia1Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia2Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia2Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia2Dotxlarge
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
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortKey = _NotebookInstanceLifecycleConfigSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending_
    - typings.awsDashSdk.awsDashSdkStrings.Descending_
    - java.lang.String
  */
  type NotebookInstanceLifecycleConfigSortOrder = _NotebookInstanceLifecycleConfigSortOrder | java.lang.String
  type NotebookInstanceLifecycleConfigSummaryList = js.Array[NotebookInstanceLifecycleConfigSummary]
  type NotebookInstanceName = java.lang.String
  type NotebookInstanceNameContains = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - java.lang.String
  */
  type NotebookInstanceSortKey = _NotebookInstanceSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending_
    - typings.awsDashSdk.awsDashSdkStrings.Descending_
    - java.lang.String
  */
  type NotebookInstanceSortOrder = _NotebookInstanceSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.InService
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Updating_
    - java.lang.String
  */
  type NotebookInstanceStatus = _NotebookInstanceStatus | java.lang.String
  type NotebookInstanceSummaryList = js.Array[NotebookInstanceSummary]
  type NotebookInstanceUrl = java.lang.String
  type NotebookInstanceVolumeSizeInGB = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Allowed_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type NotebookOutputOption = _NotebookOutputOption | java.lang.String
  type NotificationTopicArn = java.lang.String
  type NumberOfHumanWorkersPerDataObject = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded_
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type ObjectiveStatus = _ObjectiveStatus | java.lang.String
  type ObjectiveStatusCounter = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Equals_
    - typings.awsDashSdk.awsDashSdkStrings.NotEquals
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThan
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanOrEqualTo
    - typings.awsDashSdk.awsDashSdkStrings.LessThan
    - typings.awsDashSdk.awsDashSdkStrings.LessThanOrEqualTo
    - typings.awsDashSdk.awsDashSdkStrings.Contains_
    - typings.awsDashSdk.awsDashSdkStrings.Exists
    - typings.awsDashSdk.awsDashSdkStrings.NotExists
    - java.lang.String
  */
  type Operator = _Operator | java.lang.String
  type OptionalDouble = Double
  type OptionalInteger = Double
  type OptionalVolumeSizeInGB = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending_
    - typings.awsDashSdk.awsDashSdkStrings.Descending_
    - java.lang.String
  */
  type OrderKey = _OrderKey | java.lang.String
  type PaginationToken = java.lang.String
  type ParameterKey = java.lang.String
  type ParameterName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Integer_
    - typings.awsDashSdk.awsDashSdkStrings.Continuous_
    - typings.awsDashSdk.awsDashSdkStrings.Categorical
    - typings.awsDashSdk.awsDashSdkStrings.FreeText
    - java.lang.String
  */
  type ParameterType = _ParameterType | java.lang.String
  type ParameterValue = java.lang.String
  type ParameterValues = js.Array[ParameterValue]
  type ParentHyperParameterTuningJobs = js.Array[ParentHyperParameterTuningJob]
  type Parents = js.Array[Parent]
  type PresignedDomainUrl = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BinaryClassification
    - typings.awsDashSdk.awsDashSdkStrings.MulticlassClassification
    - typings.awsDashSdk.awsDashSdkStrings.Regression_
    - java.lang.String
  */
  type ProblemType = _ProblemType | java.lang.String
  type ProcessingEnvironmentKey = java.lang.String
  type ProcessingEnvironmentMap = StringDictionary[ProcessingEnvironmentValue]
  type ProcessingEnvironmentValue = java.lang.String
  type ProcessingInputs = js.Array[ProcessingInput]
  type ProcessingInstanceCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot24xlarge
    - java.lang.String
  */
  type ProcessingInstanceType = _ProcessingInstanceType | java.lang.String
  type ProcessingJobArn = java.lang.String
  type ProcessingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - java.lang.String
  */
  type ProcessingJobStatus = _ProcessingJobStatus | java.lang.String
  type ProcessingJobSummaries = js.Array[ProcessingJobSummary]
  type ProcessingLocalPath = java.lang.String
  type ProcessingMaxRuntimeInSeconds = Double
  type ProcessingOutputs = js.Array[ProcessingOutput]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None_
    - typings.awsDashSdk.awsDashSdkStrings.Gzip_
    - java.lang.String
  */
  type ProcessingS3CompressionType = _ProcessingS3CompressionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.FullyReplicated
    - typings.awsDashSdk.awsDashSdkStrings.ShardedByS3Key
    - java.lang.String
  */
  type ProcessingS3DataDistributionType = _ProcessingS3DataDistributionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ManifestFile
    - typings.awsDashSdk.awsDashSdkStrings.S3Prefix
    - java.lang.String
  */
  type ProcessingS3DataType = _ProcessingS3DataType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pipe
    - typings.awsDashSdk.awsDashSdkStrings.File_
    - java.lang.String
  */
  type ProcessingS3InputMode = _ProcessingS3InputMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Continuous_
    - typings.awsDashSdk.awsDashSdkStrings.EndOfJob
    - java.lang.String
  */
  type ProcessingS3UploadMode = _ProcessingS3UploadMode | java.lang.String
  type ProcessingVolumeSizeInGB = Double
  type ProductId = java.lang.String
  type ProductListings = js.Array[String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia1Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia1Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia1Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia2Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia2Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDoteia2Dotxlarge
    - java.lang.String
  */
  type ProductionVariantAcceleratorType = _ProductionVariantAcceleratorType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDott2Dotmedium
    - typings.awsDashSdk.awsDashSdkStrings.mlDott2Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDott2Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5dDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5dDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5dDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5dDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5dDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5dDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5dDot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotg4dnDot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5dDotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5dDotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5dDot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5dDot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5dDot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotr5dDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotinf1Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotinf1Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotinf1Dot6xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotinf1Dot24xlarge
    - java.lang.String
  */
  type ProductionVariantInstanceType = _ProductionVariantInstanceType | java.lang.String
  type ProductionVariantList = js.Array[ProductionVariant]
  type ProductionVariantSummaryList = js.Array[ProductionVariantSummary]
  type PropertyNameHint = java.lang.String
  type PropertyNameSuggestionList = js.Array[PropertyNameSuggestion]
  type RealtimeInferenceInstanceTypes = js.Array[ProductionVariantInstanceType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None_
    - typings.awsDashSdk.awsDashSdkStrings.RecordIO
    - java.lang.String
  */
  type RecordWrapper = _RecordWrapper | java.lang.String
  type RenderingErrorList = js.Array[RenderingError]
  type ResourceArn = java.lang.String
  type ResourceId = java.lang.String
  type ResourcePropertyName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TrainingJob
    - typings.awsDashSdk.awsDashSdkStrings.Experiment
    - typings.awsDashSdk.awsDashSdkStrings.ExperimentTrial
    - typings.awsDashSdk.awsDashSdkStrings.ExperimentTrialComponent
    - java.lang.String
  */
  type ResourceType = _ResourceType | java.lang.String
  type ResponseMIMEType = java.lang.String
  type ResponseMIMETypes = js.Array[ResponseMIMEType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Retain_
    - typings.awsDashSdk.awsDashSdkStrings.Delete_
    - java.lang.String
  */
  type RetentionType = _RetentionType | java.lang.String
  type RoleArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type RootAccess = _RootAccess | java.lang.String
  type RuleConfigurationName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.NoIssuesFound
    - typings.awsDashSdk.awsDashSdkStrings.IssuesFound
    - typings.awsDashSdk.awsDashSdkStrings.Error_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - java.lang.String
  */
  type RuleEvaluationStatus = _RuleEvaluationStatus | java.lang.String
  type RuleParameters = StringDictionary[ConfigValue]
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
  type SamplingPercentage = Double
  type ScheduleExpression = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Scheduled_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - java.lang.String
  */
  type ScheduleStatus = _ScheduleStatus | java.lang.String
  type SearchExpressionList = js.Array[SearchExpression]
  type SearchResultsList = js.Array[SearchRecord]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending_
    - typings.awsDashSdk.awsDashSdkStrings.Descending_
    - java.lang.String
  */
  type SearchSortOrder = _SearchSortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Starting_
    - typings.awsDashSdk.awsDashSdkStrings.LaunchingMLInstances
    - typings.awsDashSdk.awsDashSdkStrings.PreparingTrainingStack
    - typings.awsDashSdk.awsDashSdkStrings.Downloading_
    - typings.awsDashSdk.awsDashSdkStrings.DownloadingTrainingImage
    - typings.awsDashSdk.awsDashSdkStrings.Training_
    - typings.awsDashSdk.awsDashSdkStrings.Uploading_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - typings.awsDashSdk.awsDashSdkStrings.MaxRuntimeExceeded
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Interrupted_
    - typings.awsDashSdk.awsDashSdkStrings.MaxWaitTimeExceeded
    - java.lang.String
  */
  type SecondaryStatus = _SecondaryStatus | java.lang.String
  type SecondaryStatusTransitions = js.Array[SecondaryStatusTransition]
  type SecretArn = java.lang.String
  type SecurityGroupId = java.lang.String
  type SecurityGroupIds = js.Array[SecurityGroupId]
  type Seed = Double
  type SessionExpirationDurationInSeconds = Double
  type SingleSignOnUserIdentifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - java.lang.String
  */
  type SortBy = _SortBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type SortExperimentsBy = _SortExperimentsBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Ascending_
    - typings.awsDashSdk.awsDashSdkStrings.Descending_
    - java.lang.String
  */
  type SortOrder = _SortOrder | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type SortTrialComponentsBy = _SortTrialComponentsBy | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - java.lang.String
  */
  type SortTrialsBy = _SortTrialsBy | java.lang.String
  type SourceAlgorithmList = js.Array[SourceAlgorithm]
  type SourceType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.None_
    - typings.awsDashSdk.awsDashSdkStrings.Line_
    - typings.awsDashSdk.awsDashSdkStrings.RecordIO
    - typings.awsDashSdk.awsDashSdkStrings.TFRecord
    - java.lang.String
  */
  type SplitType = _SplitType | java.lang.String
  type StatusDetails = java.lang.String
  type StatusMessage = java.lang.String
  type String = java.lang.String
  type String1024 = java.lang.String
  type String200 = java.lang.String
  type String256 = java.lang.String
  type StringParameterValue = java.lang.String
  type SubnetId = java.lang.String
  type Subnets = js.Array[SubnetId]
  type SubscribedWorkteams = js.Array[SubscribedWorkteam]
  type Success = scala.Boolean
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TargetAttributeName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.lambda__
    - typings.awsDashSdk.awsDashSdkStrings.ml_m4
    - typings.awsDashSdk.awsDashSdkStrings.ml_m5
    - typings.awsDashSdk.awsDashSdkStrings.ml_c4
    - typings.awsDashSdk.awsDashSdkStrings.ml_c5
    - typings.awsDashSdk.awsDashSdkStrings.ml_p2
    - typings.awsDashSdk.awsDashSdkStrings.ml_p3
    - typings.awsDashSdk.awsDashSdkStrings.ml_inf1
    - typings.awsDashSdk.awsDashSdkStrings.jetson_tx1
    - typings.awsDashSdk.awsDashSdkStrings.jetson_tx2
    - typings.awsDashSdk.awsDashSdkStrings.jetson_nano
    - typings.awsDashSdk.awsDashSdkStrings.rasp3b
    - typings.awsDashSdk.awsDashSdkStrings.deeplens
    - typings.awsDashSdk.awsDashSdkStrings.rk3399
    - typings.awsDashSdk.awsDashSdkStrings.rk3288
    - typings.awsDashSdk.awsDashSdkStrings.aisage
    - typings.awsDashSdk.awsDashSdkStrings.sbe_c
    - typings.awsDashSdk.awsDashSdkStrings.qcs605
    - typings.awsDashSdk.awsDashSdkStrings.qcs603
    - java.lang.String
  */
  type TargetDevice = _TargetDevice | java.lang.String
  type TargetObjectiveMetricValue = Double
  type TaskAvailabilityLifetimeInSeconds = Double
  type TaskCount = Double
  type TaskDescription = java.lang.String
  type TaskInput = java.lang.String
  type TaskKeyword = java.lang.String
  type TaskKeywords = js.Array[TaskKeyword]
  type TaskTimeLimitInSeconds = Double
  type TaskTitle = java.lang.String
  type TemplateContent = java.lang.String
  type TemplateContentSha256 = java.lang.String
  type TemplateUrl = java.lang.String
  type TenthFractionsOfACent = Double
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pipe
    - typings.awsDashSdk.awsDashSdkStrings.File_
    - java.lang.String
  */
  type TrainingInputMode = _TrainingInputMode | java.lang.String
  type TrainingInstanceCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3dnDot24xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot18xlarge
    - java.lang.String
  */
  type TrainingInstanceType = _TrainingInstanceType | java.lang.String
  type TrainingInstanceTypes = js.Array[TrainingInstanceType]
  type TrainingJobArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Off_
    - typings.awsDashSdk.awsDashSdkStrings.Auto_
    - java.lang.String
  */
  type TrainingJobEarlyStoppingType = _TrainingJobEarlyStoppingType | java.lang.String
  type TrainingJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Name_
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - typings.awsDashSdk.awsDashSdkStrings.FinalObjectiveMetricValue
    - java.lang.String
  */
  type TrainingJobSortByOptions = _TrainingJobSortByOptions | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - java.lang.String
  */
  type TrainingJobStatus = _TrainingJobStatus | java.lang.String
  type TrainingJobStatusCounter = Double
  type TrainingJobSummaries = js.Array[TrainingJobSummary]
  type TrainingTimeInSeconds = Double
  type TransformEnvironmentKey = java.lang.String
  type TransformEnvironmentMap = StringDictionary[TransformEnvironmentValue]
  type TransformEnvironmentValue = java.lang.String
  type TransformInstanceCount = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot10xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm4Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc4Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp2Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot8xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotp3Dot16xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot9xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotc5Dot18xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dotxlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot2xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot4xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot12xlarge
    - typings.awsDashSdk.awsDashSdkStrings.mlDotm5Dot24xlarge
    - java.lang.String
  */
  type TransformInstanceType = _TransformInstanceType | java.lang.String
  type TransformInstanceTypes = js.Array[TransformInstanceType]
  type TransformJobArn = java.lang.String
  type TransformJobName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - java.lang.String
  */
  type TransformJobStatus = _TransformJobStatus | java.lang.String
  type TransformJobSummaries = js.Array[TransformJobSummary]
  type TrialArn = java.lang.String
  type TrialComponentArn = java.lang.String
  type TrialComponentArtifactValue = java.lang.String
  type TrialComponentArtifacts = StringDictionary[TrialComponentArtifact]
  type TrialComponentKey256 = java.lang.String
  type TrialComponentKey64 = java.lang.String
  type TrialComponentMetricSummaries = js.Array[TrialComponentMetricSummary]
  type TrialComponentParameters = StringDictionary[TrialComponentParameterValue]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type TrialComponentPrimaryStatus = _TrialComponentPrimaryStatus | java.lang.String
  type TrialComponentSimpleSummaries = js.Array[TrialComponentSimpleSummary]
  type TrialComponentSourceArn = java.lang.String
  type TrialComponentStatusMessage = java.lang.String
  type TrialComponentSummaries = js.Array[TrialComponentSummary]
  type TrialSourceArn = java.lang.String
  type TrialSummaries = js.Array[TrialSummary]
  type Url = java.lang.String
  type UserProfileArn = java.lang.String
  type UserProfileList = js.Array[UserProfileDetails]
  type UserProfileName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CreationTime
    - typings.awsDashSdk.awsDashSdkStrings.LastModifiedTime
    - java.lang.String
  */
  type UserProfileSortKey = _UserProfileSortKey | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.InService
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - java.lang.String
  */
  type UserProfileStatus = _UserProfileStatus | java.lang.String
  type VariantName = java.lang.String
  type VariantWeight = Double
  type VolumeSizeInGB = Double
  type VpcId = java.lang.String
  type VpcSecurityGroupIds = js.Array[SecurityGroupId]
  type WorkteamArn = java.lang.String
  type WorkteamName = java.lang.String
  type Workteams = js.Array[Workteam]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-07-24`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
