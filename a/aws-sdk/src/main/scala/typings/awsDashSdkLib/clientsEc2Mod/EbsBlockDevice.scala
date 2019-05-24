package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EbsBlockDevice extends js.Object {
  /**
    * Indicates whether the EBS volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether the encryption state of an EBS volume is changed while being restored from a backing snapshot. The default effect of setting the Encrypted parameter to true through the console, API, or CLI depends on the volume's origin (new or from a snapshot), starting encryption state, ownership, and whether account-level encryption is enabled. Each default case can be overridden by specifying a customer master key (CMK) with the KmsKeyId parameter in addition to setting Encrypted to true. For a complete list of possible encryption cases, see Amazon EBS Encryption in the Amazon Elastic Compute Cloud User Guide. In no case can you remove encryption from an encrypted volume. Encrypted volumes can only be attached to instances that support Amazon EBS encryption. For more information, see Supported Instance Types.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. For io1 volumes, this represents the number of IOPS that are provisioned for the volume. For gp2 volumes, this represents the baseline performance of the volume and the rate at which the volume accumulates I/O credits for bursting. For more information, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud User Guide. Constraints: Range is 100-16,000 IOPS for gp2 volumes and 100 to 64,000IOPS for io1 volumes in most Regions. Maximum io1 IOPS of 64,000 is guaranteed only on Nitro-based instances. Other instance families guarantee performance up to 32,000 IOPS. For more information, see Amazon EBS Volume Types in the Amazon Elastic Compute Cloud User Guide. Condition: This parameter is required for requests to create io1 volumes; it is not used in requests to create gp2, st1, sc1, or standard volumes.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  /**
    * Identifier (key ID, key alias, ID ARN, or alias ARN) for a user-managed CMK under which the EBS volume is encrypted. This parameter is only supported on BlockDeviceMapping objects called by RunInstances, RequestSpotFleet, and RequestSpotInstances.
    */
  var KmsKeyId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * The size of the volume, in GiB. Default: If you're creating the volume from a snapshot and don't specify a volume size, the default is the snapshot size. Constraints: 1-16384 for General Purpose SSD (gp2), 4-16384 for Provisioned IOPS SSD (io1), 500-16384 for Throughput Optimized HDD (st1), 500-16384 for Cold HDD (sc1), and 1-1024 for Magnetic (standard) volumes. If you specify a snapshot, the volume size must be equal to or larger than the snapshot size.
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
  /**
    * The volume type. If you set the type to io1, you must also set the Iops property. Default: standard 
    */
  var VolumeType: js.UndefOr[VolumeType] = js.undefined
}

object EbsBlockDevice {
  @scala.inline
  def apply(
    DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    Iops: js.UndefOr[Integer] = js.undefined,
    KmsKeyId: String = null,
    SnapshotId: String = null,
    VolumeSize: js.UndefOr[Integer] = js.undefined,
    VolumeType: VolumeType = null
  ): EbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (!js.isUndefined(VolumeSize)) __obj.updateDynamic("VolumeSize")(VolumeSize)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsBlockDevice]
  }
}

