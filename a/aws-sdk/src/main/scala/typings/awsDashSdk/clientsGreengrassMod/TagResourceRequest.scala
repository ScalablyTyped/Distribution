package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: __string
  var tags: js.UndefOr[Tags] = js.undefined
}

object TagResourceRequest {
  @scala.inline
  def apply(ResourceArn: __string, tags: Tags = null): TagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[TagResourceRequest]
  }
}

