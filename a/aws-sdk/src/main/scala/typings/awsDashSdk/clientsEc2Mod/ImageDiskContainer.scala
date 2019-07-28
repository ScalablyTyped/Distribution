package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageDiskContainer extends js.Object {
  /**
    * The description of the disk image.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The block device mapping for the disk.
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  /**
    * The format of the disk image being imported. Valid values: VHD | VMDK | OVA 
    */
  var Format: js.UndefOr[String] = js.undefined
  /**
    * The ID of the EBS snapshot to be used for importing the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * The URL to the Amazon S3-based disk image being imported. The URL can either be a https URL (https://..) or an Amazon S3 URL (s3://..)
    */
  var Url: js.UndefOr[String] = js.undefined
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.UserBucket] = js.undefined
}

object ImageDiskContainer {
  @scala.inline
  def apply(
    Description: String = null,
    DeviceName: String = null,
    Format: String = null,
    SnapshotId: String = null,
    Url: String = null,
    UserBucket: UserBucket = null
  ): ImageDiskContainer = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (UserBucket != null) __obj.updateDynamic("UserBucket")(UserBucket)
    __obj.asInstanceOf[ImageDiskContainer]
  }
}

