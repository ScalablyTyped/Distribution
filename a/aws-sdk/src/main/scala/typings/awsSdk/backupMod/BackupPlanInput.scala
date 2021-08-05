package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupPlanInput extends StObject {
  
  /**
    * Specifies a list of BackupOptions for each resource type. These settings are only available for Windows VSS backup jobs.
    */
  var AdvancedBackupSettings: js.UndefOr[typings.awsSdk.backupMod.AdvancedBackupSettings] = js.undefined
  
  /**
    * The optional display name of a backup plan.
    */
  var BackupPlanName: typings.awsSdk.backupMod.BackupPlanName
  
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources.
    */
  var Rules: BackupRulesInput
}
object BackupPlanInput {
  
  inline def apply(BackupPlanName: BackupPlanName, Rules: BackupRulesInput): BackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlanName = BackupPlanName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPlanInput]
  }
  
  extension [Self <: BackupPlanInput](x: Self) {
    
    inline def setAdvancedBackupSettings(value: AdvancedBackupSettings): Self = StObject.set(x, "AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    inline def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "AdvancedBackupSettings", js.undefined)
    
    inline def setAdvancedBackupSettingsVarargs(value: AdvancedBackupSetting*): Self = StObject.set(x, "AdvancedBackupSettings", js.Array(value :_*))
    
    inline def setBackupPlanName(value: BackupPlanName): Self = StObject.set(x, "BackupPlanName", value.asInstanceOf[js.Any])
    
    inline def setRules(value: BackupRulesInput): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: BackupRuleInput*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
