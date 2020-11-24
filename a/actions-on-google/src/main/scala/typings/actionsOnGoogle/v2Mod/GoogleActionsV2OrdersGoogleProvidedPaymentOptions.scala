package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OrdersGoogleProvidedPaymentOptions extends js.Object {
  
  /**
    * If true, billing address will be returned.
    * Deprecated: Use facilitation_specification field instead.
    */
  var billingAddressRequired: js.UndefOr[Boolean] = js.native
  
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
  var facilitationSpecification: js.UndefOr[String] = js.native
  
  /**
    * If true, disallow prepaid cards from being used in the transaction.
    * Deprecated: Use facilitation_specification field instead.
    */
  var prepaidCardDisallowed: js.UndefOr[Boolean] = js.native
  
  /**
    * The app allows cards from any card network listed here being used in
    * transaction.
    * By default, Amex, Visa, MC and Discover are supported.
    * Deprecated: Use facilitation_specification field instead.
    */
  var supportedCardNetworks: js.UndefOr[js.Array[GoogleActionsV2OrdersGoogleProvidedPaymentOptionsSupportedCardNetworks]] = js.native
  
  /**
    * Required field for requesting Google provided payment instrument.
    * These tokenization parameters  will be used for generating payment token
    * for use in transaction. The app should get these parameters from their
    * payment gateway.
    * Deprecated: Use facilitation_specification field instead.
    */
  var tokenizationParameters: js.UndefOr[GoogleActionsV2OrdersPaymentMethodTokenizationParameters] = js.native
}
object GoogleActionsV2OrdersGoogleProvidedPaymentOptions {
  
  @scala.inline
  def apply(): GoogleActionsV2OrdersGoogleProvidedPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OrdersGoogleProvidedPaymentOptions]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OrdersGoogleProvidedPaymentOptionsOps[Self <: GoogleActionsV2OrdersGoogleProvidedPaymentOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBillingAddressRequired(value: Boolean): Self = this.set("billingAddressRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingAddressRequired: Self = this.set("billingAddressRequired", js.undefined)
    
    @scala.inline
    def setFacilitationSpecification(value: String): Self = this.set("facilitationSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacilitationSpecification: Self = this.set("facilitationSpecification", js.undefined)
    
    @scala.inline
    def setPrepaidCardDisallowed(value: Boolean): Self = this.set("prepaidCardDisallowed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrepaidCardDisallowed: Self = this.set("prepaidCardDisallowed", js.undefined)
    
    @scala.inline
    def setSupportedCardNetworksVarargs(value: GoogleActionsV2OrdersGoogleProvidedPaymentOptionsSupportedCardNetworks*): Self = this.set("supportedCardNetworks", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCardNetworks(value: js.Array[GoogleActionsV2OrdersGoogleProvidedPaymentOptionsSupportedCardNetworks]): Self = this.set("supportedCardNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCardNetworks: Self = this.set("supportedCardNetworks", js.undefined)
    
    @scala.inline
    def setTokenizationParameters(value: GoogleActionsV2OrdersPaymentMethodTokenizationParameters): Self = this.set("tokenizationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokenizationParameters: Self = this.set("tokenizationParameters", js.undefined)
  }
}
