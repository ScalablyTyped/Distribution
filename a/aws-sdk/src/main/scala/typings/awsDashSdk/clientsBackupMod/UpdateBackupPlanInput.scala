package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBackupPlanInput extends js.Object {
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: BackupPlanInput
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String
}

object UpdateBackupPlanInput {
  @scala.inline
  def apply(BackupPlan: BackupPlanInput, BackupPlanId: String): UpdateBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlan = BackupPlan, BackupPlanId = BackupPlanId)
  
    __obj.asInstanceOf[UpdateBackupPlanInput]
  }
}

