package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotDetail extends js.Object {
  /**
    * A description for the snapshot.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The block device mapping for the snapshot.
    */
  var DeviceName: js.UndefOr[String] = js.undefined
  /**
    * The size of the disk in the snapshot, in GiB.
    */
  var DiskImageSize: js.UndefOr[Double] = js.undefined
  /**
    * The format of the disk image from which the snapshot is created.
    */
  var Format: js.UndefOr[String] = js.undefined
  /**
    * The percentage of progress for the task.
    */
  var Progress: js.UndefOr[String] = js.undefined
  /**
    * The snapshot ID of the disk being imported.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * A brief status of the snapshot creation.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * A detailed status message for the snapshot creation.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * The URL used to access the disk image.
    */
  var Url: js.UndefOr[String] = js.undefined
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[UserBucketDetails] = js.undefined
}

object SnapshotDetail {
  @scala.inline
  def apply(
    Description: String = null,
    DeviceName: String = null,
    DiskImageSize: js.UndefOr[Double] = js.undefined,
    Format: String = null,
    Progress: String = null,
    SnapshotId: String = null,
    Status: String = null,
    StatusMessage: String = null,
    Url: String = null,
    UserBucket: UserBucketDetails = null
  ): SnapshotDetail = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (!js.isUndefined(DiskImageSize)) __obj.updateDynamic("DiskImageSize")(DiskImageSize)
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (UserBucket != null) __obj.updateDynamic("UserBucket")(UserBucket)
    __obj.asInstanceOf[SnapshotDetail]
  }
}

