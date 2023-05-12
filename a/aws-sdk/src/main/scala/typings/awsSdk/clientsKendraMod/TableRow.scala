package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRow extends StObject {
  
  /**
    * A list of table cells in a row.
    */
  var Cells: js.UndefOr[TableCellList] = js.undefined
}
object TableRow {
  
  inline def apply(): TableRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRow] (val x: Self) extends AnyVal {
    
    inline def setCells(value: TableCellList): Self = StObject.set(x, "Cells", value.asInstanceOf[js.Any])
    
    inline def setCellsUndefined: Self = StObject.set(x, "Cells", js.undefined)
    
    inline def setCellsVarargs(value: TableCell*): Self = StObject.set(x, "Cells", js.Array(value*))
  }
}
