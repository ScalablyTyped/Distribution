package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachedDisk extends js.Object {
  /**
    * The path of the disk (e.g., /dev/xvdf).
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The size of the disk in GB.
    */
  var sizeInGb: js.UndefOr[integer] = js.undefined
}

object AttachedDisk {
  @scala.inline
  def apply(path: String = null, sizeInGb: Int | Double = null): AttachedDisk = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    if (sizeInGb != null) __obj.updateDynamic("sizeInGb")(sizeInGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachedDisk]
  }
}

