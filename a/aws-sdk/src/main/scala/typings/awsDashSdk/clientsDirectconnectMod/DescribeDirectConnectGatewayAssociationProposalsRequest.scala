package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDirectConnectGatewayAssociationProposalsRequest extends js.Object {
  /**
    * The ID of the associated gateway.
    */
  var associatedGatewayId: js.UndefOr[AssociatedGatewayId] = js.undefined
  /**
    * The ID of the Direct Connect gateway.
    */
  var directConnectGatewayId: js.UndefOr[DirectConnectGatewayId] = js.undefined
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value. If MaxResults is given a value larger than 100, only 100 results are returned.
    */
  var maxResults: js.UndefOr[MaxResultSetSize] = js.undefined
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The ID of the proposal.
    */
  var proposalId: js.UndefOr[DirectConnectGatewayAssociationProposalId] = js.undefined
}

object DescribeDirectConnectGatewayAssociationProposalsRequest {
  @scala.inline
  def apply(
    associatedGatewayId: AssociatedGatewayId = null,
    directConnectGatewayId: DirectConnectGatewayId = null,
    maxResults: js.UndefOr[MaxResultSetSize] = js.undefined,
    nextToken: PaginationToken = null,
    proposalId: DirectConnectGatewayAssociationProposalId = null
  ): DescribeDirectConnectGatewayAssociationProposalsRequest = {
    val __obj = js.Dynamic.literal()
    if (associatedGatewayId != null) __obj.updateDynamic("associatedGatewayId")(associatedGatewayId)
    if (directConnectGatewayId != null) __obj.updateDynamic("directConnectGatewayId")(directConnectGatewayId)
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (proposalId != null) __obj.updateDynamic("proposalId")(proposalId)
    __obj.asInstanceOf[DescribeDirectConnectGatewayAssociationProposalsRequest]
  }
}

