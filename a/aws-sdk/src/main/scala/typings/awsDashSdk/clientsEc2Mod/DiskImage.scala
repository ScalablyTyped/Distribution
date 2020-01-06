package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskImage extends js.Object {
  /**
    * A description of the disk image.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Information about the disk image.
    */
  var Image: js.UndefOr[DiskImageDetail] = js.native
  /**
    * Information about the volume.
    */
  var Volume: js.UndefOr[VolumeDetail] = js.native
}

object DiskImage {
  @scala.inline
  def apply(Description: String = null, Image: DiskImageDetail = null, Volume: VolumeDetail = null): DiskImage = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Image != null) __obj.updateDynamic("Image")(Image.asInstanceOf[js.Any])
    if (Volume != null) __obj.updateDynamic("Volume")(Volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskImage]
  }
}

