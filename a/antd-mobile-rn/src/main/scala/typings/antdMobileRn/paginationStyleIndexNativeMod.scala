package typings.antdMobileRn

import typings.antdMobileRn.anon.AlignItemsString
import typings.antdMobileRn.anon.BackgroundColorBorderRadius
import typings.antdMobileRn.anon.BackgroundColorString
import typings.antdMobileRn.anon.ColorStringFontSizeNumber
import typings.antdMobileRn.anon.FlexDirectionJustifyContent
import typings.antdMobileRn.anon.FlexDirectionString
import typings.antdMobileRn.anon.MarginHorizontal
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/pagination/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/pagination/style/index.native", "default.activeTextStyle")
    @js.native
    def activeTextStyle: ColorStringFontSizeNumber = js.native
    @scala.inline
    def activeTextStyle_=(x: ColorStringFontSizeNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("activeTextStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/pagination/style/index.native", "default.container")
    @js.native
    def container: AlignItemsString = js.native
    @scala.inline
    def container_=(x: AlignItemsString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/pagination/style/index.native", "default.indicatorStyle")
    @js.native
    def indicatorStyle: FlexDirectionString = js.native
    @scala.inline
    def indicatorStyle_=(x: FlexDirectionString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("indicatorStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/pagination/style/index.native", "default.numberStyle")
    @js.native
    def numberStyle: FlexDirectionJustifyContent = js.native
    @scala.inline
    def numberStyle_=(x: FlexDirectionJustifyContent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("numberStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/pagination/style/index.native", "default.pointActiveStyle")
    @js.native
    def pointActiveStyle: BackgroundColorString = js.native
    @scala.inline
    def pointActiveStyle_=(x: BackgroundColorString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointActiveStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/pagination/style/index.native", "default.pointStyle")
    @js.native
    def pointStyle: BackgroundColorBorderRadius = js.native
    @scala.inline
    def pointStyle_=(x: BackgroundColorBorderRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pointStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/pagination/style/index.native", "default.spaceStyle")
    @js.native
    def spaceStyle: MarginHorizontal = js.native
    @scala.inline
    def spaceStyle_=(x: MarginHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spaceStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/pagination/style/index.native", "default.totalStyle")
    @js.native
    def totalStyle: ColorStringFontSizeNumber = js.native
    @scala.inline
    def totalStyle_=(x: ColorStringFontSizeNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("totalStyle")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IPaginationStyle extends StObject {
    
    var activeTextStyle: TextStyle = js.native
    
    var container: ViewStyle = js.native
    
    var indicatorStyle: ViewStyle = js.native
    
    var numberStyle: ViewStyle = js.native
    
    var pointActiveStyle: ViewStyle = js.native
    
    var pointStyle: ViewStyle = js.native
    
    var spaceStyle: ViewStyle = js.native
    
    var totalStyle: TextStyle = js.native
  }
  object IPaginationStyle {
    
    @scala.inline
    def apply(
      activeTextStyle: TextStyle,
      container: ViewStyle,
      indicatorStyle: ViewStyle,
      numberStyle: ViewStyle,
      pointActiveStyle: ViewStyle,
      pointStyle: ViewStyle,
      spaceStyle: ViewStyle,
      totalStyle: TextStyle
    ): IPaginationStyle = {
      val __obj = js.Dynamic.literal(activeTextStyle = activeTextStyle.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], numberStyle = numberStyle.asInstanceOf[js.Any], pointActiveStyle = pointActiveStyle.asInstanceOf[js.Any], pointStyle = pointStyle.asInstanceOf[js.Any], spaceStyle = spaceStyle.asInstanceOf[js.Any], totalStyle = totalStyle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPaginationStyle]
    }
    
    @scala.inline
    implicit class IPaginationStyleMutableBuilder[Self <: IPaginationStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveTextStyle(value: TextStyle): Self = StObject.set(x, "activeTextStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicatorStyle(value: ViewStyle): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberStyle(value: ViewStyle): Self = StObject.set(x, "numberStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointActiveStyle(value: ViewStyle): Self = StObject.set(x, "pointActiveStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPointStyle(value: ViewStyle): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpaceStyle(value: ViewStyle): Self = StObject.set(x, "spaceStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalStyle(value: TextStyle): Self = StObject.set(x, "totalStyle", value.asInstanceOf[js.Any])
    }
  }
}
