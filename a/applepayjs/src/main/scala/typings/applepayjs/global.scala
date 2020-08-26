package typings.applepayjs

import typings.applepayjs.ApplePayJS.ApplePayPaymentRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  class ApplePaySession protected ()
    extends typings.applepayjs.ApplePaySession {
    /**
      * The entry point for Apple Pay on the web.
      * @param version - The version number of the ApplePay JS API you are using. The current API version number is 3.
      * @param paymentRequest - An ApplePayPaymentRequest object that contains the information to be displayed on the Apple Pay payment sheet.
      */
    def this(version: Double, paymentRequest: ApplePayPaymentRequest) = this()
  }
  
  @js.native
  object ApplePayJS extends js.Object {
    /**
      * The ApplePayPaymentAuthorizedEvent class defines the attributes contained by the ApplePaySession.onpaymentauthorized callback function.
      */
    @js.native
    abstract class ApplePayPaymentAuthorizedEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayPaymentAuthorizedEvent
    
    /**
      * The ApplePayPaymentMethodSelectedEvent class defines the attributes contained by the ApplePaySession.onpaymentmethodselected callback function.
      */
    @js.native
    abstract class ApplePayPaymentMethodSelectedEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayPaymentMethodSelectedEvent
    
    /**
      * Encapsulates the attributes contained by the onshippingcontactselected callback function.
      */
    @js.native
    abstract class ApplePayShippingContactSelectedEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayShippingContactSelectedEvent
    
    /**
      * Updated transaction details resulting from a change in shipping contact, including any errors.
      */
    @js.native
    class ApplePayShippingContactUpdate ()
      extends typings.applepayjs.ApplePayJS.ApplePayShippingContactUpdate
    
    /**
      * The ApplePayShippingMethodSelectedEvent class defines the attribute contained by the ApplePaySession.onshippingmethodselected callback function.
      */
    @js.native
    abstract class ApplePayShippingMethodSelectedEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayShippingMethodSelectedEvent
    
    /**
      * The attributes contained by the onvalidatemerchant callback function.
      */
    @js.native
    abstract class ApplePayValidateMerchantEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayValidateMerchantEvent
    
    @js.native
    abstract class Event ()
      extends typings.applepayjs.ApplePayJS.Event
    
    /* static members */
    @js.native
    object Event extends js.Object {
      val AT_TARGET: Double = js.native
      val BLUR: Double = js.native
      val BUBBLING_PHASE: Double = js.native
      val CAPTURING_PHASE: Double = js.native
      val CHANGE: Double = js.native
      val CLICK: Double = js.native
      val DBLCLICK: Double = js.native
      val DRAGDROP: Double = js.native
      val FOCUS: Double = js.native
      val KEYDOWN: Double = js.native
      val KEYPRESS: Double = js.native
      val KEYUP: Double = js.native
      val MOUSEDOWN: Double = js.native
      val MOUSEDRAG: Double = js.native
      val MOUSEMOVE: Double = js.native
      val MOUSEOUT: Double = js.native
      val MOUSEOVER: Double = js.native
      val MOUSEUP: Double = js.native
      val NONE: Double = js.native
      val SELECT: Double = js.native
    }
    
  }
  
  /* static members */
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
  
}

