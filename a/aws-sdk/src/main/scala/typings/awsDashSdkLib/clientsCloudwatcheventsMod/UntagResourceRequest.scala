package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The ARN of the rule that you're removing tags from.
    */
  var ResourceARN: Arn
  /**
    * The list of tag keys to remove from the resource.
    */
  var TagKeys: TagKeyList
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceARN: Arn, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

