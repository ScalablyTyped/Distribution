package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimeType extends js.Object

/**
  * List of possible order time types.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.TimeType")
@js.native
object TimeType extends js.Object {
  /**
    * Date of delivery for the order.
    */
  @js.native
  sealed trait DELIVERY_DATE extends TimeType
  
  /**
    * Estimated Time of Arrival for order.
    */
  @js.native
  sealed trait ETA extends TimeType
  
  /**
    * Reservation time.
    */
  @js.native
  sealed trait RESERVATION_SLOT extends TimeType
  
  /**
    * Unknown.
    */
  @js.native
  sealed trait UNKNOWN extends TimeType
  
  /* 1 */ val DELIVERY_DATE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TimeType.DELIVERY_DATE with Double = js.native
  /* 2 */ val ETA: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TimeType.ETA with Double = js.native
  /* 3 */ val RESERVATION_SLOT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TimeType.RESERVATION_SLOT with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TimeType.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimeType with Double] = js.native
}

