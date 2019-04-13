package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVolumePermissionModifications extends js.Object {
  /**
    * Adds the specified AWS account ID or group to the list.
    */
  var Add: js.UndefOr[CreateVolumePermissionList] = js.undefined
  /**
    * Removes the specified AWS account ID or group from the list.
    */
  var Remove: js.UndefOr[CreateVolumePermissionList] = js.undefined
}

object CreateVolumePermissionModifications {
  @scala.inline
  def apply(Add: CreateVolumePermissionList = null, Remove: CreateVolumePermissionList = null): CreateVolumePermissionModifications = {
    val __obj = js.Dynamic.literal()
    if (Add != null) __obj.updateDynamic("Add")(Add)
    if (Remove != null) __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[CreateVolumePermissionModifications]
  }
}

