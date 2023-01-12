package typings.antDesignProUtils

import typings.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typings.antDesignProUtils.esComponentsDropdownFooterMod.DropdownFooterProps
import typings.antd.libTooltipMod.TooltipPlacement
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsFilterDropdownMod {
  
  @JSImport("@ant-design/pro-utils/es/components/FilterDropdown", "FilterDropdown")
  @js.native
  val FilterDropdown: FC[DropdownProps] = js.native
  
  trait DropdownProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var footer: js.UndefOr[DropdownFooterProps] = js.undefined
    
    var footerRender: js.UndefOr[FooterRender] = js.undefined
    
    var label: js.UndefOr[ReactNode] = js.undefined
    
    var onOpenChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    /**
      * @deprecated use onOpenChange replace
      */
    var onVisibleChange: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var padding: js.UndefOr[Double] = js.undefined
    
    var placement: js.UndefOr[TooltipPlacement] = js.undefined
    
    /**
      * @deprecated use open replace
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownProps {
    
    inline def apply(): DropdownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropdownProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFooter(value: DropdownFooterProps): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterRender(value: FooterRender): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
      
      inline def setFooterRenderFunction2(
        value: (/* onConfirm */ js.UndefOr[js.Function1[/* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]], Unit]], /* onClear */ js.UndefOr[js.Function1[/* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]], Unit]]) => typings.react.mod.global.JSX.Element | `false`
      ): Self = StObject.set(x, "footerRender", js.Any.fromFunction2(value))
      
      inline def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setLabel(value: ReactNode): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setOnOpenChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onOpenChange", js.Any.fromFunction1(value))
      
      inline def setOnOpenChangeUndefined: Self = StObject.set(x, "onOpenChange", js.undefined)
      
      inline def setOnVisibleChange(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onVisibleChange", js.Any.fromFunction1(value))
      
      inline def setOnVisibleChangeUndefined: Self = StObject.set(x, "onVisibleChange", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setPlacement(value: TooltipPlacement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  type FooterRender = (js.Function2[
    /* onConfirm */ js.UndefOr[js.Function1[/* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]], Unit]], 
    /* onClear */ js.UndefOr[js.Function1[/* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]], Unit]], 
    typings.react.mod.global.JSX.Element | `false`
  ]) | `false`
}
