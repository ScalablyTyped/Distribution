package typings.awsDashSdk.clientsBackupMod

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
}

