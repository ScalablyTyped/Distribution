package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrderState extends js.Object

/**
  * List of possible order states.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.OrderState")
@js.native
object OrderState extends js.Object {
  /**
    * User cancelled the order.
    */
  @js.native
  sealed trait CANCELLED extends OrderState
  
  /**
    * Order was confirmed by integrator and is active.
    */
  @js.native
  sealed trait CONFIRMED extends OrderState
  
  /**
    * Order was created at the integrator's system.
    */
  @js.native
  sealed trait CREATED extends OrderState
  
  /**
    * User received what was ordered.
    */
  @js.native
  sealed trait FULFILLED extends OrderState
  
  /**
    * Order is being delivered.
    */
  @js.native
  sealed trait IN_TRANSIT extends OrderState
  
  /**
    * Order was rejected.
    */
  @js.native
  sealed trait REJECTED extends OrderState
  
  /**
    * User performed a return.
    */
  @js.native
  sealed trait RETURNED extends OrderState
  
  /* 3 */ val CANCELLED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderState.CANCELLED with Double = js.native
  /* 2 */ val CONFIRMED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderState.CONFIRMED with Double = js.native
  /* 0 */ val CREATED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderState.CREATED with Double = js.native
  /* 6 */ val FULFILLED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderState.FULFILLED with Double = js.native
  /* 4 */ val IN_TRANSIT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderState.IN_TRANSIT with Double = js.native
  /* 1 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderState.REJECTED with Double = js.native
  /* 5 */ val RETURNED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderState.RETURNED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderState with Double] = js.native
}

