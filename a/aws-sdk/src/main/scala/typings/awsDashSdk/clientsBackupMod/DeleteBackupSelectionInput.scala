package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupSelectionInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: String
}

object DeleteBackupSelectionInput {
  @scala.inline
  def apply(BackupPlanId: String, SelectionId: String): DeleteBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId, SelectionId = SelectionId)
  
    __obj.asInstanceOf[DeleteBackupSelectionInput]
  }
}

