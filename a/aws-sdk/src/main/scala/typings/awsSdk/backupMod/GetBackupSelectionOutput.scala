package typings.awsSdk.backupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBackupSelectionOutput extends StObject {
  
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the body of a request to assign a set of resources to a backup plan.
    */
  var BackupSelection: js.UndefOr[typings.awsSdk.backupMod.BackupSelection] = js.undefined
  
  /**
    * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of running the operation twice.
    */
  var CreatorRequestId: js.UndefOr[String] = js.undefined
  
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: js.UndefOr[String] = js.undefined
}
object GetBackupSelectionOutput {
  
  inline def apply(): GetBackupSelectionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBackupSelectionOutput]
  }
  
  extension [Self <: GetBackupSelectionOutput](x: Self) {
    
    inline def setBackupPlanId(value: String): Self = StObject.set(x, "BackupPlanId", value.asInstanceOf[js.Any])
    
    inline def setBackupPlanIdUndefined: Self = StObject.set(x, "BackupPlanId", js.undefined)
    
    inline def setBackupSelection(value: BackupSelection): Self = StObject.set(x, "BackupSelection", value.asInstanceOf[js.Any])
    
    inline def setBackupSelectionUndefined: Self = StObject.set(x, "BackupSelection", js.undefined)
    
    inline def setCreationDate(value: timestamp): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setCreatorRequestId(value: String): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setSelectionId(value: String): Self = StObject.set(x, "SelectionId", value.asInstanceOf[js.Any])
    
    inline def setSelectionIdUndefined: Self = StObject.set(x, "SelectionId", js.undefined)
  }
}
