package typings.antdMobile

import typings.antdMobile.anon.PrefixCls
import typings.antdMobile.cardPropsTypeMod.CardFooterPropsType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardFooterMod {
  
  @JSImport("antd-mobile/lib/card/CardFooter", JSImport.Default)
  @js.native
  class default () extends CardFooter
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/card/CardFooter", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/card/CardFooter", "default.defaultProps")
    @js.native
    def defaultProps: PrefixCls = js.native
    inline def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardFooter
    extends Component[CardFooterProps, js.Any, js.Any]
  
  trait CardFooterProps
    extends StObject
       with CardFooterPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object CardFooterProps {
    
    inline def apply(): CardFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardFooterProps]
    }
    
    extension [Self <: CardFooterProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
