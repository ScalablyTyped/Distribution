package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceInput extends js.Object {
  /**
    * Removes one or more tags from the workgroup resource for the specified ARN.
    */
  var ResourceARN: AmazonResourceName = js.native
  /**
    * Removes the tags associated with one or more tag keys from the workgroup resource.
    */
  var TagKeys: TagKeyList = js.native
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName, TagKeys: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

