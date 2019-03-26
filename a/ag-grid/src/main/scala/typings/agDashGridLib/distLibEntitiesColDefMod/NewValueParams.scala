package typings
package agDashGridLib.distLibEntitiesColDefMod

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
    api: agDashGridLib.distLibGridApiMod.GridApi,
    colDef: ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    data: js.Any,
    newValue: js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    oldValue: js.Any
  ): NewValueParams = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, newValue = newValue, node = node, oldValue = oldValue)
  
    __obj.asInstanceOf[NewValueParams]
  }
}

