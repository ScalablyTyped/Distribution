package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTransitGatewayResult extends js.Object {
  /**
    * Information about the transit gateway.
    */
  var TransitGateway: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGateway] = js.native
}

object CreateTransitGatewayResult {
  @scala.inline
  def apply(TransitGateway: TransitGateway = null): CreateTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGateway != null) __obj.updateDynamic("TransitGateway")(TransitGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTransitGatewayResult]
  }
}

