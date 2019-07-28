package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupPlanFromJSONInput extends js.Object {
  /**
    * A customer-supplied backup plan document in JSON format.
    */
  var BackupPlanTemplateJson: String
}

object GetBackupPlanFromJSONInput {
  @scala.inline
  def apply(BackupPlanTemplateJson: String): GetBackupPlanFromJSONInput = {
    val __obj = js.Dynamic.literal(BackupPlanTemplateJson = BackupPlanTemplateJson)
  
    __obj.asInstanceOf[GetBackupPlanFromJSONInput]
  }
}

