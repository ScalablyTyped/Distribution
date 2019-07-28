package typings.amazonDashConnectDashStreams.connectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessFailOptions extends js.Object {
  /*
    * A {SuccessFailCallback} to receive a notification of failure.
    */
  var failure: js.UndefOr[SuccessFailCallback] = js.undefined
  /*
    * A {SuccessFailCallback} to receive a notification of success.
    */
  var success: js.UndefOr[SuccessFailCallback] = js.undefined
}

object SuccessFailOptions {
  @scala.inline
  def apply(failure: SuccessFailCallback = null, success: SuccessFailCallback = null): SuccessFailOptions = {
    val __obj = js.Dynamic.literal()
    if (failure != null) __obj.updateDynamic("failure")(failure)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[SuccessFailOptions]
  }
}

