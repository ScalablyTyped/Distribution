package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLegalHoldOutput extends StObject {
  
  /**
    * Time in number format when legal hold was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This is the returned string description of the legal hold.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * This is the ARN (Amazon Resource Number) of the created legal hold.
    */
  var LegalHoldArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Legal hold ID returned for the specified legal hold on a recovery point.
    */
  var LegalHoldId: js.UndefOr[String] = js.undefined
  
  /**
    * This specifies criteria to assign a set of resources, such as resource types or backup vaults.
    */
  var RecoveryPointSelection: js.UndefOr[typings.awsSdk.clientsBackupMod.RecoveryPointSelection] = js.undefined
  
  /**
    * This displays the status of the legal hold returned after creating the legal hold. Statuses can be ACTIVE, PENDING, CANCELED, CANCELING, or FAILED.
    */
  var Status: js.UndefOr[LegalHoldStatus] = js.undefined
  
  /**
    * This is the string title of the legal hold returned after creating the legal hold.
    */
  var Title: js.UndefOr[String] = js.undefined
}
object CreateLegalHoldOutput {
  
  inline def apply(): CreateLegalHoldOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLegalHoldOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateLegalHoldOutput] (val x: Self) extends AnyVal {
    
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
    
    inline def setStatus(value: LegalHoldStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
