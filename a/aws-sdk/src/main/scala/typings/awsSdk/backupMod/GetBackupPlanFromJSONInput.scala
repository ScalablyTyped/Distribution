package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackupPlanFromJSONInput extends StObject {
  
  /**
    * A customer-supplied backup plan document in JSON format.
    */
  var BackupPlanTemplateJson: String
}
object GetBackupPlanFromJSONInput {
  
  @scala.inline
  def apply(BackupPlanTemplateJson: String): GetBackupPlanFromJSONInput = {
    val __obj = js.Dynamic.literal(BackupPlanTemplateJson = BackupPlanTemplateJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupPlanFromJSONInput]
  }
  
  @scala.inline
  implicit class GetBackupPlanFromJSONInputMutableBuilder[Self <: GetBackupPlanFromJSONInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanTemplateJson(value: String): Self = StObject.set(x, "BackupPlanTemplateJson", value.asInstanceOf[js.Any])
  }
}
