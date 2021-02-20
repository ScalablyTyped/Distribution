package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalStyleMod {
  
  @JSImport("@ant-design/react-native/lib/modal/style", JSImport.Default)
  @js.native
  def default(theme: Theme): ModalStyle = js.native
  
  @js.native
  trait ModalStyle extends StObject {
    
    var body: ViewStyle = js.native
    
    var buttonGroupH: ViewStyle = js.native
    
    var buttonGroupV: ViewStyle = js.native
    
    var buttonText: TextStyle = js.native
    
    var buttonTextOperation: TextStyle = js.native
    
    var buttonWrapH: ViewStyle = js.native
    
    var buttonWrapV: ViewStyle = js.native
    
    var close: TextStyle = js.native
    
    var closeWrap: ViewStyle = js.native
    
    var container: ViewStyle = js.native
    
    var footer: ViewStyle = js.native
    
    var header: TextStyle = js.native
    
    var innerContainer: ViewStyle = js.native
    
    var maskClosable: ViewStyle = js.native
    
    var operationBody: ViewStyle = js.native
    
    var operationContainer: ViewStyle = js.native
    
    var popupContainer: ViewStyle = js.native
    
    var popupSlideDown: ViewStyle = js.native
    
    var popupSlideUp: ViewStyle = js.native
    
    var wrap: ViewStyle = js.native
  }
  object ModalStyle {
    
    @scala.inline
    def apply(
      body: ViewStyle,
      buttonGroupH: ViewStyle,
      buttonGroupV: ViewStyle,
      buttonText: TextStyle,
      buttonTextOperation: TextStyle,
      buttonWrapH: ViewStyle,
      buttonWrapV: ViewStyle,
      close: TextStyle,
      closeWrap: ViewStyle,
      container: ViewStyle,
      footer: ViewStyle,
      header: TextStyle,
      innerContainer: ViewStyle,
      maskClosable: ViewStyle,
      operationBody: ViewStyle,
      operationContainer: ViewStyle,
      popupContainer: ViewStyle,
      popupSlideDown: ViewStyle,
      popupSlideUp: ViewStyle,
      wrap: ViewStyle
    ): ModalStyle = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], buttonGroupH = buttonGroupH.asInstanceOf[js.Any], buttonGroupV = buttonGroupV.asInstanceOf[js.Any], buttonText = buttonText.asInstanceOf[js.Any], buttonTextOperation = buttonTextOperation.asInstanceOf[js.Any], buttonWrapH = buttonWrapH.asInstanceOf[js.Any], buttonWrapV = buttonWrapV.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], closeWrap = closeWrap.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], innerContainer = innerContainer.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], operationBody = operationBody.asInstanceOf[js.Any], operationContainer = operationContainer.asInstanceOf[js.Any], popupContainer = popupContainer.asInstanceOf[js.Any], popupSlideDown = popupSlideDown.asInstanceOf[js.Any], popupSlideUp = popupSlideUp.asInstanceOf[js.Any], wrap = wrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalStyle]
    }
    
    @scala.inline
    implicit class ModalStyleMutableBuilder[Self <: ModalStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: ViewStyle): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonGroupH(value: ViewStyle): Self = StObject.set(x, "buttonGroupH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonGroupV(value: ViewStyle): Self = StObject.set(x, "buttonGroupV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonText(value: TextStyle): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonTextOperation(value: TextStyle): Self = StObject.set(x, "buttonTextOperation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonWrapH(value: ViewStyle): Self = StObject.set(x, "buttonWrapH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonWrapV(value: ViewStyle): Self = StObject.set(x, "buttonWrapV", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClose(value: TextStyle): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseWrap(value: ViewStyle): Self = StObject.set(x, "closeWrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooter(value: ViewStyle): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: TextStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerContainer(value: ViewStyle): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaskClosable(value: ViewStyle): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationBody(value: ViewStyle): Self = StObject.set(x, "operationBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperationContainer(value: ViewStyle): Self = StObject.set(x, "operationContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupContainer(value: ViewStyle): Self = StObject.set(x, "popupContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupSlideDown(value: ViewStyle): Self = StObject.set(x, "popupSlideDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopupSlideUp(value: ViewStyle): Self = StObject.set(x, "popupSlideUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrap(value: ViewStyle): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
}
