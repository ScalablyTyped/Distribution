package typings.antdMobileRn

import typings.antdMobileRn.anon.BackgroundColorFontSize
import typings.antdMobileRn.anon.BorderBottomColorBorderBottomWidth
import typings.antdMobileRn.anon.BottomPosition
import typings.antdMobileRn.anon.HeightPosition
import typings.antdMobileRn.anon.PositionRight
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTextareaItemStyleIndexDotnativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.container")
    @js.native
    def container: BorderBottomColorBorderBottomWidth = js.native
    inline def container_=(x: BorderBottomColorBorderBottomWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.count")
    @js.native
    def count: BottomPosition = js.native
    inline def count_=(x: BottomPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.errorIcon")
    @js.native
    def errorIcon: PositionRight = js.native
    inline def errorIcon_=(x: PositionRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.icon")
    @js.native
    def icon: HeightPosition = js.native
    inline def icon_=(x: HeightPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.input")
    @js.native
    def input: BackgroundColorFontSize = js.native
    inline def input_=(x: BackgroundColorFontSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
  }
  
  trait ITextareaItemStyle extends StObject {
    
    var container: ViewStyle
    
    var count: ViewStyle
    
    var errorIcon: ViewStyle
    
    var icon: ViewStyle
    
    var input: TextStyle
  }
  object ITextareaItemStyle {
    
    inline def apply(container: ViewStyle, count: ViewStyle, errorIcon: ViewStyle, icon: ViewStyle, input: TextStyle): ITextareaItemStyle = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextareaItemStyle]
    }
    
    extension [Self <: ITextareaItemStyle](x: Self) {
      
      inline def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setCount(value: ViewStyle): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setErrorIcon(value: ViewStyle): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      inline def setIcon(value: ViewStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
}
