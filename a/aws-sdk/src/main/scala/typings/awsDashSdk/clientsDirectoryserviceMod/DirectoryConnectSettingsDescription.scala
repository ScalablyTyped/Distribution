package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectoryConnectSettingsDescription extends js.Object {
  /**
    * A list of the Availability Zones that the directory is in.
    */
  var AvailabilityZones: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.AvailabilityZones] = js.native
  /**
    * The IP addresses of the AD Connector servers.
    */
  var ConnectIps: js.UndefOr[IpAddrs] = js.native
  /**
    * The user name of the service account in the on-premises directory.
    */
  var CustomerUserName: js.UndefOr[UserName] = js.native
  /**
    * The security group identifier for the AD Connector directory.
    */
  var SecurityGroupId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SecurityGroupId] = js.native
  /**
    * A list of subnet identifiers in the VPC that the AD Connector is in.
    */
  var SubnetIds: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SubnetIds] = js.native
  /**
    * The identifier of the VPC that the AD Connector is in.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.VpcId] = js.native
}

object DirectoryConnectSettingsDescription {
  @scala.inline
  def apply(
    AvailabilityZones: AvailabilityZones = null,
    ConnectIps: IpAddrs = null,
    CustomerUserName: UserName = null,
    SecurityGroupId: SecurityGroupId = null,
    SubnetIds: SubnetIds = null,
    VpcId: VpcId = null
  ): DirectoryConnectSettingsDescription = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZones != null) __obj.updateDynamic("AvailabilityZones")(AvailabilityZones.asInstanceOf[js.Any])
    if (ConnectIps != null) __obj.updateDynamic("ConnectIps")(ConnectIps.asInstanceOf[js.Any])
    if (CustomerUserName != null) __obj.updateDynamic("CustomerUserName")(CustomerUserName.asInstanceOf[js.Any])
    if (SecurityGroupId != null) __obj.updateDynamic("SecurityGroupId")(SecurityGroupId.asInstanceOf[js.Any])
    if (SubnetIds != null) __obj.updateDynamic("SubnetIds")(SubnetIds.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectoryConnectSettingsDescription]
  }
}

