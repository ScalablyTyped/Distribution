package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableExcerpt extends StObject {
  
  /**
    * A list of rows in the table excerpt.
    */
  var Rows: js.UndefOr[TableRowList] = js.undefined
  
  /**
    * A count of the number of rows in the original table within the document.
    */
  var TotalNumberOfRows: js.UndefOr[Integer] = js.undefined
}
object TableExcerpt {
  
  inline def apply(): TableExcerpt = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableExcerpt]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableExcerpt] (val x: Self) extends AnyVal {
    
    inline def setRows(value: TableRowList): Self = StObject.set(x, "Rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "Rows", js.undefined)
    
    inline def setRowsVarargs(value: TableRow*): Self = StObject.set(x, "Rows", js.Array(value*))
    
    inline def setTotalNumberOfRows(value: Integer): Self = StObject.set(x, "TotalNumberOfRows", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfRowsUndefined: Self = StObject.set(x, "TotalNumberOfRows", js.undefined)
  }
}
