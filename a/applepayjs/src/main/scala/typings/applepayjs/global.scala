package typings.applepayjs

import typings.applepayjs.ApplePayJS.ApplePayErrorCode
import typings.applepayjs.ApplePayJS.ApplePayErrorContactField
import typings.applepayjs.ApplePayJS.ApplePayLineItem
import typings.applepayjs.ApplePayJS.ApplePayPaymentRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /**
    * A customizable error type that you create to indicate problems with the address or contact information on an Apple Pay sheet.
    */
  @JSGlobal("ApplePayError")
  @js.native
  open class ApplePayError protected ()
    extends StObject
       with typings.applepayjs.ApplePayError {
    /**
      * Construct a new ApplePayError instance.
      *
      * @param errorCode - The error code for the new instance.
      * @param contactField - The name of the field that contains the error.
      * @param message - A localized, user-facing string that describes the error.
      */
    def this(errorCode: ApplePayErrorCode) = this()
    def this(errorCode: ApplePayErrorCode, contactField: ApplePayErrorContactField) = this()
    def this(errorCode: ApplePayErrorCode, contactField: Unit, message: String) = this()
    def this(errorCode: ApplePayErrorCode, contactField: ApplePayErrorContactField, message: String) = this()
    
    /**
      * The error code for this instance.
      */
    /* CompleteClass */
    var code: ApplePayErrorCode = js.native
    
    /**
      * A localized, user-facing string that describes the error.
      */
    /* CompleteClass */
    var message: String = js.native
  }
  
  object ApplePayJS {
    
    /**
      * The ApplePayPaymentAuthorizedEvent class defines the attributes contained by the ApplePaySession.onpaymentauthorized callback function.
      */
    /* note: abstract class */ @JSGlobal("ApplePayJS.ApplePayPaymentAuthorizedEvent")
    @js.native
    open class ApplePayPaymentAuthorizedEvent ()
      extends StObject
         with typings.applepayjs.ApplePayJS.ApplePayPaymentAuthorizedEvent
    
    /**
      * The ApplePayPaymentMethodSelectedEvent class defines the attributes contained by the ApplePaySession.onpaymentmethodselected callback function.
      */
    /* note: abstract class */ @JSGlobal("ApplePayJS.ApplePayPaymentMethodSelectedEvent")
    @js.native
    open class ApplePayPaymentMethodSelectedEvent ()
      extends StObject
         with typings.applepayjs.ApplePayJS.ApplePayPaymentMethodSelectedEvent
    
    /**
      * Encapsulates the attributes contained by the onshippingcontactselected callback function.
      */
    /* note: abstract class */ @JSGlobal("ApplePayJS.ApplePayShippingContactSelectedEvent")
    @js.native
    open class ApplePayShippingContactSelectedEvent ()
      extends StObject
         with typings.applepayjs.ApplePayJS.ApplePayShippingContactSelectedEvent
    
    /**
      * Updated transaction details resulting from a change in shipping contact, including any errors.
      */
    @JSGlobal("ApplePayJS.ApplePayShippingContactUpdate")
    @js.native
    open class ApplePayShippingContactUpdate ()
      extends StObject
         with typings.applepayjs.ApplePayJS.ApplePayShippingContactUpdate {
      
      /**
        * The new total resulting from a change in the shipping contact.
        */
      /* CompleteClass */
      var newTotal: ApplePayLineItem = js.native
    }
    
    /**
      * The ApplePayShippingMethodSelectedEvent class defines the attribute contained by the ApplePaySession.onshippingmethodselected callback function.
      */
    /* note: abstract class */ @JSGlobal("ApplePayJS.ApplePayShippingMethodSelectedEvent")
    @js.native
    open class ApplePayShippingMethodSelectedEvent ()
      extends StObject
         with typings.applepayjs.ApplePayJS.ApplePayShippingMethodSelectedEvent
    
    /**
      * The attributes contained by the onvalidatemerchant callback function.
      */
    /* note: abstract class */ @JSGlobal("ApplePayJS.ApplePayValidateMerchantEvent")
    @js.native
    open class ApplePayValidateMerchantEvent ()
      extends StObject
         with typings.applepayjs.ApplePayJS.ApplePayValidateMerchantEvent
    
    /* note: abstract class */ @JSGlobal("ApplePayJS.Event")
    @js.native
    open class Event ()
      extends StObject
         with typings.applepayjs.ApplePayJS.Event
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
  open class ApplePaySession protected ()
    extends StObject
       with typings.applepayjs.ApplePaySession {
    /**
      * The entry point for Apple Pay on the web.
      * @param version - The version number of the ApplePay JS API you are using. The current API version number is 14.
      * @param paymentRequest - An ApplePayPaymentRequest object that contains the information to be displayed on the Apple Pay payment sheet.
      */
    def this(version: Double, paymentRequest: ApplePayPaymentRequest) = this()
  }
  object ApplePaySession {
    
    @JSGlobal("ApplePaySession")
    @js.native
    val ^ : js.Any = js.native
    
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
    inline def canMakePayments(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canMakePayments")().asInstanceOf[Boolean]
    
    /**
      * Indicates whether the device supports Apple Pay and whether the user has an active card in Wallet.
      * @param merchantIdentifier - The merchant ID created when the merchant enrolled in Apple Pay.
      * @returns true if the device supports Apple Pay and there is at least one active card in Wallet that is qualified for payments on the web; otherwise, false.
      */
    /* static member */
    inline def canMakePaymentsWithActiveCard(merchantIdentifier: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("canMakePaymentsWithActiveCard")(merchantIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Displays the Set up Apple Pay button.
      * @param merchantIdentifier - The merchant ID created when the merchant enrolled in Apple Pay.
      * @returns A boolean value indicating whether setup was successful.
      */
    /* static member */
    inline def openPaymentSetup(merchantIdentifier: String): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("openPaymentSetup")(merchantIdentifier.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
    
    /**
      * Verifies whether a web browser supports a given Apple Pay JS API version.
      * @param version - A number representing the Apple Pay JS API version being checked. The initial version is 1. The latest version is 3.
      * @returns A boolean value indicating whether the web browser supports the given API version. Returns false if the web browser does not support the specified version.
      */
    /* static member */
    inline def supportsVersion(version: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("supportsVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
