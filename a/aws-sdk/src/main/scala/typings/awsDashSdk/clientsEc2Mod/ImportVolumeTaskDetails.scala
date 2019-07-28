package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportVolumeTaskDetails extends js.Object {
  /**
    * The Availability Zone where the resulting volume will reside.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The number of bytes converted so far.
    */
  var BytesConverted: js.UndefOr[Long] = js.undefined
  /**
    * The description you provided when starting the import volume task.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The image.
    */
  var Image: js.UndefOr[DiskImageDescription] = js.undefined
  /**
    * The volume.
    */
  var Volume: js.UndefOr[DiskImageVolumeDescription] = js.undefined
}

object ImportVolumeTaskDetails {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    BytesConverted: js.UndefOr[Long] = js.undefined,
    Description: String = null,
    Image: DiskImageDescription = null,
    Volume: DiskImageVolumeDescription = null
  ): ImportVolumeTaskDetails = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (!js.isUndefined(BytesConverted)) __obj.updateDynamic("BytesConverted")(BytesConverted)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Image != null) __obj.updateDynamic("Image")(Image)
    if (Volume != null) __obj.updateDynamic("Volume")(Volume)
    __obj.asInstanceOf[ImportVolumeTaskDetails]
  }
}

