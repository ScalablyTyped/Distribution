package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupSelectionOutput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.native
  /**
    * Specifies the body of a request to assign a set of resources to a backup plan.
    */
  var BackupSelection: js.UndefOr[typings.awsSdk.backupMod.BackupSelection] = js.native
  /**
    * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: js.UndefOr[String] = js.native
}

object GetBackupSelectionOutput {
  @scala.inline
  def apply(
    BackupPlanId: String = null,
    BackupSelection: BackupSelection = null,
    CreationDate: timestamp = null,
    CreatorRequestId: String = null,
    SelectionId: String = null
  ): GetBackupSelectionOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId.asInstanceOf[js.Any])
    if (BackupSelection != null) __obj.updateDynamic("BackupSelection")(BackupSelection.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    if (SelectionId != null) __obj.updateDynamic("SelectionId")(SelectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupSelectionOutput]
  }
}

