package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipMediaApplicationCallRequest extends StObject {
  
  /**
    * The phone number that a user calls from. This is a phone number in your Amazon Chime phone number inventory.
    */
  var FromPhoneNumber: E164PhoneNumber
  
  /**
    * The SIP headers added to an outbound call leg.
    */
  var SipHeaders: js.UndefOr[SipHeadersMap] = js.undefined
  
  /**
    * The ID of the SIP media application.
    */
  var SipMediaApplicationId: NonEmptyString
  
  /**
    * The phone number that the service should call.
    */
  var ToPhoneNumber: E164PhoneNumber
}
object CreateSipMediaApplicationCallRequest {
  
  inline def apply(
    FromPhoneNumber: E164PhoneNumber,
    SipMediaApplicationId: NonEmptyString,
    ToPhoneNumber: E164PhoneNumber
  ): CreateSipMediaApplicationCallRequest = {
    val __obj = js.Dynamic.literal(FromPhoneNumber = FromPhoneNumber.asInstanceOf[js.Any], SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any], ToPhoneNumber = ToPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSipMediaApplicationCallRequest]
  }
  
  extension [Self <: CreateSipMediaApplicationCallRequest](x: Self) {
    
    inline def setFromPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "FromPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setSipHeaders(value: SipHeadersMap): Self = StObject.set(x, "SipHeaders", value.asInstanceOf[js.Any])
    
    inline def setSipHeadersUndefined: Self = StObject.set(x, "SipHeaders", js.undefined)
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    inline def setToPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "ToPhoneNumber", value.asInstanceOf[js.Any])
  }
}
