package typings.agDashGrid.distLibEntitiesColDefMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsColumnFuncParams extends js.Object {
  var api: GridApi
  var colDef: ColDef
  var column: Column
  var columnApi: ColumnApi
  var context: js.Any
  var data: js.Any
  var node: RowNode
}

object IsColumnFuncParams {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    node: RowNode
  ): IsColumnFuncParams = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, node = node)
  
    __obj.asInstanceOf[IsColumnFuncParams]
  }
}

