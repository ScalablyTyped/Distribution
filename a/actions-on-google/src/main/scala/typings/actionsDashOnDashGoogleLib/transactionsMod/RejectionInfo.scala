package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectionInfo extends js.Object {
  /** Reason for the order rejection. */
  var reason: java.lang.String
  /** One of Transaction.ReasonType. */
  var `type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType
}

object RejectionInfo {
  @scala.inline
  def apply(
    reason: java.lang.String,
    `type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.ReasonType
  ): RejectionInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[RejectionInfo]
  }
}

