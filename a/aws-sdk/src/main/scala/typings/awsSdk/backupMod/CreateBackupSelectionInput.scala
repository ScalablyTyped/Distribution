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
  def apply(BackupPlanId: String, BackupSelection: BackupSelection): CreateBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any], BackupSelection = BackupSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupSelectionInput]
  }
  @scala.inline
  implicit class CreateBackupSelectionInputOps[Self <: CreateBackupSelectionInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBackupPlanId(value: String): Self = this.set("BackupPlanId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackupSelection(value: BackupSelection): Self = this.set("BackupSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatorRequestId(value: String): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
  }
  
}

