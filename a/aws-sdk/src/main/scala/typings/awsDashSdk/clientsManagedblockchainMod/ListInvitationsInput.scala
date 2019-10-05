package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInvitationsInput extends js.Object {
  /**
    * The maximum number of invitations to return.
    */
  var MaxResults: js.UndefOr[ProposalListMaxResults] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListInvitationsInput {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: PaginationToken = null): ListInvitationsInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListInvitationsInput]
  }
}

