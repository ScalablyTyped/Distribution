package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStreamingDistributionRequest extends js.Object {
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: typings.awsDashSdk.clientsCloudfrontMod.StreamingDistributionConfig
}

object CreateStreamingDistributionRequest {
  @scala.inline
  def apply(StreamingDistributionConfig: StreamingDistributionConfig): CreateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfig = StreamingDistributionConfig)
  
    __obj.asInstanceOf[CreateStreamingDistributionRequest]
  }
}

