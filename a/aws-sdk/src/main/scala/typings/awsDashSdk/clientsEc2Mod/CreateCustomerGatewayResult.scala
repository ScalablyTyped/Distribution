package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCustomerGatewayResult extends js.Object {
  /**
    * Information about the customer gateway.
    */
  var CustomerGateway: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.CustomerGateway] = js.native
}

object CreateCustomerGatewayResult {
  @scala.inline
  def apply(CustomerGateway: CustomerGateway = null): CreateCustomerGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (CustomerGateway != null) __obj.updateDynamic("CustomerGateway")(CustomerGateway.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCustomerGatewayResult]
  }
}

