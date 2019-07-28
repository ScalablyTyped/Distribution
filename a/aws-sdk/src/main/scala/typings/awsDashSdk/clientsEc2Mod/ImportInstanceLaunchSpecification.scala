package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportInstanceLaunchSpecification extends js.Object {
  /**
    * Reserved.
    */
  var AdditionalInfo: js.UndefOr[String] = js.undefined
  /**
    * The architecture of the instance.
    */
  var Architecture: js.UndefOr[ArchitectureValues] = js.undefined
  /**
    * The security group IDs.
    */
  var GroupIds: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  /**
    * The security group names.
    */
  var GroupNames: js.UndefOr[SecurityGroupStringList] = js.undefined
  /**
    * Indicates whether an instance stops or terminates when you initiate shutdown from the instance (using the operating system command for system shutdown).
    */
  var InstanceInitiatedShutdownBehavior: js.UndefOr[ShutdownBehavior] = js.undefined
  /**
    * The instance type. For more information about the instance types that you can import, see Instance Types in the VM Import/Export User Guide.
    */
  var InstanceType: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceType] = js.undefined
  /**
    * Indicates whether monitoring is enabled.
    */
  var Monitoring: js.UndefOr[Boolean] = js.undefined
  /**
    * The placement information for the instance.
    */
  var Placement: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.Placement] = js.undefined
  /**
    * [EC2-VPC] An available IP address from the IP address range of the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  /**
    * [EC2-VPC] The ID of the subnet in which to launch the instance.
    */
  var SubnetId: js.UndefOr[String] = js.undefined
  /**
    * The Base64-encoded user data to make available to the instance.
    */
  var UserData: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.UserData] = js.undefined
}

object ImportInstanceLaunchSpecification {
  @scala.inline
  def apply(
    AdditionalInfo: String = null,
    Architecture: ArchitectureValues = null,
    GroupIds: SecurityGroupIdStringList = null,
    GroupNames: SecurityGroupStringList = null,
    InstanceInitiatedShutdownBehavior: ShutdownBehavior = null,
    InstanceType: InstanceType = null,
    Monitoring: js.UndefOr[Boolean] = js.undefined,
    Placement: Placement = null,
    PrivateIpAddress: String = null,
    SubnetId: String = null,
    UserData: UserData = null
  ): ImportInstanceLaunchSpecification = {
    val __obj = js.Dynamic.literal()
    if (AdditionalInfo != null) __obj.updateDynamic("AdditionalInfo")(AdditionalInfo)
    if (Architecture != null) __obj.updateDynamic("Architecture")(Architecture.asInstanceOf[js.Any])
    if (GroupIds != null) __obj.updateDynamic("GroupIds")(GroupIds)
    if (GroupNames != null) __obj.updateDynamic("GroupNames")(GroupNames)
    if (InstanceInitiatedShutdownBehavior != null) __obj.updateDynamic("InstanceInitiatedShutdownBehavior")(InstanceInitiatedShutdownBehavior.asInstanceOf[js.Any])
    if (InstanceType != null) __obj.updateDynamic("InstanceType")(InstanceType.asInstanceOf[js.Any])
    if (!js.isUndefined(Monitoring)) __obj.updateDynamic("Monitoring")(Monitoring)
    if (Placement != null) __obj.updateDynamic("Placement")(Placement)
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (UserData != null) __obj.updateDynamic("UserData")(UserData)
    __obj.asInstanceOf[ImportInstanceLaunchSpecification]
  }
}

