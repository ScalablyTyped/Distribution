package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportBackupPlanTemplateInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String = js.native
}

object ExportBackupPlanTemplateInput {
  @scala.inline
  def apply(BackupPlanId: String): ExportBackupPlanTemplateInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBackupPlanTemplateInput]
  }
  @scala.inline
  implicit class ExportBackupPlanTemplateInputOps[Self <: ExportBackupPlanTemplateInput] (val x: Self) extends AnyVal {
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
  }
  
}

