package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThrottleSettings extends js.Object {
  /**
    * The API request burst limit, the maximum rate limit over a time ranging from one to a few seconds, depending upon whether the underlying token bucket is at its full capacity.
    */
  var burstLimit: js.UndefOr[Integer] = js.native
  /**
    * The API request steady-state rate limit.
    */
  var rateLimit: js.UndefOr[Double] = js.native
}

object ThrottleSettings {
  @scala.inline
  def apply(burstLimit: js.UndefOr[Integer] = js.undefined, rateLimit: js.UndefOr[Double] = js.undefined): ThrottleSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(burstLimit)) __obj.updateDynamic("burstLimit")(burstLimit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rateLimit)) __obj.updateDynamic("rateLimit")(rateLimit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThrottleSettings]
  }
}

