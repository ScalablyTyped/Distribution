package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrderStateInfo extends js.Object

/**
  * List of possible order state objects.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.OrderStateInfo")
@js.native
object OrderStateInfo extends js.Object {
  /**
    * Information about order cancellation. Used with {@link CancellationInfo}.
    */
  @js.native
  sealed trait CANCELLATION extends OrderStateInfo
  
  /**
    * Information about order fulfillment. Used with {@link FulfillmentInfo}.
    */
  @js.native
  sealed trait FULFILLMENT extends OrderStateInfo
  
  /**
    * Information about in-transit order. Used with {@link TransitInfo}.
    */
  @js.native
  sealed trait IN_TRANSIT extends OrderStateInfo
  
  /**
    * Information about order receipt. Used with {@link ReceiptInfo}.
    */
  @js.native
  sealed trait RECEIPT extends OrderStateInfo
  
  /**
    * Information about order rejection. Used with {@link RejectionInfo}.
    */
  @js.native
  sealed trait REJECTION extends OrderStateInfo
  
  /**
    * Information about order return. Used with {@link ReturnInfo}.
    */
  @js.native
  sealed trait RETURN extends OrderStateInfo
  
  /* 2 */ val CANCELLATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.CANCELLATION with Double = js.native
  /* 4 */ val FULFILLMENT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.FULFILLMENT with Double = js.native
  /* 3 */ val IN_TRANSIT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.IN_TRANSIT with Double = js.native
  /* 1 */ val RECEIPT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.RECEIPT with Double = js.native
  /* 0 */ val REJECTION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.REJECTION with Double = js.native
  /* 5 */ val RETURN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderStateInfo.RETURN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderStateInfo with Double] = js.native
}

