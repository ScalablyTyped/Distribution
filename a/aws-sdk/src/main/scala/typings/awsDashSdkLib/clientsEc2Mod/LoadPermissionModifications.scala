package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadPermissionModifications extends js.Object {
  /**
    * The load permissions to add.
    */
  var Add: js.UndefOr[LoadPermissionListRequest] = js.undefined
  /**
    * The load permissions to remove.
    */
  var Remove: js.UndefOr[LoadPermissionListRequest] = js.undefined
}

object LoadPermissionModifications {
  @scala.inline
  def apply(Add: LoadPermissionListRequest = null, Remove: LoadPermissionListRequest = null): LoadPermissionModifications = {
    val __obj = js.Dynamic.literal()
    if (Add != null) __obj.updateDynamic("Add")(Add)
    if (Remove != null) __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[LoadPermissionModifications]
  }
}

