package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopMonitoringMembersResponse extends js.Object {
  /**
    * A list of objects containing the unprocessed account and a result string explaining why it was unprocessed.
    */
  var UnprocessedAccounts: typings.awsDashSdk.clientsGuarddutyMod.UnprocessedAccounts
}

object StopMonitoringMembersResponse {
  @scala.inline
  def apply(UnprocessedAccounts: UnprocessedAccounts): StopMonitoringMembersResponse = {
    val __obj = js.Dynamic.literal(UnprocessedAccounts = UnprocessedAccounts)
  
    __obj.asInstanceOf[StopMonitoringMembersResponse]
  }
}

