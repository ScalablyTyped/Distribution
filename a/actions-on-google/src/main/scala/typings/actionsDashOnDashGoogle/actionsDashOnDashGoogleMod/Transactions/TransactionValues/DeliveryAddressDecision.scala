package typings.actionsDashOnDashGoogle.actionsDashOnDashGoogleMod.Transactions.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * List of possible user decisions to give delivery address.
  */
@JSImport("actions-on-google", "Transactions.TransactionValues.DeliveryAddressDecision")
@js.native
object DeliveryAddressDecision extends js.Object {
  /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressDecision.ACCEPTED with Double = js.native
  /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressDecision.REJECTED with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressDecision.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressDecision with Double
  ] = js.native
}

