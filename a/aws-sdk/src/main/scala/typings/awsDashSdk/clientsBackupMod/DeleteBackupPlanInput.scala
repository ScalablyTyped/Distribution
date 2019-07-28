package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupPlanInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String
}

object DeleteBackupPlanInput {
  @scala.inline
  def apply(BackupPlanId: String): DeleteBackupPlanInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId)
  
    __obj.asInstanceOf[DeleteBackupPlanInput]
  }
}

