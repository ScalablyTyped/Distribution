package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskInfo extends js.Object {
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.undefined
  /**
    * The disk name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The disk path.
    */
  var path: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
}

object DiskInfo {
  @scala.inline
  def apply(
    isSystemDisk: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    path: NonEmptyString = null,
    sizeInGb: Int | Double = null
  ): DiskInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSystemDisk)) __obj.updateDynamic("isSystemDisk")(isSystemDisk)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sizeInGb != null) __obj.updateDynamic("sizeInGb")(sizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskInfo]
  }
}

