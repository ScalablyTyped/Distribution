package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateNatGatewayResult extends js.Object {
  /**
    * Unique, case-sensitive identifier to ensure the idempotency of the request. Only returned if a client token was provided in the request.
    */
  var ClientToken: js.UndefOr[String] = js.native
  /**
    * Information about the NAT gateway.
    */
  var NatGateway: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.NatGateway] = js.native
}

object CreateNatGatewayResult {
  @scala.inline
  def apply(ClientToken: String = null, NatGateway: NatGateway = null): CreateNatGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken.asInstanceOf[js.Any])
    if (NatGateway != null) __obj.updateDynamic("NatGateway")(NatGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNatGatewayResult]
  }
}

