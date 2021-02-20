package typings.antdMobile

import typings.antdMobile.anon.Disabled
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @scala.inline
    def defaultProps_=(x: Disabled): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/popover/Item", "default.myName")
    @js.native
    def myName: String = js.native
    @scala.inline
    def myName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("myName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Item
    extends Component[PopoverItemProps, js.Any, js.Any]
  
  @js.native
  trait PopoverItemProps extends StObject {
    
    var activeStyle: js.UndefOr[CSSProperties] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var firstItem: js.UndefOr[String] = js.native
    
    var icon: js.UndefOr[ReactNode] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object PopoverItemProps {
    
    @scala.inline
    def apply(): PopoverItemProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverItemProps]
    }
    
    @scala.inline
    implicit class PopoverItemPropsMutableBuilder[Self <: PopoverItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFirstItem(value: String): Self = StObject.set(x, "firstItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstItemUndefined: Self = StObject.set(x, "firstItem", js.undefined)
      
      @scala.inline
      def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
