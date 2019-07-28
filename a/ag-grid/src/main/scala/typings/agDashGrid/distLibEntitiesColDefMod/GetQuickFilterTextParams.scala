package typings.agDashGrid.distLibEntitiesColDefMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQuickFilterTextParams extends js.Object {
  var colDef: ColDef
  var column: Column
  var data: js.Any
  var node: RowNode
  var value: js.Any
}

object GetQuickFilterTextParams {
  @scala.inline
  def apply(colDef: ColDef, column: Column, data: js.Any, node: RowNode, value: js.Any): GetQuickFilterTextParams = {
    val __obj = js.Dynamic.literal(colDef = colDef, column = column, data = data, node = node, value = value)
  
    __obj.asInstanceOf[GetQuickFilterTextParams]
  }
}

