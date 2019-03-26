package typings
package agDashGridLib.distLibEntitiesColDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueGetterParams extends BaseColDefParams {
  def getValue(field: java.lang.String): js.Any
}

object ValueGetterParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    colDef: ColDef,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    data: js.Any,
    getValue: java.lang.String => js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): ValueGetterParams = {
    val __obj = js.Dynamic.literal(api = api, colDef = colDef, column = column, columnApi = columnApi, context = context, data = data, getValue = js.Any.fromFunction1(getValue), node = node)
  
    __obj.asInstanceOf[ValueGetterParams]
  }
}

