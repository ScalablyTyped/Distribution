package typings.actionsDashOnDashGoogle.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptInfo extends js.Object {
  /** Action provided order ID. Used when the order has been received by the integrator. */
  var confirmedActionOrderId: String
}

object ReceiptInfo {
  @scala.inline
  def apply(confirmedActionOrderId: String): ReceiptInfo = {
    val __obj = js.Dynamic.literal(confirmedActionOrderId = confirmedActionOrderId)
  
    __obj.asInstanceOf[ReceiptInfo]
  }
}

