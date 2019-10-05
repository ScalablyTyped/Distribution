package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportInstanceVolumeDetailItem extends js.Object {
  /**
    * The Availability Zone where the resulting instance will reside.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The number of bytes converted so far.
    */
  var BytesConverted: js.UndefOr[Long] = js.undefined
  /**
    * A description of the task.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The image.
    */
  var Image: js.UndefOr[DiskImageDescription] = js.undefined
  /**
    * The status of the import of this particular disk image.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The status information or errors related to the disk image.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * The volume.
    */
  var Volume: js.UndefOr[DiskImageVolumeDescription] = js.undefined
}

object ImportInstanceVolumeDetailItem {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    BytesConverted: Int | scala.Double = null,
    Description: String = null,
    Image: DiskImageDescription = null,
    Status: String = null,
    StatusMessage: String = null,
    Volume: DiskImageVolumeDescription = null
  ): ImportInstanceVolumeDetailItem = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (BytesConverted != null) __obj.updateDynamic("BytesConverted")(BytesConverted.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Image != null) __obj.updateDynamic("Image")(Image)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (Volume != null) __obj.updateDynamic("Volume")(Volume)
    __obj.asInstanceOf[ImportInstanceVolumeDetailItem]
  }
}

