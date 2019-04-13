package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportBackupPlanTemplateOutput extends js.Object {
  /**
    * The body of a backup plan template in JSON format.  This is a signed JSON document that cannot be modified before being passed to GetBackupPlanFromJSON.  
    */
  var BackupPlanTemplateJson: js.UndefOr[java.lang.String] = js.undefined
}

object ExportBackupPlanTemplateOutput {
  @scala.inline
  def apply(BackupPlanTemplateJson: java.lang.String = null): ExportBackupPlanTemplateOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanTemplateJson != null) __obj.updateDynamic("BackupPlanTemplateJson")(BackupPlanTemplateJson)
    __obj.asInstanceOf[ExportBackupPlanTemplateOutput]
  }
}

