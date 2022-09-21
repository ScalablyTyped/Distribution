package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.STRINGEQUALS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ARN = String

type AccountId = String

type AdvancedBackupSettings = js.Array[AdvancedBackupSetting]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.ABORTING
  - typings.awsSdk.awsSdkStrings.ABORTED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type BackupJobState = _BackupJobState | String

type BackupJobsList = js.Array[BackupJob]

type BackupOptionKey = String

type BackupOptionValue = String

type BackupOptions = StringDictionary[BackupOptionValue]

type BackupPlanName = String

type BackupPlanTemplatesList = js.Array[BackupPlanTemplatesListMember]

type BackupPlanVersionsList = js.Array[BackupPlansListMember]

type BackupPlansList = js.Array[BackupPlansListMember]

type BackupRuleName = String

type BackupRules = js.Array[BackupRule]

type BackupRulesInput = js.Array[BackupRuleInput]

type BackupSelectionName = String

type BackupSelectionsList = js.Array[BackupSelectionsListMember]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BACKUP_JOB_STARTED
  - typings.awsSdk.awsSdkStrings.BACKUP_JOB_COMPLETED
  - typings.awsSdk.awsSdkStrings.BACKUP_JOB_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.BACKUP_JOB_FAILED
  - typings.awsSdk.awsSdkStrings.BACKUP_JOB_EXPIRED
  - typings.awsSdk.awsSdkStrings.RESTORE_JOB_STARTED
  - typings.awsSdk.awsSdkStrings.RESTORE_JOB_COMPLETED
  - typings.awsSdk.awsSdkStrings.RESTORE_JOB_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.RESTORE_JOB_FAILED
  - typings.awsSdk.awsSdkStrings.COPY_JOB_STARTED
  - typings.awsSdk.awsSdkStrings.COPY_JOB_SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.COPY_JOB_FAILED
  - typings.awsSdk.awsSdkStrings.RECOVERY_POINT_MODIFIED
  - typings.awsSdk.awsSdkStrings.BACKUP_PLAN_CREATED
  - typings.awsSdk.awsSdkStrings.BACKUP_PLAN_MODIFIED
  - typings.awsSdk.awsSdkStrings.S3_BACKUP_OBJECT_FAILED
  - typings.awsSdk.awsSdkStrings.S3_RESTORE_OBJECT_FAILED
  - java.lang.String
*/
type BackupVaultEvent = _BackupVaultEvent | String

type BackupVaultEvents = js.Array[BackupVaultEvent]

type BackupVaultList = js.Array[BackupVaultListMember]

type BackupVaultName = String

type Boolean = scala.Boolean

type ComplianceResourceIdList = js.Array[String]

type ConditionKey = String

type ConditionParameters = js.Array[ConditionParameter]

type ConditionType = STRINGEQUALS | String

type ConditionValue = String

type ControlInputParameters = js.Array[ControlInputParameter]

type ControlName = String

type CopyActions = js.Array[CopyAction]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CopyJobState = _CopyJobState | String

type CopyJobsList = js.Array[CopyJob]

type CronExpression = String

type FormatList = js.Array[String]

type FrameworkControls = js.Array[FrameworkControl]

type FrameworkDescription = String

type FrameworkList = js.Array[Framework]

type FrameworkName = String

type GlobalSettings = StringDictionary[GlobalSettingsValue]

type GlobalSettingsName = String

type GlobalSettingsValue = String

type IAMPolicy = String

type IAMRoleArn = String

type IsEnabled = scala.Boolean

type ListOfTags = js.Array[Condition]

type Long_ = Double

type MaxFrameworkInputs = Double

type MaxResults = Double

type Metadata = StringDictionary[MetadataValue]

type MetadataKey = String

type MetadataValue = String

type ParameterName = String

type ParameterValue = String

type ProtectedResourcesList = js.Array[ProtectedResource]

type RecoveryPointByBackupVaultList = js.Array[RecoveryPointByBackupVault]

type RecoveryPointByResourceList = js.Array[RecoveryPointByResource]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.PARTIAL
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type RecoveryPointStatus = _RecoveryPointStatus | String

type ReportJobId = String

type ReportJobList = js.Array[ReportJob]

type ReportPlanDescription = String

type ReportPlanList = js.Array[ReportPlan]

type ReportPlanName = String

type ResourceArns = js.Array[ARN]

type ResourceType = String

type ResourceTypeList = js.Array[ARN]

type ResourceTypeManagementPreference = StringDictionary[IsEnabled]

type ResourceTypeOptInPreference = StringDictionary[IsEnabled]

type ResourceTypes = js.Array[ResourceType]

type RestoreJobId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.ABORTED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type RestoreJobStatus = _RestoreJobStatus | String

type RestoreJobsList = js.Array[RestoreJobsListMember]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WARM
  - typings.awsSdk.awsSdkStrings.COLD
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type StorageClass = _StorageClass | String

type TagKey = String

type TagKeyList = js.Array[String]

type TagValue = String

type Tags = StringDictionary[TagValue]

type WindowMinutes = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2018-11-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type integer = Double

type long = Double

type stringList = js.Array[String]

type stringMap = StringDictionary[String]

type timestamp = js.Date
