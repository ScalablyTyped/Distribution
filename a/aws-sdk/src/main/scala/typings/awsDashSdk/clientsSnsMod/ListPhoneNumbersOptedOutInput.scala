package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPhoneNumbersOptedOutInput extends js.Object {
  /**
    * A NextToken string is used when you call the ListPhoneNumbersOptedOut action to retrieve additional records that are available after the first page of results.
    */
  var nextToken: js.UndefOr[java.lang.String] = js.native
}

object ListPhoneNumbersOptedOutInput {
  @scala.inline
  def apply(nextToken: java.lang.String = null): ListPhoneNumbersOptedOutInput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumbersOptedOutInput]
  }
}

