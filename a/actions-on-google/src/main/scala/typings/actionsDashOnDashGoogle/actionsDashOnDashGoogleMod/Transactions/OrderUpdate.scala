package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod.Transactions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google", "Transactions.OrderUpdate")
@js.native
class OrderUpdate protected ()
  extends typings.actionsDashOnDashGoogle.transactionsMod.OrderUpdate {
  /**
    * Constructor for OrderUpdate.
    *
    * @param orderId Unique identifier of the order.
    * @param isGoogleOrderId True if the order ID is provided by
    *     Google. False if the order ID is app provided.
    */
  def this(orderId: String, isGoogleOrderId: Boolean) = this()
}

