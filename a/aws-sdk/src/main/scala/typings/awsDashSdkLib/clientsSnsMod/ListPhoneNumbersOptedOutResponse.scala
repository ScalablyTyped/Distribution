package typings
package awsDashSdkLib.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPhoneNumbersOptedOutResponse extends js.Object {
  /**
    * A NextToken string is returned when you call the ListPhoneNumbersOptedOut action if additional records are available after the first page of results.
    */
  var nextToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A list of phone numbers that are opted out of receiving SMS messages. The list is paginated, and each page can contain up to 100 phone numbers.
    */
  var phoneNumbers: js.UndefOr[PhoneNumberList] = js.undefined
}

object ListPhoneNumbersOptedOutResponse {
  @scala.inline
  def apply(nextToken: java.lang.String = null, phoneNumbers: PhoneNumberList = null): ListPhoneNumbersOptedOutResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (phoneNumbers != null) __obj.updateDynamic("phoneNumbers")(phoneNumbers)
    __obj.asInstanceOf[ListPhoneNumbersOptedOutResponse]
  }
}

