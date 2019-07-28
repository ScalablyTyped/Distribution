package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateBandwidthRateLimitInput extends js.Object {
  /**
    * The average download bandwidth rate limit in bits per second.
    */
  var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined
  /**
    * The average upload bandwidth rate limit in bits per second.
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined
  var GatewayARN: typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN
}

object UpdateBandwidthRateLimitInput {
  @scala.inline
  def apply(
    GatewayARN: GatewayARN,
    AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined,
    AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined
  ): UpdateBandwidthRateLimitInput = {
    val __obj = js.Dynamic.literal(GatewayARN = GatewayARN)
    if (!js.isUndefined(AverageDownloadRateLimitInBitsPerSec)) __obj.updateDynamic("AverageDownloadRateLimitInBitsPerSec")(AverageDownloadRateLimitInBitsPerSec)
    if (!js.isUndefined(AverageUploadRateLimitInBitsPerSec)) __obj.updateDynamic("AverageUploadRateLimitInBitsPerSec")(AverageUploadRateLimitInBitsPerSec)
    __obj.asInstanceOf[UpdateBandwidthRateLimitInput]
  }
}

