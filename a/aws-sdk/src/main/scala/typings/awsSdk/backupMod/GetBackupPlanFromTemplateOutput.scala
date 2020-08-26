package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupPlanFromTemplateOutput extends js.Object {
  /**
    * Returns the body of a backup plan based on the target template, including the name, rules, and backup vault of the plan.
    */
  var BackupPlanDocument: js.UndefOr[BackupPlan] = js.native
}

object GetBackupPlanFromTemplateOutput {
  @scala.inline
  def apply(): GetBackupPlanFromTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupPlanFromTemplateOutput]
  }
  @scala.inline
  implicit class GetBackupPlanFromTemplateOutputOps[Self <: GetBackupPlanFromTemplateOutput] (val x: Self) extends AnyVal {
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
    def setBackupPlanDocument(value: BackupPlan): Self = this.set("BackupPlanDocument", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackupPlanDocument: Self = this.set("BackupPlanDocument", js.undefined)
  }
  
}

