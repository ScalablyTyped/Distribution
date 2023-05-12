package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates a request for payment, including information about payment processing capabilities, the payment amount, and shipping information.
  */
trait ApplePayPaymentRequest extends StObject {
  
  /**
    * Optional user-defined data.
    */
  var applicationData: js.UndefOr[String] = js.undefined
  
  /**
    * A property that requests an automatic reload payment, such as a store card top-up.
    */
  var automaticReloadPaymentRequest: js.UndefOr[ApplePayAutomaticReloadPaymentRequest] = js.undefined
  
  /**
    * Billing contact information for the user.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  
  /**
    * The merchant's two-letter ISO 3166 country code.
    */
  var countryCode: String
  
  /**
    * The three-letter ISO 4217 currency code for the payment.
    */
  var currencyCode: String
  
  /**
    * A set of line items that explain recurring payments and/or additional charges.
    */
  var lineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.undefined
  
  /**
    * The payment capabilities supported by the merchant.
    * The value must at least contain ApplePayMerchantCapability.supports3DS.
    */
  var merchantCapabilities: js.Array[ApplePayMerchantCapability]
  
  /**
    * An array of payment token contexts that requests multiple payment tokens to support a multimerchant payment.
    */
  var multiTokenContexts: js.UndefOr[js.Array[ApplePayPaymentTokenContext]] = js.undefined
  
  /**
    * This property is optional. Use it to indicate that the payment request is for a recurring payment.
    * Apple Pay issues an Apple Pay Merchant Token if the user’s payment network supports merchant-specific payment tokens.
    * Otherwise, Apple Pay issues a device token for the payment request.
    *
    * Important
    * You can’t use this property with multiTokenContexts or automaticReloadPaymentRequest properties.
    * Simultaneous use of these properties results in an error and cancels the payment request.
    */
  var recurringPaymentRequest: js.UndefOr[ApplePayRecurringPaymentRequest] = js.undefined
  
  /**
    * The billing information that you require from the user in order to process the transaction.
    */
  var requiredBillingContactFields: js.UndefOr[js.Array[ApplePayContactField]] = js.undefined
  
  /**
    * The shipping information that you require from the user in order to fulfill the order.
    */
  var requiredShippingContactFields: js.UndefOr[js.Array[ApplePayContactField]] = js.undefined
  
  /**
    * Shipping contact information for the user.
    */
  var shippingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  
  /**
    * A set of shipping method objects that describe the available shipping methods.
    */
  var shippingMethods: js.UndefOr[js.Array[ApplePayShippingMethod]] = js.undefined
  
  /**
    * How the items are to be shipped.
    */
  var shippingType: js.UndefOr[ApplePayShippingType] = js.undefined
  
  /**
    * A list of ISO 3166 country codes for limiting payments to cards from specific countries.
    */
  var supportedCountries: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The payment networks supported by the merchant.
    */
  var supportedNetworks: js.Array[String]
  
  /**
    * A line item representing the total for the payment.
    */
  var total: ApplePayLineItem
}
object ApplePayPaymentRequest {
  
  inline def apply(
    countryCode: String,
    currencyCode: String,
    merchantCapabilities: js.Array[ApplePayMerchantCapability],
    supportedNetworks: js.Array[String],
    total: ApplePayLineItem
  ): ApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], merchantCapabilities = merchantCapabilities.asInstanceOf[js.Any], supportedNetworks = supportedNetworks.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplePayPaymentRequest] (val x: Self) extends AnyVal {
    
    inline def setApplicationData(value: String): Self = StObject.set(x, "applicationData", value.asInstanceOf[js.Any])
    
    inline def setApplicationDataUndefined: Self = StObject.set(x, "applicationData", js.undefined)
    
    inline def setAutomaticReloadPaymentRequest(value: ApplePayAutomaticReloadPaymentRequest): Self = StObject.set(x, "automaticReloadPaymentRequest", value.asInstanceOf[js.Any])
    
    inline def setAutomaticReloadPaymentRequestUndefined: Self = StObject.set(x, "automaticReloadPaymentRequest", js.undefined)
    
    inline def setBillingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    inline def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    inline def setLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    inline def setLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
    
    inline def setMerchantCapabilities(value: js.Array[ApplePayMerchantCapability]): Self = StObject.set(x, "merchantCapabilities", value.asInstanceOf[js.Any])
    
    inline def setMerchantCapabilitiesVarargs(value: ApplePayMerchantCapability*): Self = StObject.set(x, "merchantCapabilities", js.Array(value*))
    
    inline def setMultiTokenContexts(value: js.Array[ApplePayPaymentTokenContext]): Self = StObject.set(x, "multiTokenContexts", value.asInstanceOf[js.Any])
    
    inline def setMultiTokenContextsUndefined: Self = StObject.set(x, "multiTokenContexts", js.undefined)
    
    inline def setMultiTokenContextsVarargs(value: ApplePayPaymentTokenContext*): Self = StObject.set(x, "multiTokenContexts", js.Array(value*))
    
    inline def setRecurringPaymentRequest(value: ApplePayRecurringPaymentRequest): Self = StObject.set(x, "recurringPaymentRequest", value.asInstanceOf[js.Any])
    
    inline def setRecurringPaymentRequestUndefined: Self = StObject.set(x, "recurringPaymentRequest", js.undefined)
    
    inline def setRequiredBillingContactFields(value: js.Array[ApplePayContactField]): Self = StObject.set(x, "requiredBillingContactFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredBillingContactFieldsUndefined: Self = StObject.set(x, "requiredBillingContactFields", js.undefined)
    
    inline def setRequiredBillingContactFieldsVarargs(value: ApplePayContactField*): Self = StObject.set(x, "requiredBillingContactFields", js.Array(value*))
    
    inline def setRequiredShippingContactFields(value: js.Array[ApplePayContactField]): Self = StObject.set(x, "requiredShippingContactFields", value.asInstanceOf[js.Any])
    
    inline def setRequiredShippingContactFieldsUndefined: Self = StObject.set(x, "requiredShippingContactFields", js.undefined)
    
    inline def setRequiredShippingContactFieldsVarargs(value: ApplePayContactField*): Self = StObject.set(x, "requiredShippingContactFields", js.Array(value*))
    
    inline def setShippingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    inline def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    inline def setShippingMethods(value: js.Array[ApplePayShippingMethod]): Self = StObject.set(x, "shippingMethods", value.asInstanceOf[js.Any])
    
    inline def setShippingMethodsUndefined: Self = StObject.set(x, "shippingMethods", js.undefined)
    
    inline def setShippingMethodsVarargs(value: ApplePayShippingMethod*): Self = StObject.set(x, "shippingMethods", js.Array(value*))
    
    inline def setShippingType(value: ApplePayShippingType): Self = StObject.set(x, "shippingType", value.asInstanceOf[js.Any])
    
    inline def setShippingTypeUndefined: Self = StObject.set(x, "shippingType", js.undefined)
    
    inline def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
    
    inline def setSupportedCountriesUndefined: Self = StObject.set(x, "supportedCountries", js.undefined)
    
    inline def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value*))
    
    inline def setSupportedNetworks(value: js.Array[String]): Self = StObject.set(x, "supportedNetworks", value.asInstanceOf[js.Any])
    
    inline def setSupportedNetworksVarargs(value: String*): Self = StObject.set(x, "supportedNetworks", js.Array(value*))
    
    inline def setTotal(value: ApplePayLineItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
