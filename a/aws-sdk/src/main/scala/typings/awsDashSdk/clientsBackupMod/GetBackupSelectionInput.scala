package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupSelectionInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: String
}

object GetBackupSelectionInput {
  @scala.inline
  def apply(BackupPlanId: String, SelectionId: String): GetBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId, SelectionId = SelectionId)
  
    __obj.asInstanceOf[GetBackupSelectionInput]
  }
}

