package typings.applepayjs.ApplePayJS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates a request for payment, including information about payment processing capabilities, the payment amount, and shipping information.
  */
@js.native
trait ApplePayPaymentRequest extends StObject {
  
  /**
    * Optional user-defined data.
    */
  var applicationData: js.UndefOr[String] = js.native
  
  /**
    * Billing contact information for the user.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.native
  
  /**
    * The merchant's two-letter ISO 3166 country code.
    */
  var countryCode: String = js.native
  
  /**
    * The three-letter ISO 4217 currency code for the payment.
    */
  var currencyCode: String = js.native
  
  /**
    * A set of line items that explain recurring payments and/or additional charges.
    */
  var lineItems: js.UndefOr[js.Array[ApplePayLineItem]] = js.native
  
  /**
    * The payment capabilities supported by the merchant.
    * The value must at least contain ApplePayMerchantCapability.supports3DS.
    */
  var merchantCapabilities: js.Array[ApplePayMerchantCapability] = js.native
  
  /**
    * The billing information that you require from the user in order to process the transaction.
    */
  var requiredBillingContactFields: js.UndefOr[js.Array[ApplePayContactField]] = js.native
  
  /**
    * The shipping information that you require from the user in order to fulfill the order.
    */
  var requiredShippingContactFields: js.UndefOr[js.Array[ApplePayContactField]] = js.native
  
  /**
    * Shipping contact information for the user.
    */
  var shippingContact: js.UndefOr[ApplePayPaymentContact] = js.native
  
  /**
    * A set of shipping method objects that describe the available shipping methods.
    */
  var shippingMethods: js.UndefOr[js.Array[ApplePayShippingMethod]] = js.native
  
  /**
    * How the items are to be shipped.
    */
  var shippingType: js.UndefOr[ApplePayShippingType] = js.native
  
  /**
    * A list of ISO 3166 country codes for limiting payments to cards from specific countries.
    */
  var supportedCountries: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * The payment networks supported by the merchant.
    */
  var supportedNetworks: js.Array[String] = js.native
  
  /**
    * A line item representing the total for the payment.
    */
  var total: ApplePayLineItem = js.native
}
object ApplePayPaymentRequest {
  
  @scala.inline
  def apply(
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
  implicit class ApplePayPaymentRequestMutableBuilder[Self <: ApplePayPaymentRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationData(value: String): Self = StObject.set(x, "applicationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationDataUndefined: Self = StObject.set(x, "applicationData", js.undefined)
    
    @scala.inline
    def setBillingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "billingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBillingContactUndefined: Self = StObject.set(x, "billingContact", js.undefined)
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCode(value: String): Self = StObject.set(x, "currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItems(value: js.Array[ApplePayLineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: ApplePayLineItem*): Self = StObject.set(x, "lineItems", js.Array(value :_*))
    
    @scala.inline
    def setMerchantCapabilities(value: js.Array[ApplePayMerchantCapability]): Self = StObject.set(x, "merchantCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantCapabilitiesVarargs(value: ApplePayMerchantCapability*): Self = StObject.set(x, "merchantCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setRequiredBillingContactFields(value: js.Array[ApplePayContactField]): Self = StObject.set(x, "requiredBillingContactFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredBillingContactFieldsUndefined: Self = StObject.set(x, "requiredBillingContactFields", js.undefined)
    
    @scala.inline
    def setRequiredBillingContactFieldsVarargs(value: ApplePayContactField*): Self = StObject.set(x, "requiredBillingContactFields", js.Array(value :_*))
    
    @scala.inline
    def setRequiredShippingContactFields(value: js.Array[ApplePayContactField]): Self = StObject.set(x, "requiredShippingContactFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequiredShippingContactFieldsUndefined: Self = StObject.set(x, "requiredShippingContactFields", js.undefined)
    
    @scala.inline
    def setRequiredShippingContactFieldsVarargs(value: ApplePayContactField*): Self = StObject.set(x, "requiredShippingContactFields", js.Array(value :_*))
    
    @scala.inline
    def setShippingContact(value: ApplePayPaymentContact): Self = StObject.set(x, "shippingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingContactUndefined: Self = StObject.set(x, "shippingContact", js.undefined)
    
    @scala.inline
    def setShippingMethods(value: js.Array[ApplePayShippingMethod]): Self = StObject.set(x, "shippingMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingMethodsUndefined: Self = StObject.set(x, "shippingMethods", js.undefined)
    
    @scala.inline
    def setShippingMethodsVarargs(value: ApplePayShippingMethod*): Self = StObject.set(x, "shippingMethods", js.Array(value :_*))
    
    @scala.inline
    def setShippingType(value: ApplePayShippingType): Self = StObject.set(x, "shippingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShippingTypeUndefined: Self = StObject.set(x, "shippingType", js.undefined)
    
    @scala.inline
    def setSupportedCountries(value: js.Array[String]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCountriesUndefined: Self = StObject.set(x, "supportedCountries", js.undefined)
    
    @scala.inline
    def setSupportedCountriesVarargs(value: String*): Self = StObject.set(x, "supportedCountries", js.Array(value :_*))
    
    @scala.inline
    def setSupportedNetworks(value: js.Array[String]): Self = StObject.set(x, "supportedNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedNetworksVarargs(value: String*): Self = StObject.set(x, "supportedNetworks", js.Array(value :_*))
    
    @scala.inline
    def setTotal(value: ApplePayLineItem): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
