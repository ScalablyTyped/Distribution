package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrderAction extends js.Object

/**
  * List of possible actions to take on the order.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.OrderAction")
@js.native
object OrderAction extends js.Object {
  /**
    * Call.
    */
  @js.native
  sealed trait CALL extends OrderAction
  
  /**
    * Cancel order.
    */
  @js.native
  sealed trait CANCEL extends OrderAction
  
  /**
    * Customer Service.
    */
  @js.native
  sealed trait CUSTOMER_SERVICE extends OrderAction
  
  /**
    * Email.
    */
  @js.native
  sealed trait EMAIL extends OrderAction
  
  /**
    * Exchange order.
    */
  @js.native
  sealed trait EXCHANGE extends OrderAction
  
  /**
    * Modify order.
    */
  @js.native
  sealed trait MODIFY extends OrderAction
  
  /**
    * Reorder.
    */
  @js.native
  sealed trait REORDER extends OrderAction
  
  /**
    * Return order.
    */
  @js.native
  sealed trait RETURN extends OrderAction
  
  /**
    * Review.
    */
  @js.native
  sealed trait REVIEW extends OrderAction
  
  /**
    * Unknown action.
    */
  @js.native
  sealed trait UNKNOWN extends OrderAction
  
  /**
    * View details.
    */
  @js.native
  sealed trait VIEW_DETAILS extends OrderAction
  
  /* 7 */ val CALL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.CALL with Double = js.native
  /* 3 */ val CANCEL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.CANCEL with Double = js.native
  /* 10 */ val CUSTOMER_SERVICE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.CUSTOMER_SERVICE with Double = js.native
  /* 6 */ val EMAIL: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.EMAIL with Double = js.native
  /* 5 */ val EXCHANGE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.EXCHANGE with Double = js.native
  /* 2 */ val MODIFY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.MODIFY with Double = js.native
  /* 8 */ val REORDER: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.REORDER with Double = js.native
  /* 4 */ val RETURN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.RETURN with Double = js.native
  /* 9 */ val REVIEW: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.REVIEW with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.UNKNOWN with Double = js.native
  /* 1 */ val VIEW_DETAILS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderAction.VIEW_DETAILS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderAction with Double] = js.native
}

