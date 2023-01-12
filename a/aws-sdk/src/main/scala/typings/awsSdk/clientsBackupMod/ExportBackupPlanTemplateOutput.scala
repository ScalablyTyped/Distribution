package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportBackupPlanTemplateOutput extends StObject {
  
  /**
    * The body of a backup plan template in JSON format.  This is a signed JSON document that cannot be modified before being passed to GetBackupPlanFromJSON.  
    */
  var BackupPlanTemplateJson: js.UndefOr[String] = js.undefined
}
object ExportBackupPlanTemplateOutput {
  
  inline def apply(): ExportBackupPlanTemplateOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportBackupPlanTemplateOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportBackupPlanTemplateOutput] (val x: Self) extends AnyVal {
    
    inline def setBackupPlanTemplateJson(value: String): Self = StObject.set(x, "BackupPlanTemplateJson", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanTemplateJsonUndefined: Self = StObject.set(x, "BackupPlanTemplateJson", js.undefined)
  }
}
