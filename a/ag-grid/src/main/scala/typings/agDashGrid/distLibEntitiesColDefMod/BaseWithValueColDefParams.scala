package typings.agDashGrid.distLibEntitiesColDefMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseWithValueColDefParams extends BaseColDefParams {
  var value: js.Any
}

object BaseWithValueColDefParams {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    node: RowNode,
    value: js.Any
  ): BaseWithValueColDefParams = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, node = node, value = value)
  
    __obj.asInstanceOf[BaseWithValueColDefParams]
  }
}

