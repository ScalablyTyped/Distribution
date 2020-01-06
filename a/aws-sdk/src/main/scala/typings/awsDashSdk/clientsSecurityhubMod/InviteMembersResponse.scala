package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteMembersResponse extends js.Object {
  /**
    * A list of account ID and email address pairs of the AWS accounts that couldn't be processed. 
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.native
}

object InviteMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: ResultList = null): InviteMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteMembersResponse]
  }
}

