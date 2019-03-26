package typings
package agDashGridLib.distLibEntitiesGridOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetContextMenuItemsParams extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var context: js.Any
  var defaultItems: js.Array[java.lang.String]
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var value: js.Any
}

object GetContextMenuItemsParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    defaultItems: js.Array[java.lang.String],
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    value: js.Any
  ): GetContextMenuItemsParams = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, context = context, defaultItems = defaultItems, node = node, value = value)
  
    __obj.asInstanceOf[GetContextMenuItemsParams]
  }
}

