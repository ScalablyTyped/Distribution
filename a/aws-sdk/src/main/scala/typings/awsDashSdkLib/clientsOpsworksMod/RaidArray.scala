package typings
package awsDashSdkLib.clientsOpsworksMod

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
    Iops: js.UndefOr[Integer] = js.undefined,
    MountPoint: String = null,
    Name: String = null,
    NumberOfDisks: js.UndefOr[Integer] = js.undefined,
    RaidArrayId: String = null,
    RaidLevel: js.UndefOr[Integer] = js.undefined,
    Size: js.UndefOr[Integer] = js.undefined,
    StackId: String = null,
    VolumeType: String = null
  ): RaidArray = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (CreatedAt != null) __obj.updateDynamic("CreatedAt")(CreatedAt)
    if (Device != null) __obj.updateDynamic("Device")(Device)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (MountPoint != null) __obj.updateDynamic("MountPoint")(MountPoint)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(NumberOfDisks)) __obj.updateDynamic("NumberOfDisks")(NumberOfDisks)
    if (RaidArrayId != null) __obj.updateDynamic("RaidArrayId")(RaidArrayId)
    if (!js.isUndefined(RaidLevel)) __obj.updateDynamic("RaidLevel")(RaidLevel)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType)
    __obj.asInstanceOf[RaidArray]
  }
}

