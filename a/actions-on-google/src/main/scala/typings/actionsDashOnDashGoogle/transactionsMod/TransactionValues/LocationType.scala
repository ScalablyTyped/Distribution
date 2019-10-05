package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LocationType extends js.Object

/**
  * List of possible order location types.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.LocationType")
@js.native
object LocationType extends js.Object {
  /**
    * Business location of order provider.
    */
  @js.native
  sealed trait BUSINESS extends LocationType
  
  /**
    * Delivery location for an order.
    */
  @js.native
  sealed trait DELIVERY extends LocationType
  
  /**
    * Destination of the order.
    */
  @js.native
  sealed trait DESTINATION extends LocationType
  
  /**
    * Origin of the order.
    */
  @js.native
  sealed trait ORIGIN extends LocationType
  
  /**
    * Pick up location of the order.
    */
  @js.native
  sealed trait PICK_UP extends LocationType
  
  /**
    * Unknown.
    */
  @js.native
  sealed trait UNKNOWN extends LocationType
  
  /* 2 */ val BUSINESS: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LocationType.BUSINESS with Double = js.native
  /* 1 */ val DELIVERY: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LocationType.DELIVERY with Double = js.native
  /* 4 */ val DESTINATION: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LocationType.DESTINATION with Double = js.native
  /* 3 */ val ORIGIN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LocationType.ORIGIN with Double = js.native
  /* 5 */ val PICK_UP: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LocationType.PICK_UP with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.LocationType.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LocationType with Double] = js.native
}

