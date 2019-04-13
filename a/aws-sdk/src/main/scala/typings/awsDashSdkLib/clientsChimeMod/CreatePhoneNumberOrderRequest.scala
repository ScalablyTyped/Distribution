package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePhoneNumberOrderRequest extends js.Object {
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
    val __obj = js.Dynamic.literal(E164PhoneNumbers = E164PhoneNumbers, ProductType = ProductType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreatePhoneNumberOrderRequest]
  }
}

