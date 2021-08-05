package typings.antdMobile

import typings.antdMobile.anon.ThumbStyle
import typings.antdMobile.cardPropsTypeMod.CardHeaderPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardHeaderMod {
  
  @JSImport("antd-mobile/lib/card/CardHeader", JSImport.Default)
  @js.native
  class default () extends CardHeader
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/card/CardHeader", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/card/CardHeader", "default.defaultProps")
    @js.native
    def defaultProps: ThumbStyle = js.native
    inline def defaultProps_=(x: ThumbStyle): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardHeader
    extends Component[CardHeaderProps, js.Any, js.Any]
  
  trait CardHeaderProps
    extends StObject
       with CardHeaderPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var thumbStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object CardHeaderProps {
    
    inline def apply(): CardHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardHeaderProps]
    }
    
    extension [Self <: CardHeaderProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setThumbStyle(value: CSSProperties): Self = StObject.set(x, "thumbStyle", value.asInstanceOf[js.Any])
      
      inline def setThumbStyleUndefined: Self = StObject.set(x, "thumbStyle", js.undefined)
    }
  }
}
