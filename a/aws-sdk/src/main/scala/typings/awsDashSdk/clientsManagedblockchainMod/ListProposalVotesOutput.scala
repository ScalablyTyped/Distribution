package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListProposalVotesOutput extends js.Object {
  /**
    *  The pagination token that indicates the next set of results to retrieve. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    *  The listing of votes. 
    */
  var ProposalVotes: js.UndefOr[ProposalVoteList] = js.undefined
}

object ListProposalVotesOutput {
  @scala.inline
  def apply(NextToken: PaginationToken = null, ProposalVotes: ProposalVoteList = null): ListProposalVotesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (ProposalVotes != null) __obj.updateDynamic("ProposalVotes")(ProposalVotes)
    __obj.asInstanceOf[ListProposalVotesOutput]
  }
}

