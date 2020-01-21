package typings.agGrid.gridCellMod

import typings.agGrid.columnMod.Column
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCellDef extends js.Object {
  var column: Column
  var floating: String
  var rowIndex: Double
}

object GridCellDef {
  @scala.inline
  def apply(column: Column, floating: String, rowIndex: Double): GridCellDef = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], floating = floating.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GridCellDef]
  }
}

