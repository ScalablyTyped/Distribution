package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OrderLocationType extends js.Object

/**
  * List of possible order location types.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.OrderLocationType")
@js.native
object OrderLocationType extends js.Object {
  /**
    * Business location of order provider.
    */
  @js.native
  sealed trait BUSINESS extends OrderLocationType
  
  /**
    * Delivery location for an order.
    */
  @js.native
  sealed trait DELIVERY extends OrderLocationType
  
  /**
    * Destination of the order.
    */
  @js.native
  sealed trait DESTINATION extends OrderLocationType
  
  /**
    * Origin of the order.
    */
  @js.native
  sealed trait ORIGIN extends OrderLocationType
  
  /**
    * Pick up location of the order.
    */
  @js.native
  sealed trait PICK_UP extends OrderLocationType
  
  /**
    * Unknown.
    */
  @js.native
  sealed trait UNKNOWN extends OrderLocationType
  
  /* 2 */ val BUSINESS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderLocationType.BUSINESS with Double = js.native
  /* 1 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderLocationType.DELIVERY with Double = js.native
  /* 4 */ val DESTINATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderLocationType.DESTINATION with Double = js.native
  /* 3 */ val ORIGIN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderLocationType.ORIGIN with Double = js.native
  /* 5 */ val PICK_UP: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderLocationType.PICK_UP with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.OrderLocationType.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[OrderLocationType with Double] = js.native
}

