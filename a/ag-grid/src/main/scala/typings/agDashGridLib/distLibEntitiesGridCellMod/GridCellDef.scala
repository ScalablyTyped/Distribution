package typings
package agDashGridLib.distLibEntitiesGridCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridCellDef extends js.Object {
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var floating: java.lang.String
  var rowIndex: scala.Double
}

object GridCellDef {
  @scala.inline
  def apply(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    floating: java.lang.String,
    rowIndex: scala.Double
  ): GridCellDef = {
    val __obj = js.Dynamic.literal(column = column, floating = floating, rowIndex = rowIndex)
  
    __obj.asInstanceOf[GridCellDef]
  }
}

