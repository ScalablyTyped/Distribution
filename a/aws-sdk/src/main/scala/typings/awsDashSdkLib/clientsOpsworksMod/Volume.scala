package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  /**
    * The volume Availability Zone. For more information, see Regions and Endpoints.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The device name.
    */
  var Device: js.UndefOr[String] = js.undefined
  /**
    * The Amazon EC2 volume ID.
    */
  var Ec2VolumeId: js.UndefOr[String] = js.undefined
  /**
    * Specifies whether an Amazon EBS volume is encrypted. For more information, see Amazon EBS Encryption.
    */
  var Encrypted: js.UndefOr[Boolean] = js.undefined
  /**
    * The instance ID.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * For PIOPS volumes, the IOPS per disk.
    */
  var Iops: js.UndefOr[Integer] = js.undefined
  /**
    * The volume mount point. For example, "/mnt/disk1".
    */
  var MountPoint: js.UndefOr[String] = js.undefined
  /**
    * The volume name.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The RAID array ID.
    */
  var RaidArrayId: js.UndefOr[String] = js.undefined
  /**
    * The AWS region. For more information about AWS regions, see Regions and Endpoints.
    */
  var Region: js.UndefOr[String] = js.undefined
  /**
    * The volume size.
    */
  var Size: js.UndefOr[Integer] = js.undefined
  /**
    * The value returned by DescribeVolumes.
    */
  var Status: js.UndefOr[String] = js.undefined
  /**
    * The volume ID.
    */
  var VolumeId: js.UndefOr[String] = js.undefined
  /**
    * The volume type. For more information, see  Amazon EBS Volume Types.    standard - Magnetic. Magnetic volumes must have a minimum size of 1 GiB and a maximum size of 1024 GiB.    io1 - Provisioned IOPS (SSD). PIOPS volumes must have a minimum size of 4 GiB and a maximum size of 16384 GiB.    gp2 - General Purpose (SSD). General purpose volumes must have a minimum size of 1 GiB and a maximum size of 16384 GiB.    st1 - Throughput Optimized hard disk drive (HDD). Throughput optimized HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.    sc1 - Cold HDD. Cold HDD volumes must have a minimum size of 500 GiB and a maximum size of 16384 GiB.  
    */
  var VolumeType: js.UndefOr[String] = js.undefined
}

object Volume {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    Device: String = null,
    Ec2VolumeId: String = null,
    Encrypted: js.UndefOr[Boolean] = js.undefined,
    InstanceId: String = null,
    Iops: js.UndefOr[Integer] = js.undefined,
    MountPoint: String = null,
    Name: String = null,
    RaidArrayId: String = null,
    Region: String = null,
    Size: js.UndefOr[Integer] = js.undefined,
    Status: String = null,
    VolumeId: String = null,
    VolumeType: String = null
  ): Volume = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (Device != null) __obj.updateDynamic("Device")(Device)
    if (Ec2VolumeId != null) __obj.updateDynamic("Ec2VolumeId")(Ec2VolumeId)
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (!js.isUndefined(Iops)) __obj.updateDynamic("Iops")(Iops)
    if (MountPoint != null) __obj.updateDynamic("MountPoint")(MountPoint)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (RaidArrayId != null) __obj.updateDynamic("RaidArrayId")(RaidArrayId)
    if (Region != null) __obj.updateDynamic("Region")(Region)
    if (!js.isUndefined(Size)) __obj.updateDynamic("Size")(Size)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (VolumeId != null) __obj.updateDynamic("VolumeId")(VolumeId)
    if (VolumeType != null) __obj.updateDynamic("VolumeType")(VolumeType)
    __obj.asInstanceOf[Volume]
  }
}

