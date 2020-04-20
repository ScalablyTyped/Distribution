package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application that you want to remove one or more tags from.
    */
  var ResourceARN: AmazonResourceName = js.native
  /**
    * The tags (tag keys) that you want to remove from the resource. When you specify a tag key, the action removes both that key and its associated tag value. To remove more than one tag from the application, append the TagKeys parameter and argument for each additional tag to remove, separated by an ampersand. 
    */
  var TagKeys: TagKeyList = js.native
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName, TagKeys: TagKeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

