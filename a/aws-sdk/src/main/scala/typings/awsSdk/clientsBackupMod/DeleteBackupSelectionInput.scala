package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackupSelectionInput extends StObject {
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String
  
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: String
}
object DeleteBackupSelectionInput {
  
  inline def apply(BackupPlanId: String, SelectionId: String): DeleteBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any], SelectionId = SelectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackupSelectionInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBackupSelectionInput] (val x: Self) extends AnyVal {
    
    inline def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    inline def setSelectionId(value: String): Self = StObject.set(x, "SelectionId", value.asInstanceOf[js.Any])
  }
}
