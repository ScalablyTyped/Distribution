package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Row extends StObject {
  
  /**
    * The data in a row of query results.
    */
  var rowData: js.UndefOr[RowData] = js.undefined
}
object Row {
  
  inline def apply(): Row = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Row]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Row] (val x: Self) extends AnyVal {
    
    inline def setRowData(value: RowData): Self = StObject.set(x, "rowData", value.asInstanceOf[js.Any])
    
    inline def setRowDataUndefined: Self = StObject.set(x, "rowData", js.undefined)
    
    inline def setRowDataVarargs(value: QueryResultValue*): Self = StObject.set(x, "rowData", js.Array(value*))
  }
}
