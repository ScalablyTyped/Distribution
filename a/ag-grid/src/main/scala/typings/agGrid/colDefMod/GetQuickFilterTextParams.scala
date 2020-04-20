package typings.agGrid.colDefMod

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
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
    val __obj = js.Dynamic.literal(colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetQuickFilterTextParams]
  }
}

