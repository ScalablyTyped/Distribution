package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeliveryAddressDecision extends js.Object

/**
  * List of possible user decisions to give delivery address.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.DeliveryAddressDecision")
@js.native
object DeliveryAddressDecision extends js.Object {
  /**
    * User granted delivery address.
    */
  @js.native
  sealed trait ACCEPTED extends DeliveryAddressDecision
  
  /**
    * User denied to give delivery address.
    */
  @js.native
  sealed trait REJECTED extends DeliveryAddressDecision
  
  /**
    * Unknown.
    */
  @js.native
  sealed trait UNKNOWN extends DeliveryAddressDecision
  
  /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressDecision.ACCEPTED with Double = js.native
  /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressDecision.REJECTED with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressDecision.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeliveryAddressDecision with Double] = js.native
}

