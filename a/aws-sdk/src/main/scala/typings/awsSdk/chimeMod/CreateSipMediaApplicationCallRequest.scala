package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipMediaApplicationCallRequest extends StObject {
  
  /**
    * The phone number that a user calls from.
    */
  var FromPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  
  /**
    * The ID of the SIP media application.
    */
  var SipMediaApplicationId: NonEmptyString
  
  /**
    * The phone number that the user dials in order to connect to a meeting
    */
  var ToPhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
}
object CreateSipMediaApplicationCallRequest {
  
  @scala.inline
  def apply(SipMediaApplicationId: NonEmptyString): CreateSipMediaApplicationCallRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSipMediaApplicationCallRequest]
  }
  
  @scala.inline
  implicit class CreateSipMediaApplicationCallRequestMutableBuilder[Self <: CreateSipMediaApplicationCallRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "FromPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromPhoneNumberUndefined: Self = StObject.set(x, "FromPhoneNumber", js.undefined)
    
    @scala.inline
    def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "ToPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToPhoneNumberUndefined: Self = StObject.set(x, "ToPhoneNumber", js.undefined)
  }
}
