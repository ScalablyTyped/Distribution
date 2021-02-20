package typings.applepayjs

import typings.applepayjs.ApplePayJS.ApplePayLineItem
import typings.applepayjs.ApplePayJS.ApplePayPaymentAuthorizationResult
import typings.applepayjs.ApplePayJS.ApplePayPaymentAuthorizedEvent
import typings.applepayjs.ApplePayJS.ApplePayPaymentMethodSelectedEvent
import typings.applepayjs.ApplePayJS.ApplePayPaymentMethodUpdate
import typings.applepayjs.ApplePayJS.ApplePayShippingContactSelectedEvent
import typings.applepayjs.ApplePayJS.ApplePayShippingContactUpdate
import typings.applepayjs.ApplePayJS.ApplePayShippingMethod
import typings.applepayjs.ApplePayJS.ApplePayShippingMethodSelectedEvent
import typings.applepayjs.ApplePayJS.ApplePayShippingMethodUpdate
import typings.applepayjs.ApplePayJS.ApplePayValidateMerchantEvent
import typings.applepayjs.ApplePayJS.Event
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplePaySession extends EventTarget {
  
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
