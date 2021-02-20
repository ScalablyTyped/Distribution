package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBackupSelectionInput extends StObject {
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String = js.native
  
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: String = js.native
}
object GetBackupSelectionInput {
  
  @scala.inline
  def apply(BackupPlanId: String, SelectionId: String): GetBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any], SelectionId = SelectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBackupSelectionInput]
  }
  
  @scala.inline
  implicit class GetBackupSelectionInputMutableBuilder[Self <: GetBackupSelectionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionId(value: String): Self = StObject.set(x, "SelectionId", value.asInstanceOf[js.Any])
  }
}
