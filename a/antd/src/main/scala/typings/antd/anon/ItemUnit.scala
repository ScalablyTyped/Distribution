package typings.antd.anon

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemUnit extends StObject {
  
  var itemUnit: String
  
  var itemsUnit: String
  
  var notFoundContent: ReactNode
  
  var remove: String
  
  var removeAll: String
  
  var removeCurrent: String
  
  var searchPlaceholder: String
  
  var selectAll: String
  
  var selectCurrent: String
  
  var selectInvert: String
  
  var titles: js.Array[String]
}
object ItemUnit {
  
  inline def apply(
    itemUnit: String,
    itemsUnit: String,
    remove: String,
    removeAll: String,
    removeCurrent: String,
    searchPlaceholder: String,
    selectAll: String,
    selectCurrent: String,
    selectInvert: String,
    titles: js.Array[String]
  ): ItemUnit = {
    val __obj = js.Dynamic.literal(itemUnit = itemUnit.asInstanceOf[js.Any], itemsUnit = itemsUnit.asInstanceOf[js.Any], remove = remove.asInstanceOf[js.Any], removeAll = removeAll.asInstanceOf[js.Any], removeCurrent = removeCurrent.asInstanceOf[js.Any], searchPlaceholder = searchPlaceholder.asInstanceOf[js.Any], selectAll = selectAll.asInstanceOf[js.Any], selectCurrent = selectCurrent.asInstanceOf[js.Any], selectInvert = selectInvert.asInstanceOf[js.Any], titles = titles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemUnit]
  }
  
  extension [Self <: ItemUnit](x: Self) {
    
    inline def setItemUnit(value: String): Self = StObject.set(x, "itemUnit", value.asInstanceOf[js.Any])
    
    inline def setItemsUnit(value: String): Self = StObject.set(x, "itemsUnit", value.asInstanceOf[js.Any])
    
    inline def setNotFoundContent(value: ReactNode): Self = StObject.set(x, "notFoundContent", value.asInstanceOf[js.Any])
    
    inline def setNotFoundContentUndefined: Self = StObject.set(x, "notFoundContent", js.undefined)
    
    inline def setRemove(value: String): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
    
    inline def setRemoveAll(value: String): Self = StObject.set(x, "removeAll", value.asInstanceOf[js.Any])
    
    inline def setRemoveCurrent(value: String): Self = StObject.set(x, "removeCurrent", value.asInstanceOf[js.Any])
    
    inline def setSearchPlaceholder(value: String): Self = StObject.set(x, "searchPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setSelectAll(value: String): Self = StObject.set(x, "selectAll", value.asInstanceOf[js.Any])
    
    inline def setSelectCurrent(value: String): Self = StObject.set(x, "selectCurrent", value.asInstanceOf[js.Any])
    
    inline def setSelectInvert(value: String): Self = StObject.set(x, "selectInvert", value.asInstanceOf[js.Any])
    
    inline def setTitles(value: js.Array[String]): Self = StObject.set(x, "titles", value.asInstanceOf[js.Any])
    
    inline def setTitlesVarargs(value: String*): Self = StObject.set(x, "titles", js.Array(value :_*))
  }
}
