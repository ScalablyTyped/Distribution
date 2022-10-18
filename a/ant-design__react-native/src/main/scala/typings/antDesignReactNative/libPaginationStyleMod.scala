package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPaginationStyleMod {
  
  @JSImport("@ant-design/react-native/lib/pagination/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): PaginationStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[PaginationStyle]
  
  trait PaginationStyle extends StObject {
    
    var activeTextStyle: TextStyle
    
    var container: ViewStyle
    
    var indicatorStyle: ViewStyle
    
    var numberStyle: ViewStyle
    
    var pointActiveStyle: ViewStyle
    
    var pointStyle: ViewStyle
    
    var spaceStyle: ViewStyle
    
    var totalStyle: TextStyle
  }
  object PaginationStyle {
    
    inline def apply(
      activeTextStyle: TextStyle,
      container: ViewStyle,
      indicatorStyle: ViewStyle,
      numberStyle: ViewStyle,
      pointActiveStyle: ViewStyle,
      pointStyle: ViewStyle,
      spaceStyle: ViewStyle,
      totalStyle: TextStyle
    ): PaginationStyle = {
      val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], numberStyle = numberStyle.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any], totalStyle = totalStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationStyle]
    }
    
    extension [Self <: PaginationStyle](x: Self) {
      
      inline def setActiveTextStyle(value: TextStyle): Self = StObject.set(x, "activeTextStyle", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyle(value: ViewStyle): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setNumberStyle(value: ViewStyle): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
      
      inline def setPointActiveStyle(value: ViewStyle): Self = StObject.set(x, "pointActiveStyle", value.asInstanceOf[js.Any])
      
      inline def setPointStyle(value: ViewStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
      
      inline def setSpaceStyle(value: ViewStyle): Self = StObject.set(x, "spaceStyle", value.asInstanceOf[js.Any])
      
      inline def setTotalStyle(value: TextStyle): Self = StObject.set(x, "totalStyle", value.asInstanceOf[js.Any])
    }
  }
}
