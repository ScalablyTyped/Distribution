package typings.antd.anon

import typings.rcMenu.interfaceMod.MenuMode
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined antd.antd/lib/menu/OverrideContext.OverrideContextProps & {  children :react.react.ReactNode} */
trait OverrideContextPropschild extends StObject {
  
  var children: ReactNode
  
  var expandIcon: js.UndefOr[ReactNode] = js.undefined
  
  var mode: js.UndefOr[MenuMode] = js.undefined
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var validator: js.UndefOr[js.Function1[/* menuProps */ PickMenuPropsmode, Unit]] = js.undefined
}
object OverrideContextPropschild {
  
  inline def apply(): OverrideContextPropschild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OverrideContextPropschild]
  }
  
  extension [Self <: OverrideContextPropschild](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setExpandIcon(value: ReactNode): Self = StObject.set(x, "expandIcon", value.asInstanceOf[js.Any])
    
    inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
    
    inline def setMode(value: MenuMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setValidator(value: /* menuProps */ PickMenuPropsmode => Unit): Self = StObject.set(x, "validator", js.Any.fromFunction1(value))
    
    inline def setValidatorUndefined: Self = StObject.set(x, "validator", js.undefined)
  }
}
