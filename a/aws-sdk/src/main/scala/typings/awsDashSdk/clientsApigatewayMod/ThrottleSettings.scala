package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThrottleSettings extends js.Object {
  /**
    * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
    */
  var burstLimit: js.UndefOr[Integer] = js.undefined
  /**
    * The API request steady-state rate limit.
    */
  var rateLimit: js.UndefOr[Double] = js.undefined
}

object ThrottleSettings {
  @scala.inline
  def apply(burstLimit: Int | scala.Double = null, rateLimit: Int | scala.Double = null): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    if (burstLimit != null) __obj.updateDynamic("burstLimit")(burstLimit.asInstanceOf[js.Any])
    if (rateLimit != null) __obj.updateDynamic("rateLimit")(rateLimit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleSettings]
  }
}

