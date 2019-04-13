package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaChangePolicy extends js.Object {
  /**
    * The deletion behavior when the crawler finds a deleted object.
    */
  var DeleteBehavior: js.UndefOr[DeleteBehavior] = js.undefined
  /**
    * The update behavior when the crawler finds a changed schema.
    */
  var UpdateBehavior: js.UndefOr[UpdateBehavior] = js.undefined
}

object SchemaChangePolicy {
  @scala.inline
  def apply(DeleteBehavior: DeleteBehavior = null, UpdateBehavior: UpdateBehavior = null): SchemaChangePolicy = {
    val __obj = js.Dynamic.literal()
    if (DeleteBehavior != null) __obj.updateDynamic("DeleteBehavior")(DeleteBehavior.asInstanceOf[js.Any])
    if (UpdateBehavior != null) __obj.updateDynamic("UpdateBehavior")(UpdateBehavior.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaChangePolicy]
  }
}

