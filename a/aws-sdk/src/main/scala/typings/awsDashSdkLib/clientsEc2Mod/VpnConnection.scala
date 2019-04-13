package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnConnection extends js.Object {
  /**
    * The category of the VPN connection. A value of VPN indicates an AWS VPN connection. A value of VPN-Classic indicates an AWS Classic VPN connection.
    */
  var Category: js.UndefOr[String] = js.undefined
  /**
    * The configuration information for the VPN connection's customer gateway (in the native XML format). This element is always present in the CreateVpnConnection response; however, it's present in the DescribeVpnConnections response only if the VPN connection is in the pending or available state.
    */
  var CustomerGatewayConfiguration: js.UndefOr[String] = js.undefined
  /**
    * The ID of the customer gateway at your end of the VPN connection.
    */
  var CustomerGatewayId: js.UndefOr[String] = js.undefined
  /**
    * The VPN connection options.
    */
  var Options: js.UndefOr[VpnConnectionOptions] = js.undefined
  /**
    * The static routes associated with the VPN connection.
    */
  var Routes: js.UndefOr[VpnStaticRouteList] = js.undefined
  /**
    * The current state of the VPN connection.
    */
  var State: js.UndefOr[VpnState] = js.undefined
  /**
    * Any tags assigned to the VPN connection.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the transit gateway associated with the VPN connection.
    */
  var TransitGatewayId: js.UndefOr[String] = js.undefined
  /**
    * The type of VPN connection.
    */
  var Type: js.UndefOr[GatewayType] = js.undefined
  /**
    * Information about the VPN tunnel.
    */
  var VgwTelemetry: js.UndefOr[VgwTelemetryList] = js.undefined
  /**
    * The ID of the VPN connection.
    */
  var VpnConnectionId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the virtual private gateway at the AWS side of the VPN connection.
    */
  var VpnGatewayId: js.UndefOr[String] = js.undefined
}

object VpnConnection {
  @scala.inline
  def apply(
    Category: String = null,
    CustomerGatewayConfiguration: String = null,
    CustomerGatewayId: String = null,
    Options: VpnConnectionOptions = null,
    Routes: VpnStaticRouteList = null,
    State: VpnState = null,
    Tags: TagList = null,
    TransitGatewayId: String = null,
    Type: GatewayType = null,
    VgwTelemetry: VgwTelemetryList = null,
    VpnConnectionId: String = null,
    VpnGatewayId: String = null
  ): VpnConnection = {
    val __obj = js.Dynamic.literal()
    if (Category != null) __obj.updateDynamic("Category")(Category)
    if (CustomerGatewayConfiguration != null) __obj.updateDynamic("CustomerGatewayConfiguration")(CustomerGatewayConfiguration)
    if (CustomerGatewayId != null) __obj.updateDynamic("CustomerGatewayId")(CustomerGatewayId)
    if (Options != null) __obj.updateDynamic("Options")(Options)
    if (Routes != null) __obj.updateDynamic("Routes")(Routes)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TransitGatewayId != null) __obj.updateDynamic("TransitGatewayId")(TransitGatewayId)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (VgwTelemetry != null) __obj.updateDynamic("VgwTelemetry")(VgwTelemetry)
    if (VpnConnectionId != null) __obj.updateDynamic("VpnConnectionId")(VpnConnectionId)
    if (VpnGatewayId != null) __obj.updateDynamic("VpnGatewayId")(VpnGatewayId)
    __obj.asInstanceOf[VpnConnection]
  }
}

