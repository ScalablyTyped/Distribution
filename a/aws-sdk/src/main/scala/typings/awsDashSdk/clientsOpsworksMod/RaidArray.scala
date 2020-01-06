package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RaidArray extends js.Object {
  /**
    * The array's Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * When the RAID array was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.native
  /**
    * The array's Linux device. For example /dev/mdadm0.
    */
  var Device: js.UndefOr[String] = js.native
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var Iops: js.UndefOr[Integer] = js.native
  /**
    * The array's mount point.
    */
  var MountPoint: js.UndefOr[String] = js.native
  /**
    * The array name.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The number of disks in the array.
    */
  var NumberOfDisks: js.UndefOr[Integer] = js.native
  /**
    * The array ID.
    */
  var RaidArrayId: js.UndefOr[String] = js.native
  /**
    * The RAID level.
    */
  var RaidLevel: js.UndefOr[Integer] = js.native
  /**
    * The array's size.
    */
  var Size: js.UndefOr[Integer] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
  /**
    * The volume type, standard or PIOPS.
    */
  var VolumeType: js.UndefOr[String] = js.native
}

object RaidArray {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    CreatedAt: DateTime = null,
    Device: String = null,
    InstanceId: String = null,
    Iops: Int | scala.Double = null,
    MountPoint: String = null,
    Name: String = null,
    NumberOfDisks: Int | scala.Double = null,
    RaidArrayId: String = null,
    RaidLevel: Int | scala.Double = null,
    Size: Int | scala.Double = null,
    StackId: String = null,
    VolumeType: String = null
  ): RaidArray = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt.asInstanceOf[js.Any])
    if (Device != null) __obj.updateDynamic("Device")(Device.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Iops != null) __obj.updateDynamic("Iops")(Iops.asInstanceOf[js.Any])
    if (MountPoint != null) __obj.updateDynamic("MountPoint")(MountPoint.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (NumberOfDisks != null) __obj.updateDynamic("NumberOfDisks")(NumberOfDisks.asInstanceOf[js.Any])
    if (RaidArrayId != null) __obj.updateDynamic("RaidArrayId")(RaidArrayId.asInstanceOf[js.Any])
    if (RaidLevel != null) __obj.updateDynamic("RaidLevel")(RaidLevel.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaidArray]
  }
}

