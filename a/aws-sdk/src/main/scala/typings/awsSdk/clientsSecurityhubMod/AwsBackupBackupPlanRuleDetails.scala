package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsBackupBackupPlanRuleDetails extends StObject {
  
  /**
    * A value in minutes after a backup job is successfully started before it must be completed, or it is canceled by Backup. 
    */
  var CompletionWindowMinutes: js.UndefOr[Long] = js.undefined
  
  /**
    * An array of CopyAction objects, which contains the details of the copy operation. 
    */
  var CopyActions: js.UndefOr[AwsBackupBackupPlanRuleCopyActionsList] = js.undefined
  
  /**
    * Specifies whether Backup creates continuous backups capable of point-in-time restore (PITR). 
    */
  var EnableContinuousBackup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Defines when a protected resource is transitioned to cold storage and when it expires. Backup transitions and expires backups automatically according to the lifecycle that you define. If you do not specify a lifecycle, Backup applies the lifecycle policy of the source backup to the destination backup. Backups transitioned to cold storage must be stored in cold storage for a minimum of 90 days.
    */
  var Lifecycle: js.UndefOr[AwsBackupBackupPlanLifecycleDetails] = js.undefined
  
  /**
    * Uniquely identifies a rule that is used to schedule the backup of a selection of resources. 
    */
  var RuleId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A display name for a backup rule. Must contain 1 to 50 alphanumeric or '-_.' characters. 
    */
  var RuleName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A cron expression in UTC specifying when Backup initiates a backup job. 
    */
  var ScheduleExpression: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A value in minutes after a backup is scheduled before a job will be canceled if it doesn't start successfully. 
    */
  var StartWindowMinutes: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of a logical container where backups are stored. Backup vaults are identified by names that are unique to the Amazon Web Services account used to create them and the Amazon Web Services Region where they are created. They consist of letters, numbers, and hyphens. 
    */
  var TargetBackupVault: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsBackupBackupPlanRuleDetails {
  
  inline def apply(): AwsBackupBackupPlanRuleDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsBackupBackupPlanRuleDetails]
  }
  
  extension [Self <: AwsBackupBackupPlanRuleDetails](x: Self) {
    
    inline def setCompletionWindowMinutes(value: Long): Self = StObject.set(x, "CompletionWindowMinutes", value.asInstanceOf[js.Any])
    
    inline def setCompletionWindowMinutesUndefined: Self = StObject.set(x, "CompletionWindowMinutes", js.undefined)
    
    inline def setCopyActions(value: AwsBackupBackupPlanRuleCopyActionsList): Self = StObject.set(x, "CopyActions", value.asInstanceOf[js.Any])
    
    inline def setCopyActionsUndefined: Self = StObject.set(x, "CopyActions", js.undefined)
    
    inline def setCopyActionsVarargs(value: AwsBackupBackupPlanRuleCopyActionsDetails*): Self = StObject.set(x, "CopyActions", js.Array(value*))
    
    inline def setEnableContinuousBackup(value: Boolean): Self = StObject.set(x, "EnableContinuousBackup", value.asInstanceOf[js.Any])
    
    inline def setEnableContinuousBackupUndefined: Self = StObject.set(x, "EnableContinuousBackup", js.undefined)
    
    inline def setLifecycle(value: AwsBackupBackupPlanLifecycleDetails): Self = StObject.set(x, "Lifecycle", value.asInstanceOf[js.Any])
    
    inline def setLifecycleUndefined: Self = StObject.set(x, "Lifecycle", js.undefined)
    
    inline def setRuleId(value: NonEmptyString): Self = StObject.set(x, "RuleId", value.asInstanceOf[js.Any])
    
    inline def setRuleIdUndefined: Self = StObject.set(x, "RuleId", js.undefined)
    
    inline def setRuleName(value: NonEmptyString): Self = StObject.set(x, "RuleName", value.asInstanceOf[js.Any])
    
    inline def setRuleNameUndefined: Self = StObject.set(x, "RuleName", js.undefined)
    
    inline def setScheduleExpression(value: NonEmptyString): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setStartWindowMinutes(value: Long): Self = StObject.set(x, "StartWindowMinutes", value.asInstanceOf[js.Any])
    
    inline def setStartWindowMinutesUndefined: Self = StObject.set(x, "StartWindowMinutes", js.undefined)
    
    inline def setTargetBackupVault(value: NonEmptyString): Self = StObject.set(x, "TargetBackupVault", value.asInstanceOf[js.Any])
    
    inline def setTargetBackupVaultUndefined: Self = StObject.set(x, "TargetBackupVault", js.undefined)
  }
}
