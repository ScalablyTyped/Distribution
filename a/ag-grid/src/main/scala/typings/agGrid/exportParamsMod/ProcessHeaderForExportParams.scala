package typings.agGrid.exportParamsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessHeaderForExportParams extends js.Object {
  var api: GridApi = js.native
  var column: Column = js.native
  var columnApi: ColumnApi = js.native
  var context: js.Any = js.native
}

object ProcessHeaderForExportParams {
  @scala.inline
  def apply(api: GridApi, column: Column, columnApi: ColumnApi, context: js.Any): ProcessHeaderForExportParams = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessHeaderForExportParams]
  }
  @scala.inline
  implicit class ProcessHeaderForExportParamsOps[Self <: ProcessHeaderForExportParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApi(value: GridApi): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnApi(value: ColumnApi): Self = this.set("columnApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
  }
  
}

