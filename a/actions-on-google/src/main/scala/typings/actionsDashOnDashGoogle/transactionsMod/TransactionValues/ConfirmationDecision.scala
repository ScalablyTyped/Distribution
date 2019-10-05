package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ConfirmationDecision extends js.Object

/**
  * List of possible order confirmation user decisions
  */
@JSImport("actions-on-google/transactions", "TransactionValues.ConfirmationDecision")
@js.native
object ConfirmationDecision extends js.Object {
  /**
    * Order was approved by user.
    */
  @js.native
  sealed trait ACCEPTED extends ConfirmationDecision
  
  /**
    * Order was not declined, but the cart was updated during confirmation.
    */
  @js.native
  sealed trait CART_CHANGE_REQUESTED extends ConfirmationDecision
  
  /**
    * Order was not declined, but the delivery address was updated during
    * confirmation.
    */
  @js.native
  sealed trait DELIVERY_ADDRESS_UPDATED extends ConfirmationDecision
  
  /**
    * Order was declined by user.
    */
  @js.native
  sealed trait REJECTED extends ConfirmationDecision
  
  /**
    * Unspecified user decision.
    */
  @js.native
  sealed trait UNKNOWN_USER_DECISION extends ConfirmationDecision
  
  /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.ACCEPTED with Double = js.native
  /* 4 */ val CART_CHANGE_REQUESTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.CART_CHANGE_REQUESTED with Double = js.native
  /* 3 */ val DELIVERY_ADDRESS_UPDATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.DELIVERY_ADDRESS_UPDATED with Double = js.native
  /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.REJECTED with Double = js.native
  /* 0 */ val UNKNOWN_USER_DECISION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ConfirmationDecision.UNKNOWN_USER_DECISION with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ConfirmationDecision with Double] = js.native
}

