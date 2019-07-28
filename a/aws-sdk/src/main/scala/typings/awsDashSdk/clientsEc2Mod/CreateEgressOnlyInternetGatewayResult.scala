package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateEgressOnlyInternetGatewayResult extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * Information about the egress-only internet gateway.
    */
  var EgressOnlyInternetGateway: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.EgressOnlyInternetGateway] = js.undefined
}

object CreateEgressOnlyInternetGatewayResult {
  @scala.inline
  def apply(ClientToken: String = null, EgressOnlyInternetGateway: EgressOnlyInternetGateway = null): CreateEgressOnlyInternetGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (EgressOnlyInternetGateway != null) __obj.updateDynamic("EgressOnlyInternetGateway")(EgressOnlyInternetGateway)
    __obj.asInstanceOf[CreateEgressOnlyInternetGatewayResult]
  }
}

