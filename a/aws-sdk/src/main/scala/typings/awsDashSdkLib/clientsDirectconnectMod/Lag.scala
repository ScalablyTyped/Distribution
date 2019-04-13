package typings
package awsDashSdkLib.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lag extends js.Object {
  /**
    * Indicates whether the LAG can host other connections.
    */
  var allowsHostedConnections: js.UndefOr[BooleanFlag] = js.undefined
  /**
    * The AWS Direct Connect endpoint that hosts the LAG.
    */
  var awsDevice: js.UndefOr[AwsDevice] = js.undefined
  /**
    * The AWS Direct Connect endpoint that hosts the LAG.
    */
  var awsDeviceV2: js.UndefOr[AwsDeviceV2] = js.undefined
  /**
    * The connections bundled by the LAG.
    */
  var connections: js.UndefOr[ConnectionList] = js.undefined
  /**
    * The individual bandwidth of the physical connections bundled by the LAG. The possible values are 1Gbps and 10Gbps. 
    */
  var connectionsBandwidth: js.UndefOr[Bandwidth] = js.undefined
  /**
    * Indicates whether the LAG supports a secondary BGP peer in the same address family (IPv4/IPv6).
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
    * The name of the LAG.
    */
  var lagName: js.UndefOr[LagName] = js.undefined
  /**
    * The state of the LAG. The following are the possible values:    requested: The initial state of a LAG. The LAG stays in the requested state until the Letter of Authorization (LOA) is available.    pending: The LAG has been approved and is being initialized.    available: The network link is established and the LAG is ready for use.    down: The network link is down.    deleting: The LAG is being deleted.    deleted: The LAG is deleted.    unknown: The state of the LAG is not available.  
    */
  var lagState: js.UndefOr[LagState] = js.undefined
  /**
    * The location of the LAG.
    */
  var location: js.UndefOr[LocationCode] = js.undefined
  /**
    * The minimum number of physical connections that must be operational for the LAG itself to be operational.
    */
  var minimumLinks: js.UndefOr[Count] = js.undefined
  /**
    * The number of physical connections bundled by the LAG, up to a maximum of 10.
    */
  var numberOfConnections: js.UndefOr[Count] = js.undefined
  /**
    * The ID of the AWS account that owns the LAG.
    */
  var ownerAccount: js.UndefOr[OwnerAccount] = js.undefined
  /**
    * The AWS Region where the connection is located.
    */
  var region: js.UndefOr[Region] = js.undefined
}

object Lag {
  @scala.inline
  def apply(
    allowsHostedConnections: js.UndefOr[BooleanFlag] = js.undefined,
    awsDevice: AwsDevice = null,
    awsDeviceV2: AwsDeviceV2 = null,
    connections: ConnectionList = null,
    connectionsBandwidth: Bandwidth = null,
    hasLogicalRedundancy: HasLogicalRedundancy = null,
    jumboFrameCapable: js.UndefOr[JumboFrameCapable] = js.undefined,
    lagId: LagId = null,
    lagName: LagName = null,
    lagState: LagState = null,
    location: LocationCode = null,
    minimumLinks: js.UndefOr[Count] = js.undefined,
    numberOfConnections: js.UndefOr[Count] = js.undefined,
    ownerAccount: OwnerAccount = null,
    region: Region = null
  ): Lag = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowsHostedConnections)) __obj.updateDynamic("allowsHostedConnections")(allowsHostedConnections)
    if (awsDevice != null) __obj.updateDynamic("awsDevice")(awsDevice)
    if (awsDeviceV2 != null) __obj.updateDynamic("awsDeviceV2")(awsDeviceV2)
    if (connections != null) __obj.updateDynamic("connections")(connections)
    if (connectionsBandwidth != null) __obj.updateDynamic("connectionsBandwidth")(connectionsBandwidth)
    if (hasLogicalRedundancy != null) __obj.updateDynamic("hasLogicalRedundancy")(hasLogicalRedundancy.asInstanceOf[js.Any])
    if (!js.isUndefined(jumboFrameCapable)) __obj.updateDynamic("jumboFrameCapable")(jumboFrameCapable)
    if (lagId != null) __obj.updateDynamic("lagId")(lagId)
    if (lagName != null) __obj.updateDynamic("lagName")(lagName)
    if (lagState != null) __obj.updateDynamic("lagState")(lagState.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location)
    if (!js.isUndefined(minimumLinks)) __obj.updateDynamic("minimumLinks")(minimumLinks)
    if (!js.isUndefined(numberOfConnections)) __obj.updateDynamic("numberOfConnections")(numberOfConnections)
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[Lag]
  }
}

