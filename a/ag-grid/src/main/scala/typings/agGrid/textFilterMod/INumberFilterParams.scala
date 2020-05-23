package typings.agGrid.textFilterMod

import typings.agGrid.baseFilterMod.IScalarFilterParams
import typings.agGrid.baseFilterMod.NullComparator
import typings.agGrid.colDefMod.ColDef
import typings.agGrid.columnMod.Column
import typings.agGrid.iRowModelMod.IRowModel
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumberFilterParams extends IScalarFilterParams {
  var debounceMs: js.UndefOr[Double] = js.undefined
}

object INumberFilterParams {
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
    clearButton: js.UndefOr[Boolean] = js.undefined,
    debounceMs: js.UndefOr[Double] = js.undefined,
    defaultOption: String = null,
    filterOptions: js.Array[String] = null,
    inRangeInclusive: js.UndefOr[Boolean] = js.undefined,
    newRowsAction: String = null,
    nullComparator: NullComparator = null,
    textFormatter: /* from */ String => String = null
  ): INumberFilterParams = {
    val __obj = js.Dynamic.literal($scope = $scope.asInstanceOf[js.Any], colDef = colDef.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], doesRowPassOtherFilter = js.Any.fromFunction1(doesRowPassOtherFilter), filterChangedCallback = js.Any.fromFunction0(filterChangedCallback), filterModifiedCallback = js.Any.fromFunction0(filterModifiedCallback), rowModel = rowModel.asInstanceOf[js.Any], suppressAndOrCondition = suppressAndOrCondition.asInstanceOf[js.Any], valueGetter = js.Any.fromFunction1(valueGetter))
    if (!js.isUndefined(applyButton)) __obj.updateDynamic("applyButton")(applyButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clearButton)) __obj.updateDynamic("clearButton")(clearButton.get.asInstanceOf[js.Any])
    if (!js.isUndefined(debounceMs)) __obj.updateDynamic("debounceMs")(debounceMs.get.asInstanceOf[js.Any])
    if (defaultOption != null) __obj.updateDynamic("defaultOption")(defaultOption.asInstanceOf[js.Any])
    if (filterOptions != null) __obj.updateDynamic("filterOptions")(filterOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(inRangeInclusive)) __obj.updateDynamic("inRangeInclusive")(inRangeInclusive.get.asInstanceOf[js.Any])
    if (newRowsAction != null) __obj.updateDynamic("newRowsAction")(newRowsAction.asInstanceOf[js.Any])
    if (nullComparator != null) __obj.updateDynamic("nullComparator")(nullComparator.asInstanceOf[js.Any])
    if (textFormatter != null) __obj.updateDynamic("textFormatter")(js.Any.fromFunction1(textFormatter))
    __obj.asInstanceOf[INumberFilterParams]
  }
}

