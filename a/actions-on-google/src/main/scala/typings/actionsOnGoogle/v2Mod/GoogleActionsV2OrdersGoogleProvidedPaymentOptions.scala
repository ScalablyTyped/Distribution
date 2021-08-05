package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OrdersGoogleProvidedPaymentOptions extends StObject {
  
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
  
  inline def apply(): GoogleActionsV2OrdersGoogleProvidedPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersGoogleProvidedPaymentOptions]
  }
  
  extension [Self <: GoogleActionsV2OrdersGoogleProvidedPaymentOptions](x: Self) {
    
    inline def setBillingAddressRequired(value: Boolean): Self = StObject.set(x, "billingAddressRequired", value.asInstanceOf[js.Any])
    
    inline def setBillingAddressRequiredUndefined: Self = StObject.set(x, "billingAddressRequired", js.undefined)
    
    inline def setFacilitationSpecification(value: String): Self = StObject.set(x, "facilitationSpecification", value.asInstanceOf[js.Any])
    
    inline def setFacilitationSpecificationUndefined: Self = StObject.set(x, "facilitationSpecification", js.undefined)
    
    inline def setPrepaidCardDisallowed(value: Boolean): Self = StObject.set(x, "prepaidCardDisallowed", value.asInstanceOf[js.Any])
    
    inline def setPrepaidCardDisallowedUndefined: Self = StObject.set(x, "prepaidCardDisallowed", js.undefined)
    
    inline def setSupportedCardNetworks(value: js.Array[GoogleActionsV2OrdersGoogleProvidedPaymentOptionsSupportedCardNetworks]): Self = StObject.set(x, "supportedCardNetworks", value.asInstanceOf[js.Any])
    
    inline def setSupportedCardNetworksUndefined: Self = StObject.set(x, "supportedCardNetworks", js.undefined)
    
    inline def setSupportedCardNetworksVarargs(value: GoogleActionsV2OrdersGoogleProvidedPaymentOptionsSupportedCardNetworks*): Self = StObject.set(x, "supportedCardNetworks", js.Array(value :_*))
    
    inline def setTokenizationParameters(value: GoogleActionsV2OrdersPaymentMethodTokenizationParameters): Self = StObject.set(x, "tokenizationParameters", value.asInstanceOf[js.Any])
    
    inline def setTokenizationParametersUndefined: Self = StObject.set(x, "tokenizationParameters", js.undefined)
  }
}
