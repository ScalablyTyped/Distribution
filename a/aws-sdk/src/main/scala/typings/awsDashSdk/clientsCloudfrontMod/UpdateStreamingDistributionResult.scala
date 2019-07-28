package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStreamingDistributionResult extends js.Object {
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.StreamingDistribution] = js.undefined
}

object UpdateStreamingDistributionResult {
  @scala.inline
  def apply(ETag: String = null, StreamingDistribution: StreamingDistribution = null): UpdateStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (StreamingDistribution != null) __obj.updateDynamic("StreamingDistribution")(StreamingDistribution)
    __obj.asInstanceOf[UpdateStreamingDistributionResult]
  }
}

