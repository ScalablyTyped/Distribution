package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreatePhoneNumberOrderRequest extends js.Object {
  
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: E164PhoneNumberList = js.native
  
  /**
    * The phone number product type.
    */
  var ProductType: PhoneNumberProductType = js.native
}
object CreatePhoneNumberOrderRequest {
  
  @scala.inline
  def apply(E164PhoneNumbers: E164PhoneNumberList, ProductType: PhoneNumberProductType): CreatePhoneNumberOrderRequest = {
    val __obj = js.Dynamic.literal(E164PhoneNumbers = E164PhoneNumbers.asInstanceOf[js.Any], ProductType = ProductType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePhoneNumberOrderRequest]
  }
  
  @scala.inline
  implicit class CreatePhoneNumberOrderRequestOps[Self <: CreatePhoneNumberOrderRequest] (val x: Self) extends AnyVal {
    
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
    def setE164PhoneNumbersVarargs(value: E164PhoneNumber*): Self = this.set("E164PhoneNumbers", js.Array(value :_*))
    
    @scala.inline
    def setE164PhoneNumbers(value: E164PhoneNumberList): Self = this.set("E164PhoneNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductType(value: PhoneNumberProductType): Self = this.set("ProductType", value.asInstanceOf[js.Any])
  }
}
