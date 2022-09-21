package typings.antDesignProUtils

import typings.antDesignProUtils.antDesignProUtilsBooleans.`false`
import typings.react.mod.FC
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownFooterMod {
  
  @JSImport("@ant-design/pro-utils/es/components/DropdownFooter", "DropdownFooter")
  @js.native
  val DropdownFooter: FC[DropdownFooterProps] = js.native
  
  trait DropdownFooterProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var footerRender: js.UndefOr[LightFilterFooterRender] = js.undefined
    
    var onClear: js.UndefOr[OnClick] = js.undefined
    
    var onConfirm: js.UndefOr[OnClick] = js.undefined
  }
  object DropdownFooterProps {
    
    inline def apply(): DropdownFooterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownFooterProps]
    }
    
    extension [Self <: DropdownFooterProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFooterRender(value: LightFilterFooterRender): Self = StObject.set(x, "footerRender", value.asInstanceOf[js.Any])
      
      inline def setFooterRenderFunction2(
        value: (/* onConfirm */ js.UndefOr[js.Function1[/* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]], Unit]], /* onClear */ js.UndefOr[js.Function1[/* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]], Unit]]) => typings.react.mod.global.JSX.Element | `false`
      ): Self = StObject.set(x, "footerRender", js.Any.fromFunction2(value))
      
      inline def setFooterRenderUndefined: Self = StObject.set(x, "footerRender", js.undefined)
      
      inline def setOnClear(value: /* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnConfirm(value: /* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
    }
  }
  
  type LightFilterFooterRender = (js.Function2[
    /* onConfirm */ js.UndefOr[js.Function1[/* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]], Unit]], 
    /* onClear */ js.UndefOr[js.Function1[/* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]], Unit]], 
    typings.react.mod.global.JSX.Element | `false`
  ]) | `false`
  
  type OnClick = js.Function1[/* e */ js.UndefOr[MouseEvent[Element, NativeMouseEvent]], Unit]
}
