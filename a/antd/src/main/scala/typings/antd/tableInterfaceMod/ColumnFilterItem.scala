package typings.antd.tableInterfaceMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFilterItem extends StObject {
  
  var children: js.UndefOr[js.Array[ColumnFilterItem]] = js.undefined
  
  var text: ReactNode
  
  var value: String | Double | Boolean
}
object ColumnFilterItem {
  
  inline def apply(value: String | Double | Boolean): ColumnFilterItem = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnFilterItem]
  }
  
  extension [Self <: ColumnFilterItem](x: Self) {
    
    inline def setChildren(value: js.Array[ColumnFilterItem]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ColumnFilterItem*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setValue(value: String | Double | Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
