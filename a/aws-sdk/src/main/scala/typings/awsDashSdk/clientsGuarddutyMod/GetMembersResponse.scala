package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMembersResponse extends js.Object {
  /**
    * A list of members.
    */
  var Members: typings.awsDashSdk.clientsGuarddutyMod.Members
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: typings.awsDashSdk.clientsGuarddutyMod.UnprocessedAccounts
}

object GetMembersResponse {
  @scala.inline
  def apply(Members: Members, UnprocessedAccounts: UnprocessedAccounts): GetMembersResponse = {
    val __obj = js.Dynamic.literal(Members = Members, UnprocessedAccounts = UnprocessedAccounts)
  
    __obj.asInstanceOf[GetMembersResponse]
  }
}

