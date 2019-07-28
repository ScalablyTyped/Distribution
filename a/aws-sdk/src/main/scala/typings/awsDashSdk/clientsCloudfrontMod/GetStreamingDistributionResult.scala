package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamingDistributionResult extends js.Object {
  /**
    * The current version of the streaming distribution's information. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.StreamingDistribution] = js.undefined
}

object GetStreamingDistributionResult {
  @scala.inline
  def apply(ETag: String = null, StreamingDistribution: StreamingDistribution = null): GetStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (StreamingDistribution != null) __obj.updateDynamic("StreamingDistribution")(StreamingDistribution)
    __obj.asInstanceOf[GetStreamingDistributionResult]
  }
}

