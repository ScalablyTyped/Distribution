package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamingDistributionConfigResult extends js.Object {
  /**
    * The current version of the configuration. For example: E2QWRUHAPOMQZL. 
    */
  var ETag: js.UndefOr[String] = js.undefined
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: js.UndefOr[typings.awsDashSdk.clientsCloudfrontMod.StreamingDistributionConfig] = js.undefined
}

object GetStreamingDistributionConfigResult {
  @scala.inline
  def apply(ETag: String = null, StreamingDistributionConfig: StreamingDistributionConfig = null): GetStreamingDistributionConfigResult = {
    val __obj = js.Dynamic.literal()
    if (ETag != null) __obj.updateDynamic("ETag")(ETag)
    if (StreamingDistributionConfig != null) __obj.updateDynamic("StreamingDistributionConfig")(StreamingDistributionConfig)
    __obj.asInstanceOf[GetStreamingDistributionConfigResult]
  }
}

