package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTransitGatewayResult extends js.Object {
  /**
    * Information about the deleted transit gateway.
    */
  var TransitGateway: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGateway] = js.native
}

object DeleteTransitGatewayResult {
  @scala.inline
  def apply(TransitGateway: TransitGateway = null): DeleteTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGateway != null) __obj.updateDynamic("TransitGateway")(TransitGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTransitGatewayResult]
  }
}

