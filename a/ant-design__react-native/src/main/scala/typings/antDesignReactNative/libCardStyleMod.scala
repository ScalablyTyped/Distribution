package typings.antDesignReactNative

import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCardStyleMod {
  
  @JSImport("@ant-design/react-native/lib/card/style", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(theme: Theme): CardStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(theme.asInstanceOf[js.Any]).asInstanceOf[CardStyle]
  
  trait CardStyle extends StObject {
    
    var body: ViewStyle
    
    var card: ViewStyle
    
    var footerContent: TextStyle
    
    var footerExtra: TextStyle
    
    var footerWrap: ViewStyle
    
    var full: ViewStyle
    
    var headerContent: TextStyle
    
    var headerContentWrap: ViewStyle
    
    var headerExtra: TextStyle
    
    var headerExtraWrap: ViewStyle
    
    var headerImage: ImageStyle
    
    var headerTitle: ViewStyle
    
    var headerWrap: ViewStyle
  }
  object CardStyle {
    
    inline def apply(
      body: ViewStyle,
      card: ViewStyle,
      footerContent: TextStyle,
      footerExtra: TextStyle,
      footerWrap: ViewStyle,
      full: ViewStyle,
      headerContent: TextStyle,
      headerContentWrap: ViewStyle,
      headerExtra: TextStyle,
      headerExtraWrap: ViewStyle,
      headerImage: ImageStyle,
      headerTitle: ViewStyle,
      headerWrap: ViewStyle
    ): CardStyle = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerContentWrap = headerContentWrap.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerExtraWrap = headerExtraWrap.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardStyle]
    }
    
    extension [Self <: CardStyle](x: Self) {
      
      inline def setBody(value: ViewStyle): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCard(value: ViewStyle): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setFooterContent(value: TextStyle): Self = StObject.set(x, "footerContent", value.asInstanceOf[js.Any])
      
      inline def setFooterExtra(value: TextStyle): Self = StObject.set(x, "footerExtra", value.asInstanceOf[js.Any])
      
      inline def setFooterWrap(value: ViewStyle): Self = StObject.set(x, "footerWrap", value.asInstanceOf[js.Any])
      
      inline def setFull(value: ViewStyle): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setHeaderContent(value: TextStyle): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderContentWrap(value: ViewStyle): Self = StObject.set(x, "headerContentWrap", value.asInstanceOf[js.Any])
      
      inline def setHeaderExtra(value: TextStyle): Self = StObject.set(x, "headerExtra", value.asInstanceOf[js.Any])
      
      inline def setHeaderExtraWrap(value: ViewStyle): Self = StObject.set(x, "headerExtraWrap", value.asInstanceOf[js.Any])
      
      inline def setHeaderImage(value: ImageStyle): Self = StObject.set(x, "headerImage", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitle(value: ViewStyle): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderWrap(value: ViewStyle): Self = StObject.set(x, "headerWrap", value.asInstanceOf[js.Any])
    }
  }
}
