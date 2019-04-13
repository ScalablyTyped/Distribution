package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPhoneNumbersResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The phone number details.
    */
  var PhoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
}

object ListPhoneNumbersResponse {
  @scala.inline
  def apply(NextToken: String = null, PhoneNumbers: PhoneNumberList = null): ListPhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PhoneNumbers != null) __obj.updateDynamic("PhoneNumbers")(PhoneNumbers)
    __obj.asInstanceOf[ListPhoneNumbersResponse]
  }
}

