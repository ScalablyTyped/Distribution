package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapshotTaskDetail extends js.Object {
  /**
    * The description of the snapshot.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The size of the disk in the snapshot, in GiB.
    */
  var DiskImageSize: js.UndefOr[Double] = js.undefined
  /**
    * Indicates whether the snapshot is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The format of the disk image from which the snapshot is created.
    */
  var Format: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to create the encrypted snapshot.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The percentage of completion for the import snapshot task.
    */
  var Progress: js.UndefOr[String] = js.undefined
  /**
    * The snapshot ID of the disk being imported.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * A brief status for the import snapshot task.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * A detailed status message for the import snapshot task.
    */
  var StatusMessage: js.UndefOr[String] = js.undefined
  /**
    * The URL of the disk image from which the snapshot is created.
    */
  var Url: js.UndefOr[String] = js.undefined
  /**
    * The S3 bucket for the disk image.
    */
  var UserBucket: js.UndefOr[UserBucketDetails] = js.undefined
}

object SnapshotTaskDetail {
  @scala.inline
  def apply(
    Description: String = null,
    DiskImageSize: js.UndefOr[Double] = js.undefined,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Format: String = null,
    KmsKeyId: String = null,
    Progress: String = null,
    SnapshotId: String = null,
    Status: String = null,
    StatusMessage: String = null,
    Url: String = null,
    UserBucket: UserBucketDetails = null
  ): SnapshotTaskDetail = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(DiskImageSize)) __obj.updateDynamic("DiskImageSize")(DiskImageSize)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (Format != null) __obj.updateDynamic("Format")(Format)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (Progress != null) __obj.updateDynamic("Progress")(Progress)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage)
    if (Url != null) __obj.updateDynamic("Url")(Url)
    if (UserBucket != null) __obj.updateDynamic("UserBucket")(UserBucket)
    __obj.asInstanceOf[SnapshotTaskDetail]
  }
}

