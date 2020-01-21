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
  def apply(BackupPlanDocument: BackupPlan = null): GetBackupPlanFromTemplateOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanDocument != null) __obj.updateDynamic("BackupPlanDocument")(BackupPlanDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupPlanFromTemplateOutput]
  }
}

