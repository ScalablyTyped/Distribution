package typings.agGrid.gridOptionsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessRowParams extends js.Object {
  var api: GridApi = js.native
  var columnApi: ColumnApi = js.native
  var context: js.Any = js.native
  var ePinnedLeftRow: HTMLElement = js.native
  var ePinnedRightRow: HTMLElement = js.native
  var eRow: HTMLElement = js.native
  var node: RowNode = js.native
  var rowIndex: Double = js.native
  def addRenderedRowListener(eventType: String, listener: js.Function): Unit = js.native
}

object ProcessRowParams {
  @scala.inline
  def apply(
    addRenderedRowListener: (String, js.Function) => Unit,
    api: GridApi,
    columnApi: ColumnApi,
    context: js.Any,
    ePinnedLeftRow: HTMLElement,
    ePinnedRightRow: HTMLElement,
    eRow: HTMLElement,
    node: RowNode,
    rowIndex: Double
  ): ProcessRowParams = {
    val __obj = js.Dynamic.literal(addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], ePinnedLeftRow = ePinnedLeftRow.asInstanceOf[js.Any], ePinnedRightRow = ePinnedRightRow.asInstanceOf[js.Any], eRow = eRow.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessRowParams]
  }
  @scala.inline
  implicit class ProcessRowParamsOps[Self <: ProcessRowParams] (val x: Self) extends AnyVal {
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
    def setAddRenderedRowListener(value: (String, js.Function) => Unit): Self = this.set("addRenderedRowListener", js.Any.fromFunction2(value))
    @scala.inline
    def setApi(value: GridApi): Self = this.set("api", value.asInstanceOf[js.Any])
    @scala.inline
    def setColumnApi(value: ColumnApi): Self = this.set("columnApi", value.asInstanceOf[js.Any])
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def setEPinnedLeftRow(value: HTMLElement): Self = this.set("ePinnedLeftRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setEPinnedRightRow(value: HTMLElement): Self = this.set("ePinnedRightRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setERow(value: HTMLElement): Self = this.set("eRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: RowNode): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
  }
  
}

