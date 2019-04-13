package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBackupSelectionInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: java.lang.String
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: java.lang.String
}

object DeleteBackupSelectionInput {
  @scala.inline
  def apply(BackupPlanId: java.lang.String, SelectionId: java.lang.String): DeleteBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId, SelectionId = SelectionId)
  
    __obj.asInstanceOf[DeleteBackupSelectionInput]
  }
}

