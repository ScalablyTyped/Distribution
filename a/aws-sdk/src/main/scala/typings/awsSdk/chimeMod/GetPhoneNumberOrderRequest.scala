package typings.awsSdk.chimeMod

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
  
  @scala.inline
  def apply(PhoneNumberOrderId: GuidString): GetPhoneNumberOrderRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberOrderId = PhoneNumberOrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhoneNumberOrderRequest]
  }
  
  @scala.inline
  implicit class GetPhoneNumberOrderRequestMutableBuilder[Self <: GetPhoneNumberOrderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPhoneNumberOrderId(value: GuidString): Self = StObject.set(x, "PhoneNumberOrderId", value.asInstanceOf[js.Any])
  }
}
