package typings.agDashGrid.distLibExportParamsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessCellForExportParams extends js.Object {
  var api: GridApi
  var column: Column
  var columnApi: ColumnApi
  var context: js.Any
  var node: RowNode
  var `type`: String
  var value: js.Any
}

object ProcessCellForExportParams {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    node: RowNode,
    `type`: String,
    value: js.Any
  ): ProcessCellForExportParams = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, context = context, node = node, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProcessCellForExportParams]
  }
}

