package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsBackupMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.awsDashSdkStrings.STRINGEQUALS
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type ARN = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATED
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.ABORTING
    - typings.awsDashSdk.awsDashSdkStrings.ABORTED
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - java.lang.String
  */
  type BackupJobState = _BackupJobState | String
  type BackupJobsList = js.Array[BackupJob]
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
    - typings.awsDashSdk.awsDashSdkStrings.BACKUP_JOB_STARTED
    - typings.awsDashSdk.awsDashSdkStrings.BACKUP_JOB_COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.RESTORE_JOB_STARTED
    - typings.awsDashSdk.awsDashSdkStrings.RESTORE_JOB_COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.RECOVERY_POINT_MODIFIED
    - typings.awsDashSdk.awsDashSdkStrings.BACKUP_PLAN_CREATED
    - typings.awsDashSdk.awsDashSdkStrings.BACKUP_PLAN_MODIFIED
    - java.lang.String
  */
  type BackupVaultEvent = _BackupVaultEvent | String
  type BackupVaultEvents = js.Array[BackupVaultEvent]
  type BackupVaultList = js.Array[BackupVaultListMember]
  type BackupVaultName = String
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ConditionKey = String
  type ConditionType = STRINGEQUALS | String
  type ConditionValue = String
  type CronExpression = String
  type IAMPolicy = String
  type IAMRoleArn = String
  type ListOfTags = js.Array[Condition]
  type Long = Double
  type MaxResults = Double
  type Metadata = StringDictionary[MetadataValue]
  type MetadataKey = String
  type MetadataValue = String
  type ProtectedResourcesList = js.Array[ProtectedResource]
  type RecoveryPointByBackupVaultList = js.Array[RecoveryPointByBackupVault]
  type RecoveryPointByResourceList = js.Array[RecoveryPointByResource]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.PARTIAL
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - java.lang.String
  */
  type RecoveryPointStatus = _RecoveryPointStatus | String
  type ResourceArns = js.Array[ARN]
  type ResourceType = String
  type ResourceTypes = js.Array[ResourceType]
  type RestoreJobId = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.RUNNING
    - typings.awsDashSdk.awsDashSdkStrings.COMPLETED
    - typings.awsDashSdk.awsDashSdkStrings.ABORTED
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type RestoreJobStatus = _RestoreJobStatus | String
  type RestoreJobsList = js.Array[RestoreJobsListMember]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.WARM
    - typings.awsDashSdk.awsDashSdkStrings.COLD
    - typings.awsDashSdk.awsDashSdkStrings.DELETED
    - java.lang.String
  */
  type StorageClass = _StorageClass | String
  type TagKey = String
  type TagKeyList = js.Array[String]
  type TagValue = String
  type Tags = StringDictionary[TagValue]
  type WindowMinutes = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-11-15`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
  type long = Double
  type timestamp = Date
}
