package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod.Transactions.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of possible order confirmation user decisions
  */
@JSImport("actions-on-google", "Transactions.TransactionValues.ConfirmationDecision")
@js.native
object ConfirmationDecision extends js.Object {
  /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.ACCEPTED with Double = js.native
  /* 4 */ val CART_CHANGE_REQUESTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.CART_CHANGE_REQUESTED with Double = js.native
  /* 3 */ val DELIVERY_ADDRESS_UPDATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.DELIVERY_ADDRESS_UPDATED with Double = js.native
  /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.REJECTED with Double = js.native
  /* 0 */ val UNKNOWN_USER_DECISION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.UNKNOWN_USER_DECISION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision with Double
  ] = js.native
}

