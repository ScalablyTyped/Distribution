package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBandwidthRateLimitOutput extends js.Object {
  /**
    * The average download bandwidth rate limit in bits per second. This field does not appear in the response if the download rate limit is not set.
    */
  var AverageDownloadRateLimitInBitsPerSec: js.UndefOr[BandwidthDownloadRateLimit] = js.undefined
  /**
    * The average upload bandwidth rate limit in bits per second. This field does not appear in the response if the upload rate limit is not set.
    */
  var AverageUploadRateLimitInBitsPerSec: js.UndefOr[BandwidthUploadRateLimit] = js.undefined
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}

object DescribeBandwidthRateLimitOutput {
  @scala.inline
  def apply(
    AverageDownloadRateLimitInBitsPerSec: Int | Double = null,
    AverageUploadRateLimitInBitsPerSec: Int | Double = null,
    GatewayARN: GatewayARN = null
  ): DescribeBandwidthRateLimitOutput = {
    val __obj = js.Dynamic.literal()
    if (AverageDownloadRateLimitInBitsPerSec != null) __obj.updateDynamic("AverageDownloadRateLimitInBitsPerSec")(AverageDownloadRateLimitInBitsPerSec.asInstanceOf[js.Any])
    if (AverageUploadRateLimitInBitsPerSec != null) __obj.updateDynamic("AverageUploadRateLimitInBitsPerSec")(AverageUploadRateLimitInBitsPerSec.asInstanceOf[js.Any])
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    __obj.asInstanceOf[DescribeBandwidthRateLimitOutput]
  }
}

