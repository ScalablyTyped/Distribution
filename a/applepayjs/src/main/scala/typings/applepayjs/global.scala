package typings.applepayjs

import typings.applepayjs.ApplePayJS.ApplePayPaymentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ApplePayJS {
    
    /**
      * The ApplePayPaymentAuthorizedEvent class defines the attributes contained by the ApplePaySession.onpaymentauthorized callback function.
      */
    @JSGlobal("ApplePayJS.ApplePayPaymentAuthorizedEvent")
    @js.native
    abstract class ApplePayPaymentAuthorizedEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayPaymentAuthorizedEvent
    
    /**
      * The ApplePayPaymentMethodSelectedEvent class defines the attributes contained by the ApplePaySession.onpaymentmethodselected callback function.
      */
    @JSGlobal("ApplePayJS.ApplePayPaymentMethodSelectedEvent")
    @js.native
    abstract class ApplePayPaymentMethodSelectedEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayPaymentMethodSelectedEvent
    
    /**
      * Encapsulates the attributes contained by the onshippingcontactselected callback function.
      */
    @JSGlobal("ApplePayJS.ApplePayShippingContactSelectedEvent")
    @js.native
    abstract class ApplePayShippingContactSelectedEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayShippingContactSelectedEvent
    
    /**
      * Updated transaction details resulting from a change in shipping contact, including any errors.
      */
    @JSGlobal("ApplePayJS.ApplePayShippingContactUpdate")
    @js.native
    class ApplePayShippingContactUpdate ()
      extends typings.applepayjs.ApplePayJS.ApplePayShippingContactUpdate
    
    /**
      * The ApplePayShippingMethodSelectedEvent class defines the attribute contained by the ApplePaySession.onshippingmethodselected callback function.
      */
    @JSGlobal("ApplePayJS.ApplePayShippingMethodSelectedEvent")
    @js.native
    abstract class ApplePayShippingMethodSelectedEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayShippingMethodSelectedEvent
    
    /**
      * The attributes contained by the onvalidatemerchant callback function.
      */
    @JSGlobal("ApplePayJS.ApplePayValidateMerchantEvent")
    @js.native
    abstract class ApplePayValidateMerchantEvent ()
      extends typings.applepayjs.ApplePayJS.ApplePayValidateMerchantEvent
    
    @JSGlobal("ApplePayJS.Event")
    @js.native
    abstract class Event ()
      extends typings.applepayjs.ApplePayJS.Event
    object Event {
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.AT_TARGET")
      @js.native
      val AT_TARGET: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.BLUR")
      @js.native
      val BLUR: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.BUBBLING_PHASE")
      @js.native
      val BUBBLING_PHASE: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.CAPTURING_PHASE")
      @js.native
      val CAPTURING_PHASE: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.CHANGE")
      @js.native
      val CHANGE: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.CLICK")
      @js.native
      val CLICK: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.DBLCLICK")
      @js.native
      val DBLCLICK: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.DRAGDROP")
      @js.native
      val DRAGDROP: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.FOCUS")
      @js.native
      val FOCUS: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.KEYDOWN")
      @js.native
      val KEYDOWN: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.KEYPRESS")
      @js.native
      val KEYPRESS: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.KEYUP")
      @js.native
      val KEYUP: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.MOUSEDOWN")
      @js.native
      val MOUSEDOWN: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.MOUSEDRAG")
      @js.native
      val MOUSEDRAG: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.MOUSEMOVE")
      @js.native
      val MOUSEMOVE: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.MOUSEOUT")
      @js.native
      val MOUSEOUT: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.MOUSEOVER")
      @js.native
      val MOUSEOVER: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.MOUSEUP")
      @js.native
      val MOUSEUP: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.NONE")
      @js.native
      val NONE: Double = js.native
      
      /* static member */
      @JSGlobal("ApplePayJS.Event.SELECT")
      @js.native
      val SELECT: Double = js.native
    }
  }
  
  @JSGlobal("ApplePaySession")
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
  object ApplePaySession {
    
    /**
      * The requested action failed.
      */
    /* static member */
    @JSGlobal("ApplePaySession.STATUS_FAILURE")
    @js.native
    val STATUS_FAILURE: Double = js.native
    
    /**
      * The billing address is not valid.
      */
    /* static member */
    @JSGlobal("ApplePaySession.STATUS_INVALID_BILLING_POSTAL_ADDRESS")
    @js.native
    val STATUS_INVALID_BILLING_POSTAL_ADDRESS: Double = js.native
    
    /**
      * The shipping contact information is not valid.
      */
    /* static member */
    @JSGlobal("ApplePaySession.STATUS_INVALID_SHIPPING_CONTACT")
    @js.native
    val STATUS_INVALID_SHIPPING_CONTACT: Double = js.native
    
    /**
      * The shipping address is not valid.
      */
    /* static member */
    @JSGlobal("ApplePaySession.STATUS_INVALID_SHIPPING_POSTAL_ADDRESS")
    @js.native
    val STATUS_INVALID_SHIPPING_POSTAL_ADDRESS: Double = js.native
    
    /**
      * The PIN information is not valid. Cards on the China Union Pay network may require a PIN.
      */
    /* static member */
    @JSGlobal("ApplePaySession.STATUS_PIN_INCORRECT")
    @js.native
    val STATUS_PIN_INCORRECT: Double = js.native
    
    /**
      * The maximum number of tries for a PIN has been reached and the user has been locked out. Cards on the China Union Pay network may require a PIN.
      */
    /* static member */
    @JSGlobal("ApplePaySession.STATUS_PIN_LOCKOUT")
    @js.native
    val STATUS_PIN_LOCKOUT: Double = js.native
    
    /**
      * The required PIN information was not provided. Cards on the China Union Pay payment network may require a PIN to authenticate the transaction.
      */
    /* static member */
    @JSGlobal("ApplePaySession.STATUS_PIN_REQUIRED")
    @js.native
    val STATUS_PIN_REQUIRED: Double = js.native
    
    /**
      * The requested action succeeded.
      */
    /* static member */
    @JSGlobal("ApplePaySession.STATUS_SUCCESS")
    @js.native
    val STATUS_SUCCESS: Double = js.native
    
    /**
      * Indicates whether the device supports Apple Pay.
      * @returns true if the device supports making payments with Apple Pay; otherwise, false.
      */
    /* static member */
    @JSGlobal("ApplePaySession.canMakePayments")
    @js.native
    def canMakePayments(): Boolean = js.native
    
    /**
      * Indicates whether the device supports Apple Pay and whether the user has an active card in Wallet.
      * @param merchantIdentifier - The merchant ID created when the merchant enrolled in Apple Pay.
      * @returns true if the device supports Apple Pay and there is at least one active card in Wallet that is qualified for payments on the web; otherwise, false.
      */
    /* static member */
    @JSGlobal("ApplePaySession.canMakePaymentsWithActiveCard")
    @js.native
    def canMakePaymentsWithActiveCard(merchantIdentifier: String): js.Promise[Boolean] = js.native
    
    /**
      * Displays the Set up Apple Pay button.
      * @param merchantIdentifier - The merchant ID created when the merchant enrolled in Apple Pay.
      * @returns A boolean value indicating whether setup was successful.
      */
    /* static member */
    @JSGlobal("ApplePaySession.openPaymentSetup")
    @js.native
    def openPaymentSetup(merchantIdentifier: String): js.Promise[Boolean] = js.native
    
    /**
      * Verifies whether a web browser supports a given Apple Pay JS API version.
      * @param version - A number representing the Apple Pay JS API version being checked. The initial version is 1. The latest version is 3.
      * @returns A boolean value indicating whether the web browser supports the given API version. Returns false if the web browser does not support the specified version.
      */
    /* static member */
    @JSGlobal("ApplePaySession.supportsVersion")
    @js.native
    def supportsVersion(version: Double): Boolean = js.native
  }
}
