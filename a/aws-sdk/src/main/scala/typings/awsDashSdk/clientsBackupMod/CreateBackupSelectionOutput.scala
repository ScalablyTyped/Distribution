package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateBackupSelectionOutput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.undefined
  /**
    * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: js.UndefOr[String] = js.undefined
}

object CreateBackupSelectionOutput {
  @scala.inline
  def apply(BackupPlanId: String = null, CreationDate: timestamp = null, SelectionId: String = null): CreateBackupSelectionOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (SelectionId != null) __obj.updateDynamic("SelectionId")(SelectionId)
    __obj.asInstanceOf[CreateBackupSelectionOutput]
  }
}

