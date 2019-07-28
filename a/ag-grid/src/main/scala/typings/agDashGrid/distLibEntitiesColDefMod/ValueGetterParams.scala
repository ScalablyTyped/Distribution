package typings.agDashGrid.distLibEntitiesColDefMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueGetterParams extends BaseColDefParams {
  def getValue(field: String): js.Any
}

object ValueGetterParams {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    getValue: String => js.Any,
    node: RowNode
  ): ValueGetterParams = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, getValue = js.Any.fromFunction1(getValue), node = node)
  
    __obj.asInstanceOf[ValueGetterParams]
  }
}

