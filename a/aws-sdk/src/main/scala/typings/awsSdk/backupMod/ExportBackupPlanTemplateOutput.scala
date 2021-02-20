package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportBackupPlanTemplateOutput extends StObject {
  
  /**
    * The body of a backup plan template in JSON format.  This is a signed JSON document that cannot be modified before being passed to GetBackupPlanFromJSON.  
    */
  var BackupPlanTemplateJson: js.UndefOr[String] = js.native
}
object ExportBackupPlanTemplateOutput {
  
  @scala.inline
  def apply(): ExportBackupPlanTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportBackupPlanTemplateOutput]
  }
  
  @scala.inline
  implicit class ExportBackupPlanTemplateOutputMutableBuilder[Self <: ExportBackupPlanTemplateOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanTemplateJson(value: String): Self = StObject.set(x, "BackupPlanTemplateJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupPlanTemplateJsonUndefined: Self = StObject.set(x, "BackupPlanTemplateJson", js.undefined)
  }
}
