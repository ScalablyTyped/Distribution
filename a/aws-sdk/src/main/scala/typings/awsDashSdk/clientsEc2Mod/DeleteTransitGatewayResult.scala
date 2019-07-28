package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteTransitGatewayResult extends js.Object {
  /**
    * Information about the deleted transit gateway.
    */
  var TransitGateway: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TransitGateway] = js.undefined
}

object DeleteTransitGatewayResult {
  @scala.inline
  def apply(TransitGateway: TransitGateway = null): DeleteTransitGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (TransitGateway != null) __obj.updateDynamic("TransitGateway")(TransitGateway)
    __obj.asInstanceOf[DeleteTransitGatewayResult]
  }
}

