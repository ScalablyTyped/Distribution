package typings.awsDashSdk.clientsDetectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListMembersResponse extends js.Object {
  /**
    * The list of member accounts in the behavior graph. The results include member accounts that did not pass verification and member accounts that have not yet accepted the invitation to the behavior graph. The results do not include member accounts that were removed from the behavior graph.
    */
  var MemberDetails: js.UndefOr[MemberDetailList] = js.native
  /**
    * If there are more member accounts remaining in the results, then this is the pagination token to use to request the next page of member accounts.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListMembersResponse {
  @scala.inline
  def apply(MemberDetails: MemberDetailList = null, NextToken: PaginationToken = null): ListMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (MemberDetails != null) __obj.updateDynamic("MemberDetails")(MemberDetails.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListMembersResponse]
  }
}

