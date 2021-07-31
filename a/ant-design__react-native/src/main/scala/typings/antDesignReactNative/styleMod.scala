package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleMod {
  
  @JSImport("@ant-design/react-native/lib/accordion/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): AccordionStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[AccordionStyle]
  
  trait AccordionStyle extends StObject {
    
    var arrow: TextStyle
    
    var container: ViewStyle
    
    var content: ViewStyle
    
    var contentText: TextStyle
    
    var header: ViewStyle
    
    var headerText: TextStyle
    
    var headerWrap: ViewStyle
  }
  object AccordionStyle {
    
    @scala.inline
    def apply(
      arrow: TextStyle,
      container: ViewStyle,
      content: ViewStyle,
      contentText: TextStyle,
      header: ViewStyle,
      headerText: TextStyle,
      headerWrap: ViewStyle
    ): AccordionStyle = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], contentText = contentText.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], headerText = headerText.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccordionStyle]
    }
    
    @scala.inline
    implicit class AccordionStyleMutableBuilder[Self <: AccordionStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrow(value: TextStyle): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContent(value: ViewStyle): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentText(value: TextStyle): Self = StObject.set(x, "contentText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeader(value: ViewStyle): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderText(value: TextStyle): Self = StObject.set(x, "headerText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaderWrap(value: ViewStyle): Self = StObject.set(x, "headerWrap", value.asInstanceOf[js.Any])
    }
  }
}
