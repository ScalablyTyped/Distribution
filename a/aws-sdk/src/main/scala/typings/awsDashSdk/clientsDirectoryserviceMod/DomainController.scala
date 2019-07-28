package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainController extends js.Object {
  /**
    * The Availability Zone where the domain controller is located.
    */
  var AvailabilityZone: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.AvailabilityZone] = js.undefined
  /**
    * Identifier of the directory where the domain controller resides.
    */
  var DirectoryId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DirectoryId] = js.undefined
  /**
    * The IP address of the domain controller.
    */
  var DnsIpAddr: js.UndefOr[IpAddr] = js.undefined
  /**
    * Identifies a specific domain controller in the directory.
    */
  var DomainControllerId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.DomainControllerId] = js.undefined
  /**
    * Specifies when the domain controller was created.
    */
  var LaunchTime: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.LaunchTime] = js.undefined
  /**
    * The status of the domain controller.
    */
  var Status: js.UndefOr[DomainControllerStatus] = js.undefined
  /**
    * The date and time that the status was last updated.
    */
  var StatusLastUpdatedDateTime: js.UndefOr[LastUpdatedDateTime] = js.undefined
  /**
    * A description of the domain controller state.
    */
  var StatusReason: js.UndefOr[DomainControllerStatusReason] = js.undefined
  /**
    * Identifier of the subnet in the VPC that contains the domain controller.
    */
  var SubnetId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.SubnetId] = js.undefined
  /**
    * The identifier of the VPC that contains the domain controller.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsDirectoryserviceMod.VpcId] = js.undefined
}

object DomainController {
  @scala.inline
  def apply(
    AvailabilityZone: AvailabilityZone = null,
    DirectoryId: DirectoryId = null,
    DnsIpAddr: IpAddr = null,
    DomainControllerId: DomainControllerId = null,
    LaunchTime: LaunchTime = null,
    Status: DomainControllerStatus = null,
    StatusLastUpdatedDateTime: LastUpdatedDateTime = null,
    StatusReason: DomainControllerStatusReason = null,
    SubnetId: SubnetId = null,
    VpcId: VpcId = null
  ): DomainController = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId)
    if (DnsIpAddr != null) __obj.updateDynamic("DnsIpAddr")(DnsIpAddr)
    if (DomainControllerId != null) __obj.updateDynamic("DomainControllerId")(DomainControllerId)
    if (LaunchTime != null) __obj.updateDynamic("LaunchTime")(LaunchTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusLastUpdatedDateTime != null) __obj.updateDynamic("StatusLastUpdatedDateTime")(StatusLastUpdatedDateTime)
    if (StatusReason != null) __obj.updateDynamic("StatusReason")(StatusReason)
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[DomainController]
  }
}

