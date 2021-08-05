package typings.antdMobile

import typings.antdMobile.anon.RadioProps
import typings.antdMobile.radioPropsTypeMod.RadioItemPropsType
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object radioItemMod {
  
  @JSImport("antd-mobile/lib/radio/RadioItem", JSImport.Default)
  @js.native
  class default () extends RadioItem
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/radio/RadioItem", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/radio/RadioItem", "default.defaultProps")
    @js.native
    def defaultProps: RadioProps = js.native
    inline def defaultProps_=(x: RadioProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait RadioItem
    extends Component[RadioItemProps, js.Any, js.Any]
  
  trait RadioItemProps
    extends StObject
       with RadioItemPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var listPrefixCls: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object RadioItemProps {
    
    inline def apply(): RadioItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioItemProps]
    }
    
    extension [Self <: RadioItemProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setListPrefixCls(value: String): Self = StObject.set(x, "listPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setListPrefixClsUndefined: Self = StObject.set(x, "listPrefixCls", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
}
