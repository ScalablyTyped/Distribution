package typings.agGrid.iRangeControllerMod

import typings.agGrid.columnMod.Column
import typings.agGrid.gridCellMod.GridCell
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RangeSelection extends js.Object {
  
  var columns: js.Array[Column] = js.native
  
  var end: GridCell = js.native
  
  var start: GridCell = js.native
}
object RangeSelection {
  
  @scala.inline
  def apply(columns: js.Array[Column], end: GridCell, start: GridCell): RangeSelection = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelection]
  }
  
  @scala.inline
  implicit class RangeSelectionOps[Self <: RangeSelection] (val x: Self) extends AnyVal {
    
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
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd(value: GridCell): Self = this.set("end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: GridCell): Self = this.set("start", value.asInstanceOf[js.Any])
  }
}
