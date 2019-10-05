package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDirectConnectGatewaysRequest extends js.Object {
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. If MaxResults is given a value larger than 100, only 100 results are returned.
    */
  var maxResults: js.UndefOr[MaxResultSetSize] = js.undefined
  /**
    * The token provided in the previous call to retrieve the next page.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object DescribeDirectConnectGatewaysRequest {
  @scala.inline
  def apply(
    directConnectGatewayId: DirectConnectGatewayId = null,
    maxResults: Int | Double = null,
    nextToken: PaginationToken = null
  ): DescribeDirectConnectGatewaysRequest = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeDirectConnectGatewaysRequest]
  }
}

