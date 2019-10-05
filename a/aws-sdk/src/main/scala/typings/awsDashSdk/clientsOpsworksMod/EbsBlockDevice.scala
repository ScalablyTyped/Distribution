package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EbsBlockDevice extends js.Object {
  /**
    * Whether the volume is deleted on instance termination.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of I/O operations per second (IOPS) that the volume supports. For more information, see EbsBlockDevice.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  /**
    * The snapshot ID.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
  /**
    * The volume size, in GiB. For more information, see EbsBlockDevice.
    */
  var VolumeSize: js.UndefOr[Integer] = js.undefined
  /**
    * The volume type. gp2 for General Purpose (SSD) volumes, io1 for Provisioned IOPS (SSD) volumes, st1 for Throughput Optimized hard disk drives (HDD), sc1 for Cold HDD,and standard for Magnetic volumes. If you specify the io1 volume type, you must also specify a value for the Iops attribute. The maximum ratio of provisioned IOPS to requested volume size (in GiB) is 50:1. AWS uses the default volume size (in GiB) specified in the AMI attributes to set IOPS to 50 x (volume size).
    */
  var VolumeType: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.VolumeType] = js.undefined
}

object EbsBlockDevice {
  @scala.inline
  def apply(
    DeleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    Iops: Int | scala.Double = null,
    SnapshotId: String = null,
    VolumeSize: Int | scala.Double = null,
    VolumeType: VolumeType = null
  ): EbsBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination)
    if (Iops != null) __obj.updateDynamic("Iops")(Iops.asInstanceOf[js.Any])
    if (SnapshotId != null) __obj.updateDynamic("SnapshotId")(SnapshotId)
    if (VolumeSize != null) __obj.updateDynamic("VolumeSize")(VolumeSize.asInstanceOf[js.Any])
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EbsBlockDevice]
  }
}

