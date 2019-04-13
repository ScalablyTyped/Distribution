package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStreamingDistributionResult extends js.Object {
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL.
    */
  var ETag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The streaming distribution's information.
    */
  var StreamingDistribution: js.UndefOr[StreamingDistribution] = js.undefined
}

object UpdateStreamingDistributionResult {
  @scala.inline
  def apply(ETag: java.lang.String = null, StreamingDistribution: StreamingDistribution = null): UpdateStreamingDistributionResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (StreamingDistribution != null) __obj.updateDynamic("StreamingDistribution")(StreamingDistribution)
    __obj.asInstanceOf[UpdateStreamingDistributionResult]
  }
}

