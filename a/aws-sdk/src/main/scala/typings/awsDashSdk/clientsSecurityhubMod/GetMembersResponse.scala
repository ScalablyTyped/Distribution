package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMembersResponse extends js.Object {
  /**
    * A list of details about the Security Hub member accounts.
    */
  var Members: js.UndefOr[MemberList] = js.undefined
  /**
    * A list of account ID and email address pairs of the AWS accounts that couldn't be processed.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.undefined
}

object GetMembersResponse {
  @scala.inline
  def apply(Members: MemberList = null, UnprocessedAccounts: ResultList = null): GetMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members)
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts)
    __obj.asInstanceOf[GetMembersResponse]
  }
}

