package typings.agGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColId extends StObject {
  
  var colId: String
  
  var sort: String
}
object ColId {
  
  inline def apply(colId: String, sort: String): ColId = {
    val __obj = js.Dynamic.literal(colId = colId.asInstanceOf[js.Any], sort = sort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColId]
  }
  
  extension [Self <: ColId](x: Self) {
    
    inline def setColId(value: String): Self = StObject.set(x, "colId", value.asInstanceOf[js.Any])
    
    inline def setSort(value: String): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
  }
}
