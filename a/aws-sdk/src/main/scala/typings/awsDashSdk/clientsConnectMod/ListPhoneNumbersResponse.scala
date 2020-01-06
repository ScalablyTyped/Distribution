package typings.awsDashSdk.clientsConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPhoneNumbersResponse extends js.Object {
  /**
    * If there are additional results, this is the token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsConnectMod.NextToken] = js.native
  /**
    * Information about the phone numbers.
    */
  var PhoneNumberSummaryList: js.UndefOr[typings.awsDashSdk.clientsConnectMod.PhoneNumberSummaryList] = js.native
}

object ListPhoneNumbersResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, PhoneNumberSummaryList: PhoneNumberSummaryList = null): ListPhoneNumbersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PhoneNumberSummaryList != null) __obj.updateDynamic("PhoneNumberSummaryList")(PhoneNumberSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumbersResponse]
  }
}

