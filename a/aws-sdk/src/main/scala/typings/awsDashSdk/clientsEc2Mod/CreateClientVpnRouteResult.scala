package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateClientVpnRouteResult extends js.Object {
  /**
    * The current state of the route.
    */
  var Status: js.UndefOr[ClientVpnRouteStatus] = js.undefined
}

object CreateClientVpnRouteResult {
  @scala.inline
  def apply(Status: ClientVpnRouteStatus = null): CreateClientVpnRouteResult = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[CreateClientVpnRouteResult]
  }
}

