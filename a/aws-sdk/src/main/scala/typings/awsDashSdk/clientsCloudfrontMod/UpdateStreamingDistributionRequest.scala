package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateStreamingDistributionRequest extends js.Object {
  /**
    * The streaming distribution's id.
    */
  var Id: String
  /**
    * The value of the ETag header that you received when retrieving the streaming distribution's configuration. For example: E2QWRUHAPOMQZL.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: typings.awsDashSdk.clientsCloudfrontMod.StreamingDistributionConfig
}

object UpdateStreamingDistributionRequest {
  @scala.inline
  def apply(Id: String, StreamingDistributionConfig: StreamingDistributionConfig, IfMatch: String = null): UpdateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(Id = Id, StreamingDistributionConfig = StreamingDistributionConfig)
    if (IfMatch != null) __obj.updateDynamic("IfMatch")(IfMatch)
    __obj.asInstanceOf[UpdateStreamingDistributionRequest]
  }
}

