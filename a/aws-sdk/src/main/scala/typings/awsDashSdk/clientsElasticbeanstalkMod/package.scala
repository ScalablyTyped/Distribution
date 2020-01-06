package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsElasticbeanstalkMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ARN = java.lang.String
  type AbortableOperationInProgress = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Completed_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionHistoryStatus = _ActionHistoryStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Scheduled_
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Running_
    - typings.awsDashSdk.awsDashSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionStatus = _ActionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.InstanceRefresh
    - typings.awsDashSdk.awsDashSdkStrings.PlatformUpdate
    - typings.awsDashSdk.awsDashSdkStrings.Unknown_
    - java.lang.String
  */
  type ActionType = _ActionType | java.lang.String
  type ApplicationArn = java.lang.String
  type ApplicationDescriptionList = js.Array[ApplicationDescription]
  type ApplicationName = java.lang.String
  type ApplicationNamesList = js.Array[ApplicationName]
  type ApplicationVersionArn = java.lang.String
  type ApplicationVersionDescriptionList = js.Array[ApplicationVersionDescription]
  type ApplicationVersionProccess = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Processed
    - typings.awsDashSdk.awsDashSdkStrings.Unprocessed
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Processing_
    - typings.awsDashSdk.awsDashSdkStrings.Building_
    - java.lang.String
  */
  type ApplicationVersionStatus = _ApplicationVersionStatus | java.lang.String
  type AutoCreateApplication = Boolean
  type AutoScalingGroupList = js.Array[AutoScalingGroup]
  type AvailableSolutionStackDetailsList = js.Array[SolutionStackDescription]
  type AvailableSolutionStackNamesList = js.Array[SolutionStackName]
  type BoxedBoolean = Boolean
  type BoxedInt = Double
  type Cause = java.lang.String
  type Causes = js.Array[Cause]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CnameAvailability = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BUILD_GENERAL1_SMALL
    - typings.awsDashSdk.awsDashSdkStrings.BUILD_GENERAL1_MEDIUM
    - typings.awsDashSdk.awsDashSdkStrings.BUILD_GENERAL1_LARGE
    - java.lang.String
  */
  type ComputeType = _ComputeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.deployed_
    - typings.awsDashSdk.awsDashSdkStrings.pending__
    - typings.awsDashSdk.awsDashSdkStrings.failed__
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
    - typings.awsDashSdk.awsDashSdkStrings.Scalar
    - typings.awsDashSdk.awsDashSdkStrings.List
    - java.lang.String
  */
  type ConfigurationOptionValueType = _ConfigurationOptionValueType | java.lang.String
  type ConfigurationSettingsDescriptionList = js.Array[ConfigurationSettingsDescription]
  type ConfigurationTemplateName = java.lang.String
  type ConfigurationTemplateNamesList = js.Array[ConfigurationTemplateName]
  type CreationDate = Date
  type CustomAmiList = js.Array[CustomAmi]
  type DNSCname = java.lang.String
  type DNSCnamePrefix = java.lang.String
  type DeleteSourceBundle = Boolean
  type DeploymentTimestamp = Date
  type Description = java.lang.String
  type Ec2InstanceId = java.lang.String
  type EndpointURL = java.lang.String
  type EnvironmentArn = java.lang.String
  type EnvironmentDescriptionsList = js.Array[EnvironmentDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Green_
    - typings.awsDashSdk.awsDashSdkStrings.Yellow_
    - typings.awsDashSdk.awsDashSdkStrings.Red_
    - typings.awsDashSdk.awsDashSdkStrings.Grey
    - java.lang.String
  */
  type EnvironmentHealth = _EnvironmentHealth | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Status_
    - typings.awsDashSdk.awsDashSdkStrings.Color_
    - typings.awsDashSdk.awsDashSdkStrings.Causes
    - typings.awsDashSdk.awsDashSdkStrings.ApplicationMetrics
    - typings.awsDashSdk.awsDashSdkStrings.InstancesHealth
    - typings.awsDashSdk.awsDashSdkStrings.All_
    - typings.awsDashSdk.awsDashSdkStrings.HealthStatus
    - typings.awsDashSdk.awsDashSdkStrings.RefreshedAt
    - java.lang.String
  */
  type EnvironmentHealthAttribute = _EnvironmentHealthAttribute | java.lang.String
  type EnvironmentHealthAttributes = js.Array[EnvironmentHealthAttribute]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NoData
    - typings.awsDashSdk.awsDashSdkStrings.Unknown_
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Ok_
    - typings.awsDashSdk.awsDashSdkStrings.Info_
    - typings.awsDashSdk.awsDashSdkStrings.Warning_
    - typings.awsDashSdk.awsDashSdkStrings.Degraded_
    - typings.awsDashSdk.awsDashSdkStrings.Severe
    - typings.awsDashSdk.awsDashSdkStrings.Suspended_
    - java.lang.String
  */
  type EnvironmentHealthStatus = _EnvironmentHealthStatus | java.lang.String
  type EnvironmentId = java.lang.String
  type EnvironmentIdList = js.Array[EnvironmentId]
  type EnvironmentInfoDescriptionList = js.Array[EnvironmentInfoDescription]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.tail_
    - typings.awsDashSdk.awsDashSdkStrings.bundle
    - java.lang.String
  */
  type EnvironmentInfoType = _EnvironmentInfoType | java.lang.String
  type EnvironmentLinks = js.Array[EnvironmentLink]
  type EnvironmentName = java.lang.String
  type EnvironmentNamesList = js.Array[EnvironmentName]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Launching_
    - typings.awsDashSdk.awsDashSdkStrings.Updating_
    - typings.awsDashSdk.awsDashSdkStrings.Ready_
    - typings.awsDashSdk.awsDashSdkStrings.Terminating_
    - typings.awsDashSdk.awsDashSdkStrings.Terminated_
    - java.lang.String
  */
  type EnvironmentStatus = _EnvironmentStatus | java.lang.String
  type EventDate = Date
  type EventDescriptionList = js.Array[EventDescription]
  type EventMessage = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRACE
    - typings.awsDashSdk.awsDashSdkStrings.DEBUG
    - typings.awsDashSdk.awsDashSdkStrings.INFO
    - typings.awsDashSdk.awsDashSdkStrings.WARN
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.FATAL
    - java.lang.String
  */
  type EventSeverity = _EventSeverity | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UpdateCancelled
    - typings.awsDashSdk.awsDashSdkStrings.CancellationFailed
    - typings.awsDashSdk.awsDashSdkStrings.RollbackFailed
    - typings.awsDashSdk.awsDashSdkStrings.RollbackSuccessful
    - typings.awsDashSdk.awsDashSdkStrings.InternalFailure
    - typings.awsDashSdk.awsDashSdkStrings.InvalidEnvironmentState
    - typings.awsDashSdk.awsDashSdkStrings.PermissionsError
    - java.lang.String
  */
  type FailureType = _FailureType | java.lang.String
  type FileTypeExtension = java.lang.String
  type ForceTerminate = Boolean
  type GroupName = java.lang.String
  type ImageId = java.lang.String
  type IncludeDeleted = Boolean
  type IncludeDeletedBackTo = Date
  type InstanceHealthList = js.Array[SingleInstanceHealth]
  type InstanceId = java.lang.String
  type InstanceList = js.Array[Instance]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.HealthStatus
    - typings.awsDashSdk.awsDashSdkStrings.Color_
    - typings.awsDashSdk.awsDashSdkStrings.Causes
    - typings.awsDashSdk.awsDashSdkStrings.ApplicationMetrics
    - typings.awsDashSdk.awsDashSdkStrings.RefreshedAt
    - typings.awsDashSdk.awsDashSdkStrings.LaunchedAt
    - typings.awsDashSdk.awsDashSdkStrings.System_
    - typings.awsDashSdk.awsDashSdkStrings.Deployment
    - typings.awsDashSdk.awsDashSdkStrings.AvailabilityZone
    - typings.awsDashSdk.awsDashSdkStrings.InstanceType
    - typings.awsDashSdk.awsDashSdkStrings.All_
    - java.lang.String
  */
  type InstancesHealthAttribute = _InstancesHealthAttribute | java.lang.String
  type InstancesHealthAttributes = js.Array[InstancesHealthAttribute]
  type Integer = Double
  type LaunchConfigurationList = js.Array[LaunchConfiguration]
  type LaunchTemplateList = js.Array[LaunchTemplate]
  type LaunchedAt = Date
  type LoadAverage = js.Array[LoadAverageValue]
  type LoadAverageValue = Double
  type LoadBalancerList = js.Array[LoadBalancer]
  type LoadBalancerListenersDescription = js.Array[Listener]
  type Maintainer = java.lang.String
  type ManagedActionHistoryItems = js.Array[ManagedActionHistoryItem]
  type ManagedActions = js.Array[ManagedAction]
  type MaxRecords = Double
  type Message = java.lang.String
  type NextToken = java.lang.String
  type NonEmptyString = java.lang.String
  type NullableDouble = Double
  type NullableInteger = Double
  type NullableLong = Double
  type OperatingSystemName = java.lang.String
  type OperatingSystemVersion = java.lang.String
  type OptionNamespace = java.lang.String
  type OptionRestrictionMaxLength = Double
  type OptionRestrictionMaxValue = Double
  type OptionRestrictionMinValue = Double
  type OptionsSpecifierList = js.Array[OptionSpecification]
  type PlatformArn = java.lang.String
  type PlatformCategory = java.lang.String
  type PlatformFilterOperator = java.lang.String
  type PlatformFilterType = java.lang.String
  type PlatformFilterValue = java.lang.String
  type PlatformFilterValueList = js.Array[PlatformFilterValue]
  type PlatformFilters = js.Array[PlatformFilter]
  type PlatformFrameworks = js.Array[PlatformFramework]
  type PlatformMaxRecords = Double
  type PlatformName = java.lang.String
  type PlatformOwner = java.lang.String
  type PlatformProgrammingLanguages = js.Array[PlatformProgrammingLanguage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Creating_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Ready_
    - typings.awsDashSdk.awsDashSdkStrings.Deleting_
    - typings.awsDashSdk.awsDashSdkStrings.Deleted_
    - java.lang.String
  */
  type PlatformStatus = _PlatformStatus | java.lang.String
  type PlatformSummaryList = js.Array[PlatformSummary]
  type PlatformVersion = java.lang.String
  type QueueList = js.Array[Queue]
  type RefreshedAt = Date
  type RegexLabel = java.lang.String
  type RegexPattern = java.lang.String
  type RequestCount = Double
  type RequestId = java.lang.String
  type ResourceArn = java.lang.String
  type ResourceId = java.lang.String
  type ResourceName = java.lang.String
  type S3Bucket = java.lang.String
  type S3Key = java.lang.String
  type SampleTimestamp = Date
  type SolutionStackFileTypeList = js.Array[FileTypeExtension]
  type SolutionStackName = java.lang.String
  type SourceLocation = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CodeCommit_
    - typings.awsDashSdk.awsDashSdkStrings.S3
    - java.lang.String
  */
  type SourceRepository = _SourceRepository | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Git
    - typings.awsDashSdk.awsDashSdkStrings.Zip_
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
  type TerminateEnvForce = Boolean
  type TerminateEnvironmentResources = Boolean
  type TimeFilterEnd = Date
  type TimeFilterStart = Date
  type Timestamp = Date
  type Token = java.lang.String
  type TriggerList = js.Array[Trigger]
  type UpdateDate = Date
  type UserDefinedOption = Boolean
  type ValidationMessageString = java.lang.String
  type ValidationMessagesList = js.Array[ValidationMessage]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.error__
    - typings.awsDashSdk.awsDashSdkStrings.warning__
    - java.lang.String
  */
  type ValidationSeverity = _ValidationSeverity | java.lang.String
  type VersionLabel = java.lang.String
  type VersionLabels = js.Array[VersionLabel]
  type VersionLabelsList = js.Array[VersionLabel]
  type VirtualizationType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2010-12-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
