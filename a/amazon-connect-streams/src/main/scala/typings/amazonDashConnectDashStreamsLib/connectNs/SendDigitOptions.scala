package typings
package amazonDashConnectDashStreamsLib.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendDigitOptions extends SuccessFailOptions {
  /*
    * A string containing digits to send.
    */
  var digits: java.lang.String
}

object SendDigitOptions {
  @scala.inline
  def apply(digits: java.lang.String, failure: SuccessFailCallback = null, success: SuccessFailCallback = null): SendDigitOptions = {
    val __obj = js.Dynamic.literal(digits = digits)
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SendDigitOptions]
  }
}

