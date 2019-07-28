package typings.actionsDashOnDashGoogle.transactionsMod

import typings.actionsDashOnDashGoogle.transactionsMod.TransactionValuesNs.PaymentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionPaymentTransactionConfig extends js.Object {
  var customerInfoOptions: js.UndefOr[CustomerInfoOptions] = js.undefined
  /** True if delivery address is required for the transaction. */
  var deliveryAddressRequired: Boolean
  /** The name of the instrument displayed on receipt. For example, for card payment, could be "VISA-1234". */
  var displayName: String
  /** One of Transactions.PaymentType. */
  var `type`: PaymentType
}

object ActionPaymentTransactionConfig {
  @scala.inline
  def apply(
    deliveryAddressRequired: Boolean,
    displayName: String,
    `type`: PaymentType,
    customerInfoOptions: CustomerInfoOptions = null
  ): ActionPaymentTransactionConfig = {
    val __obj = js.Dynamic.literal(deliveryAddressRequired = deliveryAddressRequired, displayName = displayName)
    __obj.updateDynamic("type")(`type`)
    if (customerInfoOptions != null) __obj.updateDynamic("customerInfoOptions")(customerInfoOptions)
    __obj.asInstanceOf[ActionPaymentTransactionConfig]
  }
}

