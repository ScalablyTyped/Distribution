package typings.agDashGrid.distLibEntitiesColDefMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NewValueParams extends BaseColDefParams {
  var newValue: js.Any
  var oldValue: js.Any
}

object NewValueParams {
  @scala.inline
  def apply(
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    newValue: js.Any,
    node: RowNode,
    oldValue: js.Any
  ): NewValueParams = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, newValue = newValue, node = node, oldValue = oldValue)
  
    __obj.asInstanceOf[NewValueParams]
  }
}

