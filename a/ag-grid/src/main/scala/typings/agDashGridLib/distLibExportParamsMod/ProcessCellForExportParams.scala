package typings
package agDashGridLib.distLibExportParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessCellForExportParams extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var context: js.Any
  var node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var `type`: java.lang.String
  var value: js.Any
}

object ProcessCellForExportParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    `type`: java.lang.String,
    value: js.Any
  ): ProcessCellForExportParams = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, context = context, node = node, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ProcessCellForExportParams]
  }
}

