package typings.agGrid.groupCellRendererMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.iCellRendererMod.ICellRendererParams
import typings.agGrid.rowNodeMod.RowNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupCellRendererParams extends ICellRendererParams {
  
  var actualValue: String = js.native
  
  var checkbox: js.Any = js.native
  
  var footerValueGetter: js.Any = js.native
  
  var fullWidth: Boolean = js.native
  
  var padding: Double = js.native
  
  var pinned: String = js.native
  
  var scope: js.Any = js.native
  
  var suppressCount: Boolean = js.native
  
  var suppressDoubleClickExpand: Boolean = js.native
  
  var suppressPadding: Boolean = js.native
}
object GroupCellRendererParams {
  
  @scala.inline
  def apply(
    $scope: js.Any,
    actualValue: String,
    addRenderedRowListener: (String, js.Function) => Unit,
    api: GridApi,
    checkbox: js.Any,
    colDef: ColDef,
    column: Column,
    columnApi: ColumnApi,
    context: js.Any,
    data: js.Any,
    eGridCell: HTMLElement,
    eParentOfValue: HTMLElement,
    footerValueGetter: js.Any,
    formatValue: js.Any => js.Any,
    fullWidth: Boolean,
    getValue: () => js.Any,
    node: RowNode,
    padding: Double,
    pinned: String,
    refreshCell: () => Unit,
    rowIndex: Double,
    scope: js.Any,
    setValue: js.Any => Unit,
    suppressCount: Boolean,
    suppressDoubleClickExpand: Boolean,
    suppressPadding: Boolean,
    value: js.Any,
    valueFormatted: js.Any
  ): GroupCellRendererParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], actualValue = actualValue.asInstanceOf[js.Any], addRenderedRowListener = js.Any.fromFunction2(addRenderedRowListener), api = api.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], eGridCell = eGridCell.asInstanceOf[js.Any], eParentOfValue = eParentOfValue.asInstanceOf[js.Any], footerValueGetter = footerValueGetter.asInstanceOf[js.Any], formatValue = js.Any.fromFunction1(formatValue), fullWidth = fullWidth.asInstanceOf[js.Any], getValue = js.Any.fromFunction0(getValue), node = node.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], pinned = pinned.asInstanceOf[js.Any], refreshCell = js.Any.fromFunction0(refreshCell), rowIndex = rowIndex.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], setValue = js.Any.fromFunction1(setValue), suppressCount = suppressCount.asInstanceOf[js.Any], suppressDoubleClickExpand = suppressDoubleClickExpand.asInstanceOf[js.Any], suppressPadding = suppressPadding.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueFormatted = valueFormatted.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupCellRendererParams]
  }
  
  @scala.inline
  implicit class GroupCellRendererParamsOps[Self <: GroupCellRendererParams] (val x: Self) extends AnyVal {
    
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
    def setActualValue(value: String): Self = this.set("actualValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckbox(value: js.Any): Self = this.set("checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterValueGetter(value: js.Any): Self = this.set("footerValueGetter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned(value: String): Self = this.set("pinned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScope(value: js.Any): Self = this.set("scope", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressCount(value: Boolean): Self = this.set("suppressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressDoubleClickExpand(value: Boolean): Self = this.set("suppressDoubleClickExpand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressPadding(value: Boolean): Self = this.set("suppressPadding", value.asInstanceOf[js.Any])
  }
}
