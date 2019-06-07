package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMembersResponse extends js.Object {
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: awsDashSdkLib.clientsGuarddutyMod.UnprocessedAccounts
}

object CreateMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): CreateMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts)
  
    __obj.asInstanceOf[CreateMembersResponse]
  }
}

