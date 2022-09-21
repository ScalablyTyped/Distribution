package typings.antd.tableInterfaceMod

import typings.antd.useSelectionMod.INTERNAL_SELECTION_ITEM
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectionItem
  extends StObject
     with INTERNAL_SELECTION_ITEM {
  
  var key: String
  
  var onSelect: js.UndefOr[SelectionItemSelectFn] = js.undefined
  
  var text: ReactNode
}
object SelectionItem {
  
  inline def apply(key: String): SelectionItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionItem]
  }
  
  extension [Self <: SelectionItem](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setOnSelect(value: /* currentRowKeys */ js.Array[Key] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setText(value: ReactNode): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
