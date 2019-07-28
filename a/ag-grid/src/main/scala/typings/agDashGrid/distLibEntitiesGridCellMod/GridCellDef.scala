package typings.agDashGrid.distLibEntitiesGridCellMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
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
    val __obj = js.Dynamic.literal(column = column, floating = floating, rowIndex = rowIndex)
  
    __obj.asInstanceOf[GridCellDef]
  }
}

