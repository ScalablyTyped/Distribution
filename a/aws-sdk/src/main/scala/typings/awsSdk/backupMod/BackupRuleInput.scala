package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupRuleInput extends StObject {
  
  /**
    * A value in minutes after a backup job is successfully started before it must be completed or it will be canceled by AWS Backup. This value is optional.
    */
  var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  
  /**
    * An array of CopyAction objects, which contains the details of the copy operation.
    */
  var CopyActions: js.UndefOr[typings.awsSdk.backupMod.CopyActions] = js.undefined
  
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup will transition and expire backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
    */
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.undefined
  
  /**
    * To help organize your resources, you can assign your own metadata to the resources that you create. Each tag is a key-value pair.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.undefined
  
  /**
    * An optional display name for a backup rule.
    */
  var RuleName: BackupRuleName
  
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job.
    */
  var ScheduleExpression: js.UndefOr[CronExpression] = js.undefined
  
  /**
    * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully. This value is optional.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the AWS Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var TargetBackupVaultName: BackupVaultName
}
object BackupRuleInput {
  
  inline def apply(RuleName: BackupRuleName, TargetBackupVaultName: BackupVaultName): BackupRuleInput = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], TargetBackupVaultName = TargetBackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupRuleInput]
  }
  
  extension [Self <: BackupRuleInput](x: Self) {
    
    inline def setCompletionWindowMinutes(value: WindowMinutes): Self = StObject.set(x, "CompletionWindowMinutes", value.asInstanceOf[js.Any])
    
    inline def setCompletionWindowMinutesUndefined: Self = StObject.set(x, "CompletionWindowMinutes", js.undefined)
    
    inline def setCopyActions(value: CopyActions): Self = StObject.set(x, "CopyActions", value.asInstanceOf[js.Any])
    
    inline def setCopyActionsUndefined: Self = StObject.set(x, "CopyActions", js.undefined)
    
    inline def setCopyActionsVarargs(value: CopyAction*): Self = StObject.set(x, "CopyActions", js.Array(value :_*))
    
    inline def setLifecycle(value: Lifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setRecoveryPointTags(value: Tags): Self = StObject.set(x, "RecoveryPointTags", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointTagsUndefined: Self = StObject.set(x, "RecoveryPointTags", js.undefined)
    
    inline def setRuleName(value: BackupRuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpression(value: CronExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setStartWindowMinutes(value: WindowMinutes): Self = StObject.set(x, "StartWindowMinutes", value.asInstanceOf[js.Any])
    
    inline def setStartWindowMinutesUndefined: Self = StObject.set(x, "StartWindowMinutes", js.undefined)
    
    inline def setTargetBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "TargetBackupVaultName", value.asInstanceOf[js.Any])
  }
}
