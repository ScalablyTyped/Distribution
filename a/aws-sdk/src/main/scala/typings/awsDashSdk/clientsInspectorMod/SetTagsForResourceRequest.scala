package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetTagsForResourceRequest extends js.Object {
  /**
    * The ARN of the assessment template that you want to set tags to.
    */
  var resourceArn: Arn
  /**
    * A collection of key and value pairs that you want to set to the assessment template.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}

object SetTagsForResourceRequest {
  @scala.inline
  def apply(resourceArn: Arn, tags: TagList = null): SetTagsForResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[SetTagsForResourceRequest]
  }
}

