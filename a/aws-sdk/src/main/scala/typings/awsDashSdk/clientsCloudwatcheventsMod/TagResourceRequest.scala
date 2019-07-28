package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the rule that you're adding tags to.
    */
  var ResourceARN: Arn
  /**
    * The list of key-value pairs to associate with the rule.
    */
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: Arn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

