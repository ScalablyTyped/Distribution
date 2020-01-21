package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBackupSelectionInput extends js.Object {
  /**
    * Uniquely identifies the backup plan to be associated with the selection of resources.
    */
  var BackupPlanId: String = js.native
  /**
    * Specifies the body of a request to assign a set of resources to a backup plan.
    */
  var BackupSelection: typings.awsSdk.backupMod.BackupSelection = js.native
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
}

object CreateBackupSelectionInput {
  @scala.inline
  def apply(BackupPlanId: String, BackupSelection: BackupSelection, CreatorRequestId: String = null): CreateBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any], BackupSelection = BackupSelection.asInstanceOf[js.Any])
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupSelectionInput]
  }
}

