package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * ARN of a resource tag.
    */
  var resourceArn: String = js.native
  /**
    * Tags assigned to a resource.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: String, tags: TagsMap = null): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceRequest]
  }
}

