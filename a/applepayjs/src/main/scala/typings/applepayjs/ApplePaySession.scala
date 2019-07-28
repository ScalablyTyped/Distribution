package typings.applepayjs

import typings.applepayjs.ApplePayJSNs.ApplePayLineItem
import typings.applepayjs.ApplePayJSNs.ApplePayPaymentAuthorizationResult
import typings.applepayjs.ApplePayJSNs.ApplePayPaymentAuthorizedEvent
import typings.applepayjs.ApplePayJSNs.ApplePayPaymentMethodSelectedEvent
import typings.applepayjs.ApplePayJSNs.ApplePayPaymentMethodUpdate
import typings.applepayjs.ApplePayJSNs.ApplePayPaymentRequest
import typings.applepayjs.ApplePayJSNs.ApplePayShippingContactSelectedEvent
import typings.applepayjs.ApplePayJSNs.ApplePayShippingContactUpdate
import typings.applepayjs.ApplePayJSNs.ApplePayShippingMethod
import typings.applepayjs.ApplePayJSNs.ApplePayShippingMethodSelectedEvent
import typings.applepayjs.ApplePayJSNs.ApplePayShippingMethodUpdate
import typings.applepayjs.ApplePayJSNs.ApplePayValidateMerchantEvent
import typings.applepayjs.ApplePayJSNs.Event
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ApplePaySession")
@js.native
class ApplePaySession protected () extends EventTarget {
  /**
    * The entry point for Apple Pay on the web.
    * @param version - The version number of the ApplePay JS API you are using. The current API version number is 3.
    * @param paymentRequest - An ApplePayPaymentRequest object that contains the information to be displayed on the Apple Pay payment sheet.
    */
  def this(version: Double, paymentRequest: ApplePayPaymentRequest) = this()
  /**
    * Aborts the current Apple Pay session.
    */
  def abort(): Unit = js.native
  /**
    * Begins the merchant validation process.
    */
  def begin(): Unit = js.native
  /**
    * Completes the validation for a merchant session.
    * @param merchantSession - An opaque message session object.
    */
  def completeMerchantValidation(merchantSession: js.Any): Unit = js.native
  /**
    * Completes the payment authorization with a result.
    * @param result - The status of the payment, whether it succeeded or failed for Apple Pay JS versions 1 and 2,
    * or the result of the payment authorization, including its status and list of errors for Apple Pay JS version 3.
    */
  def completePayment(result: Double): Unit = js.native
  def completePayment(result: ApplePayPaymentAuthorizationResult): Unit = js.native
  /**
    * Call after a payment method has been selected for Apple Pay JS versions 1 and 2.
    * @param newTotal - An ApplePayLineItem dictionary representing the total price for the purchase.
    * @param newLineItems - A sequence of ApplePayLineItem dictionaries.
    */
  def completePaymentMethodSelection(newTotal: ApplePayLineItem, newLineItems: js.Array[ApplePayLineItem]): Unit = js.native
  /**
    * Completes the selection of a payment method with an update for Apple Pay JS version 3.
    * @param update - The updated payment method.
    */
  def completePaymentMethodSelection(update: ApplePayPaymentMethodUpdate): Unit = js.native
  /**
    * Completes the selection of a shipping contact with an update for Apple Pay JS versions 1 and 2.
    * @param status - The status of the shipping contact update.
    * @param newShippingMethods - A sequence of ApplePayShippingMethod dictionaries.
    * @param newTotal - An ApplePayLineItem dictionary representing the total price for the purchase.
    * @param newLineItems - A sequence of ApplePayLineItem dictionaries.
    */
  def completeShippingContactSelection(
    status: Double,
    newShippingMethods: js.Array[ApplePayShippingMethod],
    newTotal: ApplePayLineItem,
    newLineItems: js.Array[ApplePayLineItem]
  ): Unit = js.native
  /**
    * Completes the selection of a shipping contact with an update for Apple Pay JS version 3.
    * @param update - The updated shipping contact.
    */
  def completeShippingContactSelection(update: ApplePayShippingContactUpdate): Unit = js.native
  /**
    * Call after the shipping method has been selected for Apple Pay JS versions 1 and 2.
    * @param status - The status of the shipping method update.
    * @param newTotal - An ApplePayLineItem dictionary representing the total price for the purchase.
    * @param newLineItems - A sequence of ApplePayLineItem dictionaries.
    */
  def completeShippingMethodSelection(status: Double, newTotal: ApplePayLineItem, newLineItems: js.Array[ApplePayLineItem]): Unit = js.native
  /**
    * Completes the selection of a shipping method with an update for Apple Pay JS version 3.
    * @param update - The updated shipping method.
    */
  def completeShippingMethodSelection(update: ApplePayShippingMethodUpdate): Unit = js.native
  /**
    * A callback function that is automatically called when the payment UI is dismissed.
    */
  def oncancel(event: Event): Unit = js.native
  /**
    * A callback function that is automatically called when the user has authorized the Apple Pay payment with Touch ID, Face ID, or passcode.
    */
  def onpaymentauthorized(event: ApplePayPaymentAuthorizedEvent): Unit = js.native
  /**
    * A callback function that is automatically called when a new payment method is selected.
    */
  def onpaymentmethodselected(event: ApplePayPaymentMethodSelectedEvent): Unit = js.native
  /**
    * A callback function that is called when a shipping contact is selected in the payment sheet.
    */
  def onshippingcontactselected(event: ApplePayShippingContactSelectedEvent): Unit = js.native
  /**
    * A callback function that is automatically called when a shipping method is selected.
    */
  def onshippingmethodselected(event: ApplePayShippingMethodSelectedEvent): Unit = js.native
  /**
    * A callback function that is automatically called when the payment sheet is displayed.
    */
  def onvalidatemerchant(event: ApplePayValidateMerchantEvent): Unit = js.native
}

