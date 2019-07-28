package typings.awsDashSdk.clientsManagedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMembersOutput extends js.Object {
  /**
    * An array of MemberSummary objects. Each object contains details about a network member.
    */
  var Members: js.UndefOr[MemberSummaryList] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListMembersOutput {
  @scala.inline
  def apply(Members: MemberSummaryList = null, NextToken: PaginationToken = null): ListMembersOutput = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListMembersOutput]
  }
}

