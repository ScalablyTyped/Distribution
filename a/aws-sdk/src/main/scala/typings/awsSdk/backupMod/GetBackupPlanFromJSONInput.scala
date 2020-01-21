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
}

