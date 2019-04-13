package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupPlanFromTemplateOutput extends js.Object {
  /**
    * Returns the body of a backup plan based on the target template, including the name, rules, and backup vault of the plan.
    */
  var BackupPlanDocument: js.UndefOr[BackupPlan] = js.undefined
}

object GetBackupPlanFromTemplateOutput {
  @scala.inline
  def apply(BackupPlanDocument: BackupPlan = null): GetBackupPlanFromTemplateOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanDocument != null) __obj.updateDynamic("BackupPlanDocument")(BackupPlanDocument)
    __obj.asInstanceOf[GetBackupPlanFromTemplateOutput]
  }
}

