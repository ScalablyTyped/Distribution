package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The resource ARN.
    */
  var ResourceARN: Arn = js.native
  /**
    * The tag key-value pairs.
    */
  var Tags: TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceARN: Arn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

