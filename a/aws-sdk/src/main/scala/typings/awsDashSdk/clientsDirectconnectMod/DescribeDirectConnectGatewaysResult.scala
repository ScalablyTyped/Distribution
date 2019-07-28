package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDirectConnectGatewaysResult extends js.Object {
  /**
    * The Direct Connect gateways.
    */
  var directConnectGateways: js.UndefOr[DirectConnectGatewayList] = js.undefined
  /**
    * The token to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object DescribeDirectConnectGatewaysResult {
  @scala.inline
  def apply(directConnectGateways: DirectConnectGatewayList = null, nextToken: PaginationToken = null): DescribeDirectConnectGatewaysResult = {
    val __obj = js.Dynamic.literal()
    if (directConnectGateways != null) __obj.updateDynamic("directConnectGateways")(directConnectGateways)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeDirectConnectGatewaysResult]
  }
}

