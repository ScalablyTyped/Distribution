package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSipMediaApplicationCallRequest extends StObject {
  
  /**
    * Context passed to a CreateSipMediaApplication API call. For example, you could pass key-value pairs such as: "FirstName": "John", "LastName": "Doe" 
    */
  var ArgumentsMap: js.UndefOr[SMACreateCallArgumentsMap] = js.undefined
  
  /**
    * The phone number that a user calls from. This is a phone number in your Amazon Chime SDK phone number inventory.
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSipMediaApplicationCallRequest] (val x: Self) extends AnyVal {
    
    inline def setArgumentsMap(value: SMACreateCallArgumentsMap): Self = StObject.set(x, "ArgumentsMap", value.asInstanceOf[js.Any])
    
    inline def setArgumentsMapUndefined: Self = StObject.set(x, "ArgumentsMap", js.undefined)
    
    inline def setFromPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "FromPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setSipHeaders(value: SipHeadersMap): Self = StObject.set(x, "SipHeaders", value.asInstanceOf[js.Any])
    
    inline def setSipHeadersUndefined: Self = StObject.set(x, "SipHeaders", js.undefined)
    
    inline def setSipMediaApplicationId(value: NonEmptyString): Self = StObject.set(x, "SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    inline def setToPhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "ToPhoneNumber", value.asInstanceOf[js.Any])
  }
}
