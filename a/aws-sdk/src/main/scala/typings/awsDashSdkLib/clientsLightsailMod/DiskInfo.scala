package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskInfo extends js.Object {
  /**
    * A Boolean value indicating whether this disk is a system disk (has an operating system loaded on it).
    */
  var isSystemDisk: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The disk name.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
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
    isSystemDisk: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    path: NonEmptyString = null,
    sizeInGb: js.UndefOr[integer] = js.undefined
  ): DiskInfo = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSystemDisk)) __obj.updateDynamic("isSystemDisk")(isSystemDisk)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(sizeInGb)) __obj.updateDynamic("sizeInGb")(sizeInGb)
    __obj.asInstanceOf[DiskInfo]
  }
}

