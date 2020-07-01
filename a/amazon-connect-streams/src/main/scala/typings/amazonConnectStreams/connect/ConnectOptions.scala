package typings.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends SuccessFailOptions {
  /** The queue ARN to associate the contact with. */
  val queueARN: js.UndefOr[String] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    failure: js.Array[String] => Unit = null,
    queueARN: String = null,
    success: js.Array[js.Any] => Unit = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (failure != null) __obj.updateDynamic("failure")(js.Any.fromFunction1(failure))
    if (queueARN != null) __obj.updateDynamic("queueARN")(queueARN.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ConnectOptions]
  }
}

