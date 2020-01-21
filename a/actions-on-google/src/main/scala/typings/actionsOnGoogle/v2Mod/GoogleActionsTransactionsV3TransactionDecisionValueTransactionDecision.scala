package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.TRANSACTION_DECISION_UNSPECIFIED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.USER_CANNOT_TRANSACT
  - typings.actionsOnGoogle.actionsOnGoogleStrings.ORDER_ACCEPTED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.ORDER_REJECTED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_ADDRESS_UPDATED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.CART_CHANGE_REQUESTED
*/
trait GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision extends js.Object

object GoogleActionsTransactionsV3TransactionDecisionValueTransactionDecision {
  @scala.inline
  def CART_CHANGE_REQUESTED: typings.actionsOnGoogle.actionsOnGoogleStrings.CART_CHANGE_REQUESTED = this.cast("CART_CHANGE_REQUESTED")
  @scala.inline
  def DELIVERY_ADDRESS_UPDATED: typings.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_ADDRESS_UPDATED = this.cast("DELIVERY_ADDRESS_UPDATED")
  @scala.inline
  def ORDER_ACCEPTED: typings.actionsOnGoogle.actionsOnGoogleStrings.ORDER_ACCEPTED = this.cast("ORDER_ACCEPTED")
  @scala.inline
  def ORDER_REJECTED: typings.actionsOnGoogle.actionsOnGoogleStrings.ORDER_REJECTED = this.cast("ORDER_REJECTED")
  @scala.inline
  def TRANSACTION_DECISION_UNSPECIFIED: typings.actionsOnGoogle.actionsOnGoogleStrings.TRANSACTION_DECISION_UNSPECIFIED = this.cast("TRANSACTION_DECISION_UNSPECIFIED")
  @scala.inline
  def USER_CANNOT_TRANSACT: typings.actionsOnGoogle.actionsOnGoogleStrings.USER_CANNOT_TRANSACT = this.cast("USER_CANNOT_TRANSACT")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

