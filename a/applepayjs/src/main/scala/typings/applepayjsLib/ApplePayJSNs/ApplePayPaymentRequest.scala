package typings
package applepayjsLib.ApplePayJSNs

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
  var applicationData: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Billing contact information for the user.
    */
  var billingContact: js.UndefOr[ApplePayPaymentContact] = js.undefined
  /**
    * The merchant's two-letter ISO 3166 country code.
    */
  var countryCode: java.lang.String
  /**
    * The three-letter ISO 4217 currency code for the payment.
    */
  var currencyCode: java.lang.String
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
  var supportedCountries: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The payment networks supported by the merchant.
    */
  var supportedNetworks: js.Array[java.lang.String]
  /**
    * A line item representing the total for the payment.
    */
  var total: ApplePayLineItem
}

