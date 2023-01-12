package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableRow extends StObject {
  
  /**
    * A list of cells in the table row. The cells appear in the same order as the columns of the table. 
    */
  var cells: Cells
  
  /**
    * The id of the row in the table.
    */
  var rowId: RowId
}
object TableRow {
  
  inline def apply(cells: Cells, rowId: RowId): TableRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableRow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableRow] (val x: Self) extends AnyVal {
    
    inline def setCells(value: Cells): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    inline def setCellsVarargs(value: Cell*): Self = StObject.set(x, "cells", js.Array(value*))
    
    inline def setRowId(value: RowId): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
  }
}
