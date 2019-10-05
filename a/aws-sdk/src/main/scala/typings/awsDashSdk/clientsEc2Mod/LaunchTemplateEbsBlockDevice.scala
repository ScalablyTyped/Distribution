package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateEbsBlockDevice extends js.Object {
  /**
    * Indicates whether the EBS volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the EBS volume is encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. 
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) CMK used for encryption.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * The size of the volume, in GiB.
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
  /**
    * The volume type.
    */
  var VolumeType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.VolumeType] = js.undefined
}

object LaunchTemplateEbsBlockDevice {
  @scala.inline
  def apply(
    DeleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    Encrypted: js.UndefOr[scala.Boolean] = js.undefined,
    Iops: Int | scala.Double = null,
    KmsKeyId: String = null,
    SnapshotId: String = null,
    VolumeSize: Int | scala.Double = null,
    VolumeType: VolumeType = null
  ): LaunchTemplateEbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (Iops != null) __obj.updateDynamic("Iops")(Iops.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (VolumeSize != null) __obj.updateDynamic("VolumeSize")(VolumeSize.asInstanceOf[js.Any])
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateEbsBlockDevice]
  }
}

