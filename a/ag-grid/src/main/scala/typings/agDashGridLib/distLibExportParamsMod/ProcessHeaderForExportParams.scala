package typings
package agDashGridLib.distLibExportParamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessHeaderForExportParams extends js.Object {
  var api: agDashGridLib.distLibGridApiMod.GridApi
  var column: agDashGridLib.distLibEntitiesColumnMod.Column
  var columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  var context: js.Any
}

object ProcessHeaderForExportParams {
  @scala.inline
  def apply(
    api: agDashGridLib.distLibGridApiMod.GridApi,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi,
    context: js.Any
  ): ProcessHeaderForExportParams = {
    val __obj = js.Dynamic.literal(api = api, column = column, columnApi = columnApi, context = context)
  
    __obj.asInstanceOf[ProcessHeaderForExportParams]
  }
}

