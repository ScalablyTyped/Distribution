package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupPlanFromJSONInput extends js.Object {
  /**
    * A customer-supplied backup plan document in JSON format.
    */
  var BackupPlanTemplateJson: java.lang.String
}

object GetBackupPlanFromJSONInput {
  @scala.inline
  def apply(BackupPlanTemplateJson: java.lang.String): GetBackupPlanFromJSONInput = {
    val __obj = js.Dynamic.literal(BackupPlanTemplateJson = BackupPlanTemplateJson)
  
    __obj.asInstanceOf[GetBackupPlanFromJSONInput]
  }
}

