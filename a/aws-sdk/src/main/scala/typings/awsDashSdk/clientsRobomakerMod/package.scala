package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRobomakerMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.OGRE
  import typings.awsDashSdk.awsDashSdkStrings.ROS
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.X86_64
    - typings.awsDashSdk.awsDashSdkStrings.ARM64
    - typings.awsDashSdk.awsDashSdkStrings.ARMHF
    - java.lang.String
  */
  type Architecture = _Architecture | String
  type Arn = String
  type Arns = js.Array[Arn]
  type Boolean = scala.Boolean
  type BoxedBoolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = String
  type Command = String
  type CreatedAt = Date
  type DataSourceConfigs = js.Array[DataSourceConfig]
  type DataSourceNames = js.Array[Name]
  type DataSources = js.Array[DataSource]
  type DeploymentApplicationConfigs = js.Array[DeploymentApplicationConfig]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ResourceNotFound
    - typings.awsDashSdk.awsDashSdkStrings.EnvironmentSetupError
    - typings.awsDashSdk.awsDashSdkStrings.EtagMismatch
    - typings.awsDashSdk.awsDashSdkStrings.FailureThresholdBreached
    - typings.awsDashSdk.awsDashSdkStrings.RobotDeploymentAborted
    - typings.awsDashSdk.awsDashSdkStrings.RobotDeploymentNoResponse
    - typings.awsDashSdk.awsDashSdkStrings.RobotAgentConnectionTimeout
    - typings.awsDashSdk.awsDashSdkStrings.GreengrassDeploymentFailed
    - typings.awsDashSdk.awsDashSdkStrings.MissingRobotArchitecture
    - typings.awsDashSdk.awsDashSdkStrings.MissingRobotApplicationArchitecture
    - typings.awsDashSdk.awsDashSdkStrings.MissingRobotDeploymentResource
    - typings.awsDashSdk.awsDashSdkStrings.GreengrassGroupVersionDoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.ExtractingBundleFailure
    - typings.awsDashSdk.awsDashSdkStrings.PreLaunchFileFailure
    - typings.awsDashSdk.awsDashSdkStrings.PostLaunchFileFailure
    - typings.awsDashSdk.awsDashSdkStrings.BadPermissionError
    - typings.awsDashSdk.awsDashSdkStrings.InternalServerError
    - java.lang.String
  */
  type DeploymentJobErrorCode = _DeploymentJobErrorCode | String
  type DeploymentJobs = js.Array[DeploymentJob]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Preparing
    - typings.awsDashSdk.awsDashSdkStrings.InProgress
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Canceled
    - java.lang.String
  */
  type DeploymentStatus = _DeploymentStatus | String
  type DeploymentTimeout = Double
  type DeploymentVersion = String
  type EnvironmentVariableKey = String
  type EnvironmentVariableMap = StringDictionary[EnvironmentVariableValue]
  type EnvironmentVariableValue = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Fail
    - typings.awsDashSdk.awsDashSdkStrings.Continue
    - java.lang.String
  */
  type FailureBehavior = _FailureBehavior | String
  type FilterValues = js.Array[Name]
  type Filters = js.Array[Filter]
  type Fleets = js.Array[Fleet]
  type GenericInteger = Double
  type GenericString = String
  type IamRole = String
  type Id = String
  type JobDuration = Double
  type LastStartedAt = Date
  type LastUpdatedAt = Date
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
  type RevisionId = String
  type RobotApplicationConfigs = js.Array[RobotApplicationConfig]
  type RobotApplicationNames = js.Array[Name]
  type RobotApplicationSummaries = js.Array[RobotApplicationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Validating
    - typings.awsDashSdk.awsDashSdkStrings.DownloadingExtracting
    - typings.awsDashSdk.awsDashSdkStrings.ExecutingPreLaunch
    - typings.awsDashSdk.awsDashSdkStrings.Launching
    - typings.awsDashSdk.awsDashSdkStrings.ExecutingPostLaunch
    - typings.awsDashSdk.awsDashSdkStrings.Finished
    - java.lang.String
  */
  type RobotDeploymentStep = _RobotDeploymentStep | String
  type RobotDeploymentSummary = js.Array[RobotDeployment]
  type RobotSoftwareSuiteType = ROS | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Kinetic
    - typings.awsDashSdk.awsDashSdkStrings.Melodic
    - java.lang.String
  */
  type RobotSoftwareSuiteVersionType = _RobotSoftwareSuiteVersionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Available
    - typings.awsDashSdk.awsDashSdkStrings.Registered
    - typings.awsDashSdk.awsDashSdkStrings.PendingNewDeployment
    - typings.awsDashSdk.awsDashSdkStrings.Deploying
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.InSync
    - typings.awsDashSdk.awsDashSdkStrings.NoResponse
    - java.lang.String
  */
  type RobotStatus = _RobotStatus | String
  type Robots = js.Array[Robot]
  type S3Bucket = String
  type S3Etag = String
  type S3Key = String
  type S3KeyOutputs = js.Array[S3KeyOutput]
  type S3Keys = js.Array[S3Key]
  type SecurityGroups = js.Array[NonEmptyString]
  type SimulationApplicationConfigs = js.Array[SimulationApplicationConfig]
  type SimulationApplicationNames = js.Array[Name]
  type SimulationApplicationSummaries = js.Array[SimulationApplicationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InternalServiceError
    - typings.awsDashSdk.awsDashSdkStrings.RobotApplicationCrash
    - typings.awsDashSdk.awsDashSdkStrings.SimulationApplicationCrash
    - typings.awsDashSdk.awsDashSdkStrings.BadPermissionsRobotApplication
    - typings.awsDashSdk.awsDashSdkStrings.BadPermissionsSimulationApplication
    - typings.awsDashSdk.awsDashSdkStrings.BadPermissionsS3Object
    - typings.awsDashSdk.awsDashSdkStrings.BadPermissionsS3Output
    - typings.awsDashSdk.awsDashSdkStrings.BadPermissionsCloudwatchLogs
    - typings.awsDashSdk.awsDashSdkStrings.SubnetIpLimitExceeded
    - typings.awsDashSdk.awsDashSdkStrings.ENILimitExceeded
    - typings.awsDashSdk.awsDashSdkStrings.BadPermissionsUserCredentials
    - typings.awsDashSdk.awsDashSdkStrings.InvalidBundleRobotApplication
    - typings.awsDashSdk.awsDashSdkStrings.InvalidBundleSimulationApplication
    - typings.awsDashSdk.awsDashSdkStrings.InvalidS3Resource
    - typings.awsDashSdk.awsDashSdkStrings.MismatchedEtag
    - typings.awsDashSdk.awsDashSdkStrings.RobotApplicationVersionMismatchedEtag
    - typings.awsDashSdk.awsDashSdkStrings.SimulationApplicationVersionMismatchedEtag
    - typings.awsDashSdk.awsDashSdkStrings.ResourceNotFound
    - typings.awsDashSdk.awsDashSdkStrings.InvalidInput
    - typings.awsDashSdk.awsDashSdkStrings.WrongRegionS3Bucket
    - typings.awsDashSdk.awsDashSdkStrings.WrongRegionS3Output
    - typings.awsDashSdk.awsDashSdkStrings.WrongRegionRobotApplication
    - typings.awsDashSdk.awsDashSdkStrings.WrongRegionSimulationApplication
    - java.lang.String
  */
  type SimulationJobErrorCode = _SimulationJobErrorCode | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Preparing
    - typings.awsDashSdk.awsDashSdkStrings.Running
    - typings.awsDashSdk.awsDashSdkStrings.Restarting
    - typings.awsDashSdk.awsDashSdkStrings.Completed
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.RunningFailed
    - typings.awsDashSdk.awsDashSdkStrings.Terminating
    - typings.awsDashSdk.awsDashSdkStrings.Terminated
    - typings.awsDashSdk.awsDashSdkStrings.Canceled
    - java.lang.String
  */
  type SimulationJobStatus = _SimulationJobStatus | String
  type SimulationJobSummaries = js.Array[SimulationJobSummary]
  type SimulationJobs = js.Array[SimulationJob]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Gazebo
    - typings.awsDashSdk.awsDashSdkStrings.RosbagPlay
    - java.lang.String
  */
  type SimulationSoftwareSuiteType = _SimulationSoftwareSuiteType | String
  type SimulationSoftwareSuiteVersionType = String
  type SimulationTimeMillis = Double
  type SourceConfigs = js.Array[SourceConfig]
  type Sources = js.Array[Source]
  type Subnets = js.Array[NonEmptyString]
  type TagKey = String
  type TagKeyList = js.Array[TagKey]
  type TagMap = StringDictionary[TagValue]
  type TagValue = String
  type Version = String
  type VersionQualifier = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-06-29`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
