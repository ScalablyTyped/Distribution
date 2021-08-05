package typings.antdMobile

import typings.antdMobile.anon.Disabled
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object itemMod {
  
  @JSImport("antd-mobile/lib/popover/Item", JSImport.Default)
  @js.native
  class default () extends Item
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/popover/Item", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/popover/Item", "default.defaultProps")
    @js.native
    def defaultProps: Disabled = js.native
    inline def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/popover/Item", "default.myName")
    @js.native
    def myName: String = js.native
    inline def myName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("myName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Item
    extends Component[PopoverItemProps, js.Any, js.Any]
  
  trait PopoverItemProps extends StObject {
    
    var activeStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var firstItem: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object PopoverItemProps {
    
    inline def apply(): PopoverItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverItemProps]
    }
    
    extension [Self <: PopoverItemProps](x: Self) {
      
      inline def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFirstItem(value: String): Self = StObject.set(x, "firstItem", value.asInstanceOf[js.Any])
      
      inline def setFirstItemUndefined: Self = StObject.set(x, "firstItem", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
