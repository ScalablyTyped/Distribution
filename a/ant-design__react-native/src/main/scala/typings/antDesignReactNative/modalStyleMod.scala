package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalStyleMod {
  
  @JSImport("@ant-design/react-native/lib/modal/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): ModalStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[ModalStyle]
  
  trait ModalStyle extends StObject {
    
    var body: ViewStyle
    
    var buttonGroupH: ViewStyle
    
    var buttonGroupV: ViewStyle
    
    var buttonText: TextStyle
    
    var buttonTextOperation: TextStyle
    
    var buttonWrapH: ViewStyle
    
    var buttonWrapV: ViewStyle
    
    var close: TextStyle
    
    var closeWrap: ViewStyle
    
    var container: ViewStyle
    
    var footer: ViewStyle
    
    var header: TextStyle
    
    var innerContainer: ViewStyle
    
    var maskClosable: ViewStyle
    
    var operationBody: ViewStyle
    
    var operationContainer: ViewStyle
    
    var popupContainer: ViewStyle
    
    var popupSlideDown: ViewStyle
    
    var popupSlideUp: ViewStyle
    
    var wrap: ViewStyle
  }
  object ModalStyle {
    
    inline def apply(
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
    
    extension [Self <: ModalStyle](x: Self) {
      
      inline def setBody(value: ViewStyle): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setButtonGroupH(value: ViewStyle): Self = StObject.set(x, "buttonGroupH", value.asInstanceOf[js.Any])
      
      inline def setButtonGroupV(value: ViewStyle): Self = StObject.set(x, "buttonGroupV", value.asInstanceOf[js.Any])
      
      inline def setButtonText(value: TextStyle): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextOperation(value: TextStyle): Self = StObject.set(x, "buttonTextOperation", value.asInstanceOf[js.Any])
      
      inline def setButtonWrapH(value: ViewStyle): Self = StObject.set(x, "buttonWrapH", value.asInstanceOf[js.Any])
      
      inline def setButtonWrapV(value: ViewStyle): Self = StObject.set(x, "buttonWrapV", value.asInstanceOf[js.Any])
      
      inline def setClose(value: TextStyle): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setCloseWrap(value: ViewStyle): Self = StObject.set(x, "closeWrap", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setFooter(value: ViewStyle): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: TextStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setInnerContainer(value: ViewStyle): Self = StObject.set(x, "innerContainer", value.asInstanceOf[js.Any])
      
      inline def setMaskClosable(value: ViewStyle): Self = StObject.set(x, "maskClosable", value.asInstanceOf[js.Any])
      
      inline def setOperationBody(value: ViewStyle): Self = StObject.set(x, "operationBody", value.asInstanceOf[js.Any])
      
      inline def setOperationContainer(value: ViewStyle): Self = StObject.set(x, "operationContainer", value.asInstanceOf[js.Any])
      
      inline def setPopupContainer(value: ViewStyle): Self = StObject.set(x, "popupContainer", value.asInstanceOf[js.Any])
      
      inline def setPopupSlideDown(value: ViewStyle): Self = StObject.set(x, "popupSlideDown", value.asInstanceOf[js.Any])
      
      inline def setPopupSlideUp(value: ViewStyle): Self = StObject.set(x, "popupSlideUp", value.asInstanceOf[js.Any])
      
      inline def setWrap(value: ViewStyle): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
    }
  }
}
