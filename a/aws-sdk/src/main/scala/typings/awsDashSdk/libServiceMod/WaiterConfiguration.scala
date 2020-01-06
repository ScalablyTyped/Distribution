package typings.awsDashSdk.libServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WaiterConfiguration extends js.Object {
  /**
    * The number of seconds to wait between requests
    */
  var delay: js.UndefOr[Double] = js.native
  /**
    * The maximum number of requests to send while waiting
    */
  var maxAttempts: js.UndefOr[Double] = js.native
}

object WaiterConfiguration {
  @scala.inline
  def apply(delay: Int | Double = null, maxAttempts: Int | Double = null): WaiterConfiguration = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (maxAttempts != null) __obj.updateDynamic("maxAttempts")(maxAttempts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WaiterConfiguration]
  }
}

