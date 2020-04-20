package typings.agGrid.gridOptionsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMainMenuItemsParams extends js.Object {
  var api: GridApi
  var column: Column
  var columnApi: ColumnApi
  var context: js.Any
  var defaultItems: js.Array[String]
}

object GetMainMenuItemsParams {
  @scala.inline
  def apply(
    api: GridApi,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    defaultItems: js.Array[String]
  ): GetMainMenuItemsParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], defaultItems = defaultItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMainMenuItemsParams]
  }
}

