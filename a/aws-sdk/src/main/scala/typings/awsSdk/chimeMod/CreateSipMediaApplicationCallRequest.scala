package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSipMediaApplicationCallRequest extends js.Object {
  
  /**
    * The phone number that a user calls from.
    */
  var FromPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
  
  /**
    * The ID of the SIP media application.
    */
  var SipMediaApplicationId: NonEmptyString = js.native
  
  /**
    * The phone number that the user dials in order to connect to a meeting
    */
  var ToPhoneNumber: js.UndefOr[E164PhoneNumber] = js.native
}
object CreateSipMediaApplicationCallRequest {
  
  @scala.inline
  def apply(SipMediaApplicationId: NonEmptyString): CreateSipMediaApplicationCallRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSipMediaApplicationCallRequest]
  }
  
  @scala.inline
  implicit class CreateSipMediaApplicationCallRequestOps[Self <: CreateSipMediaApplicationCallRequest] (val x: Self) extends AnyVal {
    
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
    def setSipMediaApplicationId(value: NonEmptyString): Self = this.set("SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPhoneNumber(value: E164PhoneNumber): Self = this.set("FromPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromPhoneNumber: Self = this.set("FromPhoneNumber", js.undefined)
    
    @scala.inline
    def setToPhoneNumber(value: E164PhoneNumber): Self = this.set("ToPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToPhoneNumber: Self = this.set("ToPhoneNumber", js.undefined)
  }
}
