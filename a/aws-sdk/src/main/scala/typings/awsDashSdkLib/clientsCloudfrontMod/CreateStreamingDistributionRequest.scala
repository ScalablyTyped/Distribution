package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStreamingDistributionRequest extends js.Object {
  /**
    * The streaming distribution's configuration information.
    */
  var StreamingDistributionConfig: awsDashSdkLib.clientsCloudfrontMod.StreamingDistributionConfig
}

object CreateStreamingDistributionRequest {
  @scala.inline
  def apply(StreamingDistributionConfig: StreamingDistributionConfig): CreateStreamingDistributionRequest = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfig = StreamingDistributionConfig)
  
    __obj.asInstanceOf[CreateStreamingDistributionRequest]
  }
}

