package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the Kinesis Analytics application from which to remove the tags.
    */
  var ResourceARN: KinesisAnalyticsARN = js.native
  /**
    * A list of keys of tags to remove from the specified application.
    */
  var TagKeys: typings.awsDashSdk.clientsKinesisanalyticsMod.TagKeys = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceARN: KinesisAnalyticsARN, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

