package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  /**
    * Information about the volume attachments.
    */
  var Attachments: js.UndefOr[VolumeAttachmentList] = js.undefined
  /**
    * The Availability Zone for the volume.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The time stamp when volume creation was initiated.
    */
  var CreateTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Indicates whether the volume will be encrypted.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. For Provisioned IOPS SSD volumes, this represents the number of IOPS that are provisioned for the volume. For General Purpose SSD volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more information, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud User Guide. Constraints: Range is 100-16,000 IOPS for gp2 volumes and 100 to 64,000IOPS for io1 volumes, in most Regions. The maximum IOPS for io1 of 64,000 is guaranteed only on Nitro-based instances. Other instance families guarantee performance up to 32,000 IOPS. Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  /**
    * The full ARN of the AWS Key Management Service (AWS KMS) customer master key (CMK) that was used to protect the volume encryption key for the volume.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The size of the volume, in GiBs.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  /**
    * The snapshot from which the volume was created, if applicable.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * The volume state.
    */
  var State: js.UndefOr[VolumeState] = js.undefined
  /**
    * Any tags assigned to the volume.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the volume.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
  /**
    * The volume type. This can be gp2 for General Purpose SSD, io1 for Provisioned IOPS SSD, st1 for Throughput Optimized HDD, sc1 for Cold HDD, or standard for Magnetic volumes.
    */
  var VolumeType: js.UndefOr[VolumeType] = js.undefined
}

object Volume {
  @scala.inline
  def apply(
    Attachments: VolumeAttachmentList = null,
    AvailabilityZone: String = null,
    CreateTime: DateTime = null,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Iops: js.UndefOr[Integer] = js.undefined,
    KmsKeyId: String = null,
    Size: js.UndefOr[Integer] = js.undefined,
    SnapshotId: String = null,
    State: VolumeState = null,
    Tags: TagList = null,
    VolumeId: String = null,
    VolumeType: VolumeType = null
  ): Volume = {
    val __obj = js.Dynamic.literal()
    if (Attachments != null) __obj.updateDynamic("Attachments")(Attachments)
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (CreateTime != null) __obj.updateDynamic("CreateTime")(CreateTime)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}

