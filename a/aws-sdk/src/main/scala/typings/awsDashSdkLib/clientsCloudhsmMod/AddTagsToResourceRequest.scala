package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTagsToResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS CloudHSM resource to tag.
    */
  var ResourceArn: String
  /**
    * One or more tags.
    */
  var TagList: awsDashSdkLib.clientsCloudhsmMod.TagList
}

object AddTagsToResourceRequest {
  @scala.inline
  def apply(ResourceArn: String, TagList: TagList): AddTagsToResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagList = TagList)
  
    __obj.asInstanceOf[AddTagsToResourceRequest]
  }
}

