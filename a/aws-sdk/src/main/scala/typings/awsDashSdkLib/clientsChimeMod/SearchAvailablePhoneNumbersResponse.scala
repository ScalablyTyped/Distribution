package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchAvailablePhoneNumbersResponse extends js.Object {
  /**
    * List of phone numbers, in E.164 format.
    */
  var E164PhoneNumbers: js.UndefOr[E164PhoneNumberList] = js.undefined
}

object SearchAvailablePhoneNumbersResponse {
  @scala.inline
  def apply(E164PhoneNumbers: E164PhoneNumberList = null): SearchAvailablePhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    if (E164PhoneNumbers != null) __obj.updateDynamic("E164PhoneNumbers")(E164PhoneNumbers)
    __obj.asInstanceOf[SearchAvailablePhoneNumbersResponse]
  }
}

