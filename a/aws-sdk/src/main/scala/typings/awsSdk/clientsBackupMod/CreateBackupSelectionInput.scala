package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackupSelectionInput extends StObject {
  
  /**
    * Uniquely identifies the backup plan to be associated with the selection of resources.
    */
  var BackupPlanId: String
  
  /**
    * Specifies the body of a request to assign a set of resources to a backup plan.
    */
  var BackupSelection: typings.awsSdk.clientsBackupMod.BackupSelection
  
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of running the operation twice. This parameter is optional. If used, this parameter must contain 1 to 50 alphanumeric or '-_.' characters.
    */
  var CreatorRequestId: js.UndefOr[String] = js.undefined
}
object CreateBackupSelectionInput {
  
  inline def apply(BackupPlanId: String, BackupSelection: BackupSelection): CreateBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any], BackupSelection = BackupSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupSelectionInput]
  }
  
  extension [Self <: CreateBackupSelectionInput](x: Self) {
    
    inline def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    inline def setBackupSelection(value: BackupSelection): Self = StObject.set(x, "BackupSelection", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestId(value: String): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
  }
}
