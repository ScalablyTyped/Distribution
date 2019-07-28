package typings.awsDashSdk.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamingDistributionConfigWithTags extends js.Object {
  /**
    * A streaming distribution Configuration.
    */
  var StreamingDistributionConfig: typings.awsDashSdk.clientsCloudfrontMod.StreamingDistributionConfig
  /**
    * A complex type that contains zero or more Tag elements.
    */
  var Tags: typings.awsDashSdk.clientsCloudfrontMod.Tags
}

object StreamingDistributionConfigWithTags {
  @scala.inline
  def apply(StreamingDistributionConfig: StreamingDistributionConfig, Tags: Tags): StreamingDistributionConfigWithTags = {
    val __obj = js.Dynamic.literal(StreamingDistributionConfig = StreamingDistributionConfig, Tags = Tags)
  
    __obj.asInstanceOf[StreamingDistributionConfigWithTags]
  }
}

