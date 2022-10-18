package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.InternalServiceError
import typings.awsSdk.awsSdkStrings.OGRE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.X86_64
  - typings.awsSdk.awsSdkStrings.ARM64
  - typings.awsSdk.awsSdkStrings.ARMHF
  - java.lang.String
*/
type Architecture = _Architecture | String

type Arn = String

type Arns = js.Array[Arn]

type BatchTimeoutInSeconds = Double

type Boolean = scala.Boolean

type BoxedBoolean = scala.Boolean

type ClientRequestToken = String

type Command = String

type CommandList = js.Array[NonEmptyString]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CPU
  - typings.awsSdk.awsSdkStrings.GPU_AND_CPU
  - java.lang.String
*/
type ComputeType = _ComputeType | String

type CreateSimulationJobRequests = js.Array[SimulationJobRequest]

type CreatedAt = js.Date

type DataSourceConfigs = js.Array[DataSourceConfig]

type DataSourceNames = js.Array[Name]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Prefix_
  - typings.awsSdk.awsSdkStrings.Archive_
  - typings.awsSdk.awsSdkStrings.File_
  - java.lang.String
*/
type DataSourceType = _DataSourceType | String

type DataSources = js.Array[DataSource]

type DeploymentApplicationConfigs = js.Array[DeploymentApplicationConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ResourceNotFound
  - typings.awsSdk.awsSdkStrings.EnvironmentSetupError
  - typings.awsSdk.awsSdkStrings.EtagMismatch
  - typings.awsSdk.awsSdkStrings.FailureThresholdBreached
  - typings.awsSdk.awsSdkStrings.RobotDeploymentAborted
  - typings.awsSdk.awsSdkStrings.RobotDeploymentNoResponse
  - typings.awsSdk.awsSdkStrings.RobotAgentConnectionTimeout
  - typings.awsSdk.awsSdkStrings.GreengrassDeploymentFailed
  - typings.awsSdk.awsSdkStrings.InvalidGreengrassGroup
  - typings.awsSdk.awsSdkStrings.MissingRobotArchitecture
  - typings.awsSdk.awsSdkStrings.MissingRobotApplicationArchitecture
  - typings.awsSdk.awsSdkStrings.MissingRobotDeploymentResource
  - typings.awsSdk.awsSdkStrings.GreengrassGroupVersionDoesNotExist
  - typings.awsSdk.awsSdkStrings.LambdaDeleted
  - typings.awsSdk.awsSdkStrings.ExtractingBundleFailure
  - typings.awsSdk.awsSdkStrings.PreLaunchFileFailure
  - typings.awsSdk.awsSdkStrings.PostLaunchFileFailure
  - typings.awsSdk.awsSdkStrings.BadPermissionError
  - typings.awsSdk.awsSdkStrings.DownloadConditionFailed
  - typings.awsSdk.awsSdkStrings.BadLambdaAssociated
  - typings.awsSdk.awsSdkStrings.InternalServerError
  - typings.awsSdk.awsSdkStrings.RobotApplicationDoesNotExist
  - typings.awsSdk.awsSdkStrings.DeploymentFleetDoesNotExist
  - typings.awsSdk.awsSdkStrings.FleetDeploymentTimeout
  - java.lang.String
*/
type DeploymentJobErrorCode = _DeploymentJobErrorCode | String

type DeploymentJobs = js.Array[DeploymentJob]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Preparing_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Canceled_
  - java.lang.String
*/
type DeploymentStatus = _DeploymentStatus | String

type DeploymentTimeout = Double

type DeploymentVersion = String

type EnvironmentVariableKey = String

type EnvironmentVariableMap = StringDictionary[EnvironmentVariableValue]

type EnvironmentVariableValue = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FAIL
  - typings.awsSdk.awsSdkStrings.RESTART
  - java.lang.String
*/
type ExitBehavior = _ExitBehavior | String

type FailedAt = js.Date

type FailedCreateSimulationJobRequests = js.Array[FailedCreateSimulationJobRequest]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Fail_
  - typings.awsSdk.awsSdkStrings.Continue_
  - java.lang.String
*/
type FailureBehavior = _FailureBehavior | String

type FilterValues = js.Array[Name]

type Filters = js.Array[Filter]

type Fleets = js.Array[Fleet]

type FloorplanCount = Double

type GPUUnit = Double

type GenericInteger = Double

type GenericString = String

type IamRole = String

type Id = String

type ImageDigest = String

type Integer = Double

type InteriorCountPerFloorplan = Double

type JobDuration = Double

type Json = String

type LastStartedAt = js.Date

type LastUpdatedAt = js.Date

type MaxConcurrency = Double

type MaxResults = Double

type Name = String

type NonEmptyString = String

type NonSystemPort = Double

type PaginationToken = String

type Path = String

type PercentDone = Double

type Percentage = Double

type Port = Double

type PortMappingList = js.Array[PortMapping]

type RenderingEngineType = OGRE | String

type RenderingEngineVersionType = String

type RepositoryUrl = String

type RevisionId = String

type RobotApplicationConfigs = js.Array[RobotApplicationConfig]

type RobotApplicationNames = js.Array[Name]

type RobotApplicationSummaries = js.Array[RobotApplicationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Validating_
  - typings.awsSdk.awsSdkStrings.DownloadingExtracting
  - typings.awsSdk.awsSdkStrings.ExecutingDownloadCondition
  - typings.awsSdk.awsSdkStrings.ExecutingPreLaunch
  - typings.awsSdk.awsSdkStrings.Launching_
  - typings.awsSdk.awsSdkStrings.ExecutingPostLaunch
  - typings.awsSdk.awsSdkStrings.Finished_
  - java.lang.String
*/
type RobotDeploymentStep = _RobotDeploymentStep | String

type RobotDeploymentSummary = js.Array[RobotDeployment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ROS
  - typings.awsSdk.awsSdkStrings.ROS2
  - typings.awsSdk.awsSdkStrings.General_
  - java.lang.String
*/
type RobotSoftwareSuiteType = _RobotSoftwareSuiteType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Kinetic
  - typings.awsSdk.awsSdkStrings.Melodic
  - typings.awsSdk.awsSdkStrings.Dashing
  - typings.awsSdk.awsSdkStrings.Foxy
  - java.lang.String
*/
type RobotSoftwareSuiteVersionType = _RobotSoftwareSuiteVersionType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Available_
  - typings.awsSdk.awsSdkStrings.Registered_
  - typings.awsSdk.awsSdkStrings.PendingNewDeployment
  - typings.awsSdk.awsSdkStrings.Deploying_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.InSync_
  - typings.awsSdk.awsSdkStrings.NoResponse
  - java.lang.String
*/
type RobotStatus = _RobotStatus | String

type Robots = js.Array[Robot]

type S3Bucket = String

type S3Etag = String

type S3Etags = js.Array[S3Etag]

type S3Key = String

type S3KeyOrPrefix = String

type S3KeyOutputs = js.Array[S3KeyOutput]

type S3KeysOrPrefixes = js.Array[S3KeyOrPrefix]

type SecurityGroups = js.Array[NonEmptyString]

type SimulationApplicationConfigs = js.Array[SimulationApplicationConfig]

type SimulationApplicationNames = js.Array[Name]

type SimulationApplicationSummaries = js.Array[SimulationApplicationSummary]

type SimulationJobBatchErrorCode = InternalServiceError | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Canceled_
  - typings.awsSdk.awsSdkStrings.Canceling_
  - typings.awsSdk.awsSdkStrings.Completing_
  - typings.awsSdk.awsSdkStrings.TimingOut
  - typings.awsSdk.awsSdkStrings.TimedOut_
  - java.lang.String
*/
type SimulationJobBatchStatus = _SimulationJobBatchStatus | String

type SimulationJobBatchSummaries = js.Array[SimulationJobBatchSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InternalServiceError
  - typings.awsSdk.awsSdkStrings.RobotApplicationCrash
  - typings.awsSdk.awsSdkStrings.SimulationApplicationCrash
  - typings.awsSdk.awsSdkStrings.RobotApplicationHealthCheckFailure
  - typings.awsSdk.awsSdkStrings.SimulationApplicationHealthCheckFailure
  - typings.awsSdk.awsSdkStrings.BadPermissionsRobotApplication
  - typings.awsSdk.awsSdkStrings.BadPermissionsSimulationApplication
  - typings.awsSdk.awsSdkStrings.BadPermissionsS3Object
  - typings.awsSdk.awsSdkStrings.BadPermissionsS3Output
  - typings.awsSdk.awsSdkStrings.BadPermissionsCloudwatchLogs
  - typings.awsSdk.awsSdkStrings.SubnetIpLimitExceeded
  - typings.awsSdk.awsSdkStrings.ENILimitExceeded
  - typings.awsSdk.awsSdkStrings.BadPermissionsUserCredentials
  - typings.awsSdk.awsSdkStrings.InvalidBundleRobotApplication
  - typings.awsSdk.awsSdkStrings.InvalidBundleSimulationApplication
  - typings.awsSdk.awsSdkStrings.InvalidS3Resource
  - typings.awsSdk.awsSdkStrings.ThrottlingError
  - typings.awsSdk.awsSdkStrings.LimitExceeded
  - typings.awsSdk.awsSdkStrings.MismatchedEtag
  - typings.awsSdk.awsSdkStrings.RobotApplicationVersionMismatchedEtag
  - typings.awsSdk.awsSdkStrings.SimulationApplicationVersionMismatchedEtag
  - typings.awsSdk.awsSdkStrings.ResourceNotFound
  - typings.awsSdk.awsSdkStrings.RequestThrottled
  - typings.awsSdk.awsSdkStrings.BatchTimedOut
  - typings.awsSdk.awsSdkStrings.BatchCanceled
  - typings.awsSdk.awsSdkStrings.InvalidInput
  - typings.awsSdk.awsSdkStrings.WrongRegionS3Bucket
  - typings.awsSdk.awsSdkStrings.WrongRegionS3Output
  - typings.awsSdk.awsSdkStrings.WrongRegionRobotApplication
  - typings.awsSdk.awsSdkStrings.WrongRegionSimulationApplication
  - typings.awsSdk.awsSdkStrings.UploadContentMismatchError
  - java.lang.String
*/
type SimulationJobErrorCode = _SimulationJobErrorCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Preparing_
  - typings.awsSdk.awsSdkStrings.Running_
  - typings.awsSdk.awsSdkStrings.Restarting
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.RunningFailed
  - typings.awsSdk.awsSdkStrings.Terminating_
  - typings.awsSdk.awsSdkStrings.Terminated_
  - typings.awsSdk.awsSdkStrings.Canceled_
  - java.lang.String
*/
type SimulationJobStatus = _SimulationJobStatus | String

type SimulationJobSummaries = js.Array[SimulationJobSummary]

type SimulationJobs = js.Array[SimulationJob]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Gazebo
  - typings.awsSdk.awsSdkStrings.RosbagPlay
  - typings.awsSdk.awsSdkStrings.SimulationRuntime
  - java.lang.String
*/
type SimulationSoftwareSuiteType = _SimulationSoftwareSuiteType | String

type SimulationSoftwareSuiteVersionType = String

type SimulationTimeMillis = Double

type SimulationUnit = Double

type SourceConfigs = js.Array[SourceConfig]

type Sources = js.Array[Source]

type Subnets = js.Array[NonEmptyString]

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type TemplateName = String

type TemplateSummaries = js.Array[TemplateSummary]

type Tools = js.Array[Tool]

type UnrestrictedCommand = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UPLOAD_ON_TERMINATE
  - typings.awsSdk.awsSdkStrings.UPLOAD_ROLLING_AUTO_REMOVE
  - java.lang.String
*/
type UploadBehavior = _UploadBehavior | String

type UploadConfigurations = js.Array[UploadConfiguration]

type Version = String

type VersionQualifier = String

type WorldConfigs = js.Array[WorldConfig]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InternalServiceError
  - typings.awsSdk.awsSdkStrings.LimitExceeded
  - typings.awsSdk.awsSdkStrings.ResourceNotFound
  - typings.awsSdk.awsSdkStrings.RequestThrottled
  - typings.awsSdk.awsSdkStrings.InvalidInput
  - typings.awsSdk.awsSdkStrings.AccessDenied
  - java.lang.String
*/
type WorldExportJobErrorCode = _WorldExportJobErrorCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Running_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Canceling_
  - typings.awsSdk.awsSdkStrings.Canceled_
  - java.lang.String
*/
type WorldExportJobStatus = _WorldExportJobStatus | String

type WorldExportJobSummaries = js.Array[WorldExportJobSummary]

type WorldFailures = js.Array[WorldFailure]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InternalServiceError
  - typings.awsSdk.awsSdkStrings.LimitExceeded
  - typings.awsSdk.awsSdkStrings.ResourceNotFound
  - typings.awsSdk.awsSdkStrings.RequestThrottled
  - typings.awsSdk.awsSdkStrings.InvalidInput
  - typings.awsSdk.awsSdkStrings.AllWorldGenerationFailed
  - java.lang.String
*/
type WorldGenerationJobErrorCode = _WorldGenerationJobErrorCode | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Running_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.PartialFailed
  - typings.awsSdk.awsSdkStrings.Canceling_
  - typings.awsSdk.awsSdkStrings.Canceled_
  - java.lang.String
*/
type WorldGenerationJobStatus = _WorldGenerationJobStatus | String

type WorldGenerationJobSummaries = js.Array[WorldGenerationJobSummary]

type WorldSummaries = js.Array[WorldSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-06-29`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
