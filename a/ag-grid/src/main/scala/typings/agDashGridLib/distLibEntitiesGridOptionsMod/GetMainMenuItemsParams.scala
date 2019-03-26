package typings
package agDashGridLib.distLibEntitiesGridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMainMenuItemsParams extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var context: js.Any
  var defaultItems: js.Array[java.lang.String]
}

object GetMainMenuItemsParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    defaultItems: js.Array[java.lang.String]
  ): GetMainMenuItemsParams = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, context = context, defaultItems = defaultItems)
  
    __obj.asInstanceOf[GetMainMenuItemsParams]
  }
}

