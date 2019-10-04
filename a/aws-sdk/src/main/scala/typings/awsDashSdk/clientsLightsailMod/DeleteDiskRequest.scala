package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDiskRequest extends js.Object {
  /**
    * The unique name of the disk you want to delete (e.g., my-disk).
    */
  var diskName: ResourceName
  /**
    * A Boolean value to indicate whether to delete the enabled add-ons for the disk.
    */
  var forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined
}

object DeleteDiskRequest {
  @scala.inline
  def apply(diskName: ResourceName, forceDeleteAddOns: js.UndefOr[Boolean] = js.undefined): DeleteDiskRequest = {
    val __obj = js.Dynamic.literal(diskName = diskName)
    if (!js.isUndefined(forceDeleteAddOns)) __obj.updateDynamic("forceDeleteAddOns")(forceDeleteAddOns)
    __obj.asInstanceOf[DeleteDiskRequest]
  }
}

