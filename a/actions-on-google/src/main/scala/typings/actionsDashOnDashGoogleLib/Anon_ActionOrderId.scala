package typings
package actionsDashOnDashGoogleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ActionOrderId extends js.Object {
  /** User visible order ID set in proposed order. */
  var actionOrderId: java.lang.String
  var customerInfo: Anon_Email
  /** The proposed order used in the transaction decision. */
  var finalOrder: actionsDashOnDashGoogleLib.transactionsMod.Order
  /** Order ID assigned by Google. */
  var googleOrderId: java.lang.String
  var orderDate: Anon_Nanos
  var paymentInfo: js.Object
}

object Anon_ActionOrderId {
  @scala.inline
  def apply(
    actionOrderId: java.lang.String,
    customerInfo: Anon_Email,
    finalOrder: actionsDashOnDashGoogleLib.transactionsMod.Order,
    googleOrderId: java.lang.String,
    orderDate: Anon_Nanos,
    paymentInfo: js.Object
  ): Anon_ActionOrderId = {
    val __obj = js.Dynamic.literal(actionOrderId = actionOrderId, customerInfo = customerInfo, finalOrder = finalOrder, googleOrderId = googleOrderId, orderDate = orderDate, paymentInfo = paymentInfo)
  
    __obj.asInstanceOf[Anon_ActionOrderId]
  }
}

