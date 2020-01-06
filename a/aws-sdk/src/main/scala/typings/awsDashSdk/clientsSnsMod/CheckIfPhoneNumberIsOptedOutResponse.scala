package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckIfPhoneNumberIsOptedOutResponse extends js.Object {
  /**
    * Indicates whether the phone number is opted out:    true – The phone number is opted out, meaning you cannot publish SMS messages to it.    false – The phone number is opted in, meaning you can publish SMS messages to it.  
    */
  var isOptedOut: js.UndefOr[Boolean] = js.native
}

object CheckIfPhoneNumberIsOptedOutResponse {
  @scala.inline
  def apply(isOptedOut: js.UndefOr[Boolean] = js.undefined): CheckIfPhoneNumberIsOptedOutResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isOptedOut)) __obj.updateDynamic("isOptedOut")(isOptedOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckIfPhoneNumberIsOptedOutResponse]
  }
}

