package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPhoneNumbersResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The phone number details.
    */
  var PhoneNumbers: js.UndefOr[PhoneNumberList] = js.native
}

object ListPhoneNumbersResponse {
  @scala.inline
  def apply(NextToken: String = null, PhoneNumbers: PhoneNumberList = null): ListPhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PhoneNumbers != null) __obj.updateDynamic("PhoneNumbers")(PhoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumbersResponse]
  }
}

