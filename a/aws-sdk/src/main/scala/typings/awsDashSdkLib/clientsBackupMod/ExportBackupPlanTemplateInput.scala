package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportBackupPlanTemplateInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: java.lang.String
}

object ExportBackupPlanTemplateInput {
  @scala.inline
  def apply(BackupPlanId: java.lang.String): ExportBackupPlanTemplateInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId)
  
    __obj.asInstanceOf[ExportBackupPlanTemplateInput]
  }
}

