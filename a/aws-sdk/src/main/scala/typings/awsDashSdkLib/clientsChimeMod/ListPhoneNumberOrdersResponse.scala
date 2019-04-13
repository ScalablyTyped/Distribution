package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPhoneNumberOrdersResponse extends js.Object {
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The phone number order details.
    */
  var PhoneNumberOrders: js.UndefOr[PhoneNumberOrderList] = js.undefined
}

object ListPhoneNumberOrdersResponse {
  @scala.inline
  def apply(NextToken: String = null, PhoneNumberOrders: PhoneNumberOrderList = null): ListPhoneNumberOrdersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PhoneNumberOrders != null) __obj.updateDynamic("PhoneNumberOrders")(PhoneNumberOrders)
    __obj.asInstanceOf[ListPhoneNumberOrdersResponse]
  }
}

