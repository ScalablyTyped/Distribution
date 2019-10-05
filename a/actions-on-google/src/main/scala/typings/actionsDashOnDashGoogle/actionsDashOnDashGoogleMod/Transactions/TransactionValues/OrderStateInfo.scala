package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod.Transactions.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of possible order state objects.
  */
@JSImport("actions-on-google", "Transactions.TransactionValues.OrderStateInfo")
@js.native
object OrderStateInfo extends js.Object {
  /* 2 */ val CANCELLATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.CANCELLATION with Double = js.native
  /* 4 */ val FULFILLMENT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.FULFILLMENT with Double = js.native
  /* 3 */ val IN_TRANSIT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.IN_TRANSIT with Double = js.native
  /* 1 */ val RECEIPT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.RECEIPT with Double = js.native
  /* 0 */ val REJECTION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.REJECTION with Double = js.native
  /* 5 */ val RETURN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.RETURN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo with Double
  ] = js.native
}

