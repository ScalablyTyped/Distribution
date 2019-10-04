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
  def apply(path: String = null, sizeInGb: js.UndefOr[integer] = js.undefined): AttachedDisk = {
    val __obj = js.Dynamic.literal()
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(sizeInGb)) __obj.updateDynamic("sizeInGb")(sizeInGb)
    __obj.asInstanceOf[AttachedDisk]
  }
}

