package typings.angularUiNotification

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object mod {
  
  object uiNotification {
    
    @js.native
    trait IGlobalMessageOptions extends StObject {
      
      var closeOnClick: js.UndefOr[Boolean] = js.native
      
      var delay: js.UndefOr[Double] = js.native
      
      var horizontalSpacing: js.UndefOr[Double] = js.native
      
      var maxCount: js.UndefOr[Double] = js.native
      
      var onClose: js.UndefOr[js.Function1[/* element */ js.Any, _]] = js.native
      
      var positionX: js.UndefOr[XPosition] = js.native
      
      var positionY: js.UndefOr[YPosition] = js.native
      
      var replaceMessage: js.UndefOr[Boolean] = js.native
      
      var startRight: js.UndefOr[Double] = js.native
      
      var startTop: js.UndefOr[Double] = js.native
      
      var templateUrl: js.UndefOr[String] = js.native
      
      var verticalSpacing: js.UndefOr[Double] = js.native
    }
    object IGlobalMessageOptions {
      
      @scala.inline
      def apply(): IGlobalMessageOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IGlobalMessageOptions]
      }
      
      @scala.inline
      implicit class IGlobalMessageOptionsMutableBuilder[Self <: IGlobalMessageOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
        
        @scala.inline
        def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        @scala.inline
        def setHorizontalSpacing(value: Double): Self = StObject.set(x, "horizontalSpacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHorizontalSpacingUndefined: Self = StObject.set(x, "horizontalSpacing", js.undefined)
        
        @scala.inline
        def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
        
        @scala.inline
        def setOnClose(value: /* element */ js.Any => _): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
        
        @scala.inline
        def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
        
        @scala.inline
        def setPositionX(value: XPosition): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
        
        @scala.inline
        def setPositionY(value: YPosition): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
        
        @scala.inline
        def setReplaceMessage(value: Boolean): Self = StObject.set(x, "replaceMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceMessageUndefined: Self = StObject.set(x, "replaceMessage", js.undefined)
        
        @scala.inline
        def setStartRight(value: Double): Self = StObject.set(x, "startRight", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartRightUndefined: Self = StObject.set(x, "startRight", js.undefined)
        
        @scala.inline
        def setStartTop(value: Double): Self = StObject.set(x, "startTop", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setStartTopUndefined: Self = StObject.set(x, "startTop", js.undefined)
        
        @scala.inline
        def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
        
        @scala.inline
        def setVerticalSpacing(value: Double): Self = StObject.set(x, "verticalSpacing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setVerticalSpacingUndefined: Self = StObject.set(x, "verticalSpacing", js.undefined)
      }
    }
    
    @js.native
    trait IMessageOptions extends StObject {
      
      var closeOnClick: js.UndefOr[Boolean] = js.native
      
      var delay: js.UndefOr[Double] = js.native
      
      var message: js.UndefOr[String] = js.native
      
      var positionX: js.UndefOr[XPosition] = js.native
      
      var positionY: js.UndefOr[YPosition] = js.native
      
      var replaceMessage: js.UndefOr[Boolean] = js.native
      
      var templateUrl: js.UndefOr[String] = js.native
      
      var title: js.UndefOr[String] = js.native
      
      var `type`: js.UndefOr[MessageType] = js.native
    }
    object IMessageOptions {
      
      @scala.inline
      def apply(): IMessageOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[IMessageOptions]
      }
      
      @scala.inline
      implicit class IMessageOptionsMutableBuilder[Self <: IMessageOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCloseOnClick(value: Boolean): Self = StObject.set(x, "closeOnClick", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCloseOnClickUndefined: Self = StObject.set(x, "closeOnClick", js.undefined)
        
        @scala.inline
        def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
        
        @scala.inline
        def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
        
        @scala.inline
        def setPositionX(value: XPosition): Self = StObject.set(x, "positionX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionXUndefined: Self = StObject.set(x, "positionX", js.undefined)
        
        @scala.inline
        def setPositionY(value: YPosition): Self = StObject.set(x, "positionY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPositionYUndefined: Self = StObject.set(x, "positionY", js.undefined)
        
        @scala.inline
        def setReplaceMessage(value: Boolean): Self = StObject.set(x, "replaceMessage", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReplaceMessageUndefined: Self = StObject.set(x, "replaceMessage", js.undefined)
        
        @scala.inline
        def setTemplateUrl(value: String): Self = StObject.set(x, "templateUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTemplateUrlUndefined: Self = StObject.set(x, "templateUrl", js.undefined)
        
        @scala.inline
        def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
        
        @scala.inline
        def setType(value: MessageType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      }
    }
    
    @js.native
    trait INotificationProvider extends StObject {
      
      def setOptions(options: IGlobalMessageOptions): Unit = js.native
    }
    object INotificationProvider {
      
      @scala.inline
      def apply(setOptions: IGlobalMessageOptions => Unit): INotificationProvider = {
        val __obj = js.Dynamic.literal(setOptions = js.Any.fromFunction1(setOptions))
        __obj.asInstanceOf[INotificationProvider]
      }
      
      @scala.inline
      implicit class INotificationProviderMutableBuilder[Self <: INotificationProvider] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setSetOptions(value: IGlobalMessageOptions => Unit): Self = StObject.set(x, "setOptions", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait INotificationScope extends StObject {
      
      def kill(isHard: Boolean): Unit = js.native
    }
    object INotificationScope {
      
      @scala.inline
      def apply(kill: Boolean => Unit): INotificationScope = {
        val __obj = js.Dynamic.literal(kill = js.Any.fromFunction1(kill))
        __obj.asInstanceOf[INotificationScope]
      }
      
      @scala.inline
      implicit class INotificationScopeMutableBuilder[Self <: INotificationScope] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setKill(value: Boolean => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction1(value))
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
      
      @scala.inline
      def error: typings.angularUiNotification.angularUiNotificationStrings.error = "error".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.error]
      
      @scala.inline
      def info: typings.angularUiNotification.angularUiNotificationStrings.info = "info".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.info]
      
      @scala.inline
      def primary: typings.angularUiNotification.angularUiNotificationStrings.primary = "primary".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.primary]
      
      @scala.inline
      def success: typings.angularUiNotification.angularUiNotificationStrings.success = "success".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.success]
      
      @scala.inline
      def warning: typings.angularUiNotification.angularUiNotificationStrings.warning = "warning".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.warning]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.angularUiNotification.angularUiNotificationStrings.right
      - typings.angularUiNotification.angularUiNotificationStrings.left
      - typings.angularUiNotification.angularUiNotificationStrings.center
    */
    trait XPosition extends StObject
    object XPosition {
      
      @scala.inline
      def center: typings.angularUiNotification.angularUiNotificationStrings.center = "center".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.center]
      
      @scala.inline
      def left: typings.angularUiNotification.angularUiNotificationStrings.left = "left".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.left]
      
      @scala.inline
      def right: typings.angularUiNotification.angularUiNotificationStrings.right = "right".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.right]
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.angularUiNotification.angularUiNotificationStrings.top
      - typings.angularUiNotification.angularUiNotificationStrings.bottom
    */
    trait YPosition extends StObject
    object YPosition {
      
      @scala.inline
      def bottom: typings.angularUiNotification.angularUiNotificationStrings.bottom = "bottom".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.bottom]
      
      @scala.inline
      def top: typings.angularUiNotification.angularUiNotificationStrings.top = "top".asInstanceOf[typings.angularUiNotification.angularUiNotificationStrings.top]
    }
  }
}
