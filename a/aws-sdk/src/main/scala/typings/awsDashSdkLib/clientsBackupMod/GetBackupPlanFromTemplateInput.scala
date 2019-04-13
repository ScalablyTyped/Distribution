package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupPlanFromTemplateInput extends js.Object {
  /**
    * Uniquely identifies a stored backup plan template.
    */
  var BackupPlanTemplateId: java.lang.String
}

object GetBackupPlanFromTemplateInput {
  @scala.inline
  def apply(BackupPlanTemplateId: java.lang.String): GetBackupPlanFromTemplateInput = {
    val __obj = js.Dynamic.literal(BackupPlanTemplateId = BackupPlanTemplateId)
  
    __obj.asInstanceOf[GetBackupPlanFromTemplateInput]
  }
}

