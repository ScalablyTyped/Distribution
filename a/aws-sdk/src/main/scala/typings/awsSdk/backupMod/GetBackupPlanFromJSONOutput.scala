package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupPlanFromJSONOutput extends js.Object {
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: js.UndefOr[typings.awsSdk.backupMod.BackupPlan] = js.native
}

object GetBackupPlanFromJSONOutput {
  @scala.inline
  def apply(): GetBackupPlanFromJSONOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupPlanFromJSONOutput]
  }
  @scala.inline
  implicit class GetBackupPlanFromJSONOutputOps[Self <: GetBackupPlanFromJSONOutput] (val x: Self) extends AnyVal {
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
    def setBackupPlan(value: BackupPlan): Self = this.set("BackupPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupPlan: Self = this.set("BackupPlan", js.undefined)
  }
  
}

