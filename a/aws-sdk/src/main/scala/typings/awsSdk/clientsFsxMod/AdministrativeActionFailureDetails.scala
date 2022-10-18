package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdministrativeActionFailureDetails extends StObject {
  
  /**
    * Error message providing details about the failed administrative action.
    */
  var Message: js.UndefOr[ErrorMessage] = js.undefined
}
object AdministrativeActionFailureDetails {
  
  inline def apply(): AdministrativeActionFailureDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministrativeActionFailureDetails]
  }
  
  extension [Self <: AdministrativeActionFailureDetails](x: Self) {
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
