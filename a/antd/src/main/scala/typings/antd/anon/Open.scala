package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Open extends StObject {
  
  var open: Boolean
  
  var showSearch: Boolean
}
object Open {
  
  inline def apply(open: Boolean, showSearch: Boolean): Open = {
    val __obj = js.Dynamic.literal(open = open.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any])
    __obj.asInstanceOf[Open]
  }
  
  extension [Self <: Open](x: Self) {
    
    inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
  }
}
