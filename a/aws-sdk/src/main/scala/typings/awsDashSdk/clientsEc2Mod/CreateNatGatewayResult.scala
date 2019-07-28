package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateNatGatewayResult extends js.Object {
  /**
    * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was provided in the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the NAT gateway.
    */
  var NatGateway: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NatGateway] = js.undefined
}

object CreateNatGatewayResult {
  @scala.inline
  def apply(ClientToken: String = null, NatGateway: NatGateway = null): CreateNatGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (NatGateway != null) __obj.updateDynamic("NatGateway")(NatGateway)
    __obj.asInstanceOf[CreateNatGatewayResult]
  }
}

