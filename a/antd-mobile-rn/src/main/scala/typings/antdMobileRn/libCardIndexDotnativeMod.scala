package typings.antdMobileRn

import typings.antdMobileRn.anon.Full
import typings.antdMobileRn.anon.TypeofCardBody
import typings.antdMobileRn.anon.TypeofCardFooter
import typings.antdMobileRn.anon.TypeofCardHeader
import typings.antdMobileRn.libCardPropsTypeMod.CardPropsType
import typings.antdMobileRn.libCardStyleIndexDotnativeMod.ICardStyle
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCardIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/card/index.native", JSImport.Default)
  @js.native
  open class default () extends Card
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/card/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/card/index.native", "default.Body")
    @js.native
    def Body: TypeofCardBody = js.native
    inline def Body_=(x: TypeofCardBody): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Body")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/index.native", "default.Footer")
    @js.native
    def Footer: TypeofCardFooter = js.native
    inline def Footer_=(x: TypeofCardFooter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Footer")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/index.native", "default.Header")
    @js.native
    def Header: TypeofCardHeader = js.native
    inline def Header_=(x: TypeofCardHeader): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Header")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile-rn/lib/card/index.native", "default.defaultProps")
    @js.native
    def defaultProps: Full = js.native
    inline def defaultProps_=(x: Full): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Card extends Component[CardNativeProps, Any, Any]
  
  trait CardNativeProps
    extends StObject
       with CardPropsType {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[ICardStyle] = js.undefined
  }
  object CardNativeProps {
    
    inline def apply(): CardNativeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardNativeProps]
    }
    
    extension [Self <: CardNativeProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: ICardStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
