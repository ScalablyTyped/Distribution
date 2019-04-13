package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsElasticbeanstalkMod {
  type ARN = java.lang.String
  type AbortableOperationInProgress = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Unknown
    - java.lang.String
  */
  type ActionHistoryStatus = _ActionHistoryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Scheduled
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Running
    - awsDashSdkLib.awsDashSdkLibStrings.Unknown
    - java.lang.String
  */
  type ActionStatus = _ActionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceRefresh
    - awsDashSdkLib.awsDashSdkLibStrings.PlatformUpdate
    - awsDashSdkLib.awsDashSdkLibStrings.Unknown
    - java.lang.String
  */
  type ActionType = _ActionType | java.lang.String
  type ApplicationArn = java.lang.String
  type ApplicationDescriptionList = js.Array[ApplicationDescription]
  type ApplicationName = java.lang.String
  type ApplicationNamesList = js.Array[ApplicationName]
  type ApplicationVersionArn = java.lang.String
  type ApplicationVersionDescriptionList = js.Array[ApplicationVersionDescription]
  type ApplicationVersionProccess = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Processed
    - awsDashSdkLib.awsDashSdkLibStrings.Unprocessed
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Processing
    - awsDashSdkLib.awsDashSdkLibStrings.Building
    - java.lang.String
  */
  type ApplicationVersionStatus = _ApplicationVersionStatus | java.lang.String
  type AutoCreateApplication = scala.Boolean
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AvailableSolutionStackDetailsList = js.Array[SolutionStackDescription]
  type AvailableSolutionStackNamesList = js.Array[SolutionStackName]
  type BoxedBoolean = scala.Boolean
  type BoxedInt = scala.Double
  type Cause = java.lang.String
  type Causes = js.Array[Cause]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CnameAvailability = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BUILD_GENERAL1_SMALL
    - awsDashSdkLib.awsDashSdkLibStrings.BUILD_GENERAL1_MEDIUM
    - awsDashSdkLib.awsDashSdkLibStrings.BUILD_GENERAL1_LARGE
    - java.lang.String
  */
  type ComputeType = _ComputeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.deployed
    - awsDashSdkLib.awsDashSdkLibStrings.pending
    - awsDashSdkLib.awsDashSdkLibStrings.failed
    - java.lang.String
  */
  type ConfigurationDeploymentStatus = _ConfigurationDeploymentStatus | java.lang.String
  type ConfigurationOptionDefaultValue = java.lang.String
  type ConfigurationOptionDescriptionsList = js.Array[ConfigurationOptionDescription]
  type ConfigurationOptionName = java.lang.String
  type ConfigurationOptionPossibleValue = java.lang.String
  type ConfigurationOptionPossibleValues = js.Array[ConfigurationOptionPossibleValue]
  type ConfigurationOptionSettingsList = js.Array[ConfigurationOptionSetting]
  type ConfigurationOptionSeverity = java.lang.String
  type ConfigurationOptionValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Scalar
    - awsDashSdkLib.awsDashSdkLibStrings.List
    - java.lang.String
  */
  type ConfigurationOptionValueType = _ConfigurationOptionValueType | java.lang.String
  type ConfigurationSettingsDescriptionList = js.Array[ConfigurationSettingsDescription]
  type ConfigurationTemplateName = java.lang.String
  type ConfigurationTemplateNamesList = js.Array[ConfigurationTemplateName]
  type CreationDate = stdLib.Date
  type CustomAmiList = js.Array[CustomAmi]
  type DNSCname = java.lang.String
  type DNSCnamePrefix = java.lang.String
  type DeleteSourceBundle = scala.Boolean
  type DeploymentTimestamp = stdLib.Date
  type Description = java.lang.String
  type Ec2InstanceId = java.lang.String
  type EndpointURL = java.lang.String
  type EnvironmentArn = java.lang.String
  type EnvironmentDescriptionsList = js.Array[EnvironmentDescription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Green
    - awsDashSdkLib.awsDashSdkLibStrings.Yellow
    - awsDashSdkLib.awsDashSdkLibStrings.Red
    - awsDashSdkLib.awsDashSdkLibStrings.Grey
    - java.lang.String
  */
  type EnvironmentHealth = _EnvironmentHealth | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Status
    - awsDashSdkLib.awsDashSdkLibStrings.Color
    - awsDashSdkLib.awsDashSdkLibStrings.Causes
    - awsDashSdkLib.awsDashSdkLibStrings.ApplicationMetrics
    - awsDashSdkLib.awsDashSdkLibStrings.InstancesHealth
    - awsDashSdkLib.awsDashSdkLibStrings.All
    - awsDashSdkLib.awsDashSdkLibStrings.HealthStatus
    - awsDashSdkLib.awsDashSdkLibStrings.RefreshedAt
    - java.lang.String
  */
  type EnvironmentHealthAttribute = _EnvironmentHealthAttribute | java.lang.String
  type EnvironmentHealthAttributes = js.Array[EnvironmentHealthAttribute]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NoData
    - awsDashSdkLib.awsDashSdkLibStrings.Unknown
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Ok
    - awsDashSdkLib.awsDashSdkLibStrings.Info
    - awsDashSdkLib.awsDashSdkLibStrings.Warning
    - awsDashSdkLib.awsDashSdkLibStrings.Degraded
    - awsDashSdkLib.awsDashSdkLibStrings.Severe
    - awsDashSdkLib.awsDashSdkLibStrings.Suspended
    - java.lang.String
  */
  type EnvironmentHealthStatus = _EnvironmentHealthStatus | java.lang.String
  type EnvironmentId = java.lang.String
  type EnvironmentIdList = js.Array[EnvironmentId]
  type EnvironmentInfoDescriptionList = js.Array[EnvironmentInfoDescription]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.tail
    - awsDashSdkLib.awsDashSdkLibStrings.bundle
    - java.lang.String
  */
  type EnvironmentInfoType = _EnvironmentInfoType | java.lang.String
  type EnvironmentLinks = js.Array[EnvironmentLink]
  type EnvironmentName = java.lang.String
  type EnvironmentNamesList = js.Array[EnvironmentName]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Launching
    - awsDashSdkLib.awsDashSdkLibStrings.Updating
    - awsDashSdkLib.awsDashSdkLibStrings.Ready
    - awsDashSdkLib.awsDashSdkLibStrings.Terminating
    - awsDashSdkLib.awsDashSdkLibStrings.Terminated
    - java.lang.String
  */
  type EnvironmentStatus = _EnvironmentStatus | java.lang.String
  type EventDate = stdLib.Date
  type EventDescriptionList = js.Array[EventDescription]
  type EventMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TRACE
    - awsDashSdkLib.awsDashSdkLibStrings.DEBUG
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - awsDashSdkLib.awsDashSdkLibStrings.WARN
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.FATAL
    - java.lang.String
  */
  type EventSeverity = _EventSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UpdateCancelled
    - awsDashSdkLib.awsDashSdkLibStrings.CancellationFailed
    - awsDashSdkLib.awsDashSdkLibStrings.RollbackFailed
    - awsDashSdkLib.awsDashSdkLibStrings.RollbackSuccessful
    - awsDashSdkLib.awsDashSdkLibStrings.InternalFailure
    - awsDashSdkLib.awsDashSdkLibStrings.InvalidEnvironmentState
    - awsDashSdkLib.awsDashSdkLibStrings.PermissionsError
    - java.lang.String
  */
  type FailureType = _FailureType | java.lang.String
  type FileTypeExtension = java.lang.String
  type ForceTerminate = scala.Boolean
  type GroupName = java.lang.String
  type ImageId = java.lang.String
  type IncludeDeleted = scala.Boolean
  type IncludeDeletedBackTo = stdLib.Date
  type InstanceHealthList = js.Array[SingleInstanceHealth]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.HealthStatus
    - awsDashSdkLib.awsDashSdkLibStrings.Color
    - awsDashSdkLib.awsDashSdkLibStrings.Causes
    - awsDashSdkLib.awsDashSdkLibStrings.ApplicationMetrics
    - awsDashSdkLib.awsDashSdkLibStrings.RefreshedAt
    - awsDashSdkLib.awsDashSdkLibStrings.LaunchedAt
    - awsDashSdkLib.awsDashSdkLibStrings.System
    - awsDashSdkLib.awsDashSdkLibStrings.Deployment
    - awsDashSdkLib.awsDashSdkLibStrings.AvailabilityZone
    - awsDashSdkLib.awsDashSdkLibStrings.InstanceType
    - awsDashSdkLib.awsDashSdkLibStrings.All
    - java.lang.String
  */
  type InstancesHealthAttribute = _InstancesHealthAttribute | java.lang.String
  type InstancesHealthAttributes = js.Array[InstancesHealthAttribute]
  type Integer = scala.Double
  type LaunchConfigurationList = js.Array[LaunchConfiguration]
  type LaunchTemplateList = js.Array[LaunchTemplate]
  type LaunchedAt = stdLib.Date
  type LoadAverage = js.Array[LoadAverageValue]
  type LoadAverageValue = scala.Double
  type LoadBalancerList = js.Array[LoadBalancer]
  type LoadBalancerListenersDescription = js.Array[Listener]
  type Maintainer = java.lang.String
  type ManagedActionHistoryItems = js.Array[ManagedActionHistoryItem]
  type ManagedActions = js.Array[ManagedAction]
  type MaxRecords = scala.Double
  type Message = java.lang.String
  type NextToken = java.lang.String
  type NonEmptyString = java.lang.String
  type NullableDouble = scala.Double
  type NullableInteger = scala.Double
  type NullableLong = scala.Double
  type OperatingSystemName = java.lang.String
  type OperatingSystemVersion = java.lang.String
  type OptionNamespace = java.lang.String
  type OptionRestrictionMaxLength = scala.Double
  type OptionRestrictionMaxValue = scala.Double
  type OptionRestrictionMinValue = scala.Double
  type OptionsSpecifierList = js.Array[OptionSpecification]
  type PlatformArn = java.lang.String
  type PlatformCategory = java.lang.String
  type PlatformFilterOperator = java.lang.String
  type PlatformFilterType = java.lang.String
  type PlatformFilterValue = java.lang.String
  type PlatformFilterValueList = js.Array[PlatformFilterValue]
  type PlatformFilters = js.Array[PlatformFilter]
  type PlatformFrameworks = js.Array[PlatformFramework]
  type PlatformMaxRecords = scala.Double
  type PlatformName = java.lang.String
  type PlatformOwner = java.lang.String
  type PlatformProgrammingLanguages = js.Array[PlatformProgrammingLanguage]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Creating
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Ready
    - awsDashSdkLib.awsDashSdkLibStrings.Deleting
    - awsDashSdkLib.awsDashSdkLibStrings.Deleted
    - java.lang.String
  */
  type PlatformStatus = _PlatformStatus | java.lang.String
  type PlatformSummaryList = js.Array[PlatformSummary]
  type PlatformVersion = java.lang.String
  type QueueList = js.Array[Queue]
  type RefreshedAt = stdLib.Date
  type RegexLabel = java.lang.String
  type RegexPattern = java.lang.String
  type RequestCount = scala.Double
  type RequestId = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type SampleTimestamp = stdLib.Date
  type SolutionStackFileTypeList = js.Array[FileTypeExtension]
  type SolutionStackName = java.lang.String
  type SourceLocation = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CodeCommit
    - awsDashSdkLib.awsDashSdkLibStrings.S3
    - java.lang.String
  */
  type SourceRepository = _SourceRepository | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Git
    - awsDashSdkLib.awsDashSdkLibStrings.Zip
    - java.lang.String
  */
  type SourceType = _SourceType | java.lang.String
  type String = java.lang.String
  type SupportedAddon = java.lang.String
  type SupportedAddonList = js.Array[SupportedAddon]
  type SupportedTier = java.lang.String
  type SupportedTierList = js.Array[SupportedTier]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Tags = js.Array[Tag]
  type TerminateEnvForce = scala.Boolean
  type TerminateEnvironmentResources = scala.Boolean
  type TimeFilterEnd = stdLib.Date
  type TimeFilterStart = stdLib.Date
  type Timestamp = stdLib.Date
  type Token = java.lang.String
  type TriggerList = js.Array[Trigger]
  type UpdateDate = stdLib.Date
  type UserDefinedOption = scala.Boolean
  type ValidationMessageString = java.lang.String
  type ValidationMessagesList = js.Array[ValidationMessage]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.error
    - awsDashSdkLib.awsDashSdkLibStrings.warning
    - java.lang.String
  */
  type ValidationSeverity = _ValidationSeverity | java.lang.String
  type VersionLabel = java.lang.String
  type VersionLabels = js.Array[VersionLabel]
  type VersionLabelsList = js.Array[VersionLabel]
  type VirtualizationType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2010-12-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
