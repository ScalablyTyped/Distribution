package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDirectConnectGatewayAttachmentsRequest extends js.Object {
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
  /**
    * The ID of the virtual interface.
    */
  var virtualInterfaceId: js.UndefOr[VirtualInterfaceId] = js.undefined
}

object DescribeDirectConnectGatewayAttachmentsRequest {
  @scala.inline
  def apply(
    directConnectGatewayId: DirectConnectGatewayId = null,
    maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
    nextToken: PaginationToken = null,
    virtualInterfaceId: VirtualInterfaceId = null
  ): DescribeDirectConnectGatewayAttachmentsRequest = {
    val __obj = js.Dynamic.literal()
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (virtualInterfaceId != null) __obj.updateDynamic("virtualInterfaceId")(virtualInterfaceId)
    __obj.asInstanceOf[DescribeDirectConnectGatewayAttachmentsRequest]
  }
}

