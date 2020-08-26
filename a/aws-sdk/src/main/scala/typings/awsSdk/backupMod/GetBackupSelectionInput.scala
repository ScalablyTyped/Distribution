package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupSelectionInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String = js.native
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: String = js.native
}

object GetBackupSelectionInput {
  @scala.inline
  def apply(BackupPlanId: String, SelectionId: String): GetBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any], SelectionId = SelectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupSelectionInput]
  }
  @scala.inline
  implicit class GetBackupSelectionInputOps[Self <: GetBackupSelectionInput] (val x: Self) extends AnyVal {
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
    def setSelectionId(value: String): Self = this.set("SelectionId", value.asInstanceOf[js.Any])
  }
  
}

