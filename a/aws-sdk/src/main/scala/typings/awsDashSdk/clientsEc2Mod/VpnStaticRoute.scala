package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VpnStaticRoute extends js.Object {
  /**
    * The CIDR block associated with the local subnet of the customer data center.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  /**
    * Indicates how the routes were provided.
    */
  var Source: js.UndefOr[VpnStaticRouteSource] = js.undefined
  /**
    * The current state of the static route.
    */
  var State: js.UndefOr[VpnState] = js.undefined
}

object VpnStaticRoute {
  @scala.inline
  def apply(DestinationCidrBlock: String = null, Source: VpnStaticRouteSource = null, State: VpnState = null): VpnStaticRoute = {
    val __obj = js.Dynamic.literal()
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock)
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpnStaticRoute]
  }
}

