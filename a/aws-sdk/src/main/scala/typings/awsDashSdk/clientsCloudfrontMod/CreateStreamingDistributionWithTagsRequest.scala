package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStreamingDistributionWithTagsRequest extends js.Object {
  /**
    *  The streaming distribution's configuration information. 
    */
  var StreamingDistributionConfigWithTags: typings.awsDashSdk.clientsCloudfrontMod.StreamingDistributionConfigWithTags = js.native
}

object CreateStreamingDistributionWithTagsRequest {
  @scala.inline
  def apply(StreamingDistributionConfigWithTags: StreamingDistributionConfigWithTags): CreateStreamingDistributionWithTagsRequest = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfigWithTags = StreamingDistributionConfigWithTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateStreamingDistributionWithTagsRequest]
  }
}

