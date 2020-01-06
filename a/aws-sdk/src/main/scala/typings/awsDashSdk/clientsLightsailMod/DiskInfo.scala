package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskInfo extends js.Object {
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[Boolean] = js.native
  /**
    * The disk name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The disk path.
    */
  var path: js.UndefOr[NonEmptyString] = js.native
  /**
    * The size of the disk in GB (e.g., 32).
    */
  var sizeInGb: js.UndefOr[integer] = js.native
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
    if (!js.isUndefined(isSystemDisk)) __obj.updateDynamic("isSystemDisk")(isSystemDisk.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sizeInGb != null) __obj.updateDynamic("sizeInGb")(sizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskInfo]
  }
}

