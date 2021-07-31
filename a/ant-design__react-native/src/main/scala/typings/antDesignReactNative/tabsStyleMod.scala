package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsStyleMod {
  
  @JSImport("@ant-design/react-native/lib/tabs/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(theme: Theme): TabBarStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[TabBarStyle]
  
  trait TabBarStyle extends StObject {
    
    var container: ViewStyle
    
    var tab: ViewStyle
    
    var tabs: ViewStyle
    
    var textStyle: TextStyle
    
    var underline: ViewStyle
  }
  object TabBarStyle {
    
    @scala.inline
    def apply(container: ViewStyle, tab: ViewStyle, tabs: ViewStyle, textStyle: TextStyle, underline: ViewStyle): TabBarStyle = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], tab = tab.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any], textStyle = textStyle.asInstanceOf[js.Any], underline = underline.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabBarStyle]
    }
    
    @scala.inline
    implicit class TabBarStyleMutableBuilder[Self <: TabBarStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTab(value: ViewStyle): Self = StObject.set(x, "tab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabs(value: ViewStyle): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextStyle(value: TextStyle): Self = StObject.set(x, "textStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderline(value: ViewStyle): Self = StObject.set(x, "underline", value.asInstanceOf[js.Any])
    }
  }
}
