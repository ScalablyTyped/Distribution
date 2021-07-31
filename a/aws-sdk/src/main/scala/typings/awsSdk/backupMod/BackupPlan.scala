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
    * The display name of a backup plan.
    */
  var BackupPlanName: typings.awsSdk.backupMod.BackupPlanName
  
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources. 
    */
  var Rules: BackupRules
}
object BackupPlan {
  
  @scala.inline
  def apply(BackupPlanName: BackupPlanName, Rules: BackupRules): BackupPlan = {
    val __obj = js.Dynamic.literal(BackupPlanName = BackupPlanName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPlan]
  }
  
  @scala.inline
  implicit class BackupPlanMutableBuilder[Self <: BackupPlan] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvancedBackupSettings(value: AdvancedBackupSettings): Self = StObject.set(x, "AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedBackupSettingsUndefined: Self = StObject.set(x, "AdvancedBackupSettings", js.undefined)
    
    @scala.inline
    def setAdvancedBackupSettingsVarargs(value: AdvancedBackupSetting*): Self = StObject.set(x, "AdvancedBackupSettings", js.Array(value :_*))
    
    @scala.inline
    def setBackupPlanName(value: BackupPlanName): Self = StObject.set(x, "BackupPlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRules(value: BackupRules): Self = StObject.set(x, "Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: BackupRule*): Self = StObject.set(x, "Rules", js.Array(value :_*))
  }
}
