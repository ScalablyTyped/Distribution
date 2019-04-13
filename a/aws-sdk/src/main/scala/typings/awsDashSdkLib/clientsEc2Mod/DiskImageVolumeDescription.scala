package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskImageVolumeDescription extends js.Object {
  /**
    * The volume identifier.
    */
  var Id: js.UndefOr[String] = js.undefined
  /**
    * The size of the volume, in GiB.
    */
  var Size: js.UndefOr[Long] = js.undefined
}

object DiskImageVolumeDescription {
  @scala.inline
  def apply(Id: String = null, Size: js.UndefOr[Long] = js.undefined): DiskImageVolumeDescription = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    __obj.asInstanceOf[DiskImageVolumeDescription]
  }
}

