package typings.adobeAioLibAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LastPage extends StObject {
  
  var lastPage: Boolean
  
  var rows: js.Array[Any]
}
object LastPage {
  
  inline def apply(lastPage: Boolean, rows: js.Array[Any]): LastPage = {
    val __obj = js.Dynamic.literal(lastPage = lastPage.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastPage]
  }
  
  extension [Self <: LastPage](x: Self) {
    
    inline def setLastPage(value: Boolean): Self = StObject.set(x, "lastPage", value.asInstanceOf[js.Any])
    
    inline def setRows(value: js.Array[Any]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsVarargs(value: Any*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
