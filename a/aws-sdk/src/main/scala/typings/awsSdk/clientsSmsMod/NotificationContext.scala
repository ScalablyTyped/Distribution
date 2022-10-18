package typings.awsSdk.clientsSmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationContext extends StObject {
  
  /**
    * The status of the validation.
    */
  var status: js.UndefOr[ValidationStatus] = js.undefined
  
  /**
    * The status message.
    */
  var statusMessage: js.UndefOr[ValidationStatusMessage] = js.undefined
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.undefined
}
object NotificationContext {
  
  inline def apply(): NotificationContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationContext]
  }
  
  extension [Self <: NotificationContext](x: Self) {
    
    inline def setStatus(value: ValidationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: ValidationStatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setValidationId(value: ValidationId): Self = StObject.set(x, "validationId", value.asInstanceOf[js.Any])
    
    inline def setValidationIdUndefined: Self = StObject.set(x, "validationId", js.undefined)
  }
}
