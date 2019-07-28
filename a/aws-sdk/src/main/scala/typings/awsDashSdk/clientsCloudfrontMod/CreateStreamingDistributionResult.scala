package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStreamingDistributionResult extends js.Object {
  /**
    * The current version of the streaming distribution created.
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * The fully qualified URI of the new streaming distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
    */
  var Location: js.UndefOr[String] = js.undefined
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.StreamingDistribution] = js.undefined
}

object CreateStreamingDistributionResult {
  @scala.inline
  def apply(ETag: String = null, Location: String = null, StreamingDistribution: StreamingDistribution = null): CreateStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (StreamingDistribution != null) __obj.updateDynamic("StreamingDistribution")(StreamingDistribution)
    __obj.asInstanceOf[CreateStreamingDistributionResult]
  }
}

