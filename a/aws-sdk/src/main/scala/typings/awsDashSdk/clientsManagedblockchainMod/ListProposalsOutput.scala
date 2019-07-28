package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProposalsOutput extends js.Object {
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The summary of each proposal made on the network.
    */
  var Proposals: js.UndefOr[ProposalSummaryList] = js.undefined
}

object ListProposalsOutput {
  @scala.inline
  def apply(NextToken: PaginationToken = null, Proposals: ProposalSummaryList = null): ListProposalsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Proposals != null) __obj.updateDynamic("Proposals")(Proposals)
    __obj.asInstanceOf[ListProposalsOutput]
  }
}

