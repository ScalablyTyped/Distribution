package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod.Transactions.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of possible order confirmation user decisions
  */
@JSImport("actions-on-google", "Transactions.TransactionValues.TransactionUserDecision")
@js.native
object TransactionUserDecision extends js.Object {
  /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TransactionUserDecision.ACCEPTED with Double = js.native
  /* 4 */ val CART_CHANGE_REQUESTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TransactionUserDecision.CART_CHANGE_REQUESTED with Double = js.native
  /* 3 */ val DELIVERY_ADDRESS_UPDATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TransactionUserDecision.DELIVERY_ADDRESS_UPDATED with Double = js.native
  /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TransactionUserDecision.REJECTED with Double = js.native
  /* 0 */ val UNKNOWN_USER_DECISION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TransactionUserDecision.UNKNOWN_USER_DECISION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TransactionUserDecision with Double
  ] = js.native
}

