package typings.activexLibreoffice.com_.sun.star.table

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a cell range address within a spreadsheet document. */
trait CellRangeAddress extends StObject {
  
  /** is the index of the column of the right edge of the range. */
  var EndColumn: Double
  
  /** is the index of the row of the bottom edge of the range. */
  var EndRow: Double
  
  /** is the index of the sheet that contains the cell range. */
  var Sheet: Double
  
  /** is the index of the column of the left edge of the range. */
  var StartColumn: Double
  
  /** is the index of the row of the top edge of the range. */
  var StartRow: Double
}
object CellRangeAddress {
  
  @scala.inline
  def apply(EndColumn: Double, EndRow: Double, Sheet: Double, StartColumn: Double, StartRow: Double): CellRangeAddress = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn.asInstanceOf[js.Any], EndRow = EndRow.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any], StartColumn = StartColumn.asInstanceOf[js.Any], StartRow = StartRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRangeAddress]
  }
  
  @scala.inline
  implicit class CellRangeAddressMutableBuilder[Self <: CellRangeAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndColumn(value: Double): Self = StObject.set(x, "EndColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRow(value: Double): Self = StObject.set(x, "EndRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: Double): Self = StObject.set(x, "Sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = StObject.set(x, "StartColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRow(value: Double): Self = StObject.set(x, "StartRow", value.asInstanceOf[js.Any])
  }
}
