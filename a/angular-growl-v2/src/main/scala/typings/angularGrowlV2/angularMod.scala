package typings.angularGrowlV2

import org.scalablytyped.runtime.StringDictionary
import typings.angular.JQLite
import typings.angular.mod.IAttributes
import typings.angular.mod.IController
import typings.angular.mod.IDirective
import typings.angular.mod.IHttpInterceptorFactory
import typings.angular.mod.IScope
import typings.angular.mod.IServiceProvider
import typings.angular.mod.global.Function
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object growl {
    
    /**
      * Growl message with configuration.
      */
    trait IGrowlMessage
      extends StObject
         with IGrowlMessageConfig {
      
      /**
        * Destroy the message.
        */
      def destroy(): Unit
      
      /**
        * Update the message body.
        * @param newText new message body
        */
      def setText(newText: String): Unit
      
      var text: String
    }
    object IGrowlMessage {
      
      inline def apply(destroy: () => Unit, setText: String => Unit, text: String): IGrowlMessage = {
        val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setText = js.Any.fromFunction1(setText), text = text.asInstanceOf[js.Any])
        __obj.asInstanceOf[IGrowlMessage]
      }
      
      extension [Self <: IGrowlMessage](x: Self) {
        
        inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
        
        inline def setSetText(value: String => Unit): Self = StObject.set(x, "setText", js.Any.fromFunction1(value))
        
        inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      }
    }
    
    /**
      * Custom configuration used in single message call.
      */
    trait IGrowlMessageConfig extends StObject {
      
      var disableCloseButton: js.UndefOr[Boolean] = js.undefined
      
      var disableCountDown: js.UndefOr[Boolean] = js.undefined
      
      var disableIcons: js.UndefOr[Boolean] = js.undefined
      
      var onclose: js.UndefOr[Function] = js.undefined
      
      var onopen: js.UndefOr[Function] = js.undefined
      
      var position: js.UndefOr[String] = js.undefined
      
      var referenceId: js.UndefOr[Double] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var translateMessage: js.UndefOr[Boolean] = js.undefined
      
      var ttl: js.UndefOr[Double] = js.undefined
      
      var variables: js.UndefOr[StringDictionary[Any]] = js.undefined
    }
    object IGrowlMessageConfig {
      
      inline def apply(): IGrowlMessageConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGrowlMessageConfig]
      }
      
      extension [Self <: IGrowlMessageConfig](x: Self) {
        
        inline def setDisableCloseButton(value: Boolean): Self = StObject.set(x, "disableCloseButton", value.asInstanceOf[js.Any])
        
        inline def setDisableCloseButtonUndefined: Self = StObject.set(x, "disableCloseButton", js.undefined)
        
        inline def setDisableCountDown(value: Boolean): Self = StObject.set(x, "disableCountDown", value.asInstanceOf[js.Any])
        
        inline def setDisableCountDownUndefined: Self = StObject.set(x, "disableCountDown", js.undefined)
        
        inline def setDisableIcons(value: Boolean): Self = StObject.set(x, "disableIcons", value.asInstanceOf[js.Any])
        
        inline def setDisableIconsUndefined: Self = StObject.set(x, "disableIcons", js.undefined)
        
        inline def setOnclose(value: Function): Self = StObject.set(x, "onclose", value.asInstanceOf[js.Any])
        
        inline def setOncloseUndefined: Self = StObject.set(x, "onclose", js.undefined)
        
        inline def setOnopen(value: Function): Self = StObject.set(x, "onopen", value.asInstanceOf[js.Any])
        
        inline def setOnopenUndefined: Self = StObject.set(x, "onopen", js.undefined)
        
        inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
        
        inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
        
        inline def setReferenceId(value: Double): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
        
        inline def setReferenceIdUndefined: Self = StObject.set(x, "referenceId", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setTranslateMessage(value: Boolean): Self = StObject.set(x, "translateMessage", value.asInstanceOf[js.Any])
        
        inline def setTranslateMessageUndefined: Self = StObject.set(x, "translateMessage", js.undefined)
        
        inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
        
        inline def setTtlUndefined: Self = StObject.set(x, "ttl", js.undefined)
        
        inline def setVariables(value: StringDictionary[Any]): Self = StObject.set(x, "variables", value.asInstanceOf[js.Any])
        
        inline def setVariablesUndefined: Self = StObject.set(x, "variables", js.undefined)
      }
    }
    
    /**
      * GrowlMessages service.
      */
    @js.native
    trait IGrowlMessagesService extends StObject {
      
      /**
        * Add a message
        */
      def addMessage(message: IGrowlMessage): IGrowlMessage = js.native
      
      /**
        * Delete a message
        */
      def deleteMessage(message: IGrowlMessage): Unit = js.native
      
      /**
        * Destroy all messages
        */
      def destroyAllMessages(): Unit = js.native
      def destroyAllMessages(referenceId: Double): Unit = js.native
      
      /**
        * Get current messages
        */
      def getAllMessages(): js.Array[IGrowlMessage] = js.native
      def getAllMessages(referenceId: Double): js.Array[IGrowlMessage] = js.native
      
      /**
        * Initialize a directive
        * We look at the preloaded directive and use this else we
        * create a new blank object
        * @param referenceId
        * @param limitMessages
        */
      def initDirective(referenceId: Double, limitMessages: Double): IDirective[IScope, JQLite, IAttributes, IController] = js.native
    }
    
    /**
      * Growl service provider.
      */
    @js.native
    trait IGrowlProvider
      extends StObject
         with IServiceProvider {
      
      /**
        * Set default setting for disabling close button.
        * @param disableCloseButton
        */
      def globalDisableCloseButton(disableCloseButton: Boolean): IGrowlProvider = js.native
      
      /**
        * Set default setting for displaying message disappear countdown.
        * @param disableCountDown
        */
      def globalDisableCountDown(disableCountDown: Boolean): IGrowlProvider = js.native
      
      /**
        * Set default setting for disabling icons.
        * @param disableIcons
        */
      def globalDisableIcons(disableIcons: Boolean): IGrowlProvider = js.native
      
      /**
        * Set default allowance for inline messages.
        * @param inline
        */
      def globalInlineMessages(`inline`: Boolean): IGrowlProvider = js.native
      
      /**
        * Set default message position.
        * @param position
        */
      def globalPosition(position: String): IGrowlProvider = js.native
      
      /**
        * Set reversing order of displaying new messages.
        * @param reverseOrder
        */
      def globalReversedOrder(reverseOrder: Boolean): IGrowlProvider = js.native
      
      /**
        * Set default TTL settings.
        * @param ttl ttl in milliseconds
        */
      def globalTimeToLive(ttl: Double): IGrowlProvider = js.native
      /**
        * Set default TTL settings.
        * @param ttl configuration of TTL for different type of message
        */
      def globalTimeToLive(ttl: IGrowlTTLConfig): IGrowlProvider = js.native
      
      /**
        * Set key where severity of message is stored (for http interceptor).
        * @param messageVariableKey
        */
      def messageSeverityKey(messageSeverityKey: String): IGrowlProvider = js.native
      
      /**
        * Set key where message text is stored (for http interceptor).
        * @param messageVariableKey
        */
      def messageTextKey(messageTextKey: String): IGrowlProvider = js.native
      
      /**
        * Set key where title of message is stored (for http interceptor).
        * @param messageVariableKey
        */
      def messageTitleKey(messageTitleKey: String): IGrowlProvider = js.native
      
      /**
        * Set key where variables for message are stored (for http interceptor).
        * @param messageVariableKey
        */
      def messageVariableKey(messageVariableKey: String): IGrowlProvider = js.native
      
      /**
        * Set key where messages are stored (for http interceptor).
        * @param messageVariableKey
        */
      def messagesKey(messageKey: String): IGrowlProvider = js.native
      
      /**
        * Enable/disable displaying only unique messages.
        * @param onlyUniqueMessages
        */
      def onlyUniqueMessages(onlyUniqueMessages: Boolean): IGrowlProvider = js.native
      
      /**
        * Pre-defined server error interceptor.
        */
      var serverMessagesInterceptor: js.Array[String | IHttpInterceptorFactory] = js.native
    }
    
    /**
      * Growl service.
      */
    @js.native
    trait IGrowlService extends StObject {
      
      /**
        * Show error message.
        * @param message text to display (or code for angular-translate)
        */
      def error(message: String): IGrowlMessage = js.native
      /**
        * Show error message.
        * @param message text to display (or code for angular-translate)
        * @param config additional message configuration
        */
      def error(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
      
      /**
        * Show message (generic).
        * @param message text to display (or code for angular-translate)
        */
      def general(message: String): IGrowlMessage = js.native
      /**
        * Show message (generic).
        * @param message text to display (or code for angular-translate)
        * @param config additional message configuration
        */
      def general(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
      /**
        * Show message (generic).
        * @param message text to display (or code for angular-translate)
        * @param config additional message configuration
        * @param severity message severity (error, warning, success, info).
        */
      def general(message: String, config: IGrowlMessageConfig, severity: String): IGrowlMessage = js.native
      
      /**
        * Show information message.
        * @param message text to display (or code for angular-translate)
        */
      def info(message: String): IGrowlMessage = js.native
      /**
        * Show information message.
        * @param message text to display (or code for angular-translate)
        * @param config additional message configuration
        */
      def info(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
      
      /**
        * Get current allowance for inline messages.
        */
      def inlineMessages(): Boolean = js.native
      
      /**
        * Get current setting for displaying only unique messages.
        */
      def onlyUnique(): Boolean = js.native
      
      /**
        * Get current messages position.
        */
      def position(): String = js.native
      
      /**
        * Get current setting for reversing messages order.
        */
      def reverseOrder(): Boolean = js.native
      
      /**
        * Show success message.
        * @param message text to display (or code for angular-translate)
        * @param config additional message configuration
        */
      def success(message: String): IGrowlMessage = js.native
      /**
        * Show success message.
        * @param message text to display (or code for angular-translate)
        */
      def success(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
      
      /**
        * Show warning message.
        * @param message text to display (or code for angular-translate)
        */
      def warning(message: String): IGrowlMessage = js.native
      /**
        * Show warning message.
        * @param message text to display (or code for angular-translate)
        * @param config additional message configuration
        */
      def warning(message: String, config: IGrowlMessageConfig): IGrowlMessage = js.native
    }
    
    /**
      * Global Time-To-Leave configuration.
      */
    trait IGrowlTTLConfig extends StObject {
      
      var error: js.UndefOr[Double] = js.undefined
      
      var info: js.UndefOr[Double] = js.undefined
      
      var success: js.UndefOr[Double] = js.undefined
      
      var warning: js.UndefOr[Double] = js.undefined
    }
    object IGrowlTTLConfig {
      
      inline def apply(): IGrowlTTLConfig = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGrowlTTLConfig]
      }
      
      extension [Self <: IGrowlTTLConfig](x: Self) {
        
        inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
        
        inline def setInfo(value: Double): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
        
        inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
        
        inline def setSuccess(value: Double): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
        
        inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
        
        inline def setWarning(value: Double): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
        
        inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
      }
    }
  }
}
