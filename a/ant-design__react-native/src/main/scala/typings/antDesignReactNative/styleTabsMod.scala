package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleTabsMod {
  
  @JSImport("@ant-design/react-native/lib/tabs/style/tabs", JSImport.Default)
  @js.native
  def default(theme: Theme): TabsStyle = js.native
  
  @js.native
  trait TabsStyle extends StObject {
    
    var bottomTabBarSplitLine: ViewStyle = js.native
    
    var container: ViewStyle = js.native
    
    var topTabBarSplitLine: ViewStyle = js.native
  }
  object TabsStyle {
    
    @scala.inline
    def apply(bottomTabBarSplitLine: ViewStyle, container: ViewStyle, topTabBarSplitLine: ViewStyle): TabsStyle = {
      val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsStyle]
    }
    
    @scala.inline
    implicit class TabsStyleMutableBuilder[Self <: TabsStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "bottomTabBarSplitLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "topTabBarSplitLine", value.asInstanceOf[js.Any])
    }
  }
}
