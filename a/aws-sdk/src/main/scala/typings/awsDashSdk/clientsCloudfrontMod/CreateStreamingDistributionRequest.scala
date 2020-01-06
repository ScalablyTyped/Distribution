package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamingDistributionRequest extends js.Object {
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: typings.awsDashSdk.clientsCloudfrontMod.StreamingDistributionConfig = js.native
}

object CreateStreamingDistributionRequest {
  @scala.inline
  def apply(StreamingDistributionConfig: StreamingDistributionConfig): CreateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfig = StreamingDistributionConfig.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateStreamingDistributionRequest]
  }
}

