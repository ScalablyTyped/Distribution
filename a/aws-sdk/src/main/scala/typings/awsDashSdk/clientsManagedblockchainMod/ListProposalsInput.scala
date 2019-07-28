package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProposalsInput extends js.Object {
  /**
    *  The maximum number of proposals to return. 
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
}

object ListProposalsInput {
  @scala.inline
  def apply(
    NetworkId: ResourceIdString,
    MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined,
    NextToken: PaginationToken = null
  ): ListProposalsInput = {
    val __obj = js.Dynamic.literal(NetworkId = NetworkId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListProposalsInput]
  }
}

