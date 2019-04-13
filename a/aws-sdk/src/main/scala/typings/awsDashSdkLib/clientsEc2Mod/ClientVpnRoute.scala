package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientVpnRoute extends js.Object {
  /**
    * The ID of the Client VPN endpoint with which the route is associated.
    */
  var ClientVpnEndpointId: js.UndefOr[String] = js.undefined
  /**
    * A brief description of the route.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The IPv4 address range, in CIDR notation, of the route destination.
    */
  var DestinationCidr: js.UndefOr[String] = js.undefined
  /**
    * Indicates how the route was associated with the Client VPN endpoint. associate indicates that the route was automatically added when the target network was associated with the Client VPN endpoint. add-route indicates that the route was manually added using the CreateClientVpnRoute action.
    */
  var Origin: js.UndefOr[String] = js.undefined
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.undefined
  /**
    * The ID of the subnet through which traffic is routed.
    */
  var TargetSubnet: js.UndefOr[String] = js.undefined
  /**
    * The route type.
    */
  var Type: js.UndefOr[String] = js.undefined
}

object ClientVpnRoute {
  @scala.inline
  def apply(
    ClientVpnEndpointId: String = null,
    Description: String = null,
    DestinationCidr: String = null,
    Origin: String = null,
    Status: ClientVpnRouteStatus = null,
    TargetSubnet: String = null,
    Type: String = null
  ): ClientVpnRoute = {
    val __obj = js.Dynamic.literal()
    if (ClientVpnEndpointId != null) __obj.updateDynamic("ClientVpnEndpointId")(ClientVpnEndpointId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DestinationCidr != null) __obj.updateDynamic("DestinationCidr")(DestinationCidr)
    if (Origin != null) __obj.updateDynamic("Origin")(Origin)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    if (TargetSubnet != null) __obj.updateDynamic("TargetSubnet")(TargetSubnet)
    if (Type != null) __obj.updateDynamic("Type")(Type)
    __obj.asInstanceOf[ClientVpnRoute]
  }
}

