package typings.awsDashSdk.clientsNetworkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterTransitGatewayResponse extends js.Object {
  /**
    * Information about the transit gateway registration.
    */
  var TransitGatewayRegistration: js.UndefOr[typings.awsDashSdk.clientsNetworkmanagerMod.TransitGatewayRegistration] = js.native
}

object RegisterTransitGatewayResponse {
  @scala.inline
  def apply(TransitGatewayRegistration: TransitGatewayRegistration = null): RegisterTransitGatewayResponse = {
    val __obj = js.Dynamic.literal()
    if (TransitGatewayRegistration != null) __obj.updateDynamic("TransitGatewayRegistration")(TransitGatewayRegistration.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterTransitGatewayResponse]
  }
}

