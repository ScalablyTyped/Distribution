package typings.angularUiNotification

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object uiNotification {
    
    trait IGlobalMessageOptions extends StObject {
      
      var closeOnClick: js.UndefOr[Boolean] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var horizontalSpacing: js.UndefOr[Double] = js.undefined
      
      var maxCount: js.UndefOr[Double] = js.undefined
      
      var onClose: js.UndefOr[js.Function1[/* element */ js.Any, js.Any]] = js.undefined
      
      var positionX: js.UndefOr[XPosition] = js.undefined
      
      var positionY: js.UndefOr[YPosition] = js.undefined
      
      var replaceMessage: js.UndefOr[Boolean] = js.undefined
      
      var startRight: js.UndefOr[Double] = js.undefined
      
      var startTop: js.UndefOr[Double] = js.undefined
      
      var templateUrl: js.UndefOr[String] = js.undefined
      
      var verticalSpacing: js.UndefOr[Double] = js.undefined
    }
    object IGlobalMessageOptions {
      
      inline def apply(): IGlobalMessageOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGlobalMessageOptions]
      }
      
      extension [Self <: IGlobalMessageOptions](x: Self) {
        
        inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
        
        inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setHorizontalSpacing(value: Double): Self = StObject.set(x, "horizontalSpacing", value.asInstanceOf[js.Any])
        
        inline def setHorizontalSpacingUndefined: Self = StObject.set(x, "horizontalSpacing", js.undefined)
        
        inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
        
        inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
        
        inline def setOnClose(value: /* element */ js.Any => js.Any): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
        
        inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        inline def setPositionX(value: XPosition): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
        
        inline def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
        
        inline def setPositionY(value: YPosition): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
        
        inline def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
        
        inline def setReplaceMessage(value: Boolean): Self = StObject.set(x, "replaceMessage", value.asInstanceOf[js.Any])
        
        inline def setReplaceMessageUndefined: Self = StObject.set(x, "replaceMessage", js.undefined)
        
        inline def setStartRight(value: Double): Self = StObject.set(x, "startRight", value.asInstanceOf[js.Any])
        
        inline def setStartRightUndefined: Self = StObject.set(x, "startRight", js.undefined)
        
        inline def setStartTop(value: Double): Self = StObject.set(x, "startTop", value.asInstanceOf[js.Any])
        
        inline def setStartTopUndefined: Self = StObject.set(x, "startTop", js.undefined)
        
        inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
        
        inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
        
        inline def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
        
        inline def setVerticalSpacingUndefined: Self = StObject.set(x, "verticalSpacing", js.undefined)
      }
    }
    
    trait IMessageOptions extends StObject {
      
      var closeOnClick: js.UndefOr[Boolean] = js.undefined
      
      var delay: js.UndefOr[Double] = js.undefined
      
      var message: js.UndefOr[String] = js.undefined
      
      var positionX: js.UndefOr[XPosition] = js.undefined
      
      var positionY: js.UndefOr[YPosition] = js.undefined
      
      var replaceMessage: js.UndefOr[Boolean] = js.undefined
      
      var templateUrl: js.UndefOr[String] = js.undefined
      
      var title: js.UndefOr[String] = js.undefined
      
      var `type`: js.UndefOr[MessageType] = js.undefined
    }
    object IMessageOptions {
      
      inline def apply(): IMessageOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IMessageOptions]
      }
      
      extension [Self <: IMessageOptions](x: Self) {
        
        inline def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
        
        inline def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
        
        inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        inline def setPositionX(value: XPosition): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
        
        inline def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
        
        inline def setPositionY(value: YPosition): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
        
        inline def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
        
        inline def setReplaceMessage(value: Boolean): Self = StObject.set(x, "replaceMessage", value.asInstanceOf[js.Any])
        
        inline def setReplaceMessageUndefined: Self = StObject.set(x, "replaceMessage", js.undefined)
        
        inline def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
        
        inline def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
        
        inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        inline def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    trait INotificationProvider extends StObject {
      
      def setOptions(options: IGlobalMessageOptions): Unit
    }
    object INotificationProvider {
      
      inline def apply(setOptions: IGlobalMessageOptions => Unit): INotificationProvider = {
        val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions))
        __obj.asInstanceOf[INotificationProvider]
      }
      
      extension [Self <: INotificationProvider](x: Self) {
        
        inline def setSetOptions(value: IGlobalMessageOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
      }
    }
    
    trait INotificationScope extends StObject {
      
      def kill(isHard: Boolean): Unit
    }
    object INotificationScope {
      
      inline def apply(kill: Boolean => Unit): INotificationScope = {
        val __obj = js.Dynamic.literal(kill = js.Any.fromFunction1(kill))
        __obj.asInstanceOf[INotificationScope]
      }
      
      extension [Self <: INotificationScope](x: Self) {
        
        inline def setKill(value: Boolean => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait INotificationService extends StObject {
      
      def apply(message: Message): IPromise[INotificationScope] = js.native
      def apply(message: Message, `type`: MessageType): IPromise[INotificationScope] = js.native
      
      def clearAll(): Unit = js.native
      
      def error(message: Message): IPromise[INotificationScope] = js.native
      
      def info(message: Message): IPromise[INotificationScope] = js.native
      
      def primary(message: Message): IPromise[INotificationScope] = js.native
      
      def success(message: Message): IPromise[INotificationScope] = js.native
      
      def warning(message: Message): IPromise[INotificationScope] = js.native
    }
    
    type Message = String | IMessageOptions
    
    /* Rewritten from type alias, can be one of: 
      - typings.angularUiNotification.angularUiNotificationStrings.primary
      - typings.angularUiNotification.angularUiNotificationStrings.info
      - typings.angularUiNotification.angularUiNotificationStrings.success
      - typings.angularUiNotification.angularUiNotificationStrings.warning
      - typings.angularUiNotification.angularUiNotificationStrings.error
    */
    trait MessageType extends StObject
    object MessageType {
      
      inline def error: typings.angularUiNotification.angularUiNotificationStrings.error = "error".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.error]
      
      inline def info: typings.angularUiNotification.angularUiNotificationStrings.info = "info".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.info]
      
      inline def primary: typings.angularUiNotification.angularUiNotificationStrings.primary = "primary".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.primary]
      
      inline def success: typings.angularUiNotification.angularUiNotificationStrings.success = "success".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.success]
      
      inline def warning: typings.angularUiNotification.angularUiNotificationStrings.warning = "warning".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.warning]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.angularUiNotification.angularUiNotificationStrings.right
      - typings.angularUiNotification.angularUiNotificationStrings.left
      - typings.angularUiNotification.angularUiNotificationStrings.center
    */
    trait XPosition extends StObject
    object XPosition {
      
      inline def center: typings.angularUiNotification.angularUiNotificationStrings.center = "center".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.center]
      
      inline def left: typings.angularUiNotification.angularUiNotificationStrings.left = "left".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.left]
      
      inline def right: typings.angularUiNotification.angularUiNotificationStrings.right = "right".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.right]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.angularUiNotification.angularUiNotificationStrings.top
      - typings.angularUiNotification.angularUiNotificationStrings.bottom
    */
    trait YPosition extends StObject
    object YPosition {
      
      inline def bottom: typings.angularUiNotification.angularUiNotificationStrings.bottom = "bottom".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.bottom]
      
      inline def top: typings.angularUiNotification.angularUiNotificationStrings.top = "top".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.top]
    }
  }
}
