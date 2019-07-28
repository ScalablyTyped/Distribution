package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDigitOptions extends SuccessFailOptions {
  /*
    * A string containing digits to send.
    */
  var digits: String
}

object SendDigitOptions {
  @scala.inline
  def apply(digits: String, failure: SuccessFailCallback = null, success: SuccessFailCallback = null): SendDigitOptions = {
    val __obj = js.Dynamic.literal(digits = digits)
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SendDigitOptions]
  }
}

