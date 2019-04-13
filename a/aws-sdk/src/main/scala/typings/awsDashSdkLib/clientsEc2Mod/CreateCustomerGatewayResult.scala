package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCustomerGatewayResult extends js.Object {
  /**
    * Information about the customer gateway.
    */
  var CustomerGateway: js.UndefOr[CustomerGateway] = js.undefined
}

object CreateCustomerGatewayResult {
  @scala.inline
  def apply(CustomerGateway: CustomerGateway = null): CreateCustomerGatewayResult = {
    val __obj = js.Dynamic.literal()
    if (CustomerGateway != null) __obj.updateDynamic("CustomerGateway")(CustomerGateway)
    __obj.asInstanceOf[CreateCustomerGatewayResult]
  }
}

