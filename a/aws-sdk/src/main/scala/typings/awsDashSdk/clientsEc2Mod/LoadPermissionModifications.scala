package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadPermissionModifications extends js.Object {
  /**
    * The load permissions to add.
    */
  var Add: js.UndefOr[LoadPermissionListRequest] = js.native
  /**
    * The load permissions to remove.
    */
  var Remove: js.UndefOr[LoadPermissionListRequest] = js.native
}

object LoadPermissionModifications {
  @scala.inline
  def apply(Add: LoadPermissionListRequest = null, Remove: LoadPermissionListRequest = null): LoadPermissionModifications = {
    val __obj = js.Dynamic.literal()
    if (Add != null) __obj.updateDynamic("Add")(Add.asInstanceOf[js.Any])
    if (Remove != null) __obj.updateDynamic("Remove")(Remove.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadPermissionModifications]
  }
}

