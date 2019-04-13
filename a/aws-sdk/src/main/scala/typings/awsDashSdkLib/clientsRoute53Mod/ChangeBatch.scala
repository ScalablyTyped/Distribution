package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangeBatch extends js.Object {
  /**
    * Information about the changes to make to the record sets.
    */
  var Changes: awsDashSdkLib.clientsRoute53Mod.Changes
  /**
    *  Optional: Any comments you want to include about a change batch request.
    */
  var Comment: js.UndefOr[ResourceDescription] = js.undefined
}

object ChangeBatch {
  @scala.inline
  def apply(Changes: Changes, Comment: ResourceDescription = null): ChangeBatch = {
    val __obj = js.Dynamic.literal(Changes = Changes)
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[ChangeBatch]
  }
}

