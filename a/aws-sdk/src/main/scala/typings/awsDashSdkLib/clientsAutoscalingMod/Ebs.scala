package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ebs extends js.Object {
  /**
    * Indicates whether the volume is deleted on instance termination. The default value is true.
    */
  var DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination] = js.undefined
  /**
    * Specifies whether the volume should be encrypted. Encrypted EBS volumes must be attached to instances that support Amazon EBS encryption. Volumes that are created from encrypted snapshots are automatically encrypted. There is no way to create an encrypted volume from an unencrypted snapshot or an unencrypted volume from an encrypted snapshot. If your AMI uses encrypted volumes, you can only launch it on supported instance types. For more information, see Amazon EBS Encryption in the Amazon EC2 User Guide for Linux Instances.
    */
  var Encrypted: js.UndefOr[BlockDeviceEbsEncrypted] = js.undefined
  /**
    * The number of I/O operations per second (IOPS) to provision for the volume. For more information, see Amazon EBS Volume Types in the Amazon EC2 User Guide for Linux Instances. Conditional: This parameter is required when the volume type is io1. (Not used with standard, gp2, st1, or sc1 volumes.) 
    */
  var Iops: js.UndefOr[BlockDeviceEbsIops] = js.undefined
  /**
    * The ID of the snapshot. This parameter is optional if you specify a volume size. 
    */
  var SnapshotId: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * The volume size, in GiB.  Constraints: 1-1,024 for standard, 4-16,384 for io1, 1-16,384 for gp2, and 500-16,384 for st1 and sc1. If you specify a snapshot, the volume size must be equal to or larger than the snapshot size. Default: If you create a volume from a snapshot and you don't specify a volume size, the default is the snapshot size.  At least one of VolumeSize or SnapshotId is required. 
    */
  var VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize] = js.undefined
  /**
    * The volume type, which can be standard for Magnetic, io1 for Provisioned IOPS SSD, gp2 for General Purpose SSD, st1 for Throughput Optimized HDD, or sc1 for Cold HDD. For more information, see Amazon EBS Volume Types in the Amazon EC2 User Guide for Linux Instances. Valid values: standard | io1 | gp2 | st1 | sc1 
    */
  var VolumeType: js.UndefOr[BlockDeviceEbsVolumeType] = js.undefined
}

object Ebs {
  @scala.inline
  def apply(
    DeleteOnTermination: js.UndefOr[BlockDeviceEbsDeleteOnTermination] = js.undefined,
    Encrypted: js.UndefOr[BlockDeviceEbsEncrypted] = js.undefined,
    Iops: js.UndefOr[BlockDeviceEbsIops] = js.undefined,
    SnapshotId: XmlStringMaxLen255 = null,
    VolumeSize: js.UndefOr[BlockDeviceEbsVolumeSize] = js.undefined,
    VolumeType: BlockDeviceEbsVolumeType = null
  ): Ebs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (!js.isUndefined(VolumeSize)) __obj.updateDynamic("VolumeSize")(VolumeSize)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType)
    __obj.asInstanceOf[Ebs]
  }
}

