package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Encapsulates a request for payment, including information about payment processing capabilities, the payment amount, and shipping information.
  */
trait ApplePayPaymentRequest extends js.Object {
  /**
    * Optional user-defined data.
    */
  var applicationData: js.UndefOr[String] = js.undefined
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
  @scala.inline
  def apply(
    countryCode: String,
    currencyCode: String,
    merchantCapabilities: js.Array[ApplePayMerchantCapability],
    supportedNetworks: js.Array[String],
    total: ApplePayLineItem,
    applicationData: String = null,
    billingContact: ApplePayPaymentContact = null,
    lineItems: js.Array[ApplePayLineItem] = null,
    requiredBillingContactFields: js.Array[ApplePayContactField] = null,
    requiredShippingContactFields: js.Array[ApplePayContactField] = null,
    shippingContact: ApplePayPaymentContact = null,
    shippingMethods: js.Array[ApplePayShippingMethod] = null,
    shippingType: ApplePayShippingType = null,
    supportedCountries: js.Array[String] = null
  ): ApplePayPaymentRequest = {
    val __obj = js.Dynamic.literal(countryCode = countryCode.asInstanceOf[js.Any], currencyCode = currencyCode.asInstanceOf[js.Any], merchantCapabilities = merchantCapabilities.asInstanceOf[js.Any], supportedNetworks = supportedNetworks.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    if (applicationData != null) __obj.updateDynamic("applicationData")(applicationData.asInstanceOf[js.Any])
    if (billingContact != null) __obj.updateDynamic("billingContact")(billingContact.asInstanceOf[js.Any])
    if (lineItems != null) __obj.updateDynamic("lineItems")(lineItems.asInstanceOf[js.Any])
    if (requiredBillingContactFields != null) __obj.updateDynamic("requiredBillingContactFields")(requiredBillingContactFields.asInstanceOf[js.Any])
    if (requiredShippingContactFields != null) __obj.updateDynamic("requiredShippingContactFields")(requiredShippingContactFields.asInstanceOf[js.Any])
    if (shippingContact != null) __obj.updateDynamic("shippingContact")(shippingContact.asInstanceOf[js.Any])
    if (shippingMethods != null) __obj.updateDynamic("shippingMethods")(shippingMethods.asInstanceOf[js.Any])
    if (shippingType != null) __obj.updateDynamic("shippingType")(shippingType.asInstanceOf[js.Any])
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayPaymentRequest]
  }
}

