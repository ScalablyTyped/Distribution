package typings.antd.anon

import typings.react.mod.ReactFragment
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemIcon extends StObject {
  
  var clearIcon: String | Double | Boolean | ReactFragment | Element | (js.Function1[/* props */ Any, ReactNode])
  
  var itemIcon: String | Double | Boolean | ReactFragment | Element | (js.Function1[/* props */ Any, ReactNode]) | Null
  
  var removeIcon: String | Double | Boolean | ReactFragment | Element | (js.Function1[/* props */ Any, ReactNode]) | Null
  
  var suffixIcon: Element | (js.Function1[/* hasOpenShowSearch */ Open, Element])
}
object ItemIcon {
  
  inline def apply(
    clearIcon: String | Double | Boolean | ReactFragment | Element | (js.Function1[/* props */ Any, ReactNode]),
    suffixIcon: Element | (js.Function1[/* hasOpenShowSearch */ Open, Element])
  ): ItemIcon = {
    val __obj = js.Dynamic.literal(clearIcon = clearIcon.asInstanceOf[js.Any], suffixIcon = suffixIcon.asInstanceOf[js.Any], itemIcon = null, removeIcon = null)
    __obj.asInstanceOf[ItemIcon]
  }
  
  extension [Self <: ItemIcon](x: Self) {
    
    inline def setClearIcon(
      value: String | Double | Boolean | ReactFragment | Element | (js.Function1[/* props */ Any, ReactNode])
    ): Self = StObject.set(x, "clearIcon", value.asInstanceOf[js.Any])
    
    inline def setClearIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "clearIcon", js.Any.fromFunction1(value))
    
    inline def setItemIcon(
      value: String | Double | Boolean | ReactFragment | Element | (js.Function1[/* props */ Any, ReactNode])
    ): Self = StObject.set(x, "itemIcon", value.asInstanceOf[js.Any])
    
    inline def setItemIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "itemIcon", js.Any.fromFunction1(value))
    
    inline def setItemIconNull: Self = StObject.set(x, "itemIcon", null)
    
    inline def setRemoveIcon(
      value: String | Double | Boolean | ReactFragment | Element | (js.Function1[/* props */ Any, ReactNode])
    ): Self = StObject.set(x, "removeIcon", value.asInstanceOf[js.Any])
    
    inline def setRemoveIconFunction1(value: /* props */ Any => ReactNode): Self = StObject.set(x, "removeIcon", js.Any.fromFunction1(value))
    
    inline def setRemoveIconNull: Self = StObject.set(x, "removeIcon", null)
    
    inline def setSuffixIcon(value: Element | (js.Function1[/* hasOpenShowSearch */ Open, Element])): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
    
    inline def setSuffixIconFunction1(value: /* hasOpenShowSearch */ Open => Element): Self = StObject.set(x, "suffixIcon", js.Any.fromFunction1(value))
  }
}
