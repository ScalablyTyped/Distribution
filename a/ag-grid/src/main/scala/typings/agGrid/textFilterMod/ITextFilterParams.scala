package typings.agGrid.textFilterMod

import typings.agGrid.baseFilterMod.IComparableFilterParams
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextFilterParams extends IComparableFilterParams {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var debounceMs: js.UndefOr[Double] = js.undefined
  var textCustomComparator: js.UndefOr[TextComparator] = js.undefined
}

object ITextFilterParams {
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
    suppressAndOrCondition: Boolean,
    valueGetter: RowNode => js.Any,
    applyButton: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    clearButton: js.UndefOr[Boolean] = js.undefined,
    debounceMs: js.UndefOr[Double] = js.undefined,
    defaultOption: String = null,
    filterOptions: js.Array[String] = null,
    newRowsAction: String = null,
    textCustomComparator: (/* filter */ String, /* gridValue */ js.Any, /* filterText */ String) => Boolean = null,
    textFormatter: /* from */ String => String = null
  ): ITextFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debounceMs)) __obj.updateDynamic("debounceMs")(debounceMs.get.asInstanceOf[js.Any])
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction.asInstanceOf[js.Any])
    if (textCustomComparator != null) __obj.updateDynamic("textCustomComparator")(js.Any.fromFunction3(textCustomComparator))
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    __obj.asInstanceOf[ITextFilterParams]
  }
}

