package typings.amazonConnectStreams.connect

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
  def apply(failure: () => Unit = null, queueARN: String = null, success: () => Unit = null): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction0(failure))
    if (queueARN != null) __obj.updateDynamic("queueARN")(queueARN.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[ConnectOptions]
  }
}

