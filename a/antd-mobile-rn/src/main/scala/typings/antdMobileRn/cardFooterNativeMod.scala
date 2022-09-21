package typings.antdMobileRn

import typings.antdMobileRn.anon.Style
import typings.antdMobileRn.cardPropsTypeMod.CardFooterPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardFooterNativeMod {
  
  @JSImport("antd-mobile-rn/lib/card/CardFooter.native", JSImport.Default)
  @js.native
  open class default () extends CardFooter
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/card/CardFooter.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/card/CardFooter.native", "default.defaultProps")
    @js.native
    def defaultProps: Style = js.native
    inline def defaultProps_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardFooter extends Component[CardFooterProps, Any, Any]
  
  trait CardFooterProps
    extends StObject
       with CardFooterPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
  }
  object CardFooterProps {
    
    inline def apply(): CardFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardFooterProps]
    }
    
    extension [Self <: CardFooterProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
