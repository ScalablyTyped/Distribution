package typings.antdMobileRn

import typings.antdMobileRn.anon.Style
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardBodyNativeMod {
  
  @JSImport("antd-mobile-rn/lib/card/CardBody.native", JSImport.Default)
  @js.native
  class default () extends CardBody
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/card/CardBody.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/card/CardBody.native", "default.defaultProps")
    @js.native
    def defaultProps: Style = js.native
    inline def defaultProps_=(x: Style): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardBody
    extends Component[CardBodyProps, js.Any, js.Any]
  
  trait CardBodyProps extends StObject {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[js.Any] = js.undefined
  }
  object CardBodyProps {
    
    inline def apply(): CardBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardBodyProps]
    }
    
    extension [Self <: CardBodyProps](x: Self) {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
