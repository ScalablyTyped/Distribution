package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportBackupPlanTemplateInput extends StObject {
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String
}
object ExportBackupPlanTemplateInput {
  
  inline def apply(BackupPlanId: String): ExportBackupPlanTemplateInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBackupPlanTemplateInput]
  }
  
  extension [Self <: ExportBackupPlanTemplateInput](x: Self) {
    
    inline def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
  }
}
