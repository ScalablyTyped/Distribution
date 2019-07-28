package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * ARN of a resource tag.
    */
  var resourceArn: String
  /**
    * Tags assigned to a resource.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}

object TagResourceRequest {
  @scala.inline
  def apply(resourceArn: String, tags: TagsMap = null): TagResourceRequest = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[TagResourceRequest]
  }
}

