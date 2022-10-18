package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = java.lang.String

type AbortableOperationInProgress = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type ActionHistoryStatus = _ActionHistoryStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Scheduled_
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Running_
  - typings.awsSdk.awsSdkStrings.Unknown_
  - java.lang.String
*/
type ActionStatus = _ActionStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InstanceRefresh
  - typings.awsSdk.awsSdkStrings.PlatformUpdate
  - typings.awsSdk.awsSdkStrings.Unknown_
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
  - typings.awsSdk.awsSdkStrings.Processed
  - typings.awsSdk.awsSdkStrings.Unprocessed
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Processing_
  - typings.awsSdk.awsSdkStrings.Building_
  - java.lang.String
*/
type ApplicationVersionStatus = _ApplicationVersionStatus | java.lang.String

type AutoCreateApplication = Boolean

type AutoScalingGroupList = js.Array[AutoScalingGroup]

type AvailableSolutionStackDetailsList = js.Array[SolutionStackDescription]

type AvailableSolutionStackNamesList = js.Array[SolutionStackName]

type BoxedBoolean = Boolean

type BoxedInt = Double

type BranchName = java.lang.String

type BranchOrder = Double

type Cause = java.lang.String

type Causes = js.Array[Cause]

type CnameAvailability = Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_SMALL
  - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_MEDIUM
  - typings.awsSdk.awsSdkStrings.BUILD_GENERAL1_LARGE
  - java.lang.String
*/
type ComputeType = _ComputeType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.deployed__
  - typings.awsSdk.awsSdkStrings.pending__
  - typings.awsSdk.awsSdkStrings.failed__
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
  - typings.awsSdk.awsSdkStrings.Scalar
  - typings.awsSdk.awsSdkStrings.List_
  - java.lang.String
*/
type ConfigurationOptionValueType = _ConfigurationOptionValueType | java.lang.String

type ConfigurationSettingsDescriptionList = js.Array[ConfigurationSettingsDescription]

type ConfigurationTemplateName = java.lang.String

type ConfigurationTemplateNamesList = js.Array[ConfigurationTemplateName]

type CreationDate = js.Date

type CustomAmiList = js.Array[CustomAmi]

type DNSCname = java.lang.String

type DNSCnamePrefix = java.lang.String

type DeleteSourceBundle = Boolean

type DeploymentTimestamp = js.Date

type Description = java.lang.String

type Ec2InstanceId = java.lang.String

type EndpointURL = java.lang.String

type EnvironmentArn = java.lang.String

