package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupPlanFromJSONOutput extends js.Object {
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: js.UndefOr[BackupPlan] = js.undefined
}

object GetBackupPlanFromJSONOutput {
  @scala.inline
  def apply(BackupPlan: BackupPlan = null): GetBackupPlanFromJSONOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlan != null) __obj.updateDynamic("BackupPlan")(BackupPlan)
    __obj.asInstanceOf[GetBackupPlanFromJSONOutput]
  }
}

