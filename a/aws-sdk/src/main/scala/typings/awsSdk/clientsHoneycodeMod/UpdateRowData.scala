package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRowData extends StObject {
  
  /**
    *  A map representing the cells to update in the given row. The key is the column id of the cell and the value is the CellInput object that represents the data to set in that cell. 
    */
  var cellsToUpdate: RowDataInput
  
  /**
    *  The id of the row that needs to be updated. 
    */
  var rowId: RowId
}
object UpdateRowData {
  
  inline def apply(cellsToUpdate: RowDataInput, rowId: RowId): UpdateRowData = {
    val __obj = js.Dynamic.literal(cellsToUpdate = cellsToUpdate.asInstanceOf[js.Any], rowId = rowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRowData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRowData] (val x: Self) extends AnyVal {
    
    inline def setCellsToUpdate(value: RowDataInput): Self = StObject.set(x, "cellsToUpdate", value.asInstanceOf[js.Any])
    
    inline def setRowId(value: RowId): Self = StObject.set(x, "rowId", value.asInstanceOf[js.Any])
  }
}
