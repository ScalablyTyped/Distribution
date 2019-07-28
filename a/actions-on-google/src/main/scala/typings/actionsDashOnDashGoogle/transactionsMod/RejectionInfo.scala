package typings.actionsDashOnDashGoogle.transactionsMod

import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.ReasonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RejectionInfo extends js.Object {
  /** Reason for the order rejection. */
  var reason: String
  /** One of Transaction.ReasonType. */
  var `type`: ReasonType
}

object RejectionInfo {
  @scala.inline
  def apply(reason: String, `type`: ReasonType): RejectionInfo = {
    val __obj = js.Dynamic.literal(reason = reason)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[RejectionInfo]
  }
}

