package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMembersResponse extends js.Object {
  var Members: js.UndefOr[Members] = js.undefined
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: js.UndefOr[UnprocessedAccounts] = js.undefined
}

object GetMembersResponse {
  @scala.inline
  def apply(Members: Members = null, UnprocessedAccounts: UnprocessedAccounts = null): GetMembersResponse = {
    val __obj = js.Dynamic.literal()
    if (Members != null) __obj.updateDynamic("Members")(Members)
    if (UnprocessedAccounts != null) __obj.updateDynamic("UnprocessedAccounts")(UnprocessedAccounts)
    __obj.asInstanceOf[GetMembersResponse]
  }
}

