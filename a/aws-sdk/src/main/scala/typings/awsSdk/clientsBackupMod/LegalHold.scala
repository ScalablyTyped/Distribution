package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegalHold extends StObject {
  
  /**
    * This is the time in number format when legal hold was cancelled.
    */
  var CancellationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This is the time in number format when legal hold was created.
    */
  var CreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * This is the description of a legal hold.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * This is an Amazon Resource Number (ARN) that uniquely identifies the legal hold; for example, arn:aws:backup:us-east-1:123456789012:recovery-point:1EB3B5E7-9EB0-435A-A80B-108B488B0D45.
    */
  var LegalHoldArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * ID of specific legal hold on one or more recovery points.
    */
  var LegalHoldId: js.UndefOr[String] = js.undefined
  
  /**
    * This is the status of the legal hold. Statuses can be ACTIVE, CREATING, CANCELED, and CANCELING.
    */
  var Status: js.UndefOr[LegalHoldStatus] = js.undefined
  
  /**
    * This is the title of a legal hold.
    */
  var Title: js.UndefOr[String] = js.undefined
}
object LegalHold {
  
  inline def apply(): LegalHold = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegalHold]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegalHold] (val x: Self) extends AnyVal {
    
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
    
    inline def setStatus(value: LegalHoldStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
  }
}
