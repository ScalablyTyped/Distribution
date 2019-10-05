package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaidArray extends js.Object {
  /**
    * The array's Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * When the RAID array was created.
    */
  var CreatedAt: js.UndefOr[DateTime] = js.undefined
  /**
    * The array's Linux device. For example /dev/mdadm0.
    */
  var Device: js.UndefOr[String] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  /**
    * The array's mount point.
    */
  var MountPoint: js.UndefOr[String] = js.undefined
  /**
    * The array name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The number of disks in the array.
    */
  var NumberOfDisks: js.UndefOr[Integer] = js.undefined
  /**
    * The array ID.
    */
  var RaidArrayId: js.UndefOr[String] = js.undefined
  /**
    * The RAID level.
    */
  var RaidLevel: js.UndefOr[Integer] = js.undefined
  /**
    * The array's size.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
  /**
    * The volume type, standard or PIOPS.
    */
  var VolumeType: js.UndefOr[String] = js.undefined
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
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (Device != null) __obj.updateDynamic("Device")(Device)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Iops != null) __obj.updateDynamic("Iops")(Iops.asInstanceOf[js.Any])
    if (MountPoint != null) __obj.updateDynamic("MountPoint")(MountPoint)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (NumberOfDisks != null) __obj.updateDynamic("NumberOfDisks")(NumberOfDisks.asInstanceOf[js.Any])
    if (RaidArrayId != null) __obj.updateDynamic("RaidArrayId")(RaidArrayId)
    if (RaidLevel != null) __obj.updateDynamic("RaidLevel")(RaidLevel.asInstanceOf[js.Any])
    if (Size != null) __obj.updateDynamic("Size")(Size.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType)
    __obj.asInstanceOf[RaidArray]
  }
}

