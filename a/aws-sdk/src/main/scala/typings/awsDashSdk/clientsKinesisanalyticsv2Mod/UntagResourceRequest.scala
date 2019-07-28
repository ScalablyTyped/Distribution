package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the Kinesis Analytics application from which to remove the tags.
    */
  var ResourceARN: KinesisAnalyticsARN
  /**
    * A list of keys of tags to remove from the specified application.
    */
  var TagKeys: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.TagKeys
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceARN: KinesisAnalyticsARN, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

