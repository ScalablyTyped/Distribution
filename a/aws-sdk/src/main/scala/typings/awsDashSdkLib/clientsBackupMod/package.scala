package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsBackupMod {
  type ARN = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.ABORTING
    - awsDashSdkLib.awsDashSdkLibStrings.ABORTED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type BackupJobState = _BackupJobState | java.lang.String
  type BackupJobsList = js.Array[BackupJob]
  type BackupPlanName = java.lang.String
  type BackupPlanTemplatesList = js.Array[BackupPlanTemplatesListMember]
  type BackupPlanVersionsList = js.Array[BackupPlansListMember]
  type BackupPlansList = js.Array[BackupPlansListMember]
  type BackupRuleName = java.lang.String
  type BackupRules = js.Array[BackupRule]
  type BackupRulesInput = js.Array[BackupRuleInput]
  type BackupSelectionName = java.lang.String
  type BackupSelectionsList = js.Array[BackupSelectionsListMember]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BACKUP_JOB_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.BACKUP_JOB_COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.RESTORE_JOB_STARTED
    - awsDashSdkLib.awsDashSdkLibStrings.RESTORE_JOB_COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.RECOVERY_POINT_MODIFIED
    - awsDashSdkLib.awsDashSdkLibStrings.BACKUP_PLAN_CREATED
    - awsDashSdkLib.awsDashSdkLibStrings.BACKUP_PLAN_MODIFIED
    - java.lang.String
  */
  type BackupVaultEvent = _BackupVaultEvent | java.lang.String
  type BackupVaultEvents = js.Array[BackupVaultEvent]
  type BackupVaultList = js.Array[BackupVaultListMember]
  type BackupVaultName = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ConditionKey = java.lang.String
  type ConditionType = awsDashSdkLib.awsDashSdkLibStrings.STRINGEQUALS | java.lang.String
  type ConditionValue = java.lang.String
  type CronExpression = java.lang.String
  type IAMPolicy = java.lang.String
  type IAMRoleArn = java.lang.String
  type ListOfTags = js.Array[Condition]
  type Long = scala.Double
  type MaxResults = scala.Double
  type Metadata = org.scalablytyped.runtime.StringDictionary[MetadataValue]
  type MetadataKey = java.lang.String
  type MetadataValue = java.lang.String
  type ProtectedResourcesList = js.Array[ProtectedResource]
  type RecoveryPointByBackupVaultList = js.Array[RecoveryPointByBackupVault]
  type RecoveryPointByResourceList = js.Array[RecoveryPointByResource]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.PARTIAL
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
    - java.lang.String
  */
  type RecoveryPointStatus = _RecoveryPointStatus | java.lang.String
  type ResourceArns = js.Array[ARN]
  type ResourceType = java.lang.String
  type ResourceTypes = js.Array[ResourceType]
  type RestoreJobId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.RUNNING
    - awsDashSdkLib.awsDashSdkLibStrings.COMPLETED
    - awsDashSdkLib.awsDashSdkLibStrings.ABORTED
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type RestoreJobStatus = _RestoreJobStatus | java.lang.String
  type RestoreJobsList = js.Array[RestoreJobsListMember]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.WARM
    - awsDashSdkLib.awsDashSdkLibStrings.COLD
    - awsDashSdkLib.awsDashSdkLibStrings.DELETED
    - java.lang.String
  */
  type StorageClass = _StorageClass | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[java.lang.String]
  type TagValue = java.lang.String
  type Tags = org.scalablytyped.runtime.StringDictionary[TagValue]
  type WindowMinutes = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-11-15`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
  type long = scala.Double
  type timestamp = stdLib.Date
}
