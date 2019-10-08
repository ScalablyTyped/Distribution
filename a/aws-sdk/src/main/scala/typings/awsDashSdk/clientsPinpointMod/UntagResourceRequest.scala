package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application, campaign, message template, or segment.
    */
  var ResourceArn: __string
  /**
    * The key of the tag to remove from the application, campaign, message template, or segment. To remove multiple tags, append the tagKeys parameter and argument for each additional tag to remove, separated by an ampersand (&amp;).
    */
  var TagKeys: ListOf__string
}

object UntagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, TagKeys: ListOf__string): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeys = TagKeys)
  
    __obj.asInstanceOf[UntagResourceRequest]
  }
}

