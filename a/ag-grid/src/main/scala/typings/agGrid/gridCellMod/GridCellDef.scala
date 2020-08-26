package typings.agGrid.gridCellMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridCellDef extends js.Object {
  var column: Column = js.native
  var floating: String = js.native
  var rowIndex: Double = js.native
}

object GridCellDef {
  @scala.inline
  def apply(column: Column, floating: String, rowIndex: Double): GridCellDef = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], floating = floating.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridCellDef]
  }
  @scala.inline
  implicit class GridCellDefOps[Self <: GridCellDef] (val x: Self) extends AnyVal {
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
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloating(value: String): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
  }
  
}

