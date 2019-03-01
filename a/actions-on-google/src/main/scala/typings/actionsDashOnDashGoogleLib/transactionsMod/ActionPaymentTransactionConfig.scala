package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionPaymentTransactionConfig extends js.Object {
  var customerInfoOptions: js.UndefOr[CustomerInfoOptions] = js.undefined
  /** True if delivery address is required for the transaction. */
  var deliveryAddressRequired: scala.Boolean
  /** The name of the instrument displayed on receipt. For example, for card payment, could be "VISA-1234". */
  var displayName: java.lang.String
  /** One of Transactions.PaymentType. */
  var `type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType
}

object ActionPaymentTransactionConfig {
  @scala.inline
  def apply(
    deliveryAddressRequired: scala.Boolean,
    displayName: java.lang.String,
    `type`: actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.PaymentType,
    customerInfoOptions: CustomerInfoOptions = null
  ): ActionPaymentTransactionConfig = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("deliveryAddressRequired")(deliveryAddressRequired)
    __obj.updateDynamic("displayName")(displayName)
    if (customerInfoOptions != null) __obj.updateDynamic("customerInfoOptions")(customerInfoOptions)
    __obj.asInstanceOf[ActionPaymentTransactionConfig]
  }
}

