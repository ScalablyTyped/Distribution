package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLegalHoldOutput extends StObject {
  
  /**
    * String describing the reason for removing the legal hold.
    */
  var CancelDescription: js.UndefOr[String] = js.undefined
  
  /**
    * Time in number when legal hold was cancelled.
    */
  var CancellationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Time in number format when legal hold was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This is the returned string description of the legal hold.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * This is the returned framework ARN for the specified legal hold. An Amazon Resource Name (ARN) uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var LegalHoldArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * This is the returned ID associated with a specified legal hold.
    */
  var LegalHoldId: js.UndefOr[String] = js.undefined
  
  /**
    * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
    */
  var RecoveryPointSelection: js.UndefOr[typings.awsSdk.clientsBackupMod.RecoveryPointSelection] = js.undefined
  
  /**
    * This is the date and time until which the legal hold record will be retained.
    */
  var RetainRecordUntil: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This is the status of the legal hold. Statuses can be ACTIVE, CREATING, CANCELED, and CANCELING.
    */
  var Status: js.UndefOr[LegalHoldStatus] = js.undefined
  
  /**
    * This is the string title of the legal hold.
    */
  var Title: js.UndefOr[String] = js.undefined
}
object GetLegalHoldOutput {
  
  inline def apply(): GetLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLegalHoldOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetLegalHoldOutput] (val x: Self) extends AnyVal {
    
    inline def setCancelDescription(value: String): Self = StObject.set(x, "CancelDescription", value.asInstanceOf[js.Any])
    
    inline def setCancelDescriptionUndefined: Self = StObject.set(x, "CancelDescription", js.undefined)
    
    inline def setCancellationDate(value: js.Date): Self = StObject.set(x, "CancellationDate", value.asInstanceOf[js.Any])
    
    inline def setCancellationDateUndefined: Self = StObject.set(x, "CancellationDate", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setLegalHoldArn(value: ARN): Self = StObject.set(x, "LegalHoldArn", value.asInstanceOf[js.Any])
    
    inline def setLegalHoldArnUndefined: Self = StObject.set(x, "LegalHoldArn", js.undefined)
    
    inline def setLegalHoldId(value: String): Self = StObject.set(x, "LegalHoldId", value.asInstanceOf[js.Any])
    
    inline def setLegalHoldIdUndefined: Self = StObject.set(x, "LegalHoldId", js.undefined)
    
    inline def setRecoveryPointSelection(value: RecoveryPointSelection): Self = StObject.set(x, "RecoveryPointSelection", value.asInstanceOf[js.Any])
    
    inline def setRecoveryPointSelectionUndefined: Self = StObject.set(x, "RecoveryPointSelection", js.undefined)
    
    inline def setRetainRecordUntil(value: js.Date): Self = StObject.set(x, "RetainRecordUntil", value.asInstanceOf[js.Any])
    
    inline def setRetainRecordUntilUndefined: Self = StObject.set(x, "RetainRecordUntil", js.undefined)
    
    inline def setStatus(value: LegalHoldStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
