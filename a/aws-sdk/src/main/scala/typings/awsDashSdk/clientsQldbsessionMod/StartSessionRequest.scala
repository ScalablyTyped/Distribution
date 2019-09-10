package typings.awsDashSdk.clientsQldbsessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartSessionRequest extends js.Object {
  /**
    * The name of the ledger to start a new session against.
    */
  var LedgerName: typings.awsDashSdk.clientsQldbsessionMod.LedgerName
}

object StartSessionRequest {
  @scala.inline
  def apply(LedgerName: LedgerName): StartSessionRequest = {
    val __obj = js.Dynamic.literal(LedgerName = LedgerName)
  
    __obj.asInstanceOf[StartSessionRequest]
  }
}

