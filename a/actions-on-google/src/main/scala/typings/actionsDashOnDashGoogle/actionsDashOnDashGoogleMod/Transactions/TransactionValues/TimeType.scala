package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod.Transactions.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of possible order time types.
  */
@JSImport("actions-on-google", "Transactions.TransactionValues.TimeType")
@js.native
object TimeType extends js.Object {
  /* 1 */ val DELIVERY_DATE: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TimeType.DELIVERY_DATE with Double = js.native
  /* 2 */ val ETA: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TimeType.ETA with Double = js.native
  /* 3 */ val RESERVATION_SLOT: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TimeType.RESERVATION_SLOT with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TimeType.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.TimeType with Double
  ] = js.native
}

