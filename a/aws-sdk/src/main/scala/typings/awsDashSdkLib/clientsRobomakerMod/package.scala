package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRobomakerMod {
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.X86_64
    - awsDashSdkLib.awsDashSdkLibStrings.ARM64
    - awsDashSdkLib.awsDashSdkLibStrings.ARMHF
    - java.lang.String
  */
  type Architecture = _Architecture | java.lang.String
  type Arn = java.lang.String
  type Arns = js.Array[Arn]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type Command = java.lang.String
  type CreatedAt = stdLib.Date
  type DeploymentApplicationConfigs = js.Array[DeploymentApplicationConfig]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ResourceNotFound
    - awsDashSdkLib.awsDashSdkLibStrings.EnvironmentSetupError
    - awsDashSdkLib.awsDashSdkLibStrings.EtagMismatch
    - awsDashSdkLib.awsDashSdkLibStrings.FailureThresholdBreached
    - awsDashSdkLib.awsDashSdkLibStrings.RobotDeploymentNoResponse
    - awsDashSdkLib.awsDashSdkLibStrings.RobotAgentConnectionTimeout
    - awsDashSdkLib.awsDashSdkLibStrings.GreengrassDeploymentFailed
    - awsDashSdkLib.awsDashSdkLibStrings.MissingRobotArchitecture
    - awsDashSdkLib.awsDashSdkLibStrings.MissingRobotApplicationArchitecture
    - awsDashSdkLib.awsDashSdkLibStrings.MissingRobotDeploymentResource
    - awsDashSdkLib.awsDashSdkLibStrings.GreengrassGroupVersionDoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.ExtractingBundleFailure
    - awsDashSdkLib.awsDashSdkLibStrings.PreLaunchFileFailure
    - awsDashSdkLib.awsDashSdkLibStrings.PostLaunchFileFailure
    - awsDashSdkLib.awsDashSdkLibStrings.BadPermissionError
    - awsDashSdkLib.awsDashSdkLibStrings.InternalServerError
    - java.lang.String
  */
  type DeploymentJobErrorCode = _DeploymentJobErrorCode | java.lang.String
  type DeploymentJobs = js.Array[DeploymentJob]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Preparing
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Canceled
    - java.lang.String
  */
  type DeploymentStatus = _DeploymentStatus | java.lang.String
  type DeploymentVersion = java.lang.String
  type EnvironmentVariableKey = java.lang.String
  type EnvironmentVariableMap = org.scalablytyped.runtime.StringDictionary[EnvironmentVariableValue]
  type EnvironmentVariableValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Fail
    - awsDashSdkLib.awsDashSdkLibStrings.Continue
    - java.lang.String
  */
  type FailureBehavior = _FailureBehavior | java.lang.String
  type FilterValues = js.Array[Name]
  type Filters = js.Array[Filter]
  type Fleets = js.Array[Fleet]
  type GenericInteger = scala.Double
  type GenericString = java.lang.String
  type IamRole = java.lang.String
  type Id = java.lang.String
  type JobDuration = scala.Double
  type LastStartedAt = stdLib.Date
  type LastUpdatedAt = stdLib.Date
  type MaxResults = scala.Double
  type Name = java.lang.String
  type PaginationToken = java.lang.String
  type Path = java.lang.String
  type PercentDone = scala.Double
  type Percentage = scala.Double
  type RenderingEngineType = awsDashSdkLib.awsDashSdkLibStrings.OGRE | java.lang.String
  type RenderingEngineVersionType = java.lang.String
  type RevisionId = java.lang.String
  type RobotApplicationConfigs = js.Array[RobotApplicationConfig]
  type RobotApplicationNames = js.Array[Name]
  type RobotApplicationSummaries = js.Array[RobotApplicationSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Validating
    - awsDashSdkLib.awsDashSdkLibStrings.DownloadingExtracting
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutingPreLaunch
    - awsDashSdkLib.awsDashSdkLibStrings.Launching
    - awsDashSdkLib.awsDashSdkLibStrings.ExecutingPostLaunch
    - awsDashSdkLib.awsDashSdkLibStrings.Finished
    - java.lang.String
  */
  type RobotDeploymentStep = _RobotDeploymentStep | java.lang.String
  type RobotDeploymentSummary = js.Array[RobotDeployment]
  type RobotSoftwareSuiteType = awsDashSdkLib.awsDashSdkLibStrings.ROS | java.lang.String
  type RobotSoftwareSuiteVersionType = awsDashSdkLib.awsDashSdkLibStrings.Kinetic | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Available
    - awsDashSdkLib.awsDashSdkLibStrings.Registered
    - awsDashSdkLib.awsDashSdkLibStrings.PendingNewDeployment
    - awsDashSdkLib.awsDashSdkLibStrings.Deploying
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.InSync
    - awsDashSdkLib.awsDashSdkLibStrings.NoResponse
    - java.lang.String
  */
  type RobotStatus = _RobotStatus | java.lang.String
  type Robots = js.Array[Robot]
  type S3Bucket = java.lang.String
  type S3Etag = java.lang.String
  type S3Key = java.lang.String
  type SecurityGroups = js.Array[GenericString]
  type SimulationApplicationConfigs = js.Array[SimulationApplicationConfig]
  type SimulationApplicationNames = js.Array[Name]
  type SimulationApplicationSummaries = js.Array[SimulationApplicationSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InternalServiceError
    - awsDashSdkLib.awsDashSdkLibStrings.RobotApplicationCrash
    - awsDashSdkLib.awsDashSdkLibStrings.SimulationApplicationCrash
    - awsDashSdkLib.awsDashSdkLibStrings.BadPermissionsRobotApplication
    - awsDashSdkLib.awsDashSdkLibStrings.BadPermissionsSimulationApplication
    - awsDashSdkLib.awsDashSdkLibStrings.BadPermissionsS3Output
    - awsDashSdkLib.awsDashSdkLibStrings.BadPermissionsCloudwatchLogs
    - awsDashSdkLib.awsDashSdkLibStrings.SubnetIpLimitExceeded
    - awsDashSdkLib.awsDashSdkLibStrings.ENILimitExceeded
    - awsDashSdkLib.awsDashSdkLibStrings.BadPermissionsUserCredentials
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidBundleRobotApplication
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidBundleSimulationApplication
    - awsDashSdkLib.awsDashSdkLibStrings.RobotApplicationVersionMismatchedEtag
    - awsDashSdkLib.awsDashSdkLibStrings.SimulationApplicationVersionMismatchedEtag
    - awsDashSdkLib.awsDashSdkLibStrings.WrongRegionS3Output
    - awsDashSdkLib.awsDashSdkLibStrings.WrongRegionRobotApplication
    - awsDashSdkLib.awsDashSdkLibStrings.WrongRegionSimulationApplication
    - java.lang.String
  */
  type SimulationJobErrorCode = _SimulationJobErrorCode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Preparing
    - awsDashSdkLib.awsDashSdkLibStrings.Running
    - awsDashSdkLib.awsDashSdkLibStrings.Restarting
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.RunningFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Terminating
    - awsDashSdkLib.awsDashSdkLibStrings.Terminated
    - awsDashSdkLib.awsDashSdkLibStrings.Canceled
    - java.lang.String
  */
  type SimulationJobStatus = _SimulationJobStatus | java.lang.String
  type SimulationJobSummaries = js.Array[SimulationJobSummary]
  type SimulationJobs = js.Array[SimulationJob]
  type SimulationSoftwareSuiteType = awsDashSdkLib.awsDashSdkLibStrings.Gazebo | java.lang.String
  type SimulationSoftwareSuiteVersionType = java.lang.String
  type SimulationTimeMillis = scala.Double
  type SourceConfigs = js.Array[SourceConfig]
  type Sources = js.Array[Source]
  type Subnets = js.Array[GenericString]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[TagValue]
  type TagValue = java.lang.String
  type Version = java.lang.String
  type VersionQualifier = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-06-29`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
