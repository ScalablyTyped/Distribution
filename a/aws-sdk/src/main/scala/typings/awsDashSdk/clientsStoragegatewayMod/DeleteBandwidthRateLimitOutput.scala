package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBandwidthRateLimitOutput extends js.Object {
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}

object DeleteBandwidthRateLimitOutput {
  @scala.inline
  def apply(GatewayARN: GatewayARN = null): DeleteBandwidthRateLimitOutput = {
    val __obj = js.Dynamic.literal()
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[DeleteBandwidthRateLimitOutput]
  }
}

