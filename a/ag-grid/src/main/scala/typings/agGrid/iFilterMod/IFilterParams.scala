package typings.agGrid.iFilterMod

import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterParams extends js.Object {
  @JSName("$scope")
  var $scope: js.Any
  var applyButton: js.UndefOr[Boolean] = js.undefined
  var clearButton: js.UndefOr[Boolean] = js.undefined
  var colDef: ColDef
  var column: Column
  var context: js.Any
  var defaultOption: js.UndefOr[String] = js.undefined
  var filterOptions: js.UndefOr[js.Array[String]] = js.undefined
  var newRowsAction: js.UndefOr[String] = js.undefined
  var rowModel: IRowModel
  var textFormatter: js.UndefOr[js.Function1[/* from */ String, String]] = js.undefined
  def doesRowPassOtherFilter(rowNode: RowNode): Boolean
  def filterChangedCallback(): Unit
  def filterModifiedCallback(): Unit
  def valueGetter(rowNode: RowNode): js.Any
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
    valueGetter: RowNode => js.Any,
    applyButton: js.UndefOr[Boolean] = js.undefined,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    defaultOption: String = null,
    filterOptions: js.Array[String] = null,
    newRowsAction: String = null,
    textFormatter: /* from */ String => String = null
  ): IFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton.asInstanceOf[js.Any])
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton.asInstanceOf[js.Any])
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction.asInstanceOf[js.Any])
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    __obj.asInstanceOf[IFilterParams]
  }
}

