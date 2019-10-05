package typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeliveryAddressUserDecision extends js.Object

/**
  * List of possible user decisions to give delivery address.
  */
@JSImport("actions-on-google/transactions", "TransactionValues.DeliveryAddressUserDecision")
@js.native
object DeliveryAddressUserDecision extends js.Object {
  /**
    * User granted delivery address.
    */
  @js.native
  sealed trait ACCEPTED extends DeliveryAddressUserDecision
  
  /**
    * User denied to give delivery address.
    */
  @js.native
  sealed trait REJECTED extends DeliveryAddressUserDecision
  
  /**
    * Unknown.
    */
  @js.native
  sealed trait UNKNOWN extends DeliveryAddressUserDecision
  
  /* 1 */ val ACCEPTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressUserDecision.ACCEPTED with Double = js.native
  /* 2 */ val REJECTED: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressUserDecision.REJECTED with Double = js.native
  /* 0 */ val UNKNOWN: typings.actionsDashOnDashGoogle.transactionsMod.TransactionValues.DeliveryAddressUserDecision.UNKNOWN with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeliveryAddressUserDecision with Double] = js.native
}

