package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStreamingDistributionResult extends js.Object {
  /**
    * The current version of the streaming distribution created.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The fully qualified URI of the new streaming distribution resource just created. For example: https://cloudfront.amazonaws.com/2010-11-01/streaming-distribution/EGTXBD79H29TRA8.
    */
  var Location: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
}

object CreateStreamingDistributionResult {
  @scala.inline
  def apply(
    ETag: java.lang.String = null,
    Location: java.lang.String = null,
    StreamingDistribution: StreamingDistribution = null
  ): CreateStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (Location != null) __obj.updateDynamic("Location")(Location)
    if (StreamingDistribution != null) __obj.updateDynamic("StreamingDistribution")(StreamingDistribution)
    __obj.asInstanceOf[CreateStreamingDistributionResult]
  }
}

