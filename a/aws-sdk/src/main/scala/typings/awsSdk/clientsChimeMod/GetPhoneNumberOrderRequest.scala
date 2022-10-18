package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPhoneNumberOrderRequest extends StObject {
  
  /**
    * The ID for the phone number order.
    */
  var PhoneNumberOrderId: GuidString
}
object GetPhoneNumberOrderRequest {
  
  inline def apply(PhoneNumberOrderId: GuidString): GetPhoneNumberOrderRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberOrderId = PhoneNumberOrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhoneNumberOrderRequest]
  }
  
  extension [Self <: GetPhoneNumberOrderRequest](x: Self) {
    
    inline def setPhoneNumberOrderId(value: GuidString): Self = StObject.set(x, "PhoneNumberOrderId", value.asInstanceOf[js.Any])
  }
}
