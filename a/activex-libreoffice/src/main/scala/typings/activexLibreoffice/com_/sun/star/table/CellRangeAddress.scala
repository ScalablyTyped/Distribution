package typings.activexLibreoffice.com_.sun.star.table

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** contains a cell range address within a spreadsheet document. */
@js.native
trait CellRangeAddress extends js.Object {
  
  /** is the index of the column of the right edge of the range. */
  var EndColumn: Double = js.native
  
  /** is the index of the row of the bottom edge of the range. */
  var EndRow: Double = js.native
  
  /** is the index of the sheet that contains the cell range. */
  var Sheet: Double = js.native
  
  /** is the index of the column of the left edge of the range. */
  var StartColumn: Double = js.native
  
  /** is the index of the row of the top edge of the range. */
  var StartRow: Double = js.native
}
object CellRangeAddress {
  
  @scala.inline
  def apply(EndColumn: Double, EndRow: Double, Sheet: Double, StartColumn: Double, StartRow: Double): CellRangeAddress = {
    val __obj = js.Dynamic.literal(EndColumn = EndColumn.asInstanceOf[js.Any], EndRow = EndRow.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any], StartColumn = StartColumn.asInstanceOf[js.Any], StartRow = StartRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellRangeAddress]
  }
  
  @scala.inline
  implicit class CellRangeAddressOps[Self <: CellRangeAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndColumn(value: Double): Self = this.set("EndColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndRow(value: Double): Self = this.set("EndRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheet(value: Double): Self = this.set("Sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColumn(value: Double): Self = this.set("StartColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartRow(value: Double): Self = this.set("StartRow", value.asInstanceOf[js.Any])
  }
}