/* static members */
@JSGlobal("ApplePaySession")
@js.native
object ApplePaySession extends js.Object {
  /**
    * The requested action failed.
    */
  val STATUS_FAILURE: Double = js.native
  /**
    * The billing address is not valid.
    */
  val STATUS_INVALID_BILLING_POSTAL_ADDRESS: Double = js.native
  /**
    * The shipping contact information is not valid.
    */
  val STATUS_INVALID_SHIPPING_CONTACT: Double = js.native
  /**
    * The shipping address is not valid.
    */
  val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: Double = js.native
  /**
    * The PIN information is not valid. Cards on the China Union Pay network may require a PIN.
    */
  val STATUS_PIN_INCORRECT: Double = js.native
  /**
    * The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
    */
  val STATUS_PIN_LOCKOUT: Double = js.native
  /**
    * The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
    */
  val STATUS_PIN_REQUIRED: Double = js.native
  /**
    * The requested action succeeded.
    */
  val STATUS_SUCCESS: Double = js.native
  /**
    * Indicates whether the device supports Apple Pay.
    * @returns true if the device supports making payments with Apple Pay; otherwise, false.
    */
  def canMakePayments(): Boolean = js.native
  /**
    * Indicates whether the device supports Apple Pay and whether the user has an active card in Wallet.
    * @param merchantIdentifier - The merchant ID created when the merchant enrolled in Apple Pay.
    * @returns true if the device supports Apple Pay and there is at least one active card in Wallet that is qualified for payments on the web; otherwise, false.
    */
  def canMakePaymentsWithActiveCard(merchantIdentifier: String): js.Promise[Boolean] = js.native
  /**
    * Displays the Set up Apple Pay button.
    * @param merchantIdentifier - The merchant ID created when the merchant enrolled in Apple Pay.
    * @returns A boolean value indicating whether setup was successful.
    */
  def openPaymentSetup(merchantIdentifier: String): js.Promise[Boolean] = js.native
  /**
    * Verifies whether a web browser supports a given Apple Pay JS API version.
    * @param version - A number representing the Apple Pay JS API version being checked. The initial version is 1. The latest version is 3.
    * @returns A boolean value indicating whether the web browser supports the given API version. Returns false if the web browser does not support the specified version.
    */
  def supportsVersion(version: Double): Boolean = js.native
}

