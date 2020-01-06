package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteInvitationsResponse extends js.Object {
  /**
    * A list of account ID and email address pairs of the AWS accounts that invitations weren't deleted for.
    */
  var UnprocessedAccounts: js.UndefOr[ResultList] = js.native
}

object DeleteInvitationsResponse {
  @scala.inline
  def apply(UnprocessedAccounts: ResultList = null): DeleteInvitationsResponse = {
    val __obj = js.Dynamic.literal()
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInvitationsResponse]
  }
}

