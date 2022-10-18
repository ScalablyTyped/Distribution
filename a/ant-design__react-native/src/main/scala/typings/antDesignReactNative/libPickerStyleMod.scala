package typings.antDesignReactNative

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPickerStyleMod {
  
  @JSImport("@ant-design/react-native/lib/picker/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): PickerStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PickerStyle]
  
  trait PickerStyle extends StObject {
    
    var actionText: TextStyle
    
    var container: ViewStyle
    
    var dismissText: TextStyle
    
    var header: ViewStyle
    
    var headerItem: ViewStyle
    
    var modal: ViewStyle
    
    var okText: TextStyle
    
    var title: TextStyle
  }
  object PickerStyle {
    
    inline def apply(
      actionText: TextStyle,
      container: ViewStyle,
      dismissText: TextStyle,
      header: ViewStyle,
      headerItem: ViewStyle,
      modal: ViewStyle,
      okText: TextStyle,
      title: TextStyle
    ): PickerStyle = {
      val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerStyle]
    }
    
    extension [Self <: PickerStyle](x: Self) {
      
      inline def setActionText(value: TextStyle): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDismissText(value: TextStyle): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      inline def setHeader(value: ViewStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderItem(value: ViewStyle): Self = StObject.set(x, "headerItem", value.asInstanceOf[js.Any])
      
      inline def setModal(value: ViewStyle): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setOkText(value: TextStyle): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: TextStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
