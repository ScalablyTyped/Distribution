package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupRule extends StObject {
  
  /**
    * A value in minutes after a backup job is successfully started before it must be completed or it will be canceled by AWS Backup. This value is optional.
    */
  var CompletionWindowMinutes: js.UndefOr[WindowMinutes] = js.undefined
  
  /**
    * An array of CopyAction objects, which contains the details of the copy operation.
    */
  var CopyActions: js.UndefOr[typings.awsSdk.backupMod.CopyActions] = js.undefined
  
  /**
    * The lifecycle defines when a protected resource is transitioned to cold storage and when it expires. AWS Backup transitions and expires backups automatically according to the lifecycle that you define.  Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days. Therefore, the “expire after days” setting must be 90 days greater than the “transition to cold after days” setting. The “transition to cold after days” setting cannot be changed after a backup has been transitioned to cold. 
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
    * An optional display name for a backup rule.
    */
  var RuleName: BackupRuleName
  
  /**
    * A CRON expression specifying when AWS Backup initiates a backup job. For more information about cron expressions, see Schedule Expressions for Rules in the Amazon CloudWatch Events User Guide.. Prior to specifying a value for this parameter, we recommend testing your cron expression using one of the many available cron generator and testing tools.
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
    
    inline def setCopyActionsVarargs(value: CopyAction*): Self = StObject.set(x, "CopyActions", js.Array(value :_*))
    
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
