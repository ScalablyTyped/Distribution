package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN_USER_DECISION
  - typings.actionsOnGoogle.actionsOnGoogleStrings.ORDER_ACCEPTED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.ORDER_REJECTED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_ADDRESS_UPDATED
  - typings.actionsOnGoogle.actionsOnGoogleStrings.CART_CHANGE_REQUESTED
*/
trait GoogleActionsV2TransactionDecisionValueUserDecision extends js.Object

object GoogleActionsV2TransactionDecisionValueUserDecision {
  @scala.inline
  def CART_CHANGE_REQUESTED: typings.actionsOnGoogle.actionsOnGoogleStrings.CART_CHANGE_REQUESTED = this.cast("CART_CHANGE_REQUESTED")
  @scala.inline
  def DELIVERY_ADDRESS_UPDATED: typings.actionsOnGoogle.actionsOnGoogleStrings.DELIVERY_ADDRESS_UPDATED = this.cast("DELIVERY_ADDRESS_UPDATED")
  @scala.inline
  def ORDER_ACCEPTED: typings.actionsOnGoogle.actionsOnGoogleStrings.ORDER_ACCEPTED = this.cast("ORDER_ACCEPTED")
  @scala.inline
  def ORDER_REJECTED: typings.actionsOnGoogle.actionsOnGoogleStrings.ORDER_REJECTED = this.cast("ORDER_REJECTED")
  @scala.inline
  def UNKNOWN_USER_DECISION: typings.actionsOnGoogle.actionsOnGoogleStrings.UNKNOWN_USER_DECISION = this.cast("UNKNOWN_USER_DECISION")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

