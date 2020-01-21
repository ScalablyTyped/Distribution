package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportBackupPlanTemplateOutput extends js.Object {
  /**
    * The body of a backup plan template in JSON format.  This is a signed JSON document that cannot be modified before being passed to GetBackupPlanFromJSON.  
    */
  var BackupPlanTemplateJson: js.UndefOr[String] = js.native
}

object ExportBackupPlanTemplateOutput {
  @scala.inline
  def apply(BackupPlanTemplateJson: String = null): ExportBackupPlanTemplateOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanTemplateJson != null) __obj.updateDynamic("BackupPlanTemplateJson")(BackupPlanTemplateJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBackupPlanTemplateOutput]
  }
}

