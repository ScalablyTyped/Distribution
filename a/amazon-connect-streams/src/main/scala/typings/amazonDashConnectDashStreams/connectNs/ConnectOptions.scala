package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends SuccessFailOptions {
  /*
    * A string containing a Connect Queue ARN.
    */
  var queueARN: js.UndefOr[String] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(failure: SuccessFailCallback = null, queueARN: String = null, success: SuccessFailCallback = null): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (queueARN != null) __obj.updateDynamic("queueARN")(queueARN)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ConnectOptions]
  }
}

