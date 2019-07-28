package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMembersResponse extends js.Object {
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: typings.awsDashSdk.clientsGuarddutyMod.UnprocessedAccounts
}

object DeleteMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): DeleteMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts)
  
    __obj.asInstanceOf[DeleteMembersResponse]
  }
}

