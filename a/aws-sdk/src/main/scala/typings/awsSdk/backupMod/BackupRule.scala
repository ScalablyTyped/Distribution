package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupRule extends StObject {
  
  /**
    * A value in minutes after a backup job is successfully started before it must be completed or it will be canceled by Backup. This value is optional.
    */
  var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  
  /**
    * An array of CopyAction objects, which contains the details of the copy operation.
    */
  var CopyActions: js.UndefOr[typings.awsSdk.backupMod.CopyActions] = js.undefined
  
  /**
    * Specifies whether Backup creates continuous backups. True causes Backup to create continuous backups capable of point-in-time restore (PITR). False (or not specified) causes Backup to create snapshot backups.
    */
  var EnableContinuousBackup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “retention” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold.  Resource types that are able to be transitioned to cold storage are listed in the "Lifecycle to cold storage" section of the  Feature availability by resource table. Backup ignores this expression for other resource types.
    */
  var Lifecycle: js.UndefOr[typings.awsSdk.backupMod.Lifecycle] = js.undefined
  
  /**
    * An array of key-value pair strings that are assigned to resources that are associated with this rule when restored from backup.
    */
  var RecoveryPointTags: js.UndefOr[Tags] = js.undefined
  
  /**
    * Uniquely identifies a rule that is used to schedule the backup of a selection of resources.
    */
  var RuleId: js.UndefOr[String] = js.undefined
  
  /**
    * A display name for a backup rule. Must contain 1 to 50 alphanumeric or '-_.' characters.
    */
  var RuleName: BackupRuleName
  
  /**
    * A cron expression in UTC specifying when Backup initiates a backup job. For more information about Amazon Web Services cron expressions, see Schedule Expressions for Rules in the Amazon CloudWatch Events User Guide.. Two examples of Amazon Web Services cron expressions are  15 * ? * * * (take a backup every hour at 15 minutes past the hour) and 0 12 * * ? * (take a backup every day at 12 noon UTC). For a table of examples, click the preceding link and scroll down the page.
    */
  var ScheduleExpression: js.UndefOr[CronExpression] = js.undefined
  
  /**
    * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully. This value is optional.
    */
  var StartWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the account used to create them and the Amazon Web Services Region where they are created. They consist of lowercase letters, numbers, and hyphens.
    */
  var TargetBackupVaultName: BackupVaultName
}
object BackupRule {
  
  inline def apply(RuleName: BackupRuleName, TargetBackupVaultName: BackupVaultName): BackupRule = {
    val __obj = js.Dynamic.literal(RuleName = RuleName.asInstanceOf[js.Any], TargetBackupVaultName = TargetBackupVaultName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupRule]
  }
  
  extension [Self <: BackupRule](x: Self) {
    
    inline def setCompletionWindowMinutes(value: WindowMinutes): Self = StObject.set(x, "CompletionWindowMinutes", value.asInstanceOf[js.Any])
    
    inline def setCompletionWindowMinutesUndefined: Self = StObject.set(x, "CompletionWindowMinutes", js.undefined)
    
    inline def setCopyActions(value: CopyActions): Self = StObject.set(x, "CopyActions", value.asInstanceOf[js.Any])
    
    inline def setCopyActionsUndefined: Self = StObject.set(x, "CopyActions", js.undefined)
    
    inline def setCopyActionsVarargs(value: CopyAction*): Self = StObject.set(x, "CopyActions", js.Array(value*))
    
    inline def setEnableContinuousBackup(value: Boolean): Self = StObject.set(x, "EnableContinuousBackup", value.asInstanceOf[js.Any])
    
    inline def setEnableContinuousBackupUndefined: Self = StObject.set(x, "EnableContinuousBackup", js.undefined)
    
    inline def setLifecycle(value: Lifecycle): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setRecoveryPointTags(value: Tags): Self = StObject.set(x, "RecoveryPointTags", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointTagsUndefined: Self = StObject.set(x, "RecoveryPointTags", js.undefined)
    
    inline def setRuleId(value: String): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "RuleId", js.undefined)
    
    inline def setRuleName(value: BackupRuleName): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpression(value: CronExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setStartWindowMinutes(value: WindowMinutes): Self = StObject.set(x, "StartWindowMinutes", value.asInstanceOf[js.Any])
    
    inline def setStartWindowMinutesUndefined: Self = StObject.set(x, "StartWindowMinutes", js.undefined)
    
    inline def setTargetBackupVaultName(value: BackupVaultName): Self = StObject.set(x, "TargetBackupVaultName", value.asInstanceOf[js.Any])
  }
}
