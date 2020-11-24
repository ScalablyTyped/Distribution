package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPhoneNumberOrderRequest extends js.Object {
  
  /**
    * The ID for the phone number order.
    */
  var PhoneNumberOrderId: GuidString = js.native
}
object GetPhoneNumberOrderRequest {
  
  @scala.inline
  def apply(PhoneNumberOrderId: GuidString): GetPhoneNumberOrderRequest = {
    val __obj = js.Dynamic.literal(PhoneNumberOrderId = PhoneNumberOrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPhoneNumberOrderRequest]
  }
  
  @scala.inline
  implicit class GetPhoneNumberOrderRequestOps[Self <: GetPhoneNumberOrderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPhoneNumberOrderId(value: GuidString): Self = this.set("PhoneNumberOrderId", value.asInstanceOf[js.Any])
  }
}
