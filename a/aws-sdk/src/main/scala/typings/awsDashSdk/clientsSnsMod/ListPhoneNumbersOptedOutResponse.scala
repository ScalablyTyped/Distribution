package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPhoneNumbersOptedOutResponse extends js.Object {
  /**
    * A NextToken string is returned when you call the ListPhoneNumbersOptedOut action if additional records are available after the first page of results.
    */
  var nextToken: js.UndefOr[java.lang.String] = js.native
  /**
    * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can contain up to 100 phone numbers.
    */
  var phoneNumbers: js.UndefOr[PhoneNumberList] = js.native
}

object ListPhoneNumbersOptedOutResponse {
  @scala.inline
  def apply(nextToken: java.lang.String = null, phoneNumbers: PhoneNumberList = null): ListPhoneNumbersOptedOutResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (phoneNumbers != null) __obj.updateDynamic("phoneNumbers")(phoneNumbers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumbersOptedOutResponse]
  }
}