type EnvironmentDescriptionsList = js.Array[EnvironmentDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Green_
  - typings.awsSdk.awsSdkStrings.Yellow_
  - typings.awsSdk.awsSdkStrings.Red_
  - typings.awsSdk.awsSdkStrings.Grey
  - java.lang.String
*/
type EnvironmentHealth = _EnvironmentHealth | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Status_
  - typings.awsSdk.awsSdkStrings.Color_
  - typings.awsSdk.awsSdkStrings.Causes
  - typings.awsSdk.awsSdkStrings.ApplicationMetrics
  - typings.awsSdk.awsSdkStrings.InstancesHealth
  - typings.awsSdk.awsSdkStrings.All_
  - typings.awsSdk.awsSdkStrings.HealthStatus
  - typings.awsSdk.awsSdkStrings.RefreshedAt
  - java.lang.String
*/
type EnvironmentHealthAttribute = _EnvironmentHealthAttribute | java.lang.String

type EnvironmentHealthAttributes = js.Array[EnvironmentHealthAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NoData_
  - typings.awsSdk.awsSdkStrings.Unknown_
  - typings.awsSdk.awsSdkStrings.Pending_
  - typings.awsSdk.awsSdkStrings.Ok_
  - typings.awsSdk.awsSdkStrings.Info_
  - typings.awsSdk.awsSdkStrings.Warning_
  - typings.awsSdk.awsSdkStrings.Degraded_
  - typings.awsSdk.awsSdkStrings.Severe
  - typings.awsSdk.awsSdkStrings.Suspended_
  - java.lang.String
*/
type EnvironmentHealthStatus = _EnvironmentHealthStatus | java.lang.String

type EnvironmentId = java.lang.String

type EnvironmentIdList = js.Array[EnvironmentId]

type EnvironmentInfoDescriptionList = js.Array[EnvironmentInfoDescription]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.tail_
  - typings.awsSdk.awsSdkStrings.bundle
  - java.lang.String
*/
type EnvironmentInfoType = _EnvironmentInfoType | java.lang.String

type EnvironmentLinks = js.Array[EnvironmentLink]

type EnvironmentName = java.lang.String

type EnvironmentNamesList = js.Array[EnvironmentName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Aborting_
  - typings.awsSdk.awsSdkStrings.Launching_
  - typings.awsSdk.awsSdkStrings.Updating_
  - typings.awsSdk.awsSdkStrings.LinkingFrom
  - typings.awsSdk.awsSdkStrings.LinkingTo
  - typings.awsSdk.awsSdkStrings.Ready_
  - typings.awsSdk.awsSdkStrings.Terminating_
  - typings.awsSdk.awsSdkStrings.Terminated_
  - java.lang.String
*/
type EnvironmentStatus = _EnvironmentStatus | java.lang.String

type EventDate = js.Date

type EventDescriptionList = js.Array[EventDescription]

type EventMessage = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRACE
  - typings.awsSdk.awsSdkStrings.DEBUG
  - typings.awsSdk.awsSdkStrings.INFO
  - typings.awsSdk.awsSdkStrings.WARN
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.FATAL
  - java.lang.String
*/
type EventSeverity = _EventSeverity | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UpdateCancelled
  - typings.awsSdk.awsSdkStrings.CancellationFailed
  - typings.awsSdk.awsSdkStrings.RollbackFailed
  - typings.awsSdk.awsSdkStrings.RollbackSuccessful
  - typings.awsSdk.awsSdkStrings.InternalFailure
  - typings.awsSdk.awsSdkStrings.InvalidEnvironmentState
  - typings.awsSdk.awsSdkStrings.PermissionsError
  - java.lang.String
*/
type FailureType = _FailureType | java.lang.String

type FileTypeExtension = java.lang.String

type ForceTerminate = Boolean

type GroupName = java.lang.String

type ImageId = java.lang.String

type IncludeDeleted = Boolean

type IncludeDeletedBackTo = js.Date

type InstanceHealthList = js.Array[SingleInstanceHealth]

type InstanceId = java.lang.String

type InstanceList = js.Array[Instance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HealthStatus
  - typings.awsSdk.awsSdkStrings.Color_
  - typings.awsSdk.awsSdkStrings.Causes
  - typings.awsSdk.awsSdkStrings.ApplicationMetrics
  - typings.awsSdk.awsSdkStrings.RefreshedAt
  - typings.awsSdk.awsSdkStrings.LaunchedAt
  - typings.awsSdk.awsSdkStrings.System_
  - typings.awsSdk.awsSdkStrings.Deployment_
  - typings.awsSdk.awsSdkStrings.AvailabilityZone
  - typings.awsSdk.awsSdkStrings.InstanceType
  - typings.awsSdk.awsSdkStrings.All_
  - java.lang.String
*/
type InstancesHealthAttribute = _InstancesHealthAttribute | java.lang.String

type InstancesHealthAttributes = js.Array[InstancesHealthAttribute]

type Integer = Double

type LaunchConfigurationList = js.Array[LaunchConfiguration]

type LaunchTemplateList = js.Array[LaunchTemplate]

type LaunchedAt = js.Date

type LoadAverage = js.Array[LoadAverageValue]

type LoadAverageValue = Double

type LoadBalancerList = js.Array[LoadBalancer]

type LoadBalancerListenersDescription = js.Array[Listener]

type Maintainer = java.lang.String

type ManagedActionHistoryItems = js.Array[ManagedActionHistoryItem]

type ManagedActionHistoryMaxItems = Double

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

type OperationsRole = java.lang.String

type OptionNamespace = java.lang.String

type OptionRestrictionMaxLength = Double

type OptionRestrictionMaxValue = Double

type OptionRestrictionMinValue = Double

type OptionsSpecifierList = js.Array[OptionSpecification]

type PlatformArn = java.lang.String

type PlatformBranchLifecycleState = java.lang.String

type PlatformBranchMaxRecords = Double

type PlatformBranchSummaryList = js.Array[PlatformBranchSummary]

type PlatformCategory = java.lang.String

type PlatformFilterOperator = java.lang.String

type PlatformFilterType = java.lang.String

type PlatformFilterValue = java.lang.String

type PlatformFilterValueList = js.Array[PlatformFilterValue]

type PlatformFilters = js.Array[PlatformFilter]

type PlatformFrameworks = js.Array[PlatformFramework]

type PlatformLifecycleState = java.lang.String

type PlatformMaxRecords = Double

type PlatformName = java.lang.String

type PlatformOwner = java.lang.String

type PlatformProgrammingLanguages = js.Array[PlatformProgrammingLanguage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Ready_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - java.lang.String
*/
type PlatformStatus = _PlatformStatus | java.lang.String

type PlatformSummaryList = js.Array[PlatformSummary]

type PlatformVersion = java.lang.String

type QueueList = js.Array[Queue]

type RefreshedAt = js.Date

type RegexLabel = java.lang.String

type RegexPattern = java.lang.String

type RequestCount = Double

type RequestId = java.lang.String

type ResourceArn = java.lang.String

type ResourceId = java.lang.String

type ResourceName = java.lang.String

type S3Bucket = java.lang.String

type S3Key = java.lang.String

type SampleTimestamp = js.Date

type SearchFilterAttribute = java.lang.String

type SearchFilterOperator = java.lang.String

type SearchFilterValue = java.lang.String

type SearchFilterValues = js.Array[SearchFilterValue]

type SearchFilters = js.Array[SearchFilter]

type SolutionStackFileTypeList = js.Array[FileTypeExtension]

type SolutionStackName = java.lang.String

type SourceLocation = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CodeCommit_
  - typings.awsSdk.awsSdkStrings.S3
  - java.lang.String
*/
type SourceRepository = _SourceRepository | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Git
  - typings.awsSdk.awsSdkStrings.Zip_
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

type TimeFilterEnd = js.Date

type TimeFilterStart = js.Date

type Timestamp = js.Date

type Token = java.lang.String

type TriggerList = js.Array[Trigger]

type UpdateDate = js.Date

type UserDefinedOption = Boolean

type ValidationMessageString = java.lang.String

type ValidationMessagesList = js.Array[ValidationMessage]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.error__
  - typings.awsSdk.awsSdkStrings.warning__
  - java.lang.String
*/
type ValidationSeverity = _ValidationSeverity | java.lang.String

type VersionLabel = java.lang.String

type VersionLabels = js.Array[VersionLabel]

type VersionLabelsList = js.Array[VersionLabel]

type VirtualizationType = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2010-12-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
