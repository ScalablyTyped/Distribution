package typings.awsDashSdk.clientsDatasyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource to apply the tag to.
    */
  var ResourceArn: TaggableResourceArn
  /**
    * The tags to apply.
    */
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: TaggableResourceArn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

