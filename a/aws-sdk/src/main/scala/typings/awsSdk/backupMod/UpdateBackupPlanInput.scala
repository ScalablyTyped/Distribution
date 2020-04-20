package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBackupPlanInput extends js.Object {
  /**
    * Specifies the body of a backup plan. Includes a BackupPlanName and one or more sets of Rules.
    */
  var BackupPlan: BackupPlanInput = js.native
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String = js.native
}

object UpdateBackupPlanInput {
  @scala.inline
  def apply(BackupPlan: BackupPlanInput, BackupPlanId: String): UpdateBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlan = BackupPlan.asInstanceOf[js.Any], BackupPlanId = BackupPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBackupPlanInput]
  }
}

