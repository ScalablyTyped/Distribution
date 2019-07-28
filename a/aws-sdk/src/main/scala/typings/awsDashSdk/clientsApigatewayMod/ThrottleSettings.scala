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
  def apply(burstLimit: js.UndefOr[Integer] = js.undefined, rateLimit: js.UndefOr[Double] = js.undefined): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(burstLimit)) __obj.updateDynamic("burstLimit")(burstLimit)
    if (!js.isUndefined(rateLimit)) __obj.updateDynamic("rateLimit")(rateLimit)
    __obj.asInstanceOf[ThrottleSettings]
  }
}

