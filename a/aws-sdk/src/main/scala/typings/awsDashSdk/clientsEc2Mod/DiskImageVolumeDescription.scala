package typings.awsDashSdk.clientsEc2Mod

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
  def apply(Id: String = null, Size: Int | scala.Double = null): DiskImageVolumeDescription = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskImageVolumeDescription]
  }
}

