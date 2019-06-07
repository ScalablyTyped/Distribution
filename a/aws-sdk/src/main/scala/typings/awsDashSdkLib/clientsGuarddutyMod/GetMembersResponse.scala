package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMembersResponse extends js.Object {
  /**
    * A list of members.
    */
  var Members: awsDashSdkLib.clientsGuarddutyMod.Members
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: awsDashSdkLib.clientsGuarddutyMod.UnprocessedAccounts
}

object GetMembersResponse {
  @scala.inline
  def apply(Members: Members, UnprocessedAccounts: UnprocessedAccounts): GetMembersResponse = {
    val __obj = js.Dynamic.literal(Members = Members, UnprocessedAccounts = UnprocessedAccounts)
  
    __obj.asInstanceOf[GetMembersResponse]
  }
}

