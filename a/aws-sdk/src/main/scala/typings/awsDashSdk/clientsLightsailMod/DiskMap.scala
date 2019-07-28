package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskMap extends js.Object {
  /**
    * The new disk name (e.g., my-new-disk).
    */
  var newDiskName: js.UndefOr[ResourceName] = js.undefined
  /**
    * The original disk path exposed to the instance (for example, /dev/sdh).
    */
  var originalDiskPath: js.UndefOr[NonEmptyString] = js.undefined
}

object DiskMap {
  @scala.inline
  def apply(newDiskName: ResourceName = null, originalDiskPath: NonEmptyString = null): DiskMap = {
    val __obj = js.Dynamic.literal()
    if (newDiskName != null) __obj.updateDynamic("newDiskName")(newDiskName)
    if (originalDiskPath != null) __obj.updateDynamic("originalDiskPath")(originalDiskPath)
    __obj.asInstanceOf[DiskMap]
  }
}

