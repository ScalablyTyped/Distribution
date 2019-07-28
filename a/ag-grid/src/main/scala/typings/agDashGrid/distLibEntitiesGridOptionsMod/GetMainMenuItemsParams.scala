package typings.agDashGrid.distLibEntitiesGridOptionsMod

import typings.agDashGrid.distLibColumnControllerColumnApiMod.ColumnApi
import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibGridApiMod.GridApi
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
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, context = context, defaultItems = defaultItems)
  
    __obj.asInstanceOf[GetMainMenuItemsParams]
  }
}

