package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupPlanInput extends StObject {
  
  /**
    * Specifies a list of BackupOptions for each resource type. These settings are only available for Windows Volume Shadow Copy Service (VSS) backup jobs.
    */
  var AdvancedBackupSettings: js.UndefOr[typings.awsSdk.clientsBackupMod.AdvancedBackupSettings] = js.undefined
  
  /**
    * The display name of a backup plan. Must contain 1 to 50 alphanumeric or '-_.' characters.
    */
  var BackupPlanName: typings.awsSdk.clientsBackupMod.BackupPlanName
  
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BackupPlanInput] (val x: Self) extends AnyVal {
    
    inline def setAdvancedBackupSettings(value: AdvancedBackupSettings): Self = StObject.set(x, "AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    inline def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "AdvancedBackupSettings", js.undefined)
    
    inline def setAdvancedBackupSettingsVarargs(value: AdvancedBackupSetting*): Self = StObject.set(x, "AdvancedBackupSettings", js.Array(value*))
    
    inline def setBackupPlanName(value: BackupPlanName): Self = StObject.set(x, "BackupPlanName", value.asInstanceOf[js.Any])
    
    inline def setRules(value: BackupRulesInput): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: BackupRuleInput*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
