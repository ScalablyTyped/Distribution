package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceError extends StObject {
  
  /**
    *  The reason the resource association failed. 
    */
  var Message: js.UndefOr[String] = js.undefined
  
  /**
    *  A static error code that used to classify the type of failure. 
    */
  var Reason: js.UndefOr[AssociateResourceErrorReason] = js.undefined
}
object AssociateResourceError {
  
  inline def apply(): AssociateResourceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResourceError]
  }
  
  extension [Self <: AssociateResourceError](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setReason(value: AssociateResourceErrorReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "Reason", js.undefined)
  }
}
