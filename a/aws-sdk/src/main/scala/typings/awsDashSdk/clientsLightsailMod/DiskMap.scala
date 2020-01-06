package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskMap extends js.Object {
  /**
    * The new disk name (e.g., my-new-disk).
    */
  var newDiskName: js.UndefOr[ResourceName] = js.native
  /**
    * The original disk path exposed to the instance (for example, /dev/sdh).
    */
  var originalDiskPath: js.UndefOr[NonEmptyString] = js.native
}

object DiskMap {
  @scala.inline
  def apply(newDiskName: ResourceName = null, originalDiskPath: NonEmptyString = null): DiskMap = {
    val __obj = js.Dynamic.literal()
    if (newDiskName != null) __obj.updateDynamic("newDiskName")(newDiskName.asInstanceOf[js.Any])
    if (originalDiskPath != null) __obj.updateDynamic("originalDiskPath")(originalDiskPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskMap]
  }
}

