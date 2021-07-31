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
  
  @scala.inline
  def apply(BackupPlanId: String): ExportBackupPlanTemplateInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportBackupPlanTemplateInput]
  }
  
  @scala.inline
  implicit class ExportBackupPlanTemplateInputMutableBuilder[Self <: ExportBackupPlanTemplateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
  }
}
