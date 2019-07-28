package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProposalVotesInput extends js.Object {
  /**
    *  The maximum number of votes to return. 
    */
  var MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined
  /**
    *  The unique identifier of the network. 
    */
  var NetworkId: ResourceIdString
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  The unique identifier of the proposal. 
    */
  var ProposalId: ResourceIdString
}

object ListProposalVotesInput {
  @scala.inline
  def apply(
    NetworkId: ResourceIdString,
    ProposalId: ResourceIdString,
    MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined,
    NextToken: PaginationToken = null
  ): ListProposalVotesInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId, ProposalId = ProposalId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListProposalVotesInput]
  }
}

