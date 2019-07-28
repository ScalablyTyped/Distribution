package typings.actionsDashOnDashGoogle.transactionsMod

import typings.actionsDashOnDashGoogle.Anon_ActionOrderId
import typings.actionsDashOnDashGoogle.Anon_ResultType
import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.TransactionUserDecision
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionDecision extends js.Object {
  var checkResult: Anon_ResultType
  /**
    * The delivery address if user requested.
    * Will appear if userDecision is Transactions.DELIVERY_ADDRESS_UPDATED.
    */
  var deliveryAddress: Location
  var order: Anon_ActionOrderId
  /** One of Transactions.ConfirmationDecision. */
  var userDecision: TransactionUserDecision
}

object TransactionDecision {
  @scala.inline
  def apply(
    checkResult: Anon_ResultType,
    deliveryAddress: Location,
    order: Anon_ActionOrderId,
    userDecision: TransactionUserDecision
  ): TransactionDecision = {
    val __obj = js.Dynamic.literal(checkResult = checkResult, deliveryAddress = deliveryAddress, order = order, userDecision = userDecision)
  
    __obj.asInstanceOf[TransactionDecision]
  }
}

