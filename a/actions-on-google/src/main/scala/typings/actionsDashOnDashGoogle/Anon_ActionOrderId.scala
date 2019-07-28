package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.transactionsMod.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOrderId extends js.Object {
  /** User visible order ID set in proposed order. */
  var actionOrderId: String
  var customerInfo: Anon_Email
  /** The proposed order used in the transaction decision. */
  var finalOrder: Order
  /** Order ID assigned by Google. */
  var googleOrderId: String
  var orderDate: Anon_Nanos
  var paymentInfo: js.Object
}

object Anon_ActionOrderId {
  @scala.inline
  def apply(
    actionOrderId: String,
    customerInfo: Anon_Email,
    finalOrder: Order,
    googleOrderId: String,
    orderDate: Anon_Nanos,
    paymentInfo: js.Object
  ): Anon_ActionOrderId = {
    val __obj = js.Dynamic.literal(actionOrderId = actionOrderId, customerInfo = customerInfo, finalOrder = finalOrder, googleOrderId = googleOrderId, orderDate = orderDate, paymentInfo = paymentInfo)
  
    __obj.asInstanceOf[Anon_ActionOrderId]
  }
}

