package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/transfer.TransferLocale> */
trait PartialTransferLocale extends StObject {
  
  var itemUnit: js.UndefOr[String] = js.undefined
  
  var itemsUnit: js.UndefOr[String] = js.undefined
  
  var notFoundContent: js.UndefOr[ReactNode | js.Array[ReactNode]] = js.undefined
  
  var remove: js.UndefOr[String] = js.undefined
  
  var removeAll: js.UndefOr[String] = js.undefined
  
  var removeCurrent: js.UndefOr[String] = js.undefined
  
  var searchPlaceholder: js.UndefOr[String] = js.undefined
  
  var selectAll: js.UndefOr[String] = js.undefined
  
  var selectCurrent: js.UndefOr[String] = js.undefined
  
  var selectInvert: js.UndefOr[String] = js.undefined
  
  var titles: js.UndefOr[js.Array[ReactNode]] = js.undefined
}
object PartialTransferLocale {
  
  inline def apply(): PartialTransferLocale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTransferLocale]
  }
  
  extension [Self <: PartialTransferLocale](x: Self) {
    
    inline def setItemUnit(value: String): Self = StObject.set(x, "itemUnit", value.asInstanceOf[js.Any])
    
    inline def setItemUnitUndefined: Self = StObject.set(x, "itemUnit", js.undefined)
    
    inline def setItemsUnit(value: String): Self = StObject.set(x, "itemsUnit", value.asInstanceOf[js.Any])
    
    inline def setItemsUnitUndefined: Self = StObject.set(x, "itemsUnit", js.undefined)
    
    inline def setNotFoundContent(value: ReactNode | js.Array[ReactNode]): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
    
    inline def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
    
    inline def setNotFoundContentVarargs(value: ReactNode*): Self = StObject.set(x, "notFoundContent", js.Array(value*))
    
    inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveAll(value: String): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
    
    inline def setRemoveAllUndefined: Self = StObject.set(x, "removeAll", js.undefined)
    
    inline def setRemoveCurrent(value: String): Self = StObject.set(x, "removeCurrent", value.asInstanceOf[js.Any])
    
    inline def setRemoveCurrentUndefined: Self = StObject.set(x, "removeCurrent", js.undefined)
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholderUndefined: Self = StObject.set(x, "searchPlaceholder", js.undefined)
    
    inline def setSelectAll(value: String): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setSelectAllUndefined: Self = StObject.set(x, "selectAll", js.undefined)
    
    inline def setSelectCurrent(value: String): Self = StObject.set(x, "selectCurrent", value.asInstanceOf[js.Any])
    
    inline def setSelectCurrentUndefined: Self = StObject.set(x, "selectCurrent", js.undefined)
    
    inline def setSelectInvert(value: String): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
    
    inline def setSelectInvertUndefined: Self = StObject.set(x, "selectInvert", js.undefined)
    
    inline def setTitles(value: js.Array[ReactNode]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    inline def setTitlesUndefined: Self = StObject.set(x, "titles", js.undefined)
    
    inline def setTitlesVarargs(value: ReactNode*): Self = StObject.set(x, "titles", js.Array(value*))
  }
}
