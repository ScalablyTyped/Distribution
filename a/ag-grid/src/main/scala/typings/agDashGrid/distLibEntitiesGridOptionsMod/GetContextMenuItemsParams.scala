package typings.agDashGrid.distLibEntitiesGridOptionsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.agDashGrid.distLibGridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContextMenuItemsParams extends js.Object {
  var api: GridApi
  var column: Column
  var columnApi: ColumnApi
  var context: js.Any
  var defaultItems: js.Array[String]
  var node: RowNode
  var value: js.Any
}

object GetContextMenuItemsParams {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    defaultItems: js.Array[String],
    node: RowNode,
    value: js.Any
  ): GetContextMenuItemsParams = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, context = context, defaultItems = defaultItems, node = node, value = value)
  
    __obj.asInstanceOf[GetContextMenuItemsParams]
  }
}

