package typings.actionsDashOnDashGoogle.distServiceActionssdkApiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsV2OrdersGoogleProvidedPaymentOptions extends js.Object {
  /**
    * If true, billing address will be returned.
    * Deprecated: Use facilitation_specification field instead.
    */
  var billingAddressRequired: js.UndefOr[Boolean] = js.undefined
  /**
    * This JSON blob captures the specification for how Google facilitates
    * the payment for integrators, which is the PaymentDataRequest object
    * as defined in
    * https://developers.google.com/pay/api/web/reference/object#PaymentDataRequest
    * Example:
    *  {
    *  \"apiVersion\": 2,
    *  \"apiVersionMinor\": 0,
    *  \"merchantInfo\": {
    *    \"merchantName\": \"Example Merchant\"
    *  },
    *  \"allowedPaymentMethods\": [
    *    {
    *    \"type\": \"CARD\",
    *    \"parameters\": {
    *      \"allowedAuthMethods\": [\"PAN_ONLY\", \"CRYPTOGRAM_3DS\"],
    *      \"allowedCardNetworks\": [\"AMEX\", \"DISCOVER\", \"JCB\",
    * \"MASTERCARD\",
    *      \"VISA\"]
    *    },
    *    \"tokenizationSpecification\": {
    *      \"type\": \"PAYMENT_GATEWAY\",
    *      \"parameters\": {
    *      \"gateway\": \"example\",
    *      \"gatewayMerchantId\": \"exampleGatewayMerchantId\"
    *      }
    *    }
    *    }
    *  ],
    *  \"transactionInfo\": {
    *    \"totalPriceStatus\": \"ESTIMATED\",
    *    \"totalPrice\": \"12.34\",
    *    \"currencyCode\": \"USD\"
    *  }
    *  }
    */
  var facilitationSpecification: js.UndefOr[String] = js.undefined
  /**
    * If true, disallow prepaid cards from being used in the transaction.
    * Deprecated: Use facilitation_specification field instead.
    */
  var prepaidCardDisallowed: js.UndefOr[Boolean] = js.undefined
  /**
    * The app allows cards from any card network listed here being used in
    * transaction.
    * By default, Amex, Visa, MC and Discover are supported.
    * Deprecated: Use facilitation_specification field instead.
    */
  var supportedCardNetworks: js.UndefOr[js.Array[GoogleActionsV2OrdersGoogleProvidedPaymentOptionsSupportedCardNetworks]] = js.undefined
  /**
    * Required field for requesting Google provided payment instrument.
    * These tokenization parameters  will be used for generating payment token
    * for use in transaction. The app should get these parameters from their
    * payment gateway.
    * Deprecated: Use facilitation_specification field instead.
    */
  var tokenizationParameters: js.UndefOr[GoogleActionsV2OrdersPaymentMethodTokenizationParameters] = js.undefined
}

object GoogleActionsV2OrdersGoogleProvidedPaymentOptions {
  @scala.inline
  def apply(
    billingAddressRequired: js.UndefOr[Boolean] = js.undefined,
    facilitationSpecification: String = null,
    prepaidCardDisallowed: js.UndefOr[Boolean] = js.undefined,
    supportedCardNetworks: js.Array[GoogleActionsV2OrdersGoogleProvidedPaymentOptionsSupportedCardNetworks] = null,
    tokenizationParameters: GoogleActionsV2OrdersPaymentMethodTokenizationParameters = null
  ): GoogleActionsV2OrdersGoogleProvidedPaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(billingAddressRequired)) __obj.updateDynamic("billingAddressRequired")(billingAddressRequired.asInstanceOf[js.Any])
    if (facilitationSpecification != null) __obj.updateDynamic("facilitationSpecification")(facilitationSpecification.asInstanceOf[js.Any])
    if (!js.isUndefined(prepaidCardDisallowed)) __obj.updateDynamic("prepaidCardDisallowed")(prepaidCardDisallowed.asInstanceOf[js.Any])
    if (supportedCardNetworks != null) __obj.updateDynamic("supportedCardNetworks")(supportedCardNetworks.asInstanceOf[js.Any])
    if (tokenizationParameters != null) __obj.updateDynamic("tokenizationParameters")(tokenizationParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsV2OrdersGoogleProvidedPaymentOptions]
  }
}

