package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GooglePaymentTransactionConfig extends js.Object {
  /** List of accepted card networks. Must be any number of Transactions.CardNetwork. */
  var cardNetworks: js.Array[actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork]
  var customerInfoOptions: js.UndefOr[CustomerInfoOptions] = js.undefined
  /** True if delivery address is required for the transaction. */
  var deliveryAddressRequired: scala.Boolean
  /** True if prepaid cards are not allowed for transaction. */
  var prepaidCardDisallowed: scala.Boolean
  /** Tokenization parameters provided by payment gateway. */
  var tokenizationParameters: js.Object
  /** The type of tokenization. Default is {@see TransactionValues.PaymentMethodTokenizationType.PAYMENT_GATEWAY}. */
  var tokenizationType: java.lang.String
}

object GooglePaymentTransactionConfig {
  @scala.inline
  def apply(
    cardNetworks: js.Array[actionsDashOnDashGoogleLib.transactionsMod.TransactionValuesNs.CardNetwork],
    deliveryAddressRequired: scala.Boolean,
    prepaidCardDisallowed: scala.Boolean,
    tokenizationParameters: js.Object,
    tokenizationType: java.lang.String,
    customerInfoOptions: CustomerInfoOptions = null
  ): GooglePaymentTransactionConfig = {
    val __obj = js.Dynamic.literal(cardNetworks = cardNetworks, deliveryAddressRequired = deliveryAddressRequired, prepaidCardDisallowed = prepaidCardDisallowed, tokenizationParameters = tokenizationParameters, tokenizationType = tokenizationType)
    if (customerInfoOptions != null) __obj.updateDynamic("customerInfoOptions")(customerInfoOptions)
    __obj.asInstanceOf[GooglePaymentTransactionConfig]
  }
}

