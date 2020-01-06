package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateHostedZoneCommentRequest extends js.Object {
  /**
    * The new comment for the hosted zone. If you don't specify a value for Comment, Amazon Route 53 deletes the existing value of the Comment element, if any.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
  /**
    * The ID for the hosted zone that you want to update the comment for.
    */
  var Id: ResourceId = js.native
}

object UpdateHostedZoneCommentRequest {
  @scala.inline
  def apply(Id: ResourceId, Comment: ResourceDescription = null): UpdateHostedZoneCommentRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateHostedZoneCommentRequest]
  }
}

