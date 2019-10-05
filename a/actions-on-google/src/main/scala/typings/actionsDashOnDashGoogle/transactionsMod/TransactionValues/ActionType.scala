package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ActionType extends js.Object

/**
  * List of possible actions to take on the order.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.ActionType")
@js.native
object ActionType extends js.Object {
  /**
    * Call.
    */
  @js.native
  sealed trait CALL extends ActionType
  
  /**
    * Cancel order.
    */
  @js.native
  sealed trait CANCEL extends ActionType
  
  /**
    * Customer Service.
    */
  @js.native
  sealed trait CUSTOMER_SERVICE extends ActionType
  
  /**
    * Email.
    */
  @js.native
  sealed trait EMAIL extends ActionType
  
  /**
    * Exchange order.
    */
  @js.native
  sealed trait EXCHANGE extends ActionType
  
  /**
    * Modify order.
    */
  @js.native
  sealed trait MODIFY extends ActionType
  
  /**
    * Reorder.
    */
  @js.native
  sealed trait REORDER extends ActionType
  
  /**
    * Return order.
    */
  @js.native
  sealed trait RETURN extends ActionType
  
  /**
    * Review.
    */
  @js.native
  sealed trait REVIEW extends ActionType
  
  /**
    * Unknown action.
    */
  @js.native
  sealed trait UNKNOWN extends ActionType
  
  /**
    * View details.
    */
  @js.native
  sealed trait VIEW_DETAILS extends ActionType
  
  /* 7 */ val CALL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.CALL with Double = js.native
  /* 3 */ val CANCEL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.CANCEL with Double = js.native
  /* 10 */ val CUSTOMER_SERVICE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.CUSTOMER_SERVICE with Double = js.native
  /* 6 */ val EMAIL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.EMAIL with Double = js.native
  /* 5 */ val EXCHANGE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.EXCHANGE with Double = js.native
  /* 2 */ val MODIFY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.MODIFY with Double = js.native
  /* 8 */ val REORDER: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.REORDER with Double = js.native
  /* 4 */ val RETURN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.RETURN with Double = js.native
  /* 9 */ val REVIEW: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.REVIEW with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.UNKNOWN with Double = js.native
  /* 1 */ val VIEW_DETAILS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.ActionType.VIEW_DETAILS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ActionType with Double] = js.native
}

