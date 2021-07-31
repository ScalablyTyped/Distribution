package typings.antDesignReactNative

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pickerStyleMod {
  
  @JSImport("@ant-design/react-native/lib/picker/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): PickerStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PickerStyle]
  
  trait PickerStyle extends StObject {
    
    var actionText: TextStyle
    
    var dismissText: TextStyle
    
    var header: ViewStyle
    
    var headerItem: ViewStyle
    
    var modal: ViewStyle
    
    var okText: TextStyle
    
    var title: TextStyle
  }
  object PickerStyle {
    
    @scala.inline
    def apply(
      actionText: TextStyle,
      dismissText: TextStyle,
      header: ViewStyle,
      headerItem: ViewStyle,
      modal: ViewStyle,
      okText: TextStyle,
      title: TextStyle
    ): PickerStyle = {
      val __obj = js.Dynamic.literal(actionText = actionText.asInstanceOf[js.Any], dismissText = dismissText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerItem = headerItem.asInstanceOf[js.Any], modal = modal.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickerStyle]
    }
    
    @scala.inline
    implicit class PickerStyleMutableBuilder[Self <: PickerStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActionText(value: TextStyle): Self = StObject.set(x, "actionText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissText(value: TextStyle): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: ViewStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderItem(value: ViewStyle): Self = StObject.set(x, "headerItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModal(value: ViewStyle): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOkText(value: TextStyle): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: TextStyle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
