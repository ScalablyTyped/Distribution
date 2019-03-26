package typings
package agDashGridLib.distLibEntitiesColDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseColDefParams extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var colDef: ColDef
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var context: js.Any
  var data: js.Any
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
}

object BaseColDefParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    colDef: ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    data: js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): BaseColDefParams = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, node = node)
  
    __obj.asInstanceOf[BaseColDefParams]
  }
}

