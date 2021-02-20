package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object backupMod {
  
  type ARN = java.lang.String
  
  type AccountId = java.lang.String
  
  type AdvancedBackupSettings = js.Array[typings.awsSdk.backupMod.AdvancedBackupSetting]
  
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
  type BackupJobState = typings.awsSdk.backupMod._BackupJobState | java.lang.String
  
  type BackupJobsList = js.Array[typings.awsSdk.backupMod.BackupJob]
  
  type BackupOptionKey = java.lang.String
  
  type BackupOptionValue = java.lang.String
  
  type BackupOptions = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.backupMod.BackupOptionValue]
  
  type BackupPlanName = java.lang.String
  
  type BackupPlanTemplatesList = js.Array[typings.awsSdk.backupMod.BackupPlanTemplatesListMember]
  
  type BackupPlanVersionsList = js.Array[typings.awsSdk.backupMod.BackupPlansListMember]
  
  type BackupPlansList = js.Array[typings.awsSdk.backupMod.BackupPlansListMember]
  
  type BackupRuleName = java.lang.String
  
  type BackupRules = js.Array[typings.awsSdk.backupMod.BackupRule]
  
  type BackupRulesInput = js.Array[typings.awsSdk.backupMod.BackupRuleInput]
  
  type BackupSelectionName = java.lang.String
  
  type BackupSelectionsList = js.Array[typings.awsSdk.backupMod.BackupSelectionsListMember]
  
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
    - java.lang.String
  */
  type BackupVaultEvent = typings.awsSdk.backupMod._BackupVaultEvent | java.lang.String
  
  type BackupVaultEvents = js.Array[typings.awsSdk.backupMod.BackupVaultEvent]
  
  type BackupVaultList = js.Array[typings.awsSdk.backupMod.BackupVaultListMember]
  
  type BackupVaultName = java.lang.String
  
  type Boolean = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.backupMod.ClientApiVersions
  
  type ConditionKey = java.lang.String
  
  type ConditionType = typings.awsSdk.awsSdkStrings.STRINGEQUALS | java.lang.String
  
  type ConditionValue = java.lang.String
  
  type CopyActions = js.Array[typings.awsSdk.backupMod.CopyAction]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CopyJobState = typings.awsSdk.backupMod._CopyJobState | java.lang.String
  
  type CopyJobsList = js.Array[typings.awsSdk.backupMod.CopyJob]
  
  type CronExpression = java.lang.String
  
  type GlobalSettings = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.backupMod.GlobalSettingsValue]
  
  type GlobalSettingsName = java.lang.String
  
  type GlobalSettingsValue = java.lang.String
  
  type IAMPolicy = java.lang.String
  
  type IAMRoleArn = java.lang.String
  
  type IsEnabled = scala.Boolean
  
  type ListOfTags = js.Array[typings.awsSdk.backupMod.Condition]
  
  type Long_ = scala.Double
  
  type MaxResults = scala.Double
  
  type Metadata = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.backupMod.MetadataValue]
  
  type MetadataKey = java.lang.String
  
  type MetadataValue = java.lang.String
  
  type ProtectedResourcesList = js.Array[typings.awsSdk.backupMod.ProtectedResource]
  
  type RecoveryPointByBackupVaultList = js.Array[typings.awsSdk.backupMod.RecoveryPointByBackupVault]
  
  type RecoveryPointByResourceList = js.Array[typings.awsSdk.backupMod.RecoveryPointByResource]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.PARTIAL
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.EXPIRED
    - java.lang.String
  */
  type RecoveryPointStatus = typings.awsSdk.backupMod._RecoveryPointStatus | java.lang.String
  
  type ResourceArns = js.Array[typings.awsSdk.backupMod.ARN]
  
  type ResourceType = java.lang.String
  
  type ResourceTypeOptInPreference = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.backupMod.IsEnabled]
  
  type ResourceTypes = js.Array[typings.awsSdk.backupMod.ResourceType]
  
  type RestoreJobId = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PENDING
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - typings.awsSdk.awsSdkStrings.ABORTED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type RestoreJobStatus = typings.awsSdk.backupMod._RestoreJobStatus | java.lang.String
  
  type RestoreJobsList = js.Array[typings.awsSdk.backupMod.RestoreJobsListMember]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.WARM
    - typings.awsSdk.awsSdkStrings.COLD
    - typings.awsSdk.awsSdkStrings.DELETED
    - java.lang.String
  */
  type StorageClass = typings.awsSdk.backupMod._StorageClass | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[java.lang.String]
  
  type TagValue = java.lang.String
  
  type Tags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.backupMod.TagValue]
  
  type WindowMinutes = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-11-15`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.backupMod._apiVersion | java.lang.String
  
  type long = scala.Double
  
  type timestamp = typings.std.Date
}
