package typings.antdMobileRn

import typings.antdMobileRn.anon.BorderLeftWidth
import typings.antdMobileRn.anon.BorderTopWidth
import typings.antdMobileRn.anon.ColorFlex
import typings.antdMobileRn.anon.ColorFlexFontSize
import typings.antdMobileRn.anon.ColorFontSize
import typings.antdMobileRn.anon.Flex
import typings.antdMobileRn.anon.FlexFontSize
import typings.antdMobileRn.anon.MarginLeft
import typings.antdMobileRn.anon.MarginRight
import typings.antdMobileRn.anon.PaddingBottom
import typings.antdMobileRn.anon.PaddingHorizontal
import typings.reactNative.mod.ImageStyle
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCardStyleIndexDotnativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.body")
    @js.native
    def body: BorderTopWidth = js.native
    inline def body_=(x: BorderTopWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("body")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.card")
    @js.native
    def card: PaddingBottom = js.native
    inline def card_=(x: PaddingBottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("card")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.footerContent")
    @js.native
    def footerContent: ColorFlexFontSize = js.native
    inline def footerContent_=(x: ColorFlexFontSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footerContent")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.footerExtra")
    @js.native
    def footerExtra: ColorFontSize = js.native
    inline def footerExtra_=(x: ColorFontSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footerExtra")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.footerWrap")
    @js.native
    def footerWrap: PaddingHorizontal = js.native
    inline def footerWrap_=(x: PaddingHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footerWrap")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.full")
    @js.native
    def full: BorderLeftWidth = js.native
    inline def full_=(x: BorderLeftWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("full")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.headerContent")
    @js.native
    def headerContent: ColorFlex = js.native
    inline def headerContent_=(x: ColorFlex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerContent")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.headerExtra")
    @js.native
    def headerExtra: FlexFontSize = js.native
    inline def headerExtra_=(x: FlexFontSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerExtra")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.headerImage")
    @js.native
    def headerImage: MarginRight = js.native
    inline def headerImage_=(x: MarginRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerImage")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.headerTitle")
    @js.native
    def headerTitle: Flex = js.native
    inline def headerTitle_=(x: Flex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/style/index.native", "default.headerWrap")
    @js.native
    def headerWrap: MarginLeft = js.native
    inline def headerWrap_=(x: MarginLeft): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerWrap")(x.asInstanceOf[js.Any])
  }
  
  trait ICardStyle extends StObject {
    
    var body: ViewStyle
    
    var card: ViewStyle
    
    var footerContent: TextStyle
    
    var footerExtra: TextStyle
    
    var footerWrap: ViewStyle
    
    var full: ViewStyle
    
    var headerContent: TextStyle
    
    var headerExtra: TextStyle
    
    var headerImage: ImageStyle
    
    var headerTitle: ViewStyle
    
    var headerWrap: ViewStyle
  }
  object ICardStyle {
    
    inline def apply(
      body: ViewStyle,
      card: ViewStyle,
      footerContent: TextStyle,
      footerExtra: TextStyle,
      footerWrap: ViewStyle,
      full: ViewStyle,
      headerContent: TextStyle,
      headerExtra: TextStyle,
      headerImage: ImageStyle,
      headerTitle: ViewStyle,
      headerWrap: ViewStyle
    ): ICardStyle = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], footerContent = footerContent.asInstanceOf[js.Any], footerExtra = footerExtra.asInstanceOf[js.Any], footerWrap = footerWrap.asInstanceOf[js.Any], full = full.asInstanceOf[js.Any], headerContent = headerContent.asInstanceOf[js.Any], headerExtra = headerExtra.asInstanceOf[js.Any], headerImage = headerImage.asInstanceOf[js.Any], headerTitle = headerTitle.asInstanceOf[js.Any], headerWrap = headerWrap.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICardStyle]
    }
    
    extension [Self <: ICardStyle](x: Self) {
      
      inline def setBody(value: ViewStyle): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setCard(value: ViewStyle): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
      
      inline def setFooterContent(value: TextStyle): Self = StObject.set(x, "footerContent", value.asInstanceOf[js.Any])
      
      inline def setFooterExtra(value: TextStyle): Self = StObject.set(x, "footerExtra", value.asInstanceOf[js.Any])
      
      inline def setFooterWrap(value: ViewStyle): Self = StObject.set(x, "footerWrap", value.asInstanceOf[js.Any])
      
      inline def setFull(value: ViewStyle): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
      
      inline def setHeaderContent(value: TextStyle): Self = StObject.set(x, "headerContent", value.asInstanceOf[js.Any])
      
      inline def setHeaderExtra(value: TextStyle): Self = StObject.set(x, "headerExtra", value.asInstanceOf[js.Any])
      
      inline def setHeaderImage(value: ImageStyle): Self = StObject.set(x, "headerImage", value.asInstanceOf[js.Any])
      
      inline def setHeaderTitle(value: ViewStyle): Self = StObject.set(x, "headerTitle", value.asInstanceOf[js.Any])
      
      inline def setHeaderWrap(value: ViewStyle): Self = StObject.set(x, "headerWrap", value.asInstanceOf[js.Any])
    }
  }
}
