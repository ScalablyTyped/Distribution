package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource that you want to add one or more tags to.
    */
  var ResourceArn: AmazonResourceName
  /**
    * A list of the tags that you want to add to the resource. A tag consists of a required tag key (Key) and an associated tag value (Value). The maximum length of a tag key is 128 characters. The maximum length of a tag value is 256 characters.
    */
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: AmazonResourceName, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

