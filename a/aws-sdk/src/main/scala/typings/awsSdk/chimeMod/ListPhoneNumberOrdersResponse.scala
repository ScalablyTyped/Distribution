package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPhoneNumberOrdersResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The phone number order details.
    */
  var PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList] = js.native
}

object ListPhoneNumberOrdersResponse {
  @scala.inline
  def apply(NextToken: String = null, PhoneNumberOrders: PhoneNumberOrderList = null): ListPhoneNumberOrdersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (PhoneNumberOrders != null) __obj.updateDynamic("PhoneNumberOrders")(PhoneNumberOrders.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPhoneNumberOrdersResponse]
  }
}

