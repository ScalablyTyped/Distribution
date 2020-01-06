package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRevisionRequest extends js.Object {
  /**
    * An optional comment about the revision.
    */
  var Comment: js.UndefOr[__stringMin0Max16384] = js.native
  /**
    * The unique identifier for a data set.
    */
  var DataSetId: __string = js.native
  /**
    * A revision tag is an optional label that you can assign to a revision when you create it. Each tag consists of a key and an optional value, both of which you define. When you use tagging, you can also use tag-based access control in IAM policies to control access to these data sets and revisions.
    */
  var Tags: js.UndefOr[MapOf__string] = js.native
}

object CreateRevisionRequest {
  @scala.inline
  def apply(DataSetId: __string, Comment: __stringMin0Max16384 = null, Tags: MapOf__string = null): CreateRevisionRequest = {
    val __obj = js.Dynamic.literal(DataSetId = DataSetId.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRevisionRequest]
  }
}

