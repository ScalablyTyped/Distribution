package typings.agGrid.iFilterMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFilterParams extends js.Object {
  
  @JSName("$scope")
  var $scope: js.Any = js.native
  
  var applyButton: js.UndefOr[Boolean] = js.native
  
  var clearButton: js.UndefOr[Boolean] = js.native
  
  var colDef: ColDef = js.native
  
  var column: Column = js.native
  
  var context: js.Any = js.native
  
  var defaultOption: js.UndefOr[String] = js.native
  
  def doesRowPassOtherFilter(rowNode: RowNode): Boolean = js.native
  
  def filterChangedCallback(): Unit = js.native
  
  def filterModifiedCallback(): Unit = js.native
  
  var filterOptions: js.UndefOr[js.Array[String]] = js.native
  
  var newRowsAction: js.UndefOr[String] = js.native
  
  var rowModel: IRowModel = js.native
  
  var textFormatter: js.UndefOr[js.Function1[/* from */ String, String]] = js.native
  
  def valueGetter(rowNode: RowNode): js.Any = js.native
}
object IFilterParams {
  
  @scala.inline
  def apply(
    $scope: js.Any,
    colDef: ColDef,
    column: Column,
    context: js.Any,
    doesRowPassOtherFilter: RowNode => Boolean,
    filterChangedCallback: () => Unit,
    filterModifiedCallback: () => Unit,
    rowModel: IRowModel,
    valueGetter: RowNode => js.Any
  ): IFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    __obj.asInstanceOf[IFilterParams]
  }
  
  @scala.inline
  implicit class IFilterParamsOps[Self <: IFilterParams] (val x: Self) extends AnyVal {
    
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
    def setColDef(value: ColDef): Self = this.set("colDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Column): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoesRowPassOtherFilter(value: RowNode => Boolean): Self = this.set("doesRowPassOtherFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFilterChangedCallback(value: () => Unit): Self = this.set("filterChangedCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFilterModifiedCallback(value: () => Unit): Self = this.set("filterModifiedCallback", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRowModel(value: IRowModel): Self = this.set("rowModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueGetter(value: RowNode => js.Any): Self = this.set("valueGetter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApplyButton(value: Boolean): Self = this.set("applyButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyButton: Self = this.set("applyButton", js.undefined)
    
    @scala.inline
    def setClearButton(value: Boolean): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButton: Self = this.set("clearButton", js.undefined)
    
    @scala.inline
    def setDefaultOption(value: String): Self = this.set("defaultOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultOption: Self = this.set("defaultOption", js.undefined)
    
    @scala.inline
    def setFilterOptionsVarargs(value: String*): Self = this.set("filterOptions", js.Array(value :_*))
    
    @scala.inline
    def setFilterOptions(value: js.Array[String]): Self = this.set("filterOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterOptions: Self = this.set("filterOptions", js.undefined)
    
    @scala.inline
    def setNewRowsAction(value: String): Self = this.set("newRowsAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewRowsAction: Self = this.set("newRowsAction", js.undefined)
    
    @scala.inline
    def setTextFormatter(value: /* from */ String => String): Self = this.set("textFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTextFormatter: Self = this.set("textFormatter", js.undefined)
  }
}
