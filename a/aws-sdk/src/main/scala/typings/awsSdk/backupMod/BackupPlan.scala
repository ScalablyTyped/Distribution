package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackupPlan extends StObject {
  
  /**
    * Contains a list of BackupOptions for each resource type.
    */
  var AdvancedBackupSettings: js.UndefOr[typings.awsSdk.backupMod.AdvancedBackupSettings] = js.undefined
  
  /**
    * The display name of a backup plan. Must contain 1 to 50 alphanumeric or '-_.' characters.
    */
  var BackupPlanName: typings.awsSdk.backupMod.BackupPlanName
  
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources. 
    */
  var Rules: BackupRules
}
object BackupPlan {
  
  inline def apply(BackupPlanName: BackupPlanName, Rules: BackupRules): BackupPlan = {
    val __obj = js.Dynamic.literal(BackupPlanName = BackupPlanName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPlan]
  }
  
  extension [Self <: BackupPlan](x: Self) {
    
    inline def setAdvancedBackupSettings(value: AdvancedBackupSettings): Self = StObject.set(x, "AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    inline def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "AdvancedBackupSettings", js.undefined)
    
    inline def setAdvancedBackupSettingsVarargs(value: AdvancedBackupSetting*): Self = StObject.set(x, "AdvancedBackupSettings", js.Array(value*))
    
    inline def setBackupPlanName(value: BackupPlanName): Self = StObject.set(x, "BackupPlanName", value.asInstanceOf[js.Any])
    
    inline def setRules(value: BackupRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    inline def setRulesVarargs(value: BackupRule*): Self = StObject.set(x, "Rules", js.Array(value*))
  }
}
