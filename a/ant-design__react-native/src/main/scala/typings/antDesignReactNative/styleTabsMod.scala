package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styleTabsMod {
  
  @JSImport("@ant-design/react-native/lib/tabs/style/tabs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): TabsStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[TabsStyle]
  
  trait TabsStyle extends StObject {
    
    var bottomTabBarSplitLine: ViewStyle
    
    var container: ViewStyle
    
    var topTabBarSplitLine: ViewStyle
  }
  object TabsStyle {
    
    inline def apply(bottomTabBarSplitLine: ViewStyle, container: ViewStyle, topTabBarSplitLine: ViewStyle): TabsStyle = {
      val __obj = js.Dynamic.literal(bottomTabBarSplitLine = bottomTabBarSplitLine.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], topTabBarSplitLine = topTabBarSplitLine.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsStyle]
    }
    
    extension [Self <: TabsStyle](x: Self) {
      
      inline def setBottomTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "bottomTabBarSplitLine", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setTopTabBarSplitLine(value: ViewStyle): Self = StObject.set(x, "topTabBarSplitLine", value.asInstanceOf[js.Any])
    }
  }
}
