package typings.ahooks.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictkey
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var current: Double
  
  var filter: js.UndefOr[Any] = js.undefined
  
  var pageSize: Double
  
  var sorter: js.UndefOr[Any] = js.undefined
}
object Dictkey {
  
  inline def apply(current: Double, pageSize: Double): Dictkey = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], pageSize = pageSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictkey]
  }
  
  extension [Self <: Dictkey](x: Self) {
    
    inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
    
    inline def setSorter(value: Any): Self = StObject.set(x, "sorter", value.asInstanceOf[js.Any])
    
    inline def setSorterUndefined: Self = StObject.set(x, "sorter", js.undefined)
  }
}
