package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePhoneNumberOrderRequest extends StObject {
  
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: E164PhoneNumberList
  
  /**
    * The phone number product type.
    */
  var ProductType: PhoneNumberProductType
}
object CreatePhoneNumberOrderRequest {
  
  @scala.inline
  def apply(E164PhoneNumbers: E164PhoneNumberList, ProductType: PhoneNumberProductType): CreatePhoneNumberOrderRequest = {
    val __obj = js.Dynamic.literal(E164PhoneNumbers = E164PhoneNumbers.asInstanceOf[js.Any], ProductType = ProductType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePhoneNumberOrderRequest]
  }
  
  @scala.inline
  implicit class CreatePhoneNumberOrderRequestMutableBuilder[Self <: CreatePhoneNumberOrderRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setE164PhoneNumbers(value: E164PhoneNumberList): Self = StObject.set(x, "E164PhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = StObject.set(x, "E164PhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
  }
}
