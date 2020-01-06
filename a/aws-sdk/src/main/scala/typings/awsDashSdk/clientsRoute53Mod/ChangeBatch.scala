package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeBatch extends js.Object {
  /**
    * Information about the changes to make to the record sets.
    */
  var Changes: typings.awsDashSdk.clientsRoute53Mod.Changes = js.native
  /**
    *  Optional: Any comments you want to include about a change batch request.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.native
}

object ChangeBatch {
  @scala.inline
  def apply(Changes: Changes, Comment: ResourceDescription = null): ChangeBatch = {
    val __obj = js.Dynamic.literal(Changes = Changes.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeBatch]
  }
}

