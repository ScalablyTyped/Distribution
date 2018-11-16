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
  var order: actionsDashOnDashGoogleLib.Anon_GoogleOrderId
  /** One of Transactions.ConfirmationDecision. */
  var userDecision: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.TransactionUserDecision
}

