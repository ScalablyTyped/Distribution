package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupPlanFromTemplateInput extends js.Object {
  /**
    * Uniquely identifies a stored backup plan template.
    */
  var BackupPlanTemplateId: String = js.native
}

object GetBackupPlanFromTemplateInput {
  @scala.inline
  def apply(BackupPlanTemplateId: String): GetBackupPlanFromTemplateInput = {
    val __obj = js.Dynamic.literal(BackupPlanTemplateId = BackupPlanTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupPlanFromTemplateInput]
  }
  @scala.inline
  implicit class GetBackupPlanFromTemplateInputOps[Self <: GetBackupPlanFromTemplateInput] (val x: Self) extends AnyVal {
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
    def setBackupPlanTemplateId(value: String): Self = this.set("BackupPlanTemplateId", value.asInstanceOf[js.Any])
  }
  
}

