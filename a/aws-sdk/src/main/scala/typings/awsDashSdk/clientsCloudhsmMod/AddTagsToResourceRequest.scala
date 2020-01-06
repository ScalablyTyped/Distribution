package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS CloudHSM resource to tag.
    */
  var ResourceArn: String = js.native
  /**
    * One or more tags.
    */
  var TagList: typings.awsDashSdk.clientsCloudhsmMod.TagList = js.native
}

object AddTagsToResourceRequest {
  @scala.inline
  def apply(ResourceArn: String, TagList: TagList): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagList = TagList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
}

