package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackupPlanInput extends js.Object {
  
  /**
    * Specifies a list of BackupOptions for each resource type. These settings are only available for Windows VSS backup jobs.
    */
  var AdvancedBackupSettings: js.UndefOr[typings.awsSdk.backupMod.AdvancedBackupSettings] = js.native
  
  /**
    * The optional display name of a backup plan.
    */
  var BackupPlanName: typings.awsSdk.backupMod.BackupPlanName = js.native
  
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources.
    */
  var Rules: BackupRulesInput = js.native
}
object BackupPlanInput {
  
  @scala.inline
  def apply(BackupPlanName: BackupPlanName, Rules: BackupRulesInput): BackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlanName = BackupPlanName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPlanInput]
  }
  
  @scala.inline
  implicit class BackupPlanInputOps[Self <: BackupPlanInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBackupPlanName(value: BackupPlanName): Self = this.set("BackupPlanName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRulesVarargs(value: BackupRuleInput*): Self = this.set("Rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: BackupRulesInput): Self = this.set("Rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedBackupSettingsVarargs(value: AdvancedBackupSetting*): Self = this.set("AdvancedBackupSettings", js.Array(value :_*))
    
    @scala.inline
    def setAdvancedBackupSettings(value: AdvancedBackupSettings): Self = this.set("AdvancedBackupSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedBackupSettings: Self = this.set("AdvancedBackupSettings", js.undefined)
  }
}
