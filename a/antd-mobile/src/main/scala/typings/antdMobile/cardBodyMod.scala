package typings.antdMobile

import typings.antdMobile.anon.PrefixCls
import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardBodyMod {
  
  @JSImport("antd-mobile/lib/card/CardBody", JSImport.Default)
  @js.native
  class default () extends CardBody
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/card/CardBody", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/card/CardBody", "default.defaultProps")
    @js.native
    def defaultProps: PrefixCls = js.native
    inline def defaultProps_=(x: PrefixCls): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait CardBody
    extends Component[CardBodyProps, js.Any, js.Any]
  
  trait CardBodyProps
    extends StObject
       with HTMLProps[HTMLDivElement] {
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object CardBodyProps {
    
    inline def apply(): CardBodyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardBodyProps]
    }
    
    extension [Self <: CardBodyProps](x: Self) {
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
