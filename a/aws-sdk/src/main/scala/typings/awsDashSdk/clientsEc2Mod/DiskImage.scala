package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskImage extends js.Object {
  /**
    * A description of the disk image.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Information about the disk image.
    */
  var Image: js.UndefOr[DiskImageDetail] = js.undefined
  /**
    * Information about the volume.
    */
  var Volume: js.UndefOr[VolumeDetail] = js.undefined
}

object DiskImage {
  @scala.inline
  def apply(Description: String = null, Image: DiskImageDetail = null, Volume: VolumeDetail = null): DiskImage = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Image != null) __obj.updateDynamic("Image")(Image)
    if (Volume != null) __obj.updateDynamic("Volume")(Volume)
    __obj.asInstanceOf[DiskImage]
  }
}

