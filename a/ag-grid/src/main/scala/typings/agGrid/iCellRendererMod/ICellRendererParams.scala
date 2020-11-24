package typings.agGrid.iCellRendererMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICellRendererParams extends js.Object {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  def addRenderedRowListener(eventType: String, listener: js.Function): Unit = js.native
  
  var api: GridApi = js.native
  
  var colDef: ColDef = js.native
  
  var column: Column = js.native
  
  var columnApi: ColumnApi = js.native
  
  var context: js.Any = js.native
  
  var data: js.Any = js.native
  
  var eGridCell: HTMLElement = js.native
  
  var eParentOfValue: HTMLElement = js.native
  
  def formatValue(value: js.Any): js.Any = js.native
  
  def getValue(): js.Any = js.native
  
  var node: RowNode = js.native
  
  def refreshCell(): Unit = js.native
  
  var rowIndex: Double = js.native
  
  def setValue(value: js.Any): Unit = js.native
  
  var value: js.Any = js.native
  
  var valueFormatted: js.Any = js.native
}
object ICellRendererParams {
  
  @scala.inline
  def apply(
    $scope: js.Any,
    addRenderedRowListener: (String, js.Function) => Unit,
    api: GridApi,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    eGridCell: HTMLElement,
    eParentOfValue: HTMLElement,
    formatValue: js.Any => js.Any,
    getValue: () => js.Any,
    node: RowNode,
    refreshCell: () => Unit,
    rowIndex: Double,
    setValue: js.Any => Unit,
    value: js.Any,
    valueFormatted: js.Any
  ): ICellRendererParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eGridCell = eGridCell.asInstanceOf[js.Any], eParentOfValue = eParentOfValue.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), getValue = js.Any.fromFunction0(getValue), node = node.asInstanceOf[js.Any], refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellRendererParams]
  }
  
  @scala.inline
  implicit class ICellRendererParamsOps[Self <: ICellRendererParams] (val x: Self) extends AnyVal {
    
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
    def set$scope(value: js.Any): Self = this.set("$scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddRenderedRowListener(value: (String, js.Function) => Unit): Self = this.set("addRenderedRowListener", js.Any.fromFunction2(value))
    
    @scala.inline
    def setApi(value: GridApi): Self = this.set("api", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColDef(value: ColDef): Self = this.set("colDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnApi(value: ColumnApi): Self = this.set("columnApi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEGridCell(value: HTMLElement): Self = this.set("eGridCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEParentOfValue(value: HTMLElement): Self = this.set("eParentOfValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatValue(value: js.Any => js.Any): Self = this.set("formatValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetValue(value: () => js.Any): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNode(value: RowNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefreshCell(value: () => Unit): Self = this.set("refreshCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowIndex(value: Double): Self = this.set("rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetValue(value: js.Any => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueFormatted(value: js.Any): Self = this.set("valueFormatted", value.asInstanceOf[js.Any])
  }
}
