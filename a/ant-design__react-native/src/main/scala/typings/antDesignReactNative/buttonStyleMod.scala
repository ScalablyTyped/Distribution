package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonStyleMod {
  
  @JSImport("@ant-design/react-native/lib/button/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): ButtonStyles = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[ButtonStyles]
  
  trait ButtonStyles extends StObject {
    
    var container: ViewStyle
    
    var defaultDisabledRaw: ViewStyle
    
    var defaultDisabledRawText: TextStyle
    
    var defaultHighlight: ViewStyle
    
    var defaultHighlightText: TextStyle
    
    var defaultRaw: ViewStyle
    
    var defaultRawText: TextStyle
    
    var ghostDisabledRaw: ViewStyle
    
    var ghostDisabledRawText: TextStyle
    
    var ghostHighlight: ViewStyle
    
    var ghostHighlightText: TextStyle
    
    var ghostRaw: ViewStyle
    
    var ghostRawText: TextStyle
    
    var indicator: ViewStyle
    
    var largeRaw: ViewStyle
    
    var largeRawText: TextStyle
    
    var primaryDisabledRaw: ViewStyle
    
    var primaryDisabledRawText: TextStyle
    
    var primaryHighlight: ViewStyle
    
    var primaryHighlightText: TextStyle
    
    var primaryRaw: ViewStyle
    
    var primaryRawText: TextStyle
    
    var smallRaw: ViewStyle
    
    var smallRawText: TextStyle
    
    var warningDisabledRaw: ViewStyle
    
    var warningDisabledRawText: TextStyle
    
    var warningHighlight: ViewStyle
    
    var warningHighlightText: TextStyle
    
    var warningRaw: ViewStyle
    
    var warningRawText: TextStyle
    
    var wrapperStyle: ViewStyle
  }
  object ButtonStyles {
    
    inline def apply(
      container: ViewStyle,
      defaultDisabledRaw: ViewStyle,
      defaultDisabledRawText: TextStyle,
      defaultHighlight: ViewStyle,
      defaultHighlightText: TextStyle,
      defaultRaw: ViewStyle,
      defaultRawText: TextStyle,
      ghostDisabledRaw: ViewStyle,
      ghostDisabledRawText: TextStyle,
      ghostHighlight: ViewStyle,
      ghostHighlightText: TextStyle,
      ghostRaw: ViewStyle,
      ghostRawText: TextStyle,
      indicator: ViewStyle,
      largeRaw: ViewStyle,
      largeRawText: TextStyle,
      primaryDisabledRaw: ViewStyle,
      primaryDisabledRawText: TextStyle,
      primaryHighlight: ViewStyle,
      primaryHighlightText: TextStyle,
      primaryRaw: ViewStyle,
      primaryRawText: TextStyle,
      smallRaw: ViewStyle,
      smallRawText: TextStyle,
      warningDisabledRaw: ViewStyle,
      warningDisabledRawText: TextStyle,
      warningHighlight: ViewStyle,
      warningHighlightText: TextStyle,
      warningRaw: ViewStyle,
      warningRawText: TextStyle,
      wrapperStyle: ViewStyle
    ): ButtonStyles = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], defaultDisabledRaw = defaultDisabledRaw.asInstanceOf[js.Any], defaultDisabledRawText = defaultDisabledRawText.asInstanceOf[js.Any], defaultHighlight = defaultHighlight.asInstanceOf[js.Any], defaultHighlightText = defaultHighlightText.asInstanceOf[js.Any], defaultRaw = defaultRaw.asInstanceOf[js.Any], defaultRawText = defaultRawText.asInstanceOf[js.Any], ghostDisabledRaw = ghostDisabledRaw.asInstanceOf[js.Any], ghostDisabledRawText = ghostDisabledRawText.asInstanceOf[js.Any], ghostHighlight = ghostHighlight.asInstanceOf[js.Any], ghostHighlightText = ghostHighlightText.asInstanceOf[js.Any], ghostRaw = ghostRaw.asInstanceOf[js.Any], ghostRawText = ghostRawText.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], largeRaw = largeRaw.asInstanceOf[js.Any], largeRawText = largeRawText.asInstanceOf[js.Any], primaryDisabledRaw = primaryDisabledRaw.asInstanceOf[js.Any], primaryDisabledRawText = primaryDisabledRawText.asInstanceOf[js.Any], primaryHighlight = primaryHighlight.asInstanceOf[js.Any], primaryHighlightText = primaryHighlightText.asInstanceOf[js.Any], primaryRaw = primaryRaw.asInstanceOf[js.Any], primaryRawText = primaryRawText.asInstanceOf[js.Any], smallRaw = smallRaw.asInstanceOf[js.Any], smallRawText = smallRawText.asInstanceOf[js.Any], warningDisabledRaw = warningDisabledRaw.asInstanceOf[js.Any], warningDisabledRawText = warningDisabledRawText.asInstanceOf[js.Any], warningHighlight = warningHighlight.asInstanceOf[js.Any], warningHighlightText = warningHighlightText.asInstanceOf[js.Any], warningRaw = warningRaw.asInstanceOf[js.Any], warningRawText = warningRawText.asInstanceOf[js.Any], wrapperStyle = wrapperStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonStyles]
    }
    
    extension [Self <: ButtonStyles](x: Self) {
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setDefaultDisabledRaw(value: ViewStyle): Self = StObject.set(x, "defaultDisabledRaw", value.asInstanceOf[js.Any])
      
      inline def setDefaultDisabledRawText(value: TextStyle): Self = StObject.set(x, "defaultDisabledRawText", value.asInstanceOf[js.Any])
      
      inline def setDefaultHighlight(value: ViewStyle): Self = StObject.set(x, "defaultHighlight", value.asInstanceOf[js.Any])
      
      inline def setDefaultHighlightText(value: TextStyle): Self = StObject.set(x, "defaultHighlightText", value.asInstanceOf[js.Any])
      
      inline def setDefaultRaw(value: ViewStyle): Self = StObject.set(x, "defaultRaw", value.asInstanceOf[js.Any])
      
      inline def setDefaultRawText(value: TextStyle): Self = StObject.set(x, "defaultRawText", value.asInstanceOf[js.Any])
      
      inline def setGhostDisabledRaw(value: ViewStyle): Self = StObject.set(x, "ghostDisabledRaw", value.asInstanceOf[js.Any])
      
      inline def setGhostDisabledRawText(value: TextStyle): Self = StObject.set(x, "ghostDisabledRawText", value.asInstanceOf[js.Any])
      
      inline def setGhostHighlight(value: ViewStyle): Self = StObject.set(x, "ghostHighlight", value.asInstanceOf[js.Any])
      
      inline def setGhostHighlightText(value: TextStyle): Self = StObject.set(x, "ghostHighlightText", value.asInstanceOf[js.Any])
      
      inline def setGhostRaw(value: ViewStyle): Self = StObject.set(x, "ghostRaw", value.asInstanceOf[js.Any])
      
      inline def setGhostRawText(value: TextStyle): Self = StObject.set(x, "ghostRawText", value.asInstanceOf[js.Any])
      
      inline def setIndicator(value: ViewStyle): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setLargeRaw(value: ViewStyle): Self = StObject.set(x, "largeRaw", value.asInstanceOf[js.Any])
      
      inline def setLargeRawText(value: TextStyle): Self = StObject.set(x, "largeRawText", value.asInstanceOf[js.Any])
      
      inline def setPrimaryDisabledRaw(value: ViewStyle): Self = StObject.set(x, "primaryDisabledRaw", value.asInstanceOf[js.Any])
      
      inline def setPrimaryDisabledRawText(value: TextStyle): Self = StObject.set(x, "primaryDisabledRawText", value.asInstanceOf[js.Any])
      
      inline def setPrimaryHighlight(value: ViewStyle): Self = StObject.set(x, "primaryHighlight", value.asInstanceOf[js.Any])
      
      inline def setPrimaryHighlightText(value: TextStyle): Self = StObject.set(x, "primaryHighlightText", value.asInstanceOf[js.Any])
      
      inline def setPrimaryRaw(value: ViewStyle): Self = StObject.set(x, "primaryRaw", value.asInstanceOf[js.Any])
      
      inline def setPrimaryRawText(value: TextStyle): Self = StObject.set(x, "primaryRawText", value.asInstanceOf[js.Any])
      
      inline def setSmallRaw(value: ViewStyle): Self = StObject.set(x, "smallRaw", value.asInstanceOf[js.Any])
      
      inline def setSmallRawText(value: TextStyle): Self = StObject.set(x, "smallRawText", value.asInstanceOf[js.Any])
      
      inline def setWarningDisabledRaw(value: ViewStyle): Self = StObject.set(x, "warningDisabledRaw", value.asInstanceOf[js.Any])
      
      inline def setWarningDisabledRawText(value: TextStyle): Self = StObject.set(x, "warningDisabledRawText", value.asInstanceOf[js.Any])
      
      inline def setWarningHighlight(value: ViewStyle): Self = StObject.set(x, "warningHighlight", value.asInstanceOf[js.Any])
      
      inline def setWarningHighlightText(value: TextStyle): Self = StObject.set(x, "warningHighlightText", value.asInstanceOf[js.Any])
      
      inline def setWarningRaw(value: ViewStyle): Self = StObject.set(x, "warningRaw", value.asInstanceOf[js.Any])
      
      inline def setWarningRawText(value: TextStyle): Self = StObject.set(x, "warningRawText", value.asInstanceOf[js.Any])
      
      inline def setWrapperStyle(value: ViewStyle): Self = StObject.set(x, "wrapperStyle", value.asInstanceOf[js.Any])
    }
  }
}
