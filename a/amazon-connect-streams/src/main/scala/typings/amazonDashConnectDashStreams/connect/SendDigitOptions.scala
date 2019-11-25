package typings.amazonDashConnectDashStreams.connect

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
  def apply(digits: String, failure: () => Unit = null, success: () => Unit = null): SendDigitOptions = {
    val __obj = js.Dynamic.literal(digits = digits.asInstanceOf[js.Any])
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction0(failure))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SendDigitOptions]
  }
}

