package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBackupPlanFromJSONInput extends js.Object {
  /**
    * A customer-supplied backup plan document in JSON format.
    */
  var BackupPlanTemplateJson: String = js.native
}

object GetBackupPlanFromJSONInput {
  @scala.inline
  def apply(BackupPlanTemplateJson: String): GetBackupPlanFromJSONInput = {
    val __obj = js.Dynamic.literal(BackupPlanTemplateJson = BackupPlanTemplateJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupPlanFromJSONInput]
  }
  @scala.inline
  implicit class GetBackupPlanFromJSONInputOps[Self <: GetBackupPlanFromJSONInput] (val x: Self) extends AnyVal {
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
    def setBackupPlanTemplateJson(value: String): Self = this.set("BackupPlanTemplateJson", value.asInstanceOf[js.Any])
  }
  
}

