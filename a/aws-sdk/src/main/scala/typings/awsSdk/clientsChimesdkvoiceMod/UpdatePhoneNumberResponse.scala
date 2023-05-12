package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePhoneNumberResponse extends StObject {
  
  /**
    * The updated phone number details.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.PhoneNumber] = js.undefined
}
object UpdatePhoneNumberResponse {
  
  inline def apply(): UpdatePhoneNumberResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePhoneNumberResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdatePhoneNumberResponse] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
