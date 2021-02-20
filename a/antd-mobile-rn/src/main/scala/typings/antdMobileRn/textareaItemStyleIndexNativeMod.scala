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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textareaItemStyleIndexNativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.container")
    @js.native
    def container: BorderBottomColorBorderBottomWidth = js.native
    @scala.inline
    def container_=(x: BorderBottomColorBorderBottomWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("container")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.count")
    @js.native
    def count: BottomPosition = js.native
    @scala.inline
    def count_=(x: BottomPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("count")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.errorIcon")
    @js.native
    def errorIcon: PositionRight = js.native
    @scala.inline
    def errorIcon_=(x: PositionRight): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("errorIcon")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.icon")
    @js.native
    def icon: HeightPosition = js.native
    @scala.inline
    def icon_=(x: HeightPosition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("icon")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/textarea-item/style/index.native", "default.input")
    @js.native
    def input: BackgroundColorFontSize = js.native
    @scala.inline
    def input_=(x: BackgroundColorFontSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITextareaItemStyle extends StObject {
    
    var container: ViewStyle = js.native
    
    var count: ViewStyle = js.native
    
    var errorIcon: ViewStyle = js.native
    
    var icon: ViewStyle = js.native
    
    var input: TextStyle = js.native
  }
  object ITextareaItemStyle {
    
    @scala.inline
    def apply(container: ViewStyle, count: ViewStyle, errorIcon: ViewStyle, icon: ViewStyle, input: TextStyle): ITextareaItemStyle = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], errorIcon = errorIcon.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITextareaItemStyle]
    }
    
    @scala.inline
    implicit class ITextareaItemStyleMutableBuilder[Self <: ITextareaItemStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: ViewStyle): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCount(value: ViewStyle): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorIcon(value: ViewStyle): Self = StObject.set(x, "errorIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIcon(value: ViewStyle): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
}
