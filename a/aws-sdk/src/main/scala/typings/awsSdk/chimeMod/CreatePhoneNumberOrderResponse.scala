package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePhoneNumberOrderResponse extends StObject {
  
  /**
    * The phone number order details.
    */
  var PhoneNumberOrder: js.UndefOr[typings.awsSdk.chimeMod.PhoneNumberOrder] = js.undefined
}
object CreatePhoneNumberOrderResponse {
  
  inline def apply(): CreatePhoneNumberOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePhoneNumberOrderResponse]
  }
  
  extension [Self <: CreatePhoneNumberOrderResponse](x: Self) {
    
    inline def setPhoneNumberOrder(value: PhoneNumberOrder): Self = StObject.set(x, "PhoneNumberOrder", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberOrderUndefined: Self = StObject.set(x, "PhoneNumberOrder", js.undefined)
  }
}
