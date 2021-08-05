package typings.antdMobileRn

import typings.antdMobileRn.anon.BorderBottomRightRadius
import typings.antdMobileRn.anon.BorderTopLeftRadius
import typings.antdMobileRn.anon.BorderTopWidthBorderWidth
import typings.antdMobileRn.anon.FlexDirectionMarginTop
import typings.antdMobileRn.anon.FontSizeMarginTop
import typings.antdMobileRn.anon.HeightPaddingHorizontal
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promptDotnativeMod {
  
  object default {
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.input")
    @js.native
    def input: HeightPaddingHorizontal = js.native
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.inputFirst")
    @js.native
    def inputFirst: BorderTopLeftRadius = js.native
    inline def inputFirst_=(x: BorderTopLeftRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.inputGroup")
    @js.native
    def inputGroup: FlexDirectionMarginTop = js.native
    inline def inputGroup_=(x: FlexDirectionMarginTop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputGroup")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.inputLast")
    @js.native
    def inputLast: BorderBottomRightRadius = js.native
    inline def inputLast_=(x: BorderBottomRightRadius): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputLast")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.inputWrapper")
    @js.native
    def inputWrapper: BorderTopWidthBorderWidth = js.native
    inline def inputWrapper_=(x: BorderTopWidthBorderWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inputWrapper")(x.asInstanceOf[js.Any])
    
    inline def input_=(x: HeightPaddingHorizontal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/modal/style/prompt.native", "default.message")
    @js.native
    def message: FontSizeMarginTop = js.native
    inline def message_=(x: FontSizeMarginTop): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("message")(x.asInstanceOf[js.Any])
  }
  
  trait IPromptStyle extends StObject {
    
    var input: TextStyle
    
    var inputFirst: ViewStyle
    
    var inputGroup: ViewStyle
    
    var inputLast: ViewStyle
    
    var inputWrapper: ViewStyle
    
    var message: TextStyle
  }
  object IPromptStyle {
    
    inline def apply(
      input: TextStyle,
      inputFirst: ViewStyle,
      inputGroup: ViewStyle,
      inputLast: ViewStyle,
      inputWrapper: ViewStyle,
      message: TextStyle
    ): IPromptStyle = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], inputFirst = inputFirst.asInstanceOf[js.Any], inputGroup = inputGroup.asInstanceOf[js.Any], inputLast = inputLast.asInstanceOf[js.Any], inputWrapper = inputWrapper.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPromptStyle]
    }
    
    extension [Self <: IPromptStyle](x: Self) {
      
      inline def setInput(value: TextStyle): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputFirst(value: ViewStyle): Self = StObject.set(x, "inputFirst", value.asInstanceOf[js.Any])
      
      inline def setInputGroup(value: ViewStyle): Self = StObject.set(x, "inputGroup", value.asInstanceOf[js.Any])
      
      inline def setInputLast(value: ViewStyle): Self = StObject.set(x, "inputLast", value.asInstanceOf[js.Any])
      
      inline def setInputWrapper(value: ViewStyle): Self = StObject.set(x, "inputWrapper", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: TextStyle): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
}
