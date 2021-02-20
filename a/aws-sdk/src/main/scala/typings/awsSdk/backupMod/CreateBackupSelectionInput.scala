package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackupSelectionInput extends StObject {
  
  /**
    * Uniquely identifies the backup plan to be associated with the selection of resources.
    */
  var BackupPlanId: String = js.native
  
  /**
    * Specifies the body of a request to assign a set of resources to a backup plan.
    */
  var BackupSelection: typings.awsSdk.backupMod.BackupSelection = js.native
  
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of running the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.native
}
object CreateBackupSelectionInput {
  
  @scala.inline
  def apply(BackupPlanId: String, BackupSelection: BackupSelection): CreateBackupSelectionInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId.asInstanceOf[js.Any], BackupSelection = BackupSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackupSelectionInput]
  }
  
  @scala.inline
  implicit class CreateBackupSelectionInputMutableBuilder[Self <: CreateBackupSelectionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupSelection(value: BackupSelection): Self = StObject.set(x, "BackupSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestId(value: String): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
  }
}
