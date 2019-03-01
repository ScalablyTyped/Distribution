package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionDecision extends js.Object {
  var checkResult: actionsDashOnDashGoogleLib.Anon_ResultType
  /**
    * The delivery address if user requested.
    * Will appear if userDecision is Transactions.DELIVERY_ADDRESS_UPDATED.
    */
  var deliveryAddress: Location
  var order: actionsDashOnDashGoogleLib.Anon_ActionOrderId
  /** One of Transactions.ConfirmationDecision. */
  var userDecision: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision
}

object TransactionDecision {
  @scala.inline
  def apply(
    checkResult: actionsDashOnDashGoogleLib.Anon_ResultType,
    deliveryAddress: Location,
    order: actionsDashOnDashGoogleLib.Anon_ActionOrderId,
    userDecision: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision
  ): TransactionDecision = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checkResult")(checkResult)
    __obj.updateDynamic("deliveryAddress")(deliveryAddress)
    __obj.updateDynamic("order")(order)
    __obj.updateDynamic("userDecision")(userDecision)
    __obj.asInstanceOf[TransactionDecision]
  }
}

