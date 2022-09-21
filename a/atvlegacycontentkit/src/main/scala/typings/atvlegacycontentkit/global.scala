package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StringDictionary
import typings.atvlegacycontentkit.atv.Document
import typings.atvlegacycontentkit.atv.Element
import typings.atvlegacycontentkit.atv.Node
import typings.atvlegacycontentkit.atv.player.events
import typings.atvlegacycontentkit.atv.player.states
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.HD
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.SD
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.emailAddress
import typings.atvlegacycontentkit.atvlegacycontentkitStrings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("SKPaymentTransactionState")
  @js.native
  object SKPaymentTransactionState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atvlegacycontentkit.SKPaymentTransactionState & Double] = js.native
    
    /* 4 */ val Deferred: typings.atvlegacycontentkit.SKPaymentTransactionState.Deferred & Double = js.native
    
    /* 2 */ val Failed: typings.atvlegacycontentkit.SKPaymentTransactionState.Failed & Double = js.native
    
    /* 1 */ val Purchased: typings.atvlegacycontentkit.SKPaymentTransactionState.Purchased & Double = js.native
    
    /* 0 */ val Purchasing: typings.atvlegacycontentkit.SKPaymentTransactionState.Purchasing & Double = js.native
    
    /* 3 */ val Restored: typings.atvlegacycontentkit.SKPaymentTransactionState.Restored & Double = js.native
  }
  
  // TODO: seperate the one for generate request and the actual one
  /**
    * Extend the normal XMLHttpRequest, since you can access the URL directly.
    */
  // tslint:disable-next-line:strict-export-declare-modifiers
  @JSGlobal("XMLHttpRequest")
  @js.native
  open class XMLHttpRequest ()
    extends StObject
       with typings.atvlegacycontentkit.XMLHttpRequest
  
  /**
    * The possible values of the XHR ready state.
    */
  // tslint:disable-next-line:strict-export-declare-modifiers
  @JSGlobal("XMLHttpRequestState")
  @js.native
  object XMLHttpRequestState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atvlegacycontentkit.XMLHttpRequestState & Double] = js.native
    
    /* 4 */ val DONE: typings.atvlegacycontentkit.XMLHttpRequestState.DONE & Double = js.native
    
    /* 2 */ val HEADERS_RECEIVED: typings.atvlegacycontentkit.XMLHttpRequestState.HEADERS_RECEIVED & Double = js.native
    
    /* 3 */ val LOADING: typings.atvlegacycontentkit.XMLHttpRequestState.LOADING & Double = js.native
    
    /* 1 */ val OPENED: typings.atvlegacycontentkit.XMLHttpRequestState.OPENED & Double = js.native
    
    /* 0 */ val UNSENT: typings.atvlegacycontentkit.XMLHttpRequestState.UNSENT & Double = js.native
  }
  
  // tslint:disable-next-line:strict-export-declare-modifiers
  object atv {
    
    @JSGlobal("atv")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A view that allows you to programatically build an Apple TV page, rather than simply just through loading a full document.
      */
    @JSGlobal("atv.DOMView")
    @js.native
    open class DOMView ()
      extends StObject
         with typings.atvlegacycontentkit.atv.DOMView
    
    /**
      * The full screen media browser is a carousel for photos and videos (although the previews only) that has support for comments and likes.
      */
    @JSGlobal("atv.FullScreenMediaBrowser")
    @js.native
    open class FullScreenMediaBrowser ()
      extends StObject
         with typings.atvlegacycontentkit.atv.FullScreenMediaBrowser
    
    /**
      * An image that can be displayed in either scriptViews or as an overlay.
      */
    @JSGlobal("atv.ImageView")
    @js.native
    open class ImageView ()
      extends StObject
         with typings.atvlegacycontentkit.atv.ImageView {
      
      /**
        * Adds an animation to the view.
        * @param animation The animation to add.
        * @param key A unique key for this animation, so that it can be managed later.
        */
      /* CompleteClass */
      override def addAnimation(animation: ATVAnimation, key: String): Unit = js.native
      
      /**
        * The background colour of the view.
        */
      /* CompleteClass */
      var backgroundColor: ATVColor = js.native
      
      /**
        * The frame for this view. This defines the width, height and position of the view.
        *
        * This doesn't apply for the root view in a scriptView.
        */
      /* CompleteClass */
      var frame: ATVFrame = js.native
      
      /**
        * Loads an image into the ImageView.
        * @param url The URL the image is hosted at.
        */
      /* CompleteClass */
      override def loadImageAtURL(url: String): Unit = js.native
      
      /**
        * Remove all animations from an object.
        */
      /* CompleteClass */
      override def removeAllAnimations(): Unit = js.native
      
      /**
        * Remove a specific animation from the view.
        * @param key The key of the animation to remove.
        */
      /* CompleteClass */
      override def removeAnimation(key: String): Unit = js.native
      
      /**
        * Child views of this view. They are displayed on top of the view, in the order specified (e.g. the first being the lowest).
        *
        * The frame for these children views is set as (0, 0) as being at the bottom corner of the parent frame.
        */
      /* CompleteClass */
      var subviews: js.Array[typings.atvlegacycontentkit.atv.View] = js.native
    }
    
    @JSGlobal("atv.NSLocaleAlternateQuotationBeginDelimiterKey")
    @js.native
    val NSLocaleAlternateQuotationBeginDelimiterKey: /* "kCFLocaleAlternateQuotationBeginDelimiterKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleAlternateQuotationEndDelimiterKey")
    @js.native
    val NSLocaleAlternateQuotationEndDelimiterKey: /* "kCFLocaleAlternateQuotationEndDelimiterKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleCalendar")
    @js.native
    val NSLocaleCalendar: /* "kCFLocaleCalendarKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleCollationIdentifier")
    @js.native
    val NSLocaleCollationIdentifier: /* "collation" */ String = js.native
    
    @JSGlobal("atv.NSLocaleCollatorIdentifier")
    @js.native
    val NSLocaleCollatorIdentifier: /* "kCFLocaleCollatorIdentifierKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleCountryCode")
    @js.native
    val NSLocaleCountryCode: /* "kCFLocaleCountryCodeKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleCurrencyCode")
    @js.native
    val NSLocaleCurrencyCode: /* "currency" */ String = js.native
    
    @JSGlobal("atv.NSLocaleCurrencySymbol")
    @js.native
    val NSLocaleCurrencySymbol: /* "kCFLocaleCurrencySymbolKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleDecimalSeparator")
    @js.native
    val NSLocaleDecimalSeparator: /* "kCFLocaleDecimalSeparatorKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleExemplarCharacterSet")
    @js.native
    val NSLocaleExemplarCharacterSet: /* "kCFLocaleExemplarCharacterSetKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleGroupingSeparator")
    @js.native
    val NSLocaleGroupingSeparator: /* "kCFLocaleGroupingSeparatorKey" */ String = js.native
    
    /**
      * Not sure exactly what these do. They're all subproperties of NSLocale, but NSLocale doesn't appear to be available anywhere in the JS API.
      */
    @JSGlobal("atv.NSLocaleIdentifier")
    @js.native
    val NSLocaleIdentifier: /* "kCFLocaleIdentifierKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleLanguageCode")
    @js.native
    val NSLocaleLanguageCode: /* "kCFLocaleLanguageCodeKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleMeasurementSystem")
    @js.native
    val NSLocaleMeasurementSystem: /* "kCFLocaleMeasurementSystemKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleQuotationBeginDelimiterKey")
    @js.native
    val NSLocaleQuotationBeginDelimiterKey: /* "kCFLocaleQuotationBeginDelimiterKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleQuotationEndDelimiterKey")
    @js.native
    val NSLocaleQuotationEndDelimiterKey: /* "kCFLocaleQuotationEndDelimiterKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleScriptCode")
    @js.native
    val NSLocaleScriptCode: /* "kCFLocaleScriptCodeKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleUsesMetricSystem")
    @js.native
    val NSLocaleUsesMetricSystem: /* "kCFLocaleUsesMetricSystemKey" */ String = js.native
    
    @JSGlobal("atv.NSLocaleVariantCode")
    @js.native
    val NSLocaleVariantCode: /* "kCFLocaleVariantCodeKey" */ String = js.native
    
    /**
      * A screen that displays a PIN, and/or allows a user to enter one.
      */
    @JSGlobal("atv.PINEntry")
    @js.native
    open class PINEntry ()
      extends StObject
         with typings.atvlegacycontentkit.atv.PINEntry {
      
      /**
        * Show the PIN entry screen.
        */
      /* CompleteClass */
      override def show(): Unit = js.native
    }
    
    /**
      * A menu that pops up over the current content.
      */
    @JSGlobal("atv.PopupMenu")
    @js.native
    open class PopupMenu ()
      extends StObject
         with typings.atvlegacycontentkit.atv.PopupMenu
    
    /**
      * A class that allows you to show a loader while doing work in the background, and eventually replacing it with a page.
      */
    @JSGlobal("atv.ProxyDocument")
    @js.native
    open class ProxyDocument ()
      extends StObject
         with typings.atvlegacycontentkit.atv.ProxyDocument
    
    /**
      * A dialog that allows the user to rate a media item.
      */
    @JSGlobal("atv.RatingControl")
    @js.native
    open class RatingControl ()
      extends StObject
         with typings.atvlegacycontentkit.atv.RatingControl {
      
      /**
        * Whether the user has set the rating previously or not. Basically this changes the stars from white (false) to gold (true) initially. They are always set to gold when the user adjusts
        * them.
        */
      /* CompleteClass */
      var hasUserSetRating: Boolean = js.native
      
      /**
        * The rating to have initially. Must be between 0 and 1.
        */
      /* CompleteClass */
      var rating: Double = js.native
      
      /**
        * Shows the dialog.
        */
      /* CompleteClass */
      override def show(): Unit = js.native
      
      /**
        * The title of the media item.
        */
      /* CompleteClass */
      var title: String = js.native
    }
    
    /**
      * A queue of payment transactions to be processed by the App Store.
      *
      * See https://developer.apple.com/documentation/storekit/skpaymentqueue for more information.
      */
    object SKDefaultPaymentQueue {
      
      @JSGlobal("atv.SKDefaultPaymentQueue")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Adds a payment request to the queue.
        * @param payment A payment request.
        */
      inline def addPayment(payment: SKPayment): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addPayment")(payment.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Adds an observer to the payment queue.
        * @param observer The observer to add to the queue.
        */
      inline def addTransactionObserver(observer: SKPaymentTransactionObserver): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTransactionObserver")(observer.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Indicates whether the user is allowed to make payments.
        */
      @JSGlobal("atv.SKDefaultPaymentQueue.canMakePayments")
      @js.native
      val canMakePayments: Boolean = js.native
      
      /**
        * Notifies the App Store that the app finished processing the transaction.
        * @param transaction The transaction to finish.
        */
      inline def finishTransaction(transaction: SKPaymentTransaction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("finishTransaction")(transaction.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Removes an observer from the payment queue.
        * @param observer The observer to remove.
        */
      inline def removeTransactionObserver(observer: SKPaymentTransactionObserver): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeTransactionObserver")(observer.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Asks the payment queue to restore previously completed purchases.
        */
      inline def restoreCompletedTransactions(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreCompletedTransactions")().asInstanceOf[Unit]
      
      /**
        * Asks the payment queue to restore previously completed purchases, providing an opaque identifier for the user’s account.
        * @param username An opaque identifier for the user’s account on your system.
        */
      inline def restoreCompletedTransactionsWithApplicationUsername(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreCompletedTransactionsWithApplicationUsername")().asInstanceOf[Unit]
      inline def restoreCompletedTransactionsWithApplicationUsername(username: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("restoreCompletedTransactionsWithApplicationUsername")(username.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Returns an array of pending transactions.
        */
      @JSGlobal("atv.SKDefaultPaymentQueue.transactions")
      @js.native
      val transactions: js.Array[SKPaymentTransaction] | Null = js.native
    }
    
    /**
      * Error code indicating that the client is not allowed to perform the attempted action.
      *
      * See https://developer.apple.com/documentation/storekit/skerror/code/clientinvalid for more information.
      */
    @JSGlobal("atv.SKErrorClientInvalid")
    @js.native
    val SKErrorClientInvalid: /* 1 */ Double = js.native
    
    /**
      * Error code indicating that the user canceled a payment request.
      *
      * See https://developer.apple.com/documentation/storekit/skerror/code/paymentcancelled for more information.
      */
    @JSGlobal("atv.SKErrorPaymentCancelled")
    @js.native
    val SKErrorPaymentCancelled: /* 2 */ Double = js.native
    
    /**
      * Error code indicating that one of the payment parameters wasn’t recognized by the App Store.
      *
      * See https://developer.apple.com/documentation/storekit/skerror/code/paymentinvalid for more information.
      */
    @JSGlobal("atv.SKErrorPaymentInvalid")
    @js.native
    val SKErrorPaymentInvalid: /* 3 */ Double = js.native
    
    /**
      * Error code indicating that the user is not allowed to authorize payments.
      *
      * See https://developer.apple.com/documentation/storekit/skerror/code/paymentnotallowed for more information.
      */
    @JSGlobal("atv.SKErrorPaymentNotAllowed")
    @js.native
    val SKErrorPaymentNotAllowed: /* 4 */ Double = js.native
    
    /**
      * Error code indicating that the requested product is not available in the store.
      *
      * See https://developer.apple.com/documentation/storekit/skerror/code/paymentnotallowed for more information.
      */
    @JSGlobal("atv.SKErrorStoreProductNotAvailable")
    @js.native
    val SKErrorStoreProductNotAvailable: /* 5 */ Double = js.native
    
    /**
      * The constants for some SKError types. These don't appear to be used by anything (especially since they don't cover all of the possible subsets of SKError).
      */
    /**
      * Error code indicating that an unknown or unexpected error occurred.
      *
      * See https://developer.apple.com/documentation/storekit/skerror/code/unknown for more information.
      */
    @JSGlobal("atv.SKErrorUnknown")
    @js.native
    val SKErrorUnknown: /* 0 */ Double = js.native
    
    /**
      * A copy of the constants for SKPaymentTransactionState, so they match the actual ATV JS values, but while still using the enum.
      */
    @JSGlobal("atv.SKPaymentTransactionStateDeferred")
    @js.native
    val SKPaymentTransactionStateDeferred: String | Double = js.native
    
    @JSGlobal("atv.SKPaymentTransactionStateFailed")
    @js.native
    val SKPaymentTransactionStateFailed: String | Double = js.native
    
    @JSGlobal("atv.SKPaymentTransactionStatePurchased")
    @js.native
    val SKPaymentTransactionStatePurchased: String | Double = js.native
    
    @JSGlobal("atv.SKPaymentTransactionStatePurchasing")
    @js.native
    val SKPaymentTransactionStatePurchasing: String | Double = js.native
    
    @JSGlobal("atv.SKPaymentTransactionStateRestored")
    @js.native
    val SKPaymentTransactionStateRestored: String | Double = js.native
    
    /**
      * An object that can retrieve localized information from the App Store about a specified list of products.
      *
      * See https://developer.apple.com/documentation/storekit/skproductsrequest for more information.
      */
    @JSGlobal("atv.SKProductsRequest")
    @js.native
    open class SKProductsRequest protected ()
      extends StObject
         with typings.atvlegacycontentkit.atv.SKProductsRequest {
      /**
        * Initializes the request with the set of product identifiers.
        * @param productIdentifiers The list of product identifiers for the products you wish to retrieve descriptions of.
        */
      def this(productIdentifiers: js.Array[String]) = this()
      
      /**
        * Cancels a previously started request.
        */
      /* CompleteClass */
      override def cancel(): Unit = js.native
      
      /**
        * Sends the request to the Apple App Store.
        */
      /* CompleteClass */
      override def start(): Unit = js.native
    }
    
    /**
      * Receipt properties constants
      */
    /**
      * A key whose value indicates whether the receipt is expired.
      *
      * See https://developer.apple.com/documentation/storekit/skreceiptpropertyisexpired?language=objc for more information.
      */
    @JSGlobal("atv.SKReceiptPropertyIsExpired")
    @js.native
    val SKReceiptPropertyIsExpired: /* "expired" */ String = js.native
    
    /**
      * A key whose value indicates whether the receipt has been revoked.
      *
      * See https://developer.apple.com/documentation/storekit/skreceiptpropertyisrevoked?language=objc for more information.
      */
    @JSGlobal("atv.SKReceiptPropertyIsRevoked")
    @js.native
    val SKReceiptPropertyIsRevoked: /* "revoked" */ String = js.native
    
    /**
      * A key whose value indicates whether the receipt is a Volume Purchase Plan receipt.
      *
      * See https://developer.apple.com/documentation/storekit/skreceiptpropertyisvolumepurchase?language=objc for more information.
      */
    @JSGlobal("atv.SKReceiptPropertyIsVolumePurchase")
    @js.native
    val SKReceiptPropertyIsVolumePurchase: /* "vpp" */ String = js.native
    
    /**
      * A request to refresh the receipt, which represents the user's transactions with your app.
      *
      * See https://developer.apple.com/documentation/storekit/skreceiptrefreshrequest for more information.
      */
    @JSGlobal("atv.SKReceiptRefreshRequest")
    @js.native
    open class SKReceiptRefreshRequest protected ()
      extends StObject
         with typings.atvlegacycontentkit.atv.SKReceiptRefreshRequest {
      /**
        * Initializes a receipt refresh request with optional properties.
        * @param receiptProperties The properties of the receipt.
        */
      def this(receiptProperties: StringDictionary[Any]) = this()
      
      /**
        * Cancels a previously started request.
        */
      /* CompleteClass */
      override def cancel(): Unit = js.native
      
      /**
        * Sends the request to the Apple App Store.
        */
      /* CompleteClass */
      override def start(): Unit = js.native
    }
    
    /**
      * Shows a text input field.
      */
    @JSGlobal("atv.TextEntry")
    @js.native
    open class TextEntry ()
      extends StObject
         with typings.atvlegacycontentkit.atv.TextEntry {
      
      /**
        * Shows the text entry.
        */
      /* CompleteClass */
      override def show(): Unit = js.native
      
      /**
        * The type of the field. Can either be an email address, or a password.
        */
      /* CompleteClass */
      var `type`: emailAddress | password = js.native
    }
    
    /**
      * A view that shows a piece of text.
      */
    @JSGlobal("atv.TextView")
    @js.native
    open class TextView ()
      extends StObject
         with typings.atvlegacycontentkit.atv.TextView {
      
      /**
        * Adds an animation to the view.
        * @param animation The animation to add.
        * @param key A unique key for this animation, so that it can be managed later.
        */
      /* CompleteClass */
      override def addAnimation(animation: ATVAnimation, key: String): Unit = js.native
      
      /**
        * The string to display, including formatting.
        */
      /* CompleteClass */
      var attributedString: AttributedString = js.native
      
      /**
        * The background colour of the view.
        */
      /* CompleteClass */
      var backgroundColor: ATVColor = js.native
      
      /**
        * The frame for this view. This defines the width, height and position of the view.
        *
        * This doesn't apply for the root view in a scriptView.
        */
      /* CompleteClass */
      var frame: ATVFrame = js.native
      
      /**
        * Remove all animations from an object.
        */
      /* CompleteClass */
      override def removeAllAnimations(): Unit = js.native
      
      /**
        * Remove a specific animation from the view.
        * @param key The key of the animation to remove.
        */
      /* CompleteClass */
      override def removeAnimation(key: String): Unit = js.native
      
      /**
        * Child views of this view. They are displayed on top of the view, in the order specified (e.g. the first being the lowest).
        *
        * The frame for these children views is set as (0, 0) as being at the bottom corner of the parent frame.
        */
      /* CompleteClass */
      var subviews: js.Array[typings.atvlegacycontentkit.atv.View] = js.native
    }
    
    @JSGlobal("atv.View")
    @js.native
    open class View ()
      extends StObject
         with typings.atvlegacycontentkit.atv.View {
      
      /**
        * Adds an animation to the view.
        * @param animation The animation to add.
        * @param key A unique key for this animation, so that it can be managed later.
        */
      /* CompleteClass */
      override def addAnimation(animation: ATVAnimation, key: String): Unit = js.native
      
      /**
        * The background colour of the view.
        */
      /* CompleteClass */
      var backgroundColor: ATVColor = js.native
      
      /**
        * The frame for this view. This defines the width, height and position of the view.
        *
        * This doesn't apply for the root view in a scriptView.
        */
      /* CompleteClass */
      var frame: ATVFrame = js.native
      
      /**
        * Remove all animations from an object.
        */
      /* CompleteClass */
      override def removeAllAnimations(): Unit = js.native
      
      /**
        * Remove a specific animation from the view.
        * @param key The key of the animation to remove.
        */
      /* CompleteClass */
      override def removeAnimation(key: String): Unit = js.native
      
      /**
        * Child views of this view. They are displayed on top of the view, in the order specified (e.g. the first being the lowest).
        *
        * The frame for these children views is set as (0, 0) as being at the bottom corner of the parent frame.
        */
      /* CompleteClass */
      var subviews: js.Array[typings.atvlegacycontentkit.atv.View] = js.native
    }
    
    /**
      * This hasn't been extensively tested, but it likely returns a Base64 encoded string with a StoreKit receipt.
      * @returns Likely a StoreKit reciept, Base64 encoded.
      */
    inline def appStoreReceipt(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("appStoreReceipt")().asInstanceOf[Any]
    
    /**
      * Stops a repeating function from running any more times.
      * @param handle The handle returned by setInterval which references the repeating task.
      */
    inline def clearInterval(handle: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Stops a delayed function from executing.
      * @param handle The handle returned by setTimeout which references the task.
      */
    inline def clearTimeout(handle: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(handle.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * The global configuration for this app.
      */
    @JSGlobal("atv.config")
    @js.native
    def config: ATVJSConfig = js.native
    inline def config_=(x: ATVJSConfig): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
    
    /**
      * A namespace containing objects to generate various hashes.
      */
    object crypto {
      
      @JSGlobal("atv.crypto")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Generate a MD5 hash of the data.
        * @param data The data you wish to hash.
        * @returns The hash of the data.
        */
      inline def MD5(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("MD5")(data.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Generate a SHA1 hash of the data.
        * @param data The data you wish to hash.
        * @returns The hash of the data.
        */
      inline def SHA1(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("SHA1")(data.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Generate a SHA224 hash of the data.
        * @param data The data you wish to hash.
        * @returns The hash of the data.
        */
      inline def SHA224(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("SHA224")(data.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Generate a SHA256 hash of the data.
        * @param data The data you wish to hash.
        * @returns The hash of the data.
        */
      inline def SHA256(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("SHA256")(data.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Generate a SHA384 hash of the data.
        * @param data The data you wish to hash.
        * @returns The hash of the data.
        */
      inline def SHA384(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("SHA384")(data.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Generate a SHA512 hash of the data.
        * @param data The data you wish to hash.
        * @returns The hash of the data.
        */
      inline def SHA512(data: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("SHA512")(data.asInstanceOf[js.Any]).asInstanceOf[String]
    }
    
    /**
      * Dumps the current controller stack to the syslog.
      */
    inline def debugDumpControllerStack(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_debugDumpControllerStack")().asInstanceOf[Unit]
    
    /**
      * Information about the physical device the app is running on.
      */
    object device {
      
      /**
        * The display name of the device, set by the user.
        */
      @JSGlobal("atv.device.displayName")
      @js.native
      val displayName: String = js.native
      
      /**
        * A UUID that is unique to this combination of device and app.
        */
      @JSGlobal("atv.device.idForVendor")
      @js.native
      val idForVendor: String = js.native
      
      /**
        * Whether the device is in retail demo mode or not.
        */
      @JSGlobal("atv.device.isInRetailDemoMode")
      @js.native
      val isInRetailDemoMode: Boolean = js.native
      
      /**
        * The language of the Apple TV, in ISO 639-1 format.
        */
      @JSGlobal("atv.device.language")
      @js.native
      val language: String = js.native
      
      /**
        * Which video format the user prefers, set via iTunes settings. This can either be SD (Standard Definition), or HD (either 720p, or 1080p).
        */
      @JSGlobal("atv.device.preferredVideoFormat")
      @js.native
      val preferredVideoFormat: HD | SD = js.native
      
      /**
        * Which video format the user prefers for previews, set via iTunes settings. This can either be SD (Standard Definition), or HD.
        */
      @JSGlobal("atv.device.preferredVideoPreviewFormat")
      @js.native
      val preferredVideoPreviewFormat: HD | SD = js.native
      
      /**
        * The frame of the current screen.
        */
      @JSGlobal("atv.device.screenFrame")
      @js.native
      val screenFrame: ATVFrame = js.native
      
      /**
        * The version of the Apple TV Software, e.g. 7.7.
        * This is not the same as the underlying iOS version!
        */
      @JSGlobal("atv.device.softwareVersion")
      @js.native
      val softwareVersion: String = js.native
      
      /**
        * A two character country code that is the country the Apple TV is set to, e.g. NZ.
        */
      @JSGlobal("atv.device.storeFrontCountryCode")
      @js.native
      val storeFrontCountryCode: String = js.native
      
      /**
        * Get the UDID of the Apple TV.
        */
      @JSGlobal("atv.device.udid")
      @js.native
      val udid: String = js.native
    }
    
    /**
      * Exit the app.
      */
    inline def exitApp(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("exitApp")().asInstanceOf[Unit]
    
    /**
      * Get the ITMS link for iTunes Store content. Usually this seems to be in feed-resources, which is then piped into localStorage, so this method would typically return the ITMS URL from
      * localStorage.
      */
    @JSGlobal("atv.getItmsLink")
    @js.native
    def getItmsLink: (js.Function0[String | Null]) | Null = js.native
    inline def getItmsLink_=(x: (js.Function0[String | Null]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getItmsLink")(x.asInstanceOf[js.Any])
    
    /**
      * Whether the user is logged in to iTunes or not.
      */
    inline def isITunesAuthentication(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isITunesAuthentication")().asInstanceOf[Boolean]
    
    /**
      * Load and swap (i.e. remove the original page from the controller stack and replace it with this one) the page based on a plist.
      *
      * See https://github.com/SheaSmith/atv.js/wiki/Plist-findings for more information.
      * @param plist The plist to replace the page with.
      */
    inline def loadAndSwapPlist(plist: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapPlist")(plist.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loadAndSwapPlist(plist: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapPlist")(plist.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Load and swap (i.e. remove the original page from the controller stack and replace it with this one) the page based on a URL pointing to an XML template.
      *
      * See the XML documentation for more information.
      * @param url The URL of the XML template.
      * @param method The method to use to access the URL.
      * @param headers The headers to include with the request.
      * @param body The body to send with the request (if applicable).
      */
    inline def loadAndSwapURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: String, headers: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: String, headers: StringDictionary[String], body: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: String, headers: StringDictionary[String], body: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: String, headers: Unit, body: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: String, headers: Unit, body: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: Unit, headers: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: Unit, headers: StringDictionary[String], body: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: Unit, headers: StringDictionary[String], body: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: Unit, headers: Unit, body: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadAndSwapURL(url: String, method: Unit, headers: Unit, body: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Load and swap (i.e. remove the original page from the controller stack and replace it with this one) the page based on a parsed XML template, or node.
      *
      * See the XML documentation for more information.
      * @param xml The parent node, containing the XML tree to replace the current page with.
      * @param callback A callback called when the page has been swapped, and if it was successful.
      */
    inline def loadAndSwapXML(xml: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapXML")(xml.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loadAndSwapXML(xml: Node, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadAndSwapXML")(xml.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Load the specified plist onto the controller stack and view it.
      *
      * See https://github.com/SheaSmith/atv.js/wiki/Plist-findings for more information.
      * @param plist The plist to display.
      */
    inline def loadPlist(plist: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlist")(plist.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loadPlist(plist: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadPlist")(plist.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Load a page based on a URL pointing to an XML template.
      *
      * See the XML documentation for more information.
      * @param url The URL of the XML template.
      * @param method The method to use to access the URL.
      * @param headers The headers to include with the request.
      * @param body The body to send with the request (if applicable).
      */
    inline def loadURL(url: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loadURL(url: String, method: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: String, headers: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: String, headers: StringDictionary[String], body: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: String, headers: StringDictionary[String], body: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: String, headers: Unit, body: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: String, headers: Unit, body: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: Unit, headers: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: Unit, headers: StringDictionary[String], body: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: Unit, headers: StringDictionary[String], body: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: Unit, headers: Unit, body: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def loadURL(url: String, method: Unit, headers: Unit, body: StringDictionary[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadURL")(url.asInstanceOf[js.Any], method.asInstanceOf[js.Any], headers.asInstanceOf[js.Any], body.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Load a page based on a parsed XML template / Node.
      *
      * See the XML documentation for more information.
      * @param xml The parent node, containing the XML tree to replace the current page with.
      * @param callback A callback called when the page has been swapped, and if it was successful.
      */
    inline def loadXML(xml: Node): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("loadXML")(xml.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def loadXML(xml: Node, callback: js.Function1[/* success */ Boolean, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("loadXML")(xml.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Store data for this app that persists across sessions. This is essentially permanent, unless it is cleared.
      */
    @JSGlobal("atv.localStorage")
    @js.native
    val localStorage: ATVStorage = js.native
    
    /**
      * Format the supplied date into the specified format.
      * @param date The date you wish to format.
      * @param format The format you wish to use. The specification can be found at http://unicode.org/reports/tr35/tr35-6.html#Date_Format_Patterns.
      */
    inline def localtime(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localtime")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Log the user out, deleting their stored authentication information.
      */
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
    
    /**
      * Functions to do with the currently playing item.
      */
    @JSGlobal("atv.nowPlaying")
    @js.native
    val nowPlaying: ATVNowPlaying | Null = js.native
    
    /**
      * Called when the app is opened. If doesJavaScriptLoadRoot is true then it is reponsible for loading the initial page.
      */
    @JSGlobal("atv.onAppEntry")
    @js.native
    def onAppEntry: js.Function0[Unit] | Null = js.native
    inline def onAppEntry_=(x: js.Function0[Unit] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAppEntry")(x.asInstanceOf[js.Any])
    
    /**
      * Called when the app is exited. This isn't called when the app is closed by the user, rather the app is exited when another app (including this one) is opened.
      */
    @JSGlobal("atv.onAppExit")
    @js.native
    def onAppExit: js.Function0[Unit] | Null = js.native
    inline def onAppExit_=(x: js.Function0[Unit] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAppExit")(x.asInstanceOf[js.Any])
    
    /**
      * The callback called when a login attempt needs to happen.
      *
      * This can happen in three situations
      * 1. The user actively tries to login either by signing out and then back in, or on first login.
      * 2. The server returns a 401, so the app tries to silently login again.
      * 3. The stored credentials are invalid and a silent login fails, so the user needs to sign in again.
      *
      * Do not save the username or password. The Apple TV will do this for you.
      *
      * This method should not block. You must notify the Apple TV of *all* results with the callback, or else the login will hang for the user.
      */
    @JSGlobal("atv.onAuthenticate")
    @js.native
    def onAuthenticate: (js.Function3[
        /* username */ String, 
        /* password */ String, 
        /* callback */ ATVAuthenticationCallback, 
        Unit
      ]) | Null = js.native
    inline def onAuthenticate_=(
      x: (js.Function3[
          /* username */ String, 
          /* password */ String, 
          /* callback */ ATVAuthenticationCallback, 
          Unit
        ]) | Null
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAuthenticate")(x.asInstanceOf[js.Any])
    
    /**
      * This is called every time the Apple TV wants screensavers.
      */
    @JSGlobal("atv.onExecuteQuery")
    @js.native
    def onExecuteQuery: (js.Function2[/* query */ ATVScreenSaverQuery, /* callback */ ATVScreenSaverCallback, Unit]) | Null = js.native
    inline def onExecuteQuery_=(
      x: (js.Function2[/* query */ ATVScreenSaverQuery, /* callback */ ATVScreenSaverCallback, Unit]) | Null
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onExecuteQuery")(x.asInstanceOf[js.Any])
    
    /**
      * The callback called whenever the Apple TV is about to send a request.
      */
    @JSGlobal("atv.onGenerateRequest")
    @js.native
    def onGenerateRequest: (js.Function1[/* request */ ATVHttpRequest, Unit]) | Null = js.native
    inline def onGenerateRequest_=(x: (js.Function1[/* request */ ATVHttpRequest, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onGenerateRequest")(x.asInstanceOf[js.Any])
    
    /**
      * Called when the user is logged out. This can be used to remove any user specific data from local or session storage.
      */
    @JSGlobal("atv.onLogout")
    @js.native
    def onLogout: js.Function0[Unit] | Null = js.native
    inline def onLogout_=(x: js.Function0[Unit] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLogout")(x.asInstanceOf[js.Any])
    
    /**
      * A callback that seems to be related to an unreleased Universal Search feature. This only appears in PBS applications, but is listed in strings files for ATVLegacyContentKit, so seems
      * legitimate.
      *
      * Alternatively, it's a method to allow legacy applications to integrate with the Apple TV 4 search, but it's hard to tell.
      *
      * Essentially, it is for apps to open a page when linked with a normal URL.
      */
    @JSGlobal("atv.onOpenURL")
    @js.native
    def onOpenURL: (js.Function1[/* options */ ATVDeepLinkOptions, Unit]) | Null = js.native
    inline def onOpenURL_=(x: (js.Function1[/* options */ ATVDeepLinkOptions, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOpenURL")(x.asInstanceOf[js.Any])
    
    /**
      * Called whenever a new page is pushed on top of this page. Page identifier is the ID of the first element in the body.
      *
      * If you've got this in an application level JS (i.e. the one defined in bag.plist) and in a page level JS (i.e. the one defined in the head of the page), then this will be called in both of
      * them.
      */
    @JSGlobal("atv.onPageBuried")
    @js.native
    def onPageBuried: (js.Function1[/* pageIdentifier */ String, Unit]) | Null = js.native
    inline def onPageBuried_=(x: (js.Function1[/* pageIdentifier */ String, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPageBuried")(x.asInstanceOf[js.Any])
    
    /**
      * Called whenever a page that was previously open is brought on top of the stack again. Page identifier is the ID of the first element in the body.
      *
      * If you've got this in an application level JS (i.e. the one defined in bag.plist) and in a page level JS (i.e. the one defined in the head of the page), then this will be called in both of
      * them.
      */
    @JSGlobal("atv.onPageExhumed")
    @js.native
    def onPageExhumed: (js.Function1[/* pageIdentifier */ String, Unit]) | Null = js.native
    inline def onPageExhumed_=(x: (js.Function1[/* pageIdentifier */ String, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPageExhumed")(x.asInstanceOf[js.Any])
    
    /**
      * Called whenever a page is loaded. Page identifier is the ID of the first element in the body.
      */
    @JSGlobal("atv.onPageLoad")
    @js.native
    def onPageLoad: (js.Function1[/* pageIdentifier */ String, Unit]) | Null = js.native
    inline def onPageLoad_=(x: (js.Function1[/* pageIdentifier */ String, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPageLoad")(x.asInstanceOf[js.Any])
    
    /**
      * Called whenever a page is unloaded. Page identifier is the ID of the first element in the body.
      *
      * If you've got this in an application level JS (i.e. the one defined in bag.plist) and in a page level JS (i.e. the one defined in the head of the page), then this will be called in both of
      * them.
      */
    @JSGlobal("atv.onPageUnload")
    @js.native
    def onPageUnload: (js.Function1[/* pageIdentifier */ String, Unit]) | Null = js.native
    inline def onPageUnload_=(x: (js.Function1[/* pageIdentifier */ String, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPageUnload")(x.asInstanceOf[js.Any])
    
    /**
      * Called whenever the Apple TV requests some screensavers from the app. It is likely that this needs to be accompanied with the appropriate items in bag.plist.
      * This simply returns a list of available screensavers for this app. This is done via a callback function (atv.setScreensaverPhotosCollection).
      */
    @JSGlobal("atv.onScreensaverPhotosSelectionEntry")
    @js.native
    def onScreensaverPhotosSelectionEntry: js.Function0[Unit] | Null = js.native
    inline def onScreensaverPhotosSelectionEntry_=(x: js.Function0[Unit] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onScreensaverPhotosSelectionEntry")(x.asInstanceOf[js.Any])
    
    /**
      * The user has finished selecting a screensaver.
      */
    @JSGlobal("atv.onScreensaverPhotosSelectionExit")
    @js.native
    def onScreensaverPhotosSelectionExit: js.Function0[Unit] | Null = js.native
    inline def onScreensaverPhotosSelectionExit_=(x: js.Function0[Unit] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onScreensaverPhotosSelectionExit")(x.asInstanceOf[js.Any])
    
    /**
      * Parses a Plist into an object. Essentially turning the 'dict' section into a JSON object.
      * @param plist The string of the plist to parse.
      */
    inline def parsePlist(plist: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parsePlist")(plist.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    /**
      * Parses an ATV XML string into a document.
      * @param xml The XML to parse.
      */
    inline def parseXML(xml: String): Document = ^.asInstanceOf[js.Dynamic].applyDynamic("parseXML")(xml.asInstanceOf[js.Any]).asInstanceOf[Document]
    
    /**
      * Player related callbacks and functions. Please note, this is only available in application level contexts.
      */
    object player {
      
      @JSGlobal("atv.player")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * The currently playing asset.
        */
      @JSGlobal("atv.player.asset")
      @js.native
      val asset: Element | Null = js.native
      
      /**
        * Change the currently playing asset.
        * @param newAsset An element containing the new asset to play.
        */
      inline def changeToAsset(newAsset: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("changeToAsset")(newAsset.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * Convert from gross time to net time. Essentially the gross time is the total time watched of the clip, including interstitials, but net time is the time watched minus any time taken by
        * the interstitials.
        * @param grossTime The gross time you want to convert.
        */
      inline def convertGrossToNetTime(grossTime: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertGrossToNetTime")(grossTime.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Convert from net time to gross time.  Essentially the gross time is the total time watched of the clip, including interstitials, but net time is the time watched minus any time taken by
        * the interstitials.
        * @param netTime The net time you want to convert.
        */
      inline def convertNetToGrossTime(netTime: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("convertNetToGrossTime")(netTime.asInstanceOf[js.Any]).asInstanceOf[Double]
      
      /**
        * Called when the asset being played changes (e.g. if a song in a playlist ends and the next one begins).
        */
      @JSGlobal("atv.player.currentAssetChanged")
      @js.native
      def currentAssetChanged: js.Function0[Unit] | Null = js.native
      inline def currentAssetChanged_=(x: js.Function0[Unit] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("currentAssetChanged")(x.asInstanceOf[js.Any])
      
      /**
        * Get information about the current item playing.
        *
        * This appears to be a special property solely used by the Apple TV+ app. Some properties can be used for quick access to things that might otherwise need queried out, but in general most
        * of the child items are specific to that app.
        */
      @JSGlobal("atv.player.currentItem")
      @js.native
      val currentItem: ATVPlayerItem | Null = js.native
      
      /**
        * The current playback date.
        */
      @JSGlobal("atv.player.currentPlaybackDate")
      @js.native
      val currentPlaybackDate: js.Date | Null = js.native
      
      /**
        * The rate of playback. This is 0 for paused, 1 for normal playback, 2 for single fast forward, etc.
        */
      @JSGlobal("atv.player.currentPlaybackRate")
      @js.native
      val currentPlaybackRate: Double | Null = js.native
      
      /**
        * The user has selected an audio track. The language is the short string associated with the language choice (e.g. en).
        */
      @JSGlobal("atv.player.didSelectAudioTrack")
      @js.native
      def didSelectAudioTrack: (js.Function1[/* language */ String, Unit]) | Null = js.native
      inline def didSelectAudioTrack_=(x: (js.Function1[/* language */ String, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("didSelectAudioTrack")(x.asInstanceOf[js.Any])
      
      /**
        * The user has selected a subtitle track. The subtitle parameter is an object describing their chosen subtitle.
        */
      @JSGlobal("atv.player.didSelectSubtitleTrack")
      @js.native
      def didSelectSubtitleTrack: (js.Function1[/* subtitle */ ATVSubtitle, Unit]) | Null = js.native
      inline def didSelectSubtitleTrack_=(x: (js.Function1[/* subtitle */ ATVSubtitle, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("didSelectSubtitleTrack")(x.asInstanceOf[js.Any])
      
      /**
        * Called when the player has been stopped.
        */
      @JSGlobal("atv.player.didStopPlaying")
      @js.native
      def didStopPlaying: js.Function0[Unit] | Null = js.native
      inline def didStopPlaying_=(x: js.Function0[Unit] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("didStopPlaying")(x.asInstanceOf[js.Any])
      
      /**
        * A list of the event groups. The elements list contains a list of elements parsed from the supplied event groups files, so all elements will be of type eventGroup.
        *
        * These display on the player as a series of lines. Additionally, the first part of the transport controls, usually where the time watched appears will display the event group title (if
        * supplied). Skipping between events will show the information about the event as a popup.
        */
      @JSGlobal("atv.player.eventGroups")
      @js.native
      val eventGroups: js.Array[Element] | Null = js.native
      
      /**
        * Specific events for the player. Usually triggered by the remote;
        */
      @JSGlobal("atv.player.events")
      @js.native
      object events extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.atvlegacycontentkit.atv.player.events & String] = js.native
        
        /* "FFwd" */ val FFwd: typings.atvlegacycontentkit.atv.player.events.FFwd & String = js.native
        
        /* "Pause" */ val Pause: typings.atvlegacycontentkit.atv.player.events.Pause & String = js.native
        
        /* "Play" */ val Play: typings.atvlegacycontentkit.atv.player.events.Play & String = js.native
        
        /* "Rew" */ val Rew: typings.atvlegacycontentkit.atv.player.events.Rew & String = js.native
        
        /* "SkipFwd" */ val SkipFwd: typings.atvlegacycontentkit.atv.player.events.SkipFwd & String = js.native
        
        /* "SkipBack" */ val SwipBack: typings.atvlegacycontentkit.atv.player.events.SwipBack & String = js.native
      }
      
      /**
        * A list of the interstitials. These are similar to event groups in how they are defined, but essentially, they display as
        */
      @JSGlobal("atv.player.interstitials")
      @js.native
      val interstitials: js.Array[Element] | Null = js.native
      
      /**
        * Called when the player asks for a new asset (e.g. the next one to be played).
        */
      @JSGlobal("atv.player.loadMoreAssets")
      @js.native
      def loadMoreAssets: (js.Function1[/* callback */ ATVLoadMoreAssetsCallback, Unit]) | Null = js.native
      inline def loadMoreAssets_=(x: (js.Function1[/* callback */ ATVLoadMoreAssetsCallback, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadMoreAssets")(x.asInstanceOf[js.Any])
      
      /**
        * The player has asked for related content to be loaded. If there is already an item queued, it is supplied as the upNextAsset parameter.
        */
      @JSGlobal("atv.player.loadRelatedContent")
      @js.native
      def loadRelatedContent: (js.Function2[/* upNextAsset */ Element, /* callback */ ATVLoadMoreAssetsCallback, Unit]) | Null = js.native
      inline def loadRelatedContent_=(
        x: (js.Function2[/* upNextAsset */ Element, /* callback */ ATVLoadMoreAssetsCallback, Unit]) | Null
      ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("loadRelatedContent")(x.asInstanceOf[js.Any])
      
      /**
        * Unclear what this does. Possibly instructs the player to send onTimedMetadataChanged updates.
        */
      inline def observeTimedMetadataKeys(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("observeTimedMetadataKeys")().asInstanceOf[Unit]
      
      /**
        * Called when there is enough of the asset buffered to continue playing it.
        */
      @JSGlobal("atv.player.onBufferSufficientToPlay")
      @js.native
      def onBufferSufficientToPlay: js.Function0[Unit] | Null = js.native
      inline def onBufferSufficientToPlay_=(x: js.Function0[Unit] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBufferSufficientToPlay")(x.asInstanceOf[js.Any])
      
      /**
        * Called when there is an error with the player. The error is a debug message and should not be shown to the user.
        */
      @JSGlobal("atv.player.onPlaybackError")
      @js.native
      def onPlaybackError: (js.Function1[/* error */ String, Unit]) | Null = js.native
      inline def onPlaybackError_=(x: (js.Function1[/* error */ String, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onPlaybackError")(x.asInstanceOf[js.Any])
      
      /**
        * Called when there is quality of service report available. Seems to only be logs.
        */
      @JSGlobal("atv.player.onQualityOfServiceReport")
      @js.native
      def onQualityOfServiceReport: (js.Function1[/* report */ ATVQualityOfServiceReport, Unit]) | Null = js.native
      inline def onQualityOfServiceReport_=(x: (js.Function1[/* report */ ATVQualityOfServiceReport, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onQualityOfServiceReport")(x.asInstanceOf[js.Any])
      
      /**
        * Called when the player starts buffering. The playhead location is how much of the video has been played in seconds.
        */
      @JSGlobal("atv.player.onStartBuffering")
      @js.native
      def onStartBuffering: (js.Function1[/* playheadLocation */ Double, Unit]) | Null = js.native
      inline def onStartBuffering_=(x: (js.Function1[/* playheadLocation */ Double, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onStartBuffering")(x.asInstanceOf[js.Any])
      
      /**
        * The ID3 metadata for this video has changed.
        */
      @JSGlobal("atv.player.onTimedMetdataChanged")
      @js.native
      def onTimedMetdataChanged: (js.Function1[/* metadata */ AVMetadataItem, Unit]) | Null = js.native
      inline def onTimedMetdataChanged_=(x: (js.Function1[/* metadata */ AVMetadataItem, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTimedMetdataChanged")(x.asInstanceOf[js.Any])
      
      /**
        * The video controls (e.g. the progress bar) are going to be displayed. Animation duration is the length of the animation to fade in the controls.
        */
      @JSGlobal("atv.player.onTransportControlsDisplayed")
      @js.native
      def onTransportControlsDisplayed: (js.Function1[/* animationDuration */ Double, Unit]) | Null = js.native
      inline def onTransportControlsDisplayed_=(x: (js.Function1[/* animationDuration */ Double, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTransportControlsDisplayed")(x.asInstanceOf[js.Any])
      
      /**
        * The video controls (e.g. the progress bar) are going to be hidden. Animation duration is the length of the animation to fade out the controls.
        */
      @JSGlobal("atv.player.onTransportControlsHidden")
      @js.native
      def onTransportControlsHidden: (js.Function1[/* animationDuration */ Double, Unit]) | Null = js.native
      inline def onTransportControlsHidden_=(x: (js.Function1[/* animationDuration */ Double, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onTransportControlsHidden")(x.asInstanceOf[js.Any])
      
      /**
        * Start playing the asset.
        */
      inline def play(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("play")().asInstanceOf[Unit]
      
      /**
        * The current date has changed. This basically just reports the passage of time every second or so.
        */
      @JSGlobal("atv.player.playerDateDidChange")
      @js.native
      def playerDateDidChange: (js.Function1[/* date */ js.Date, Unit]) | Null = js.native
      inline def playerDateDidChange_=(x: (js.Function1[/* date */ js.Date, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playerDateDidChange")(x.asInstanceOf[js.Any])
      
      /**
        * Whether the player should handle an event. The event parameter describes what event is being requested and the playhead location is how much of the asset has been viewed in seconds.
        */
      @JSGlobal("atv.player.playerShouldHandleEvent")
      @js.native
      def playerShouldHandleEvent: (js.Function2[/* event */ events, /* playheadLocation */ Double, Boolean]) | Null = js.native
      inline def playerShouldHandleEvent_=(x: (js.Function2[/* event */ events, /* playheadLocation */ Double, Boolean]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playerShouldHandleEvent")(x.asInstanceOf[js.Any])
      
      /**
        * Called when the state of the player changes. The state is the new state of the player and the playhead location is how much of the asset has been viewed in seconds.
        */
      @JSGlobal("atv.player.playerStateChanged")
      @js.native
      def playerStateChanged: (js.Function2[/* state */ states, /* playheadLocation */ Double, Unit]) | Null = js.native
      inline def playerStateChanged_=(x: (js.Function2[/* state */ states, /* playheadLocation */ Double, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playerStateChanged")(x.asInstanceOf[js.Any])
      
      /**
        * The playhead location has changed. This either happens when it has been specifically moved by the user (e.g. skipping, fast forward or rewinding) or regularly as the asset is played.
        */
      @JSGlobal("atv.player.playerTimeDidChange")
      @js.native
      def playerTimeDidChange: (js.Function1[/* playheadLocation */ Double, Unit]) | Null = js.native
      inline def playerTimeDidChange_=(x: (js.Function1[/* playheadLocation */ Double, Unit]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playerTimeDidChange")(x.asInstanceOf[js.Any])
      
      /**
        * Called when the player is seeking to a specific time in seconds. This method should return the time the player should seek to. If you want to use the one set by the user, just return
        * the time supplied.
        */
      @JSGlobal("atv.player.playerWillSeekToTime")
      @js.native
      def playerWillSeekToTime: (js.Function1[/* time */ Double, Double]) | Null = js.native
      inline def playerWillSeekToTime_=(x: (js.Function1[/* time */ Double, Double]) | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("playerWillSeekToTime")(x.asInstanceOf[js.Any])
      
      /**
        * The different states that the player can have.
        */
      @JSGlobal("atv.player.states")
      @js.native
      object states extends StObject {
        
        @JSBracketAccess
        def apply(value: String): js.UndefOr[typings.atvlegacycontentkit.atv.player.states & String] = js.native
        
        /* "FastForwarding" */ val FastForwarding: typings.atvlegacycontentkit.atv.player.states.FastForwarding & String = js.native
        
        /* "Loading" */ val Loading: typings.atvlegacycontentkit.atv.player.states.Loading & String = js.native
        
        /* "Paused" */ val Paused: typings.atvlegacycontentkit.atv.player.states.Paused & String = js.native
        
        /* "Playing" */ val Playing: typings.atvlegacycontentkit.atv.player.states.Playing & String = js.native
        
        /* "Rewinding" */ val Rewinding: typings.atvlegacycontentkit.atv.player.states.Rewinding & String = js.native
        
        /* "Stopped" */ val Stopped: typings.atvlegacycontentkit.atv.player.states.Stopped & String = js.native
      }
      
      /**
        * Stop the player and return to the previous screen.
        */
      inline def stop(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stop")().asInstanceOf[Unit]
      
      /**
        * Stops the player, but shows the user an error screen with the reasons.
        * @param title The title of the error to show.
        * @param subtitle The subtitle of the error to show.
        */
      inline def stopWithReason(title: String, subtitle: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("stopWithReason")(title.asInstanceOf[js.Any], subtitle.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      /**
        * Called before the playback starts.
        */
      @JSGlobal("atv.player.willStartPlaying")
      @js.native
      def willStartPlaying: js.Function0[Unit] | Null = js.native
      inline def willStartPlaying_=(x: js.Function0[Unit] | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("willStartPlaying")(x.asInstanceOf[js.Any])
    }
    
    /**
      * Several listeners for dealing with FairPlay encrypted content.
      */
    @JSGlobal("atv.secureKeyDelivery")
    @js.native
    val secureKeyDelivery: ATVSecureKeyDelivery | Null = js.native
    
    /**
      * Store data for this app that persists only in the current app session, so is cleared on exit.
      */
    @JSGlobal("atv.sessionStorage")
    @js.native
    val sessionStorage: ATVStorage = js.native
    
    /**
      * Start a repeating task.
      * @param callback The function called when the task repeats.
      * @param ms How long you want between tasks.
      * @param args Arguments you wish to supply to the callback.
      */
    inline def setInterval[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def setInterval[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * Set the screensaver collection that is shown in settings.
      * @param collection The collection to set.
      */
    inline def setScreensaverPhotosCollection(collection: ATVScreenSaverCollection): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setScreensaverPhotosCollection")(collection.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Run a function after a specified amount of time.
      * @param callback The function called when the time is up.
      * @param ms How long you wish to delay.
      * @param args Arguments you wish to pass to the function.
      */
    inline def setTimeout[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
    
    /**
      * The credentials saved at the last login.
      */
    @JSGlobal("atv.sharedCredentials")
    @js.native
    val sharedCredentials: ATVSavedCredentials | Null = js.native
    
    /**
      * Scrolls the user down to the bottom shelf on an item detail page. Will throw an exception if used elsewhere.
      */
    inline def showMoreInfo(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showMoreInfo")().asInstanceOf[Unit]
    
    /**
      * A slideshow view for photos and videos.
      */
    @JSGlobal("atv.slideShow")
    @js.native
    val slideShow: ATVJSSlideShow = js.native
    
    /**
      * Unloads the current page.
      */
    inline def unloadPage(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("unloadPage")().asInstanceOf[Unit]
    
    /**
      * Generates a UUID.
      */
    inline def uuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uuid")().asInstanceOf[String]
  }
  
  // tslint:disable-next-line:strict-export-declare-modifiers
  @JSGlobal("console")
  @js.native
  val console: Console = js.native
  
  // tslint:disable-next-line:strict-export-declare-modifiers
  @JSGlobal("controller")
  @js.native
  val controller: ATVController = js.native
  
  // tslint:disable-next-line:strict-export-declare-modifiers
  @JSGlobal("document")
  @js.native
  val document: Document = js.native
}
