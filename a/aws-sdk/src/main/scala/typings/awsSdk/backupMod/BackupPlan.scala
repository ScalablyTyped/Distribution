package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackupPlan extends js.Object {
  /**
    * The display name of a backup plan.
    */
  var BackupPlanName: typings.awsSdk.backupMod.BackupPlanName = js.native
  /**
    * An array of BackupRule objects, each of which specifies a scheduled task that is used to back up a selection of resources. 
    */
  var Rules: BackupRules = js.native
}

object BackupPlan {
  @scala.inline
  def apply(BackupPlanName: BackupPlanName, Rules: BackupRules): BackupPlan = {
    val __obj = js.Dynamic.literal(BackupPlanName = BackupPlanName.asInstanceOf[js.Any], Rules = Rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupPlan]
  }
  @scala.inline
  implicit class BackupPlanOps[Self <: BackupPlan] (val x: Self) extends AnyVal {
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
    def setRulesVarargs(value: BackupRule*): Self = this.set("Rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: BackupRules): Self = this.set("Rules", value.asInstanceOf[js.Any])
  }
  
}

