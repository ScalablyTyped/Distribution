package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCustomerGatewaysResult extends js.Object {
  /**
    * Information about one or more customer gateways.
    */
  var CustomerGateways: js.UndefOr[CustomerGatewayList] = js.undefined
}

object DescribeCustomerGatewaysResult {
  @scala.inline
  def apply(CustomerGateways: CustomerGatewayList = null): DescribeCustomerGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (CustomerGateways != null) __obj.updateDynamic("CustomerGateways")(CustomerGateways)
    __obj.asInstanceOf[DescribeCustomerGatewaysResult]
  }
}

