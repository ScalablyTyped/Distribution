package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryVpcSettingsDescription extends js.Object {
  /**
    * The list of Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.AvailabilityZones] = js.undefined
  /**
    * The domain controller security group identifier for the directory.
    */
  var SecurityGroupId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SecurityGroupId] = js.undefined
  /**
    * The identifiers of the subnets for the directory servers.
    */
  var SubnetIds: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SubnetIds] = js.undefined
  /**
    * The identifier of the VPC that the directory is in.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.VpcId] = js.undefined
}

object DirectoryVpcSettingsDescription {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZones = null,
    SecurityGroupId: SecurityGroupId = null,
    SubnetIds: SubnetIds = null,
    VpcId: VpcId = null
  ): DirectoryVpcSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones)
    if (SecurityGroupId != null) __obj.updateDynamic("SecurityGroupId")(SecurityGroupId)
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DirectoryVpcSettingsDescription]
  }
}

