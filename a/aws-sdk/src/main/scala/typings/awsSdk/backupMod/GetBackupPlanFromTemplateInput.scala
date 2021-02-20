package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackupPlanFromTemplateInput extends StObject {
  
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
  
  @scala.inline
  implicit class GetBackupPlanFromTemplateInputMutableBuilder[Self <: GetBackupPlanFromTemplateInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanTemplateId(value: String): Self = StObject.set(x, "BackupPlanTemplateId", value.asInstanceOf[js.Any])
  }
}
