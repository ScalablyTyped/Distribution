package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteInvitationsResponse extends js.Object {
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: awsDashSdkLib.clientsGuarddutyMod.UnprocessedAccounts
}

object DeleteInvitationsResponse {
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): DeleteInvitationsResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts)
  
    __obj.asInstanceOf[DeleteInvitationsResponse]
  }
}

