package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Connection extends js.Object {
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.undefined
  /**
    * The Direct Connect endpoint on which the physical connection terminates.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
  /**
    * The bandwidth of the connection.
    */
  var bandwidth: js.UndefOr[Bandwidth] = js.undefined
  /**
    * The ID of the connection.
    */
  var connectionId: js.UndefOr[ConnectionId] = js.undefined
  /**
    * The name of the connection.
    */
  var connectionName: js.UndefOr[ConnectionName] = js.undefined
  /**
    * The state of the connection. The following are the possible values:    ordering: The initial state of a hosted connection provisioned on an interconnect. The connection stays in the ordering state until the owner of the hosted connection confirms or declines the connection order.    requested: The initial state of a standard connection. The connection stays in the requested state until the Letter of Authorization (LOA) is sent to the customer.    pending: The connection has been approved and is being initialized.    available: The network link is up and the connection is ready for use.    down: The network link is down.    deleting: The connection is being deleted.    deleted: The connection has been deleted.    rejected: A hosted connection in the ordering state enters the rejected state if it is deleted by the customer.    unknown: The state of the connection is not available.  
    */
  var connectionState: js.UndefOr[ConnectionState] = js.undefined
  /**
    * Indicates whether the connection supports a secondary BGP peer in the same address family (IPv4/IPv6).
    */
  var hasLogicalRedundancy: js.UndefOr[HasLogicalRedundancy] = js.undefined
  /**
    * Indicates whether jumbo frames (9001 MTU) are supported.
    */
  var jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.undefined
  /**
    * The time of the most recent call to DescribeLoa for this connection.
    */
  var loaIssueTime: js.UndefOr[LoaIssueTime] = js.undefined
  /**
    * The location of the connection.
    */
  var location: js.UndefOr[LocationCode] = js.undefined
  /**
    * The ID of the AWS account that owns the connection.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  /**
    * The name of the AWS Direct Connect service provider associated with the connection.
    */
  var partnerName: js.UndefOr[PartnerName] = js.undefined
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.undefined
  /**
    * The ID of the VLAN.
    */
  var vlan: js.UndefOr[VLAN] = js.undefined
}

object Connection {
  @scala.inline
  def apply(
    awsDevice: AwsDevice = null,
    awsDeviceV2: AwsDeviceV2 = null,
    bandwidth: Bandwidth = null,
    connectionId: ConnectionId = null,
    connectionName: ConnectionName = null,
    connectionState: ConnectionState = null,
    hasLogicalRedundancy: HasLogicalRedundancy = null,
    jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
    lagId: LagId = null,
    loaIssueTime: LoaIssueTime = null,
    location: LocationCode = null,
    ownerAccount: OwnerAccount = null,
    partnerName: PartnerName = null,
    region: Region = null,
    vlan: js.UndefOr[VLAN] = js.undefined
  ): Connection = {
    val __obj = js.Dynamic.literal()
    if (awsDevice != null) __obj.updateDynamic("awsDevice")(awsDevice)
    if (awsDeviceV2 != null) __obj.updateDynamic("awsDeviceV2")(awsDeviceV2)
    if (bandwidth != null) __obj.updateDynamic("bandwidth")(bandwidth)
    if (connectionId != null) __obj.updateDynamic("connectionId")(connectionId)
    if (connectionName != null) __obj.updateDynamic("connectionName")(connectionName)
    if (connectionState != null) __obj.updateDynamic("connectionState")(connectionState.asInstanceOf[js.Any])
    if (hasLogicalRedundancy != null) __obj.updateDynamic("hasLogicalRedundancy")(hasLogicalRedundancy.asInstanceOf[js.Any])
    if (!js.isUndefined(jumboFrameCapable)) __obj.updateDynamic("jumboFrameCapable")(jumboFrameCapable)
    if (lagId != null) __obj.updateDynamic("lagId")(lagId)
    if (loaIssueTime != null) __obj.updateDynamic("loaIssueTime")(loaIssueTime)
    if (location != null) __obj.updateDynamic("location")(location)
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount)
    if (partnerName != null) __obj.updateDynamic("partnerName")(partnerName)
    if (region != null) __obj.updateDynamic("region")(region)
    if (!js.isUndefined(vlan)) __obj.updateDynamic("vlan")(vlan)
    __obj.asInstanceOf[Connection]
  }
}

