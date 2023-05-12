package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePhoneNumberOrderResponse extends StObject {
  
  /**
    * The phone number order details.
    */
  var PhoneNumberOrder: js.UndefOr[typings.awsSdk.clientsChimesdkvoiceMod.PhoneNumberOrder] = js.undefined
}
object CreatePhoneNumberOrderResponse {
  
  inline def apply(): CreatePhoneNumberOrderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreatePhoneNumberOrderResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePhoneNumberOrderResponse] (val x: Self) extends AnyVal {
    
    inline def setPhoneNumberOrder(value: PhoneNumberOrder): Self = StObject.set(x, "PhoneNumberOrder", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberOrderUndefined: Self = StObject.set(x, "PhoneNumberOrder", js.undefined)
  }
}
