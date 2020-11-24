package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Encapsulates a request for payment, including information about payment processing capabilities, the payment amount, and shipping information.
  */
@js.native
trait ApplePayPaymentRequest extends js.Object {
  
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
  implicit class ApplePayPaymentRequestOps[Self <: ApplePayPaymentRequest] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyCode(value: String): Self = this.set("currencyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMerchantCapabilitiesVarargs(value: ApplePayMerchantCapability*): Self = this.set("merchantCapabilities", js.Array(value :_*))
    
    @scala.inline
    def setMerchantCapabilities(value: js.Array[ApplePayMerchantCapability]): Self = this.set("merchantCapabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedNetworksVarargs(value: String*): Self = this.set("supportedNetworks", js.Array(value :_*))
    
    @scala.inline
    def setSupportedNetworks(value: js.Array[String]): Self = this.set("supportedNetworks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal(value: ApplePayLineItem): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationData(value: String): Self = this.set("applicationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationData: Self = this.set("applicationData", js.undefined)
    
    @scala.inline
    def setBillingContact(value: ApplePayPaymentContact): Self = this.set("billingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBillingContact: Self = this.set("billingContact", js.undefined)
    
    @scala.inline
    def setLineItemsVarargs(value: ApplePayLineItem*): Self = this.set("lineItems", js.Array(value :_*))
    
    @scala.inline
    def setLineItems(value: js.Array[ApplePayLineItem]): Self = this.set("lineItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineItems: Self = this.set("lineItems", js.undefined)
    
    @scala.inline
    def setRequiredBillingContactFieldsVarargs(value: ApplePayContactField*): Self = this.set("requiredBillingContactFields", js.Array(value :_*))
    
    @scala.inline
    def setRequiredBillingContactFields(value: js.Array[ApplePayContactField]): Self = this.set("requiredBillingContactFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredBillingContactFields: Self = this.set("requiredBillingContactFields", js.undefined)
    
    @scala.inline
    def setRequiredShippingContactFieldsVarargs(value: ApplePayContactField*): Self = this.set("requiredShippingContactFields", js.Array(value :_*))
    
    @scala.inline
    def setRequiredShippingContactFields(value: js.Array[ApplePayContactField]): Self = this.set("requiredShippingContactFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequiredShippingContactFields: Self = this.set("requiredShippingContactFields", js.undefined)
    
    @scala.inline
    def setShippingContact(value: ApplePayPaymentContact): Self = this.set("shippingContact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingContact: Self = this.set("shippingContact", js.undefined)
    
    @scala.inline
    def setShippingMethodsVarargs(value: ApplePayShippingMethod*): Self = this.set("shippingMethods", js.Array(value :_*))
    
    @scala.inline
    def setShippingMethods(value: js.Array[ApplePayShippingMethod]): Self = this.set("shippingMethods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingMethods: Self = this.set("shippingMethods", js.undefined)
    
    @scala.inline
    def setShippingType(value: ApplePayShippingType): Self = this.set("shippingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShippingType: Self = this.set("shippingType", js.undefined)
    
    @scala.inline
    def setSupportedCountriesVarargs(value: String*): Self = this.set("supportedCountries", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCountries(value: js.Array[String]): Self = this.set("supportedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCountries: Self = this.set("supportedCountries", js.undefined)
  }
}
